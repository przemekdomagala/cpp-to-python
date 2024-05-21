// Generated from C:/Users/Przemek/PycharmProjects/pythonProject2/CppGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CppGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CppGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CppGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CppGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppGrammarParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(CppGrammarParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CppGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppGrammarParser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace(CppGrammarParser.NamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppGrammarParser#enum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum(CppGrammarParser.EnumContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppGrammarParser#struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(CppGrammarParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppGrammarParser#struct_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_body(CppGrammarParser.Struct_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppGrammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CppGrammarParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppGrammarParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(CppGrammarParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppGrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CppGrammarParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppGrammarParser#function_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_scope(CppGrammarParser.Function_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppGrammarParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(CppGrammarParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppGrammarParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(CppGrammarParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppGrammarParser#loop_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_scope(CppGrammarParser.Loop_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppGrammarParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(CppGrammarParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppGrammarParser#if_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_expression(CppGrammarParser.If_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(CppGrammarParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppGrammarParser#enum_namespace_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_namespace_call(CppGrammarParser.Enum_namespace_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppGrammarParser#arithmetic_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_operation(CppGrammarParser.Arithmetic_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppGrammarParser#assingment_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssingment_options(CppGrammarParser.Assingment_optionsContext ctx);
}