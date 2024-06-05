import io
import subprocess
import sys
from antlr4 import *
from CppGrammarLexer import CppGrammarLexer
from CppGrammarParser import CppGrammarParser
from CppGrammarVisitor import CppGrammarVisitor
from MyVisitor import MyVisitor

import os

from tkinter import *
import textblob

root = Tk()
root.title('C++ to Python')
root.geometry('1020x720')

def translate_it():
    translated_text.delete(1.0, END) 
    translated_text.insert(1.0, main(str(original_text.get(1.0, END))))
		
def main(s):
    output_capture = io.StringIO()
    sys.stdout = output_capture
    #input_stream = FileStream(InputStream(s))

    lexer = CppGrammarLexer(InputStream(s))
    stream = CommonTokenStream(lexer)
    parser = CppGrammarParser(stream)
    visitor = MyVisitor()

    tree = parser.program()
    
    #print(tree.toStringTree(recog=parser))
    visitor.visit(tree)

    return output_capture.getvalue()

# if __name__ == '__main__':
#     main(sys.argv)

def translate(s):
    result = subprocess.run(main(s), capture_output=True, text=True)
    output = result.stdout.strip()

    return output

original_text = Text(root, height=40, width=50)
original_text.grid(row=0, column=0, pady=20, padx=10)

translated_text = Text(root, height=40, width=50)
translated_text.grid(row=0, column=2, pady=20, padx=10)

translate_button = Button(root, text='Translate to Python', font=('Arial', 12), command=translate_it)
translate_button.grid(row=0, column=1, pady=20, padx=10)

root.mainloop()
    