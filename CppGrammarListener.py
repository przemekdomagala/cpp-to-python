# Generated from CppGrammar.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .CppGrammarParser import CppGrammarParser
else:
    from CppGrammarParser import CppGrammarParser

# This class defines a complete listener for a parse tree produced by CppGrammarParser.
class CppGrammarListener(ParseTreeListener):

    # Enter a parse tree produced by CppGrammarParser#program.
    def enterProgram(self, ctx:CppGrammarParser.ProgramContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#program.
    def exitProgram(self, ctx:CppGrammarParser.ProgramContext):
        pass


    # Enter a parse tree produced by CppGrammarParser#include.
    def enterInclude(self, ctx:CppGrammarParser.IncludeContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#include.
    def exitInclude(self, ctx:CppGrammarParser.IncludeContext):
        pass


    # Enter a parse tree produced by CppGrammarParser#statement.
    def enterStatement(self, ctx:CppGrammarParser.StatementContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#statement.
    def exitStatement(self, ctx:CppGrammarParser.StatementContext):
        pass


    # Enter a parse tree produced by CppGrammarParser#namespace.
    def enterNamespace(self, ctx:CppGrammarParser.NamespaceContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#namespace.
    def exitNamespace(self, ctx:CppGrammarParser.NamespaceContext):
        pass


    # Enter a parse tree produced by CppGrammarParser#enum.
    def enterEnum(self, ctx:CppGrammarParser.EnumContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#enum.
    def exitEnum(self, ctx:CppGrammarParser.EnumContext):
        pass


    # Enter a parse tree produced by CppGrammarParser#struct.
    def enterStruct(self, ctx:CppGrammarParser.StructContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#struct.
    def exitStruct(self, ctx:CppGrammarParser.StructContext):
        pass


    # Enter a parse tree produced by CppGrammarParser#struct_body.
    def enterStruct_body(self, ctx:CppGrammarParser.Struct_bodyContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#struct_body.
    def exitStruct_body(self, ctx:CppGrammarParser.Struct_bodyContext):
        pass


    # Enter a parse tree produced by CppGrammarParser#variable_declaration.
    def enterVariable_declaration(self, ctx:CppGrammarParser.Variable_declarationContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#variable_declaration.
    def exitVariable_declaration(self, ctx:CppGrammarParser.Variable_declarationContext):
        pass


    # Enter a parse tree produced by CppGrammarParser#variable.
    def enterVariable(self, ctx:CppGrammarParser.VariableContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#variable.
    def exitVariable(self, ctx:CppGrammarParser.VariableContext):
        pass


    # Enter a parse tree produced by CppGrammarParser#assign.
    def enterAssign(self, ctx:CppGrammarParser.AssignContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#assign.
    def exitAssign(self, ctx:CppGrammarParser.AssignContext):
        pass


    # Enter a parse tree produced by CppGrammarParser#function.
    def enterFunction(self, ctx:CppGrammarParser.FunctionContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#function.
    def exitFunction(self, ctx:CppGrammarParser.FunctionContext):
        pass


    # Enter a parse tree produced by CppGrammarParser#function_scope.
    def enterFunction_scope(self, ctx:CppGrammarParser.Function_scopeContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#function_scope.
    def exitFunction_scope(self, ctx:CppGrammarParser.Function_scopeContext):
        pass


    # Enter a parse tree produced by CppGrammarParser#function_call.
    def enterFunction_call(self, ctx:CppGrammarParser.Function_callContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#function_call.
    def exitFunction_call(self, ctx:CppGrammarParser.Function_callContext):
        pass


    # Enter a parse tree produced by CppGrammarParser#for_loop.
    def enterFor_loop(self, ctx:CppGrammarParser.For_loopContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#for_loop.
    def exitFor_loop(self, ctx:CppGrammarParser.For_loopContext):
        pass


    # Enter a parse tree produced by CppGrammarParser#loop_scope.
    def enterLoop_scope(self, ctx:CppGrammarParser.Loop_scopeContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#loop_scope.
    def exitLoop_scope(self, ctx:CppGrammarParser.Loop_scopeContext):
        pass


    # Enter a parse tree produced by CppGrammarParser#while_loop.
    def enterWhile_loop(self, ctx:CppGrammarParser.While_loopContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#while_loop.
    def exitWhile_loop(self, ctx:CppGrammarParser.While_loopContext):
        pass


    # Enter a parse tree produced by CppGrammarParser#if_expression.
    def enterIf_expression(self, ctx:CppGrammarParser.If_expressionContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#if_expression.
    def exitIf_expression(self, ctx:CppGrammarParser.If_expressionContext):
        pass


    # Enter a parse tree produced by CppGrammarParser#inside_if.
    def enterInside_if(self, ctx:CppGrammarParser.Inside_ifContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#inside_if.
    def exitInside_if(self, ctx:CppGrammarParser.Inside_ifContext):
        pass


    # Enter a parse tree produced by CppGrammarParser#if_statement.
    def enterIf_statement(self, ctx:CppGrammarParser.If_statementContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#if_statement.
    def exitIf_statement(self, ctx:CppGrammarParser.If_statementContext):
        pass


    # Enter a parse tree produced by CppGrammarParser#enum_namespace_call.
    def enterEnum_namespace_call(self, ctx:CppGrammarParser.Enum_namespace_callContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#enum_namespace_call.
    def exitEnum_namespace_call(self, ctx:CppGrammarParser.Enum_namespace_callContext):
        pass


    # Enter a parse tree produced by CppGrammarParser#arithmetic_operation.
    def enterArithmetic_operation(self, ctx:CppGrammarParser.Arithmetic_operationContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#arithmetic_operation.
    def exitArithmetic_operation(self, ctx:CppGrammarParser.Arithmetic_operationContext):
        pass


    # Enter a parse tree produced by CppGrammarParser#assingment_options.
    def enterAssingment_options(self, ctx:CppGrammarParser.Assingment_optionsContext):
        pass

    # Exit a parse tree produced by CppGrammarParser#assingment_options.
    def exitAssingment_options(self, ctx:CppGrammarParser.Assingment_optionsContext):
        pass



del CppGrammarParser