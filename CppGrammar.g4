grammar CppGrammar;

INCLUDE         : '#include';
NAMESPACE       : 'namespace';



CHAR            : 'char';
SHORT           : 'short';
INT_TYPE        : UNSIGNED? LONG{0,2} INT;
INT             : 'int';
LONG            : 'long';
FLOAT           : 'float';
DOUBLE          : 'double';
VOID            : 'void';
BOOL            : 'bool';
UNSIGNED        : 'unsigned';
AUTO            : 'auto';


IF              : 'if';
ELSE            : 'else';
FOR             : 'for';
WHILE           : 'while';
CONTINUE        : 'continue';
BREAK           : 'break';
RETURN          : 'return';
CONST           : 'const';
STATIC          : 'static';
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

BOOL_LITERAL    : (FALSE | TRUE);
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

INT_LITERAL     : '-'? ( '0' | [1-9][0-9]*);
CHAR_LITERAL    : '\'' (~['\r\n] | '\\\'') '\'';
FLOAT_LITERAL   : DOUBLE_LITERAL ( 'f' | 'F' );
DOUBLE_LITERAL  : ('.' [0-9]+ | [0-9]+ '.' | [0-9]+ '.' [0-9]+) ([eE] [+-]? [0-9]+)?;

ANY_LITERAL     : (INT_LITERAL | CHAR_LITERAL | DOUBLE_LITERAL | FLOAT_LITERAL | BOOL_LITERAL);
INCLUDELITERAL : [<"] ~[<>"' \t\r\n\f]+ [>"];
Whitespace      : [ \t\r\n\f]+ -> skip;

program: (include | statement)+;
include: INCLUDE INCLUDELITERAL;
statement: enum_namespace_call? (namespace | enum | variable | function | struct);
namespace: NAMESPACE ID LEFT_BRACKET function* variable* struct* enum* RIGHT_BRACKET SEMICOLON;
enum: ENUM CLASS? ID LEFT_BRACKET ((ID (ASSIGN INT_LITERAL)?) (COMMA ID (ASSIGN INT_LITERAL)?)*)?  RIGHT_BRACKET SEMICOLON;
struct: STRUCT ID LEFT_BRACKET struct_body RIGHT_BRACKET SEMICOLON;
struct_body: ((PRIVATE | PUBLIC | PROTECTED) COLON)? (variable | function) (((PRIVATE | PUBLIC | PROTECTED) COLON)? (variable | function))*;
variable: STATIC? CONST? (UNSIGNED? CHAR ID (ASSIGN (CHAR_LITERAL | enum_namespace_call? ID))? | UNSIGNED? SHORT ID (ASSIGN (INT_LITERAL | enum_namespace_call? ID))? | UNSIGNED? LONG LONG? ID (ASSIGN (INT_LITERAL | enum_namespace_call? ID))? | UNSIGNED? LONG? LONG? INT ID (ASSIGN (INT_LITERAL | enum_namespace_call? ID))? | FLOAT ID (ASSIGN (FLOAT_LITERAL | enum_namespace_call? ID))?  | DOUBLE ID (ASSIGN (DOUBLE_LITERAL | enum_namespace_call? ID))? | BOOL ID (ASSIGN (BOOL_LITERAL | enum_namespace_call? ID))? | AUTO ID ASSIGN (INT_LITERAL | CHAR_LITERAL | DOUBLE_LITERAL | FLOAT_LITERAL | BOOL_LITERAL | enum_namespace_call? ID)) SEMICOLON;
assign: ID ASSIGN (enum_namespace_call? ID | (INT_LITERAL | CHAR_LITERAL | DOUBLE_LITERAL | FLOAT_LITERAL | BOOL_LITERAL) | function_call) SEMICOLON;
function: STATIC? CONST? (VOID | UNSIGNED? CHAR | UNSIGNED? SHORT | UNSIGNED? LONG | UNSIGNED? INT | FLOAT | DOUBLE | BOOL) ID LEFT_PARENTHESIS (variable (COMMA variable)*)? RIGHT_PARENTHESIS LEFT_BRACKET function_scope RIGHT_BRACKET;
function_scope: (for_loop | while_loop | arithmetic_operation SEMICOLON | if_statement | function_call | variable | assign | enum_namespace_call ID)* (RETURN (enum_namespace_call? ID | (INT_LITERAL | CHAR_LITERAL | DOUBLE_LITERAL | FLOAT_LITERAL | BOOL_LITERAL))? SEMICOLON)?;
function_call: enum_namespace_call? ID LEFT_PARENTHESIS (enum_namespace_call? ID | (INT_LITERAL | CHAR_LITERAL | DOUBLE_LITERAL | FLOAT_LITERAL | BOOL_LITERAL))? (COMMA(ID | (INT_LITERAL | CHAR_LITERAL | DOUBLE_LITERAL | FLOAT_LITERAL | BOOL_LITERAL)))* RIGHT_PARENTHESIS;
for_loop: FOR LEFT_PARENTHESIS variable if_expression SEMICOLON arithmetic_operation RIGHT_PARENTHESIS LEFT_BRACKET loop_scope RIGHT_BRACKET;
loop_scope: ((for_loop | while_loop | BREAK SEMICOLON | CONTINUE SEMICOLON | arithmetic_operation SEMICOLON | if_statement | variable | assign | function_call | RETURN (enum_namespace_call? ID | (INT_LITERAL | CHAR_LITERAL | DOUBLE_LITERAL | FLOAT_LITERAL | BOOL_LITERAL))? | enum_namespace_call? SEMICOLON))*;
while_loop: WHILE LEFT_PARENTHESIS LOG_NOT? (TRUE | FALSE | (enum_namespace_call? ID (LESSER | LESSER_EQUAL | GREATER | GREATER_EQUAL | EQUAL | NONEQUAL) (enum_namespace_call? ID | (INT_LITERAL | CHAR_LITERAL | DOUBLE_LITERAL | FLOAT_LITERAL | BOOL_LITERAL))) ((LOG_AND | LOG_OR) LOG_NOT? enum_namespace_call? ID (TRUE | FALSE | LESSER | LESSER_EQUAL | GREATER | GREATER_EQUAL | EQUAL | NONEQUAL) (enum_namespace_call? ID | (INT_LITERAL | CHAR_LITERAL | DOUBLE_LITERAL | FLOAT_LITERAL | BOOL_LITERAL)))*) RIGHT_PARENTHESIS LEFT_BRACKET loop_scope RIGHT_BRACKET;
if_expression: LOG_NOT? enum_namespace_call? ID (LESSER | LESSER_EQUAL | GREATER | GREATER_EQUAL | EQUAL | NONEQUAL) (enum_namespace_call? ID | (INT_LITERAL | CHAR_LITERAL | DOUBLE_LITERAL | FLOAT_LITERAL | BOOL_LITERAL)) ((LOG_AND | LOG_OR) LOG_NOT? enum_namespace_call? ID (LESSER | LESSER_EQUAL | GREATER | GREATER_EQUAL | EQUAL | NONEQUAL) (enum_namespace_call? ID | (INT_LITERAL | CHAR_LITERAL | DOUBLE_LITERAL | FLOAT_LITERAL | BOOL_LITERAL)))*;
if_statement: IF LEFT_PARENTHESIS if_expression RIGHT_PARENTHESIS LEFT_BRACKET loop_scope RIGHT_BRACKET (ELSE IF LEFT_PARENTHESIS if_expression RIGHT_PARENTHESIS LEFT_BRACKET loop_scope RIGHT_BRACKET)* (ELSE LEFT_BRACKET loop_scope RIGHT_BRACKET)?;
enum_namespace_call: ID SCOPE_RESOLUTION (ID SCOPE_RESOLUTION)*;
arithmetic_operation: ID (INCREMENT | DECREMENT | ASSIGN_ADD (assingment_options) | ASSIGN_SUBSTRACT (assingment_options) | ASSIGN_MULTIPLY (assingment_options) | ASSIGN_DIVIDE (assingment_options));
assingment_options: enum_namespace_call? ID | (INT_LITERAL | CHAR_LITERAL | DOUBLE_LITERAL | FLOAT_LITERAL | BOOL_LITERAL) | function_call;
