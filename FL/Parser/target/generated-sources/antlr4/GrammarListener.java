// Generated from Grammar.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#rul}.
	 * @param ctx the parse tree
	 */
	void enterRul(@NotNull GrammarParser.RulContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rul}.
	 * @param ctx the parse tree
	 */
	void exitRul(@NotNull GrammarParser.RulContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#grammr}.
	 * @param ctx the parse tree
	 */
	void enterGrammr(@NotNull GrammarParser.GrammrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#grammr}.
	 * @param ctx the parse tree
	 */
	void exitGrammr(@NotNull GrammarParser.GrammrContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(@NotNull GrammarParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(@NotNull GrammarParser.TitleContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(@NotNull GrammarParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(@NotNull GrammarParser.WordContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#notTerminal}.
	 * @param ctx the parse tree
	 */
	void enterNotTerminal(@NotNull GrammarParser.NotTerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#notTerminal}.
	 * @param ctx the parse tree
	 */
	void exitNotTerminal(@NotNull GrammarParser.NotTerminalContext ctx);

	/**
	 * Enter a parse tree produced by {@link GrammarParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(@NotNull GrammarParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(@NotNull GrammarParser.OptionContext ctx);
}