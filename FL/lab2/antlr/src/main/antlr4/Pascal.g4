grammar Pascal;

programm
    : variables  main '.'
    ;

variables
    :
    | 'var' variableDeclaration*
    ;

main
   : 'begin' operation* 'end'
   ;

operation
   : write
   | read
   | assignment
   | 'var' variableDeclaration
   | ifOp
   | ifOp elseCase
   | whileCase
   ;

whileCase
    : WHILE_LITERAL logic DO_LITERAL  codeBlock
    ;

variableDeclaration
   : variablesList ':' TYPE SEMI
   ;


variablesList
   : (WORD ',')* WORD
   ;

assignment
   : WORD ':=' math SEMI
   ;

read
   : READ OB readArgumentList CB SEMI
   ;

readArgumentList
   : (WORD ',')* WORD
   ;

write
    : WRITE OB writeArgumentList CB SEMI
    | WRITELN
    ;

writeArgumentList
   : (writeArgument ',')* writeArgument
   ;

writeArgument
   : STRING_LITERAL
   | math
   ;

math
   : mathArgument
   | OB math CB
   | math MATH_OPERATION math
   ;

mathArgument
   : WORD
   | NUMBER
   ;

ifOp
    : ifCase THEN codeBlock
    ;

ifCase
    : IF_LITERAL logic
    ;

logic
    : math LOGIC_OPERATION math
    ;

elseCase
    : ELSE_LITERAL codeBlock
    ;

codeBlock
    : main
    | operation
    ;

WS : [ \n\t] -> skip;
IF_LITERAL : 'if';
DO_LITERAL : 'do';
THEN : 'then';
ELSE_LITERAL: 'else';
WHILE_LITERAL : 'while';
TYPE : 'integer';
WRITELN : 'writeln();';
WRITE : 'write' | 'writeln';
READ : 'read' | 'readln';
OB : '(';
CB : ')';
SEMI: ';';
LOGIC_OPERATION: '>' | '<' | '=' | '>=' | '<=' | '!=';
MATH_OPERATION : '+' | '-' | '*' | '/';
NUMBER : [0-9]+;
WORD : [a-zA-Z_][a-zA-Z0-9_]*;
STRING_LITERAL : '\'' .*? '\'';