// Generated from experiment.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link experimentParser}.
 */
public interface experimentListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link experimentParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(experimentParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(experimentParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#em}.
	 * @param ctx the parse tree
	 */
	void enterEm(experimentParser.EmContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#em}.
	 * @param ctx the parse tree
	 */
	void exitEm(experimentParser.EmContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#exf}.
	 * @param ctx the parse tree
	 */
	void enterExf(experimentParser.ExfContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#exf}.
	 * @param ctx the parse tree
	 */
	void exitExf(experimentParser.ExfContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#fex}.
	 * @param ctx the parse tree
	 */
	void enterFex(experimentParser.FexContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#fex}.
	 * @param ctx the parse tree
	 */
	void exitFex(experimentParser.FexContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#exl}.
	 * @param ctx the parse tree
	 */
	void enterExl(experimentParser.ExlContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#exl}.
	 * @param ctx the parse tree
	 */
	void exitExl(experimentParser.ExlContext ctx);
	/**
	 * Enter a parse tree produced by {@link experimentParser#ex}.
	 * @param ctx the parse tree
	 */
	void enterEx(experimentParser.ExContext ctx);
	/**
	 * Exit a parse tree produced by {@link experimentParser#ex}.
	 * @param ctx the parse tree
	 */
	void exitEx(experimentParser.ExContext ctx);
}