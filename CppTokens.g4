//tokes


Include         : '#include';
Namespace       : 'namespace';


Char            : 'char';
Short           : 'short';
Int             : 'int';
Long            : 'long';
Float           : 'float';
Double          : 'double';
Void            : 'void';
Bool            : 'bool';
Unsigned        : 'unsigned';
Signed          : 'signed';
Auto            : 'auto';


If              : 'if';
Else            : 'else';
For             : 'for';
While           : 'while';
Do              : 'do';
Continue        : 'continue';
Break           : 'break';
Return          : 'return';
Const           : 'const';
Case            : 'case';
Switch          : 'switch';
Struct          : 'struct';
Class           : 'class';
Enum            : 'enum';
Virtual         : 'virtual';
New             : 'new';
Delete          : 'delete';
Nullptr         : 'nullptr';
Operator        : 'operator';
Override        : 'override';
Private         : 'private';
Protected       : 'protected';
Public          : 'public';
Return          : 'return';
Sizeof          : 'sizeof';
This            : 'this';
Union           : 'union';


False           : 'false';
True            : 'true';

Increment       : '++';
Decrement       : '--';
Add             : '+';
Substract       : '-';
Multiply        : '*';
Divide          : '/';
Modulo          : '%';
Equal           : '==';
NonEqual        : '!=';
Greater         : '>';
Greater_Equal   : '>=';
Lesser          : '<';
Lesser_Equal    : '<=';
Log_And         : '&&';
Log_Or          : '||';
Log_Not         : '!';
Assign          : '=';
Assign_add      : '+=';
Assign_Substract : '-=';
Assign_Multiply : '*=';  
Assign_Devide   : '/=';
Assign_Modulo   : '%=';
Arrow           : '->';
QustionMark     : '?';
Ellipsis        : '...';



Semicolon       : ';';
Colon           : ':';
Left_Parenthesis : '(';
Right_Parenthesis : ')';
Left_Square     : '[';
Right_Square    : ']';
Left_Bracket    : '{';
Right_Bracket   : '}';
Scope_Resolution : '::';
Dot             : '.';
Comma           : ',';


ID              : [A-Za-z_][a-zA-Z_0-9]*;


Any_Literal     : Any_Int_Literal | Char_Literal | Double_Literal | Float_Literal
Int_Literal     : '-'? ( '0' | [1-9][0-9]+)
Char_Literal    : [\\s\\S]
Float_Literal   : Double_Literal ( 'f' | 'F' )
Double_Literal  : ('.' [0-9]+ | [0-9]+ '.' | [0-9]+ '.' [0-9]+) ([eE] [+-]? [0-9]+)?;

Any_Int_Literal : Int_Literal | Unsigned_Int_Literal | Long_Int_Literal | Unsigned_Long_Int_Literal | Long_Long_Int_Literal | Unsigned_Long_Long_Int_literal;

Unsigned_Int_Literal : Int_Literal ('u' | 'U');
Long_Int_Literal: Int_Literal ('l' | 'L');
Unsigned_Long_Int_Literal: Int_Literal ('u' | 'U') ('l' | 'L');
Long_Long_Int_Literal: Int_Literal ('l' | 'L') ('l' | 'L');
Unsigned_Long_Long_Int_literal: Int_Literal ('u' | 'U') ('l' | 'L') ('l' | 'L');

