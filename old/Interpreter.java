package src;

import gen.meincraftBaseListener;
import gen.meincraftParser;
import gen.meincraftParser.AddExprContext;

import java.util.HashMap;
import java.util.Map;

public class Interpreter extends meincraftBaseListener {
    Map<String, Integer> memory = new HashMap<>();

    @Override
    public void exitStat(meincraftParser.StatContext ctx) {
        if (ctx.getChild(0).getText().equals("print")) {
            int value = eval(ctx.expr(0));
            System.out.println(value);
        } else {
            String id = ctx.ID().getText();
            int value = eval(ctx.expr(0));
            memory.put(id, value);
        }
    }

    private int eval(meincraftParser.ExprContext ctx) {
        if (ctx instanceof meincraftParser.IntExprContext intCtx) {
            return Integer.parseInt(intCtx.getText());
        } else if (ctx instanceof meincraftParser.IntExprContext idCtx) {
            String var = idCtx.getText();
            return memory.getOrDefault(var, 0);
        } else if (ctx.getChildCount() == 3) {
            if (ctx.getChild(0).getText().equals("(")) {
                return eval(((meincraftParser.AddExprContext)ctx).expr(0)); // nawiasy
            }

            int left = eval(((meincraftParser.AddExprContext)ctx).expr(0));
            int right = eval(((meincraftParser.AddExprContext)ctx).expr(1));
            String op = ctx.getChild(1).getText();

            return switch (op) {
                case "*" -> left * right;
                case "/" -> left / right;
                case "+" -> left + right;
                case "-" -> left - right;
                default -> 0;
            };
        }

        return 0;
    }
}
