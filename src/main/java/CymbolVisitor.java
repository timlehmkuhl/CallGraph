// Generated from G:/InfProjekte/CallGraph/src/main/java\Cymbol.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CymbolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CymbolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CymbolParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(CymbolParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(CymbolParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CymbolParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(CymbolParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(CymbolParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(CymbolParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CymbolParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoReturn}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoReturn(CymbolParser.NoReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(CymbolParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NonCallExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonCallExpr(CymbolParser.NonCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(CymbolParser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(CymbolParser.ExprListContext ctx);
}