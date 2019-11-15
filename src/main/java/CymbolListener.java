// Generated from G:/InfProjekte/CallGraph/src/main/java\Cymbol.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CymbolParser}.
 */
public interface CymbolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CymbolParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CymbolParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CymbolParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(CymbolParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(CymbolParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CymbolParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CymbolParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(CymbolParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(CymbolParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(CymbolParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(CymbolParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CymbolParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CymbolParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoReturn}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterNoReturn(CymbolParser.NoReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoReturn}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitNoReturn(CymbolParser.NoReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn(CymbolParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn(CymbolParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NonCallExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNonCallExpr(CymbolParser.NonCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NonCallExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNonCallExpr(CymbolParser.NonCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(CymbolParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(CymbolParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(CymbolParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(CymbolParser.ExprListContext ctx);
}