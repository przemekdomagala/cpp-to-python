// Tokens

INCLUDE         : '#include';
NAMESPACE       : 'namespace';
INCLUDELITERAL  : [<"] ~[<>"' \t\r\n\f]+ [>"];


CHAR            : 'char';
SHORT           : 'short';
INT             : 'int';
LONG            : 'long';
FLOAT           : 'float';
DOUBLE          : 'double';
VOID            : 'void';
BOOL            : 'bool';
UNSIGNED        : 'unsigned';
AUTO            : 'auto';
INT_TYPE        : UNSIGNED? LONG{0,2} INT


IF              : 'if';
ELSE            : 'else';
FOR             : 'for';
WHILE           : 'while';
DO              : 'do';
CONTINUE        : 'continue';
BREAK           : 'break';
RETURN          : 'return';
CONST           : 'const';
CASE            : 'case';
SWITCH          : 'switch';
STRUCT          : 'struct';
CLASS           : 'class';
ENUM            : 'enum';
VIRTUAL         : 'virtual';
NEW             : 'new';
DELETE          : 'delete';
NULLPTR         : 'nullptr';
OPERATOR        : 'operator';
OVERRIDE        : 'override';
PRIVATE         : 'private';
PROTECTED       : 'protected';
PUBLIC          : 'public';
SIZEOF          : 'sizeof';
THIS            : 'this';


FALSE           : 'false';
TRUE            : 'true';

INCREMENT       : '++';
DECREMENT       : '--';
ADD             : '+';
SUBSTRACT       : '-';
MULTIPLY        : '*';
DIVIDE          : '/';
MODULO          : '%';
EQUAL           : '==';
NONEQUAL        : '!=';
GREATER         : '>';
GREATER_EQUAL   : '>=';
LESSER          : '<';
LESSER_EQUAL    : '<=';
LOG_AND         : '&&';
LOG_OR          : '||';
LOG_NOT         : '!';
ASSIGN          : '=';
ASSIGN_ADD      : '+=';
ASSIGN_SUBSTRACT : '-=';
ASSIGN_MULTIPLY : '*=';  
ASSIGN_DIVIDE   : '/=';
ASSIGN_MODULO   : '%=';
ARROW           : '->';
QUESTION_MARK   : '?';
ELLIPSIS        : '...';



SEMICOLON       : ';';
COLON           : ':';
LEFT_PARENTHESIS : '(';
RIGHT_PARENTHESIS : ')';
LEFT_SQUARE     : '[';
RIGHT_SQUARE    : ']';
LEFT_BRACKET    : '{';
RIGHT_BRACKET   : '}';
SCOPE_RESOLUTION : '::';
DOT             : '.';
COMMA           : ',';


ID              : [A-Za-z_][a-zA-Z_0-9]*;

ANY_LITERAL     : ANY_INT_LITERAL | CHAR_LITERAL | DOUBLE_LITERAL | FLOAT_LITERAL
INT_LITERAL     : '-'? ( '0' | [1-9][0-9]+)
CHAR_LITERAL    : [\\s\\S]
FLOAT_LITERAL   : DOUBLE_LITERAL ( 'f' | 'F' )
DOUBLE_LITERAL  : ('.' [0-9]+ | [0-9]+ '.' | [0-9]+ '.' [0-9]+) ([eE] [+-]? [0-9]+)?;

ANY_INT_LITERAL : INT_LITERAL | UNSIGNED_INT_LITERAL | LONG_INT_LITERAL | UNSIGNED_LONG_INT_LITERAL | LONG_LONG_INT_LITERAL | UNSIGNED_LONG_LONG_INT_LITERAL;

UNSIGNED_INT_LITERAL : INT_LITERAL ('u' | 'U');
LONG_INT_LITERAL: INT_LITERAL ('l' | 'L');
UNSIGNED_LONG_INT_LITERAL: INT_LITERAL ('u' | 'U') ('l' | 'L');
LONG_LONG_INT_LITERAL: INT_LITERAL ('l' | 'L') ('l' | 'L');
UNSIGNED_LONG_LONG_INT_LITERAL: INT_LITERAL ('u' | 'U') ('l' | 'L') ('l' | 'L');
