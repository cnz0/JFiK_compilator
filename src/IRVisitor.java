package src;

import gen.meincraftBaseVisitor;
import gen.meincraftParser;
import gen.meincraftParser.*;
import src.Type;
import src.Value;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class IRVisitor extends meincraftBaseVisitor<Value> {
    private final IRGenerator ir = new IRGenerator();
    private final Map<String, Value> variables = new HashMap<>();
    private final Deque<Map<String, Value>> scopes = new ArrayDeque<>();
    private final Map<String, List<Value>> arrays = new HashMap<>();
    private final Map<String, Map<String, Value>> structs = new HashMap<>();

    private final Map<String, FunctionDefContext> functions = new HashMap<>();
    private final Deque<Map<String, Value>> callStack = new ArrayDeque<>();

    @Override
    public Value visitFunctionDef(meincraftParser.FunctionDefContext ctx) {
        functions.put(ctx.ID().getText(), ctx);
        return null;
    }

    @Override
    public Value visitProg(ProgContext ctx) {
        scopes.push(new HashMap<>()); // global
        for (StatContext stat : ctx.stat()) {
            visit(stat);
        }
        ir.finish();
        ir.writeToFile("output.ll");
        scopes.pop();
        return null;
    }

    @Override
    public Value visitAssignStat(AssignStatContext ctx) {
        String varName = ctx.ID().getText();
        Value result = visit(ctx.expr());

        System.out.println("Przypisanie: " + varName + " = " + result.value());

        if (result.type() == Type.ARRAY) {
            arrays.put(varName, (List<Value>) result.value());
        } else if (result.type() == Type.STRING) {
            setVariable(varName, result, false); // global/public
            ir.declareString(varName, (String) result.value());
        } else {
            setVariable(varName, result, false);
            ir.declareVariable(varName, result.type());
            ir.assignValue(varName, result);
        }

        return null;
    }

    @Override
    public Value visitPrivateAssignStat(meincraftParser.PrivateAssignStatContext ctx) {
        String varName = ctx.ID().getText();
        Value value = visit(ctx.expr());
        System.out.println("Przypisanie: " + varName + " = " + value.value());

        if (value.type() == Type.ARRAY) {
            arrays.put(varName, (List<Value>) value.value());
        } else if (value.type() == Type.STRING) {
            setVariable(varName, value, true); // global/public
            ir.declareString(varName, (String) value.value());
        } else {
            setVariable(varName, value, true);
            ir.declareVariable(varName, value.type());
            ir.assignValue(varName, value);
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
                    List<Value> inner = (List<Value>) val.value();
                    for (Value item : inner) {
                        if (item.type() == Type.STRING) {
                            ir.printRawString((String) item.value());
                            continue;
                        }
    
                        String tmp = ir.newTmp();
                        ir.declareVariable(tmp, item.type());
                        ir.assignValue(tmp, item);
    
                        switch (item.type()) {
                            case INT -> ir.printInt(tmp);
                            case FLOAT -> ir.printFloat(tmp);
                            case BOOLEAN -> ir.printBoolean((Boolean) item.value());
                            default -> {}
                        }
                    }
                } else if (val.type() == Type.STRING) {
                    ir.printRawString((String) val.value());
                } else {
                    String tmp = ir.newTmp();
                    ir.declareVariable(tmp, val.type());
                    ir.assignValue(tmp, val);
    
                    switch (val.type()) {
                        case INT -> ir.printInt(tmp);
                        case FLOAT -> ir.printFloat(tmp);
                        case BOOLEAN -> ir.printBoolean((Boolean) val.value());
                        default -> {}
                    }
                }
            }
    
        } else if (result.type() == Type.STRING) {
            ir.printRawString((String) result.value());
    
        } else if (result.type() == Type.INT || result.type() == Type.FLOAT) {
            String tmp = ir.newTmp();
            ir.declareVariable(tmp, result.type());
            ir.assignValue(tmp, result);
            if (result.type() == Type.INT) {
                ir.printInt(tmp);
            } else {
                ir.printFloat(tmp);
            }
    
        } else if (result.type() == Type.BOOLEAN) {
            ir.printBoolean((Boolean) result.value());
        }
    
        return null;
    }

    @Override
    public Value visitReadStat(ReadStatContext ctx) {
        String varName = ctx.ID().getText();
    
        // Zakładamy, że user może wprowadzić dowolny typ — przechowujemy jako STRING na poziomie JVM
        Type type = Type.STRING;
    
        ir.declareString(varName, "");         // zaalokuj zmienną jako string
        ir.readString(varName);                // wygeneruj kod LLVM do odczytu stringa
    
        variables.put(varName, new Value(type, varName));  // zapamiętaj w JVM jako string z nazwą IR
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
        Value root = getVariable(varName);

        if (root.type() != Type.ARRAY) {
            throw new RuntimeException("Zmiennej " + varName + " nie można indeksować jako tablicy.");
        }

        Object current = root.value();

        for (meincraftParser.ExprContext indexExpr : ctx.expr()) {
            int index = ((Number) visit(indexExpr).value()).intValue();

            if (current instanceof List<?> list && index < list.size()) {
                current = ((Value) list.get(index)).value();
            } else {
                return new Value(Type.INT, 0); // domyślna wartość przy błędzie
            }
        }

        if (current instanceof Number n) {
            return (n instanceof Double)
                ? new Value(Type.FLOAT, n)
                : new Value(Type.INT, n);
        }

        if (current instanceof Boolean b) {
            return new Value(Type.BOOLEAN, b);
        }

        if (current instanceof String s) {
            return new Value(Type.STRING, s);
        }

        if (current instanceof List<?> list) {
            return new Value(Type.ARRAY, list);
        }

        return new Value(Type.INT, 0); // fallback
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

        return getVariable(varName);
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
    
        // najpierw spróbuj floata
        if (input.matches("-?\\d+\\.\\d+")) {
            return new Value(Type.FLOAT, Double.parseDouble(input));
        }
    
        // potem int
        if (input.matches("-?\\d+")) {
            return new Value(Type.INT, Integer.parseInt(input));
        }
    
        // potem true/false jako boolean
        if (input.equals("true") || input.equals("false")) {
            return new Value(Type.BOOLEAN, Boolean.parseBoolean(input));
        }
    
        // w każdym innym wypadku → traktuj jako string
        return new Value(Type.STRING, input);
    }

    private Value promoteAndApply(String op, Value left, Value right) {
        // Promocja bool na int (jeśli występuje)
        if (left.type() == Type.BOOLEAN) {
            left = new Value(Type.INT, (boolean) left.value() ? 1 : 0);
        }
        if (right.type() == Type.BOOLEAN) {
            right = new Value(Type.INT, (boolean) right.value() ? 1 : 0);
        }
    
        // Obsługa floatów
        if (left.type() == Type.FLOAT || right.type() == Type.FLOAT) {
            double l = left.type() == Type.FLOAT ? (double) left.value() : ((Number) left.value()).doubleValue();
            double r = right.type() == Type.FLOAT ? (double) right.value() : ((Number) right.value()).doubleValue();
            return new Value(Type.FLOAT, switch (op) {
                case "+" -> l + r;
                case "-" -> l - r;
                case "*" -> l * r;
                case "/" -> l / r;
                default -> 0.0;
            });
        }
    
        // Obsługa intów
        if (left.type() == Type.INT && right.type() == Type.INT) {
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
    
        throw new RuntimeException("Nieobsługiwany typ operacji arytmetycznej: " + op);
    }

    @Override
    public Value visitTrueExpr(TrueExprContext ctx) {
        return new Value(Type.BOOLEAN, true);
    }

    @Override
    public Value visitFalseExpr(FalseExprContext ctx) {
        return new Value(Type.BOOLEAN, false);
    }

    @Override
    public Value visitAndExpr(meincraftParser.AndExprContext ctx) {
        return applyLogical(ctx.expr(0), ctx.expr(1), "AND");
    }
    
    @Override
    public Value visitOrExpr(meincraftParser.OrExprContext ctx) {
        return applyLogical(ctx.expr(0), ctx.expr(1), "OR");
    }
    
    @Override
    public Value visitXorExpr(meincraftParser.XorExprContext ctx) {
        return applyLogical(ctx.expr(0), ctx.expr(1), "XOR");
    }

    @Override
    public Value visitNegExpr(meincraftParser.NegExprContext ctx) {
        Value value = visit(ctx.expr());
    
        boolean boolVal = toBoolean(value);
        return new Value(Type.BOOLEAN, !boolVal);
    }

    private boolean toBoolean(Value val) {
        if (val.type() == Type.BOOLEAN) return (boolean) val.value();
        if (val.type() == Type.INT) {
            int v = (int) val.value();
            if (v == 0) return false;
            if (v == 1) return true;
            throw new RuntimeException("Tylko 0 i 1 dozwolone w wyrażeniach logicznych");
        }
        throw new RuntimeException("Nieobsługiwany typ dla wyrażeń logicznych: " + val.type());
    }
    
    private Value applyLogical(meincraftParser.ExprContext leftCtx, meincraftParser.ExprContext rightCtx, String op) {
        Value left = visit(leftCtx);
        Value right = visit(rightCtx);
    
        boolean l = toBoolean(left);
        boolean r = toBoolean(right);
    
        return switch (op) {
            case "AND" -> new Value(Type.BOOLEAN, l && r);
            case "OR"  -> new Value(Type.BOOLEAN, l || r);
            case "XOR" -> new Value(Type.BOOLEAN, l ^ r);
            default -> throw new RuntimeException("Nieznany operator logiczny: " + op);
        };
    }

    @Override
    public Value visitStringExpr(meincraftParser.StringExprContext ctx) {
        String raw = ctx.getText(); // np. "\"hello\""
        String value = raw.substring(1, raw.length() - 1); // usuń cudzysłowy
        return new Value(Type.STRING, value);
    }

    @Override
    public Value visitIfStat(meincraftParser.IfStatContext ctx) {
        String ifId = ir.newTmp();

        String elseLabel = "if_else_" + ifId;
        String endLabel = "if_end_" + ifId;
    
        Value ifCond = visit(ctx.cond);
        String condVar = ir.newTmp();
        ir.declareVariable(condVar, ifCond.type());
        ir.assignValue(condVar, ifCond);
    
        String ifTrueLabel = "if_if_" + ifId;
        String firstElifLabel = ctx.elifCond.isEmpty()
            ? (ctx.elseBranch != null ? elseLabel : endLabel)
            : "elif_" + ifId + "_0";
        ir.ifStart(condVar, ifTrueLabel, firstElifLabel, ifCond.type());
        ir.label(ifTrueLabel);
    
        for (StatContext s : ctx.ifBranch) visit(s);
        ir.branch(endLabel);
    
        // === ELIFs ===
        for (int i = 0; i < ctx.elifCond.size(); i++) {
            ir.label("elif_" + ifId + "_" + i);
            Value elifCond = visit(ctx.elifCond.get(i));
            String elifVar = ir.newTmp();
            ir.declareVariable(elifVar, elifCond.type());
            ir.assignValue(elifVar, elifCond);
            String next = (i == ctx.elifCond.size() - 1)
                ? (ctx.elseBranch != null ? elseLabel : endLabel)
                : "elif_" + ifId + "_" + (i + 1);
            String thisTrue = "elif_true_" + ifId + "_" + i;
            ir.ifStart(elifVar, thisTrue, next, ifCond.type());
            ir.label(thisTrue);
            visit(ctx.elifBranch.get(i));
            ir.branch(endLabel);
        }
    
        // === ELSE ===
        if (ctx.elseBranch != null) {
            ir.label(elseLabel);
            for (StatContext s : ctx.elseBranch) visit(s);
            ir.branch(endLabel);
        }
    
        ir.label(endLabel);
        return null;
    }

    @Override
    public Value visitForStat(meincraftParser.ForStatContext ctx) {
        String loopVar = ctx.ID(0).getText();
        Value startVal = visit(ctx.expr(0));
        Value endVal = visit(ctx.expr(1));

        if (startVal.type() != Type.INT || endVal.type() != Type.INT) {
            throw new RuntimeException("FOR range bounds must be integers.");
        }

        ir.declareVariable(loopVar, Type.INT);
        ir.assignValue(loopVar, startVal);
        variables.put(loopVar, new Value(Type.INT, loopVar));

        String loopId = ir.newTmp(); 
        String condVar = ir.newTmp();
        String loopStart = "for_start_" + loopId;
        String loopBody = "for_body_" + loopId;
        String loopEnd = "for_end_" + loopId;

        ir.branch(loopStart);
        ir.label(loopStart);
        ir.declareVariable(condVar, Type.BOOLEAN);

        ir.compareForLoop(loopVar, startVal, endVal, condVar);
        ir.ifStart(condVar, loopBody, loopEnd, Type.BOOLEAN);

        ir.label(loopBody);
        for (meincraftParser.StatContext stat : ctx.stat()) {
            visit(stat);
        }

        ir.incrementLoopVar(loopVar, startVal, endVal);
        ir.branch(loopStart);
        ir.label(loopEnd);

        return null;
    }


    @Override
    public Value visitEqExpr(meincraftParser.EqExprContext ctx) {
        Value left = visit(ctx.expr(0));
        Value right = visit(ctx.expr(1));

        if (left.type() != right.type()) {
            throw new RuntimeException("Porównanie różnych typów: " + left.type() + " vs " + right.type());
        }

        if (left.value() instanceof Number && right.value() instanceof Number) {
            double l = ((Number) left.value()).doubleValue();
            double r = ((Number) right.value()).doubleValue();
            return new Value(Type.BOOLEAN, l == r);
        }

        if (left.type() == Type.STRING && right.type() == Type.STRING) {
            Object lv = left.value();
            Object rv = right.value();

            // Rozwiąż tylko jeśli value to alias (czyli String i zmienna istnieje)
            if (lv instanceof String lAlias && variables.containsKey(lAlias)) {
                lv = resolve(left).value();
            }
            if (rv instanceof String rAlias && variables.containsKey(rAlias)) {
                rv = resolve(right).value();
            }

            return new Value(Type.BOOLEAN, lv.toString().equals(rv.toString()));
        }

        String tmp = ir.newTmp(); // alloca i1
        ir.declareVariable(tmp, Type.BOOLEAN);
        ir.compareEqual(tmp, left, right); // delegujemy całość do IRGeneratora
        return new Value(Type.BOOLEAN, tmp);
    }

    private Value resolve(Value v) {
        Set<String> visited = new HashSet<>();

        while (v.value() instanceof String alias) {
            if (!visited.add(alias)) {
                throw new RuntimeException("Cykliczna aliasowa referencja: " + alias);
            }

            Object raw = variables.get(alias);
            if (raw instanceof Value inner) {
                v = inner;
            } else {
                throw new RuntimeException("Alias nie ma przypisanej wartosci: " + alias);
            }
        }

        return v;
    }

    @Override
    public Value visitFunctionCall(meincraftParser.FunctionCallContext ctx) {
        String name = ctx.ID().getText();
        FunctionDefContext fn = functions.get(name);
        if (fn == null) throw new RuntimeException("Nieznana funkcja: " + name);

        List<String> params = fn.paramList() != null
            ? fn.paramList().ID().stream().map(ParseTree::getText).toList()
            : List.of();

        List<Value> args = ctx.argList() != null
            ? ctx.argList().expr().stream().map(this::visit).toList()
            : List.of();

        if (params.size() != args.size()) {
            throw new RuntimeException("Argument mismatch: " + name);
        }

        // Nowy lokalny scope
        scopes.push(new HashMap<>());

        for (int i = 0; i < params.size(); i++) {
            scopes.peek().put(params.get(i), args.get(i));
        }

        Value result = null;

        for (StatContext s : fn.stat()) {
            if (s instanceof meincraftParser.ReturnStatContext ret) {
                result = visit(ret.expr());
                break;
            } else {
                visit(s);
            }
        }

        scopes.pop();

        return result != null ? result : new Value(Type.INT, 0);
    }

    private void setVariable(String name, Value value, boolean isPrivate) {
        if (isPrivate) {
            scopes.peek().put(name, value);
        } else {
            for (Map<String, Value> scope : scopes) {
                if (scope.containsKey(name)) {
                    scope.put(name, value);
                    return;
                }
            }
            // Jeśli nie znaleziono – wrzucamy do aktualnego (czyli globalnego)
            scopes.getLast().put(name, value);
        }
    }

    private Value getVariable(String name) {
        for (Map<String, Value> scope : scopes) {
            if (scope.containsKey(name)) {
                return scope.get(name);
            }
        }
        throw new RuntimeException("Nieznana zmienna: " + name);
    }

    @Override
    public Value visitStructDefStat(meincraftParser.StructDefStatContext ctx) {
        String name = ctx.ID().getText();
        Map<String, Value> fields = new LinkedHashMap<>();
        for (StructFieldContext field : ctx.structField()) {
            String key = field.ID().getText();
            Value value = visit(field.expr());
            fields.put(key, value);
        }
        structs.put(name, fields);
        return null;
    }

    @Override
    public Value visitStructGetExpr(meincraftParser.StructGetExprContext ctx) {
        String structName = ctx.ID(0).getText();
        String fieldName = ctx.ID(1).getText();

        Map<String, Value> struct = structs.get(structName);
        if (struct == null || !struct.containsKey(fieldName)) {
            throw new RuntimeException("Brak pola " + fieldName + " w strukturze " + structName);
        }

        return struct.get(fieldName);
    }

    @Override
    public Value visitStructSetExpr(meincraftParser.StructSetExprContext ctx) {
        String structName = ctx.ID(0).getText();
        String fieldName = ctx.ID(1).getText();
        Value value = visit(ctx.expr());

        Map<String, Value> struct = structs.get(structName);
        if (struct == null) {
            throw new RuntimeException("Nieznana struktura: " + structName);
        }

        struct.put(fieldName, value);
        return new Value(Type.INT, 0);
    }

}
