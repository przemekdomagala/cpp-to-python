from CppGrammarParser import CppGrammarParser
from CppGrammarVisitor import CppGrammarVisitor

class MyVisitor(CppGrammarVisitor):
    def __init__(self):
        super()
        
    def visitProgram(self, ctx: CppGrammarParser.ProgramContext):
        isEnum = False
        for child in ctx.children:
            object_types = [type(obj).__name__ for obj in child.children]
            if("EnumContext" in object_types):
                isEnum = True
        if(isEnum):
            print("from enum import Enum, auto")
        return super().visitProgram(ctx)
    
    def visitStatement(self, ctx: CppGrammarParser.StatementContext):
        return super().visitStatement(ctx)
    
    def visitClass(self, ctx: CppGrammarParser.ClassContext):
        print("class "+str(ctx.ID(0)), end="")
        if(ctx.COLON()):
            print("(", end="")
            for i in range(1, len(ctx.ID())):
                if i+1 == len(ctx.ID()):
                    print(str(ctx.ID(i)), end=")")
                else:
                    print(ctx.ID()[i], end=", ")
        
        print(":")
        MyVisitor.visitClass_scope(self, ctx.class_scope(), 1)

    def visitClass_scope(self, ctx: CppGrammarParser.Class_scopeContext, tabs=0):
        object_types = [type(obj).__name__ for obj in ctx.children]
        #print(object_types)
        default = True
        for i in range(len(ctx.children)):
            if default and object_types[i] != "TerminalNodeImpl": 
                    func = getattr(MyVisitor, "visit"+object_types[i].replace("Context", ""))
                    if "visitFunction" in str(func):
                        tabs_ = ""
                        for i in range(tabs):
                            tabs_ += "    "
                        print(tabs_, end="")
                        print("def __", end="")
                        MyVisitor.visitClassFunction(self, ctx.children[i], tabs)
                    elif "visitVariable" in str(func):
                        tabs_ = ""
                        for i in range(tabs):
                            tabs_ += "    "
                        print(tabs_, end="")
                        print("__", end="")
                        func(self, ctx.children[i])
                        print()
                    elif "visitConstructor" in str(func):
                        func(self, ctx.children[i], tabs)
            elif(str(ctx.children[i]) == 'public'):
                default = False
                j = i+2
                while(str(ctx.children[j]) != 'private' and str(ctx.children[j]) != 'public' and str(ctx.children[j]) != 'protected'):
                    if object_types[j] != "TerminalNodeImpl":
                        func = getattr(MyVisitor, "visit"+object_types[j].replace("Context", ""))
                        if "visitFunction" in str(func):
                            tabs_ = ""
                            for i in range(tabs):
                                tabs_ += "    "
                            print(tabs_, end="")
                            print("def ", end="")
                            MyVisitor.visitClassFunction(self, ctx.children[j], tabs)
                        elif "visitVariable" in str(func):
                            tabs_ = ""
                            for i in range(tabs):
                                tabs_ += "    "
                            print(tabs_, end="")
                            func(self, ctx.children[j])
                            print()
                        elif "visitConstructor" in str(func):
                            func(self, ctx.children[j], tabs)
                    j+=1
                    if j == len(ctx.children):
                        break

            elif(str(ctx.children[i]) == 'protected'):
                default = False
                j = i+2
                while(str(ctx.children[j]) != 'private' and str(ctx.children[j]) != 'public' and str(ctx.children[j]) != 'protected'):
                    if object_types[j] != "TerminalNodeImpl":
                        func = getattr(MyVisitor, "visit"+object_types[j].replace("Context", ""))
                        if "visitFunction" in str(func):
                            tabs_ = ""
                            for i in range(tabs):
                                tabs_ += "    "
                            print(tabs_, end="")
                            print("def _", end="")
                            MyVisitor.visitClassFunction(self, ctx.children[j], tabs)
                        elif "visitVariable" in str(func):
                            tabs_ = ""
                            for i in range(tabs):
                                tabs_ += "    "
                            print(tabs_, end="")
                            print("_", end="")
                            func(self, ctx.children[j])
                            print()
                        elif "visitConstructor" in str(func):
                            print("_", end="")
                            func(self, ctx.children[j], tabs)
                    j+=1
                    if j == len(ctx.children):
                        break

            elif(str(ctx.children[i]) == 'private'):
                default = False
                j = i+2
                while(str(ctx.children[j]) != 'private' and str(ctx.children[j]) != 'public' and str(ctx.children[j]) != 'protected'):
                    if object_types[j] != "TerminalNodeImpl":
                        func = getattr(MyVisitor, "visit"+object_types[j].replace("Context", ""))
                        if "visitFunction" in str(func):
                            tabs_ = ""
                            for i in range(tabs):
                                tabs_ += "    "
                            print(tabs_, end="")
                            print("def __", end="")
                            MyVisitor.visitClassFunction(self, ctx.children[j], tabs)
                        elif "visitVariable" in str(func):
                            tabs_ = ""
                            for i in range(tabs):
                                tabs_ += "    "
                            print(tabs_, end="")
                            print("__", end="")
                            func(self, ctx.children[j])
                            print()
                        elif "visitConstructor" in str(func):
                            tabs_ = ""
                            for i in range(tabs):
                                tabs_ += "    "
                            print(tabs_, end="")
                            print("__", end="")
                            func(self, ctx.children[j], tabs)
                    j+=1
                    if j == len(ctx.children):
                        break


    def visitClassFunction(self, ctx: CppGrammarParser.FunctionContext, tabs=0):
        
        print(""+str(ctx.ID())+str(ctx.LEFT_PARENTHESIS()), end="self")

        if(ctx.variable()):
            print(", ", end="")

        for i in range(len(ctx.variable())):
            if i+1 == len(ctx.variable()):
                MyVisitor.visitVariable(self, ctx.variable()[i], parameter=True)
            else:
                MyVisitor.visitVariable(self, ctx.variable()[i], parameter=True)
                print(", ", end="")
        print(str(ctx.RIGHT_PARENTHESIS())+":")
        MyVisitor.visitFunction_scope(self, ctx.function_scope(), tabs+1)

    def visitConstructor(self, ctx: CppGrammarParser.ConstructorContext, tabs=0):
        tabs_ = ""
        for i in range(tabs):
            tabs_ += "    "
        print(tabs_, end="")
        
        print("def __init__(self", end="")
        
        if(ctx.variable()):
            print(", ", end="")

        for i in range(len(ctx.variable())):
            if i+1 == len(ctx.variable()):
                MyVisitor.visitVariable(self, ctx.variable()[i], parameter=True)
            else:
                MyVisitor.visitVariable(self, ctx.variable()[i], parameter=True)
                print(", ", end="")
        print(str(ctx.RIGHT_PARENTHESIS())+":")
        MyVisitor.visitFunction_scope(self, ctx.function_scope(), tabs+1)

    def visitEnum(self, ctx: CppGrammarParser.EnumContext):
        print("class "+str(ctx.ID(0))+"(Enum):")
        for i in range(2, len(ctx.children)):
            if ctx.children[i] in ctx.ID():
                if ctx.children[i+1] in ctx.ASSIGN():
                    print("    "+str(ctx.children[i])+" "+str(ctx.children[i+1])+" "+str(ctx.children[i+2]))
                else:
                    print("    "+str(ctx.children[i])+" = auto()")
        return super().visitEnum(ctx)
    
    def visitInclude(self, ctx: CppGrammarParser.IncludeContext):
        print("import "+str(ctx.INCLUDELITERAL()).replace('<', '').replace('>', ''))
        return super().visitInclude(ctx)
    
    def visitVariable(self, ctx: CppGrammarParser.VariableContext, tabs=0, parameter=False):
        tabs_ = ""
        for i in range(tabs):
            tabs_ += "    "
        print(tabs_, end="")
        if(ctx.ASSIGN()):
            print(ctx.ID(0), end=" ")
            print(ctx.ASSIGN(), end=" ")
            if(ctx.CHAR_LITERAL()):
                print(ctx.CHAR_LITERAL(), end="")
            elif(ctx.INT_LITERAL()):
                print(ctx.INT_LITERAL(), end="")
            elif(ctx.FLOAT_LITERAL()):
                print(str(ctx.FLOAT_LITERAL()).replace("f", "").replace("F", ""), end="")        
            elif(ctx.DOUBLE_LITERAL()):
                print(ctx.DOUBLE_LITERAL(), end="") 
            elif(ctx.BOOL_LITERAL()):
                print(str(ctx.BOOL_LITERAL()).replace("t", "T").replace("f", "F"), end="")
            elif(ctx.enum_namespace_call()):
                MyVisitor.visitEnum_namespace_call(self, ctx.enum_namespace_call())
                print(str(ctx.ID(1))+".value", end="")
        else: 
            if not parameter:
                print(ctx.ID(0), end=" = None")
            else:
                print(ctx.ID(0), end="")

    def visitEnum_namespace_call(self, ctx: CppGrammarParser.Enum_namespace_callContext):
        print(" "+str(ctx.ID(0))+".", end="")

    def visitInside_if(self, ctx: CppGrammarParser.Inside_ifContext):
        for i in range(len(ctx.children)):
            if i+1 == len(ctx.children):
                print(ctx.children[i], end="")
            else:
                print(ctx.children[i], end=" ")

    def visitIf_expression(self, ctx: CppGrammarParser.If_expressionContext):

        for i in range(len(ctx.children)):
            if(ctx.children[i] in ctx.LOG_NOT()):
                print("not", end=" ")
            elif(ctx.children[i] in ctx.LOG_AND()):
                print(" and", end=" ")
            elif(ctx.children[i] in ctx.LOG_OR()):
                print(" or", end=" ")
            elif(ctx.children[i] in ctx.inside_if()):
                MyVisitor.visitInside_if(self, ctx.children[i])  
    
    def visitIf_statement(self, ctx: CppGrammarParser.If_statementContext, tabs=0):
        tabs_ = ""
        for i in range(tabs):
            tabs_ += "    "
        print(tabs_, end="")
        
        print("if ", end="")
        MyVisitor.visitIf_expression(self, ctx.if_expression()[0])
        print(":")
        MyVisitor.visitLoop_scope(self, ctx.loop_scope()[0], tabs+1)

        for i in range(len(ctx.ELSE_IF())):
            print(tabs_, end="")
            print("elif", end=" ")
            MyVisitor.visitIf_expression(self, ctx.if_expression()[i+1])
            print(":")
            MyVisitor.visitLoop_scope(self, ctx.loop_scope()[i+1], tabs+1)

        if(ctx.ELSE()):
            print(tabs_, end="")
            print("else:")
            MyVisitor.visitLoop_scope(self, ctx.loop_scope()[len(ctx.loop_scope())-1], tabs+1)

    def visitLoop_scope(self, ctx: CppGrammarParser.Loop_scopeContext, tabs=0):
        for j in range(len(ctx.children)):
            if(ctx.children[j] in ctx.if_statement()):
                MyVisitor.visitIf_statement(self, ctx.children[j], tabs)
            elif(ctx.children[j] in ctx.assign()):
                MyVisitor.visitAssign(self, ctx.children[j], tabs)
            elif(ctx.children[j] in ctx.BREAK()):
                tabs_ = ""
                for i in range(tabs):
                    tabs_ += "    "
                print(tabs_, end="")
                print("break")
            elif(ctx.children[j] in ctx.CONTINUE()):
                tabs_ = ""
                for i in range(tabs):
                    tabs_ += "    "
                print(tabs_, end="")
                print("continue")
            elif(ctx.children[j] in ctx.variable_declaration()):
                MyVisitor.visitVariable_declaration(self, ctx.children[j], tabs)
                print()
            elif(ctx.children[j] in ctx.arithmetic_operation()):
                MyVisitor.visitArithmetic_operation(self, ctx.children[j], tabs)

    def visitArithmetic_operation(self, ctx: CppGrammarParser.Arithmetic_operationContext, tabs=0):
        tabs_ = ""
        for i in range(tabs):
            tabs_ += "    "
        print(tabs_, end="")
        
        print(ctx.ID(), end=" ")
        if(ctx.INCREMENT()):
            print("+= 1")
        elif ctx.DECREMENT():
            print("-= 1")
        else:
            print(str(ctx.children[1])+" ", end="")
            MyVisitor.visitAssingment_options(self, ctx.children[2])
        #return super().visitArithmetic_operation(ctx)

    def visitAssingment_options(self, ctx: CppGrammarParser.Assingment_optionsContext):
        print(ctx.children[0])

    def visitFor_loop(self, ctx: CppGrammarParser.For_loopContext, tabs=0):
        tabs_ = ""
        for i in range(tabs):
            tabs_ += "    "
        print(tabs_, end="")
        
        print("while ", end="")
        MyVisitor.visitIf_expression(self, ctx.if_expression())
        print(":")
        MyVisitor.visitArithmetic_operation(self, ctx.arithmetic_operation(), tabs+1)
        MyVisitor.visitLoop_scope(self, ctx.loop_scope(), tabs+1)

        #return super().visitFor_loop(ctx)
    
    def visitAssign(self, ctx: CppGrammarParser.AssignContext, tabs=0):
        tabs_ = ""
        for i in range(tabs):
            tabs_ += "    "
        print(tabs_, end="")
        
        print(str(ctx.ID(0))+" "+str(ctx.ASSIGN())+" ", end="")
        if(ctx.CHAR_LITERAL()):
            print(ctx.CHAR_LITERAL())
        elif(ctx.INT_LITERAL()):
            print(ctx.INT_LITERAL())
        elif(ctx.FLOAT_LITERAL()):
            print(str(ctx.FLOAT_LITERAL()).replace("f", "").replace("F", ""))        
        elif(ctx.DOUBLE_LITERAL()):
            print(ctx.DOUBLE_LITERAL()) 
        elif(ctx.BOOL_LITERAL()):
            print(str(ctx.BOOL_LITERAL()).replace("t", "T").replace("f", "F"))
    
    def visitVariable_declaration(self, ctx: CppGrammarParser.Variable_declarationContext, tabs=0):
        MyVisitor.visitVariable(self, ctx.variable(), tabs)

    def visitFunction(self, ctx: CppGrammarParser.FunctionContext, tabs=0):
        tabs_ = ""
        for i in range(tabs):
            tabs_ += "    "
        print(tabs_, end="")
        
        if(ctx.STATIC()):
            print("@staticmethod")
        print("def "+str(ctx.ID())+str(ctx.LEFT_PARENTHESIS()), end="")
        for i in range(len(ctx.variable())):
            if i+1 == len(ctx.variable()):
                MyVisitor.visitVariable(self, ctx.variable()[i], parameter=True)
            else:
                MyVisitor.visitVariable(self, ctx.variable()[i], parameter=True)
                print(", ", end="")
        print(str(ctx.RIGHT_PARENTHESIS())+":")
        MyVisitor.visitFunction_scope(self, ctx.function_scope(), 1)

    def visitFunction_scope(self, ctx: CppGrammarParser.Function_scopeContext, tabs=0):
        object_types = [type(obj).__name__ for obj in ctx.children]
        #print(object_types)
        for i in range(len(object_types)):
            if object_types[i] != "TerminalNodeImpl":
                func = getattr(MyVisitor, "visit"+object_types[i].replace("Context", ""))
                func(self, ctx.children[i], tabs)
                if("Variable_declaration" in object_types[i]):
                    print()
            if(str(ctx.children[i]) in "return"):
                tabs_ = ""
                for i in range(tabs):
                    tabs_ += "    "
                print(tabs_, end="")
                print("return "+str(ctx.children[i+1]), end="")

    def visitWhile_loop(self, ctx: CppGrammarParser.While_loopContext, tabs=0):
        tabs_ = ""
        for i in range(tabs):
            tabs_ += "    "
        print(tabs_, end="")

        print("while ", end="")
        
        MyVisitor.visitIf_expression(self, ctx.if_expression())
        print(":")
        MyVisitor.visitLoop_scope(self, ctx.loop_scope(), tabs+1)