// Generated from C:/Users/Przemek/PycharmProjects/pythonProject2/CppGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CppGrammarParser}.
 */
public interface CppGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CppGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CppGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CppGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppGrammarParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(CppGrammarParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppGrammarParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(CppGrammarParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CppGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CppGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppGrammarParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(CppGrammarParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppGrammarParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(CppGrammarParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppGrammarParser#enum}.
	 * @param ctx the parse tree
	 */
	void enterEnum(CppGrammarParser.EnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppGrammarParser#enum}.
	 * @param ctx the parse tree
	 */
	void exitEnum(CppGrammarParser.EnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppGrammarParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(CppGrammarParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppGrammarParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(CppGrammarParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppGrammarParser#struct_body}.
	 * @param ctx the parse tree
	 */
	void enterStruct_body(CppGrammarParser.Struct_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppGrammarParser#struct_body}.
	 * @param ctx the parse tree
	 */
	void exitStruct_body(CppGrammarParser.Struct_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CppGrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CppGrammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CppGrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CppGrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CppGrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CppGrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppGrammarParser#function_scope}.
	 * @param ctx the parse tree
	 */
	void enterFunction_scope(CppGrammarParser.Function_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppGrammarParser#function_scope}.
	 * @param ctx the parse tree
	 */
	void exitFunction_scope(CppGrammarParser.Function_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppGrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(CppGrammarParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppGrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(CppGrammarParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppGrammarParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(CppGrammarParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppGrammarParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(CppGrammarParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppGrammarParser#loop_scope}.
	 * @param ctx the parse tree
	 */
	void enterLoop_scope(CppGrammarParser.Loop_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppGrammarParser#loop_scope}.
	 * @param ctx the parse tree
	 */
	void exitLoop_scope(CppGrammarParser.Loop_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppGrammarParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(CppGrammarParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppGrammarParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(CppGrammarParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppGrammarParser#if_expression}.
	 * @param ctx the parse tree
	 */
	void enterIf_expression(CppGrammarParser.If_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppGrammarParser#if_expression}.
	 * @param ctx the parse tree
	 */
	void exitIf_expression(CppGrammarParser.If_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(CppGrammarParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(CppGrammarParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppGrammarParser#enum_namespace_call}.
	 * @param ctx the parse tree
	 */
	void enterEnum_namespace_call(CppGrammarParser.Enum_namespace_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppGrammarParser#enum_namespace_call}.
	 * @param ctx the parse tree
	 */
	void exitEnum_namespace_call(CppGrammarParser.Enum_namespace_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppGrammarParser#arithmetic_operation}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_operation(CppGrammarParser.Arithmetic_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppGrammarParser#arithmetic_operation}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_operation(CppGrammarParser.Arithmetic_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppGrammarParser#assingment_options}.
	 * @param ctx the parse tree
	 */
	void enterAssingment_options(CppGrammarParser.Assingment_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppGrammarParser#assingment_options}.
	 * @param ctx the parse tree
	 */
	void exitAssingment_options(CppGrammarParser.Assingment_optionsContext ctx);
}