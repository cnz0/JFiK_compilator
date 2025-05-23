// Generated from grammar/meincraft.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link meincraftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface meincraftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link meincraftParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(meincraftParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStat}
	 * labeled alternative in {@link meincraftParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStat(meincraftParser.AssignStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrivateAssignStat}
	 * labeled alternative in {@link meincraftParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivateAssignStat(meincraftParser.PrivateAssignStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStat}
	 * labeled alternative in {@link meincraftParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStat(meincraftParser.PrintStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadStat}
	 * labeled alternative in {@link meincraftParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStat(meincraftParser.ReadStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAssignStat}
	 * labeled alternative in {@link meincraftParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignStat(meincraftParser.ArrayAssignStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link meincraftParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(meincraftParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStat}
	 * labeled alternative in {@link meincraftParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStat(meincraftParser.ForStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStat}
	 * labeled alternative in {@link meincraftParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(meincraftParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDefStat}
	 * labeled alternative in {@link meincraftParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefStat(meincraftParser.FunctionDefStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallStat}
	 * labeled alternative in {@link meincraftParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStat(meincraftParser.FunctionCallStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructDefStat}
	 * labeled alternative in {@link meincraftParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDefStat(meincraftParser.StructDefStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStat}
	 * labeled alternative in {@link meincraftParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(meincraftParser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link meincraftParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(meincraftParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link meincraftParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(meincraftParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link meincraftParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(meincraftParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link meincraftParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(meincraftParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link meincraftParser#structField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructField(meincraftParser.StructFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(meincraftParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(meincraftParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(meincraftParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExpr(meincraftParser.TrueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatExpr(meincraftParser.FloatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(meincraftParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XorExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorExpr(meincraftParser.XorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructSetExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructSetExpr(meincraftParser.StructSetExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpr(meincraftParser.SubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegExpr(meincraftParser.NegExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(meincraftParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteral}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(meincraftParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(meincraftParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExpr(meincraftParser.FalseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructGetExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructGetExpr(meincraftParser.StructGetExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(meincraftParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpr(meincraftParser.DivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(meincraftParser.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadExpr(meincraftParser.ReadExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(meincraftParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpr(meincraftParser.ParensExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(meincraftParser.IntExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link meincraftParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(meincraftParser.ExprListContext ctx);
}