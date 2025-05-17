package src;

import gen.meincraftBaseVisitor;
import gen.meincraftParser;
import gen.meincraftParser.*;
import src.Type;
import src.Value;

import java.util.*;

public class IRVisitor extends meincraftBaseVisitor<Value> {
    private final IRGenerator ir = new IRGenerator();
    private final Map<String, Object> variables = new HashMap<>();
    private final Map<String, List<Value>> arrays = new HashMap<>();

    @Override
    public Value visitProg(ProgContext ctx) {
        for (StatContext stat : ctx.stat()) {
            visit(stat);
        }
        ir.finish();
        ir.writeToFile("output.ll");
        return null;
    }

    @Override
    public Value visitAssignStat(AssignStatContext ctx) {
        String varName = ctx.ID().getText();
        Value result = visit(ctx.expr());

        System.out.println("Przypisanie: " + varName + " = " + result.value());

        if (result.type() == Type.ARRAY) {
            arrays.put(varName, (List<Value>) result.value());
        } else {
            variables.put(varName, result.value());
            ir.declareVariable(varName, result.type());
            ir.assignValue(varName, result);
        }

        return null;
    }

    @Override
    public Value visitPrintStat(PrintStatContext ctx) {
        Value result = visit(ctx.expr());
    
        if (result.type() == Type.ARRAY) {
            List<Value> array = (List<Value>) result.value();
            for (Value val : array) {
                if (val.type() == Type.ARRAY) {
                    // Drugi poziom – macierz
                    List<Value> inner = (List<Value>) val.value();
                    for (Value item : inner) {
                        String tmp = ir.newTmp();
                        ir.declareVariable(tmp, item.type());
                        ir.assignValue(tmp, item);
                        if (item.type() == Type.INT) {
                            ir.printInt(tmp);
                        } else if (item.type() == Type.FLOAT) {
                            ir.printFloat(tmp);
                        }
                    }
                } else {
                    String tmp = ir.newTmp();
                    ir.declareVariable(tmp, val.type());
                    ir.assignValue(tmp, val);
                    if (val.type() == Type.INT) {
                        ir.printInt(tmp);
                    } else {
                        ir.printFloat(tmp);
                    }
                }
            }
        } else if (result.type() == Type.INT || result.type() == Type.FLOAT) {
            String tmp = ir.newTmp();
            ir.declareVariable(tmp, result.type());
            ir.assignValue(tmp, result);
            if (result.type() == Type.INT) {
                ir.printInt(tmp);
            } else {
                ir.printFloat(tmp);
            }
        }
    
        return null;
    }
    @Override
    public Value visitReadStat(ReadStatContext ctx) {
        String varName = ctx.ID().getText();
        Type type = Type.INT;

        ir.declareVariable(varName, type);
        ir.readInto(varName, type);

        variables.put(varName, 0);
        return null;
    }

    @Override
    public Value visitArrayAssignStat(meincraftParser.ArrayAssignStatContext ctx) {
        String varName = ctx.ID().getText();
        int levels = ctx.expr().size() - 1; // ostatni expr to przypisywana wartość
        List<Integer> indices = new ArrayList<>();
    
        for (int i = 0; i < levels; i++) {
            Value idxVal = visit(ctx.expr(i));
            indices.add(((Number) idxVal.value()).intValue());
        }
    
        Value value = visit(ctx.expr(levels)); // wartość przypisywana
    
        // Uzyskaj referencję do tablicy lub macierzy
        List<Value> current = arrays.computeIfAbsent(varName, k -> new ArrayList<>());
    
        for (int i = 0; i < indices.size() - 1; i++) {
            int idx = indices.get(i);
            // Rozszerz jeśli potrzebne
            while (current.size() <= idx) current.add(new Value(Type.ARRAY, new ArrayList<Value>()));
            Value nested = current.get(idx);
    
            if (!(nested.value() instanceof List)) {
                nested = new Value(Type.ARRAY, new ArrayList<Value>());
                current.set(idx, nested);
            }
    
            current = (List<Value>) nested.value();
        }
    
        // Ustaw na ostatnim poziomie
        int lastIndex = indices.get(indices.size() - 1);
        while (current.size() <= lastIndex) {
            current.add(new Value(value.type(), 0));
        }
        current.set(lastIndex, value);
    
        // Opcjonalnie: możesz generować IR tylko dla typów prostych
        if (value.type() != Type.ARRAY) {
            String irName = "arr_" + varName + "_" + String.join("_",
                indices.stream().map(String::valueOf).toArray(String[]::new)
            );
            ir.declareVariable(irName, value.type());
            ir.assignValue(irName, value);
        }
    
        return null;
    }

    @Override
    public Value visitArrayAccess(meincraftParser.ArrayAccessContext ctx) {
        String varName = ctx.ID().getText();
        Object current = arrays.getOrDefault(varName, new ArrayList<>());
    
        for (meincraftParser.ExprContext indexExpr : ctx.expr()) {
            int index = ((Number) visit(indexExpr).value()).intValue();
    
            if (current instanceof List<?> list && index < list.size()) {
                current = ((Value) list.get(index)).value();
            } else {
                return new Value(Type.INT, 0); // domyślnie 0 przy błędzie
            }
        }
    
        if (current instanceof Number n) {
            return (n instanceof Double)
                ? new Value(Type.FLOAT, n)
                : new Value(Type.INT, n);
        }
    
        if (current instanceof String name) {
            // zakładamy, że to alias IR (tymczasowa zmienna z read)
            // nie możemy wywnioskować typu jednoznacznie – domyślnie INT
            return new Value(Type.INT, name); // lub FLOAT, jeśli jesteś w stanie to wykryć wcześniej
        }
    
        if (current instanceof List<?> list) {
            return new Value(Type.ARRAY, list);
        }
    
        return new Value(Type.INT, 0);
    }
    
    

    @Override
    public Value visitIntExpr(IntExprContext ctx) {
        return new Value(Type.INT, Integer.parseInt(ctx.getText()));
    }

    @Override
    public Value visitFloatExpr(FloatExprContext ctx) {
        return new Value(Type.FLOAT, Double.parseDouble(ctx.getText()));
    }

    @Override
    public Value visitIdExpr(IdExprContext ctx) {
        String varName = ctx.getText();
        if (arrays.containsKey(varName)) {
            return new Value(Type.ARRAY, arrays.get(varName));
        }
        Object val = variables.getOrDefault(varName, 0);
        return (val instanceof Double)
            ? new Value(Type.FLOAT, (double) val)
            : new Value(Type.INT, ((Number) val).intValue());
    }

    @Override
    public Value visitAddExpr(AddExprContext ctx) {
        return promoteAndApply("+", visit(ctx.expr(0)), visit(ctx.expr(1)));
    }

    @Override
    public Value visitSubExpr(SubExprContext ctx) {
        return promoteAndApply("-", visit(ctx.expr(0)), visit(ctx.expr(1)));
    }

    @Override
    public Value visitMulExpr(MulExprContext ctx) {
        return promoteAndApply("*", visit(ctx.expr(0)), visit(ctx.expr(1)));
    }

    @Override
    public Value visitDivExpr(DivExprContext ctx) {
        return promoteAndApply("/", visit(ctx.expr(0)), visit(ctx.expr(1)));
    }

    @Override
    public Value visitParensExpr(ParensExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Value visitArrayLiteral(meincraftParser.ArrayLiteralContext ctx) {
        List<Value> elements = new ArrayList<>();
        for (meincraftParser.ExprContext e : ctx.exprList().expr()) {
            Value v = visit(e);
            elements.add(v);
        }
        return new Value(Type.ARRAY, elements);
    }

    @Override
    public Value visitReadExpr(ReadExprContext ctx) {
        System.out.print("read> ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input.contains(".")
            ? new Value(Type.FLOAT, Double.parseDouble(input))
            : new Value(Type.INT, Integer.parseInt(input));
    }

    private Value promoteAndApply(String op, Value left, Value right) {
        if (left.type() == Type.FLOAT || right.type() == Type.FLOAT) {
            double l = left.type() == Type.FLOAT ? (double) left.value() : (int) left.value();
            double r = right.type() == Type.FLOAT ? (double) right.value() : (int) right.value();
            return new Value(Type.FLOAT, switch (op) {
                case "+" -> l + r;
                case "-" -> l - r;
                case "*" -> l * r;
                case "/" -> l / r;
                default -> 0.0;
            });
        } else {
            int l = (int) left.value();
            int r = (int) right.value();
            return new Value(Type.INT, switch (op) {
                case "+" -> l + r;
                case "-" -> l - r;
                case "*" -> l * r;
                case "/" -> l / r;
                default -> 0;
            });
        }
    }
}
