import sys
from antlr4 import *
from CppGrammarLexer import CppGrammarLexer
from CppGrammarParser import CppGrammarParser
from CppGrammarVisitor import CppGrammarVisitor
from MyVisitor import MyVisitor

def main(argv):
    input_stream = FileStream(argv[1])

    lexer = CppGrammarLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = CppGrammarParser(stream)
    visitor = MyVisitor()

    tree = parser.program()
    
    print(tree.toStringTree(recog=parser))
    visitor.visit(tree)
if __name__ == '__main__':
    main(sys.argv)
    