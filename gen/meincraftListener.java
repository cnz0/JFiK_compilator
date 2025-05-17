// Generated from grammar/meincraft.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link meincraftParser}.
 */
public interface meincraftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link meincraftParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(meincraftParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link meincraftParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(meincraftParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link meincraftParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(meincraftParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link meincraftParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(meincraftParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(meincraftParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(meincraftParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(meincraftParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(meincraftParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivExpr(meincraftParser.DivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivExpr(meincraftParser.DivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloatExpr(meincraftParser.FloatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloatExpr(meincraftParser.FloatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(meincraftParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(meincraftParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(meincraftParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(meincraftParser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParensExpr(meincraftParser.ParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParensExpr(meincraftParser.ParensExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(meincraftParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(meincraftParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(meincraftParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(meincraftParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteral}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(meincraftParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteral}
	 * labeled alternative in {@link meincraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(meincraftParser.ArrayLiteralContext ctx);
}