# Generated from CppGrammar.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .CppGrammarParser import CppGrammarParser
else:
    from CppGrammarParser import CppGrammarParser

# This class defines a complete generic visitor for a parse tree produced by CppGrammarParser.

class CppGrammarVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by CppGrammarParser#program.
    def visitProgram(self, ctx:CppGrammarParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CppGrammarParser#include.
    def visitInclude(self, ctx:CppGrammarParser.IncludeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CppGrammarParser#statement.
    def visitStatement(self, ctx:CppGrammarParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CppGrammarParser#namespace.
    def visitNamespace(self, ctx:CppGrammarParser.NamespaceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CppGrammarParser#enum.
    def visitEnum(self, ctx:CppGrammarParser.EnumContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CppGrammarParser#struct.
    def visitStruct(self, ctx:CppGrammarParser.StructContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CppGrammarParser#struct_body.
    def visitStruct_body(self, ctx:CppGrammarParser.Struct_bodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CppGrammarParser#variable_declaration.
    def visitVariable_declaration(self, ctx:CppGrammarParser.Variable_declarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CppGrammarParser#variable.
    def visitVariable(self, ctx:CppGrammarParser.VariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CppGrammarParser#assign.
    def visitAssign(self, ctx:CppGrammarParser.AssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CppGrammarParser#function.
    def visitFunction(self, ctx:CppGrammarParser.FunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CppGrammarParser#function_scope.
    def visitFunction_scope(self, ctx:CppGrammarParser.Function_scopeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CppGrammarParser#function_call.
    def visitFunction_call(self, ctx:CppGrammarParser.Function_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CppGrammarParser#for_loop.
    def visitFor_loop(self, ctx:CppGrammarParser.For_loopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CppGrammarParser#loop_scope.
    def visitLoop_scope(self, ctx:CppGrammarParser.Loop_scopeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CppGrammarParser#while_loop.
    def visitWhile_loop(self, ctx:CppGrammarParser.While_loopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CppGrammarParser#if_expression.
    def visitIf_expression(self, ctx:CppGrammarParser.If_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CppGrammarParser#inside_if.
    def visitInside_if(self, ctx:CppGrammarParser.Inside_ifContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CppGrammarParser#if_statement.
    def visitIf_statement(self, ctx:CppGrammarParser.If_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CppGrammarParser#enum_namespace_call.
    def visitEnum_namespace_call(self, ctx:CppGrammarParser.Enum_namespace_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CppGrammarParser#arithmetic_operation.
    def visitArithmetic_operation(self, ctx:CppGrammarParser.Arithmetic_operationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CppGrammarParser#assingment_options.
    def visitAssingment_options(self, ctx:CppGrammarParser.Assingment_optionsContext):
        return self.visitChildren(ctx)



del CppGrammarParser