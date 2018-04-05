grammar Pascal;

program
    : title variables main
    ;

title
    : 'program' WORD ';'
    ;

variables
    : variableDeclaration*
    ;

main
   : 'begin' operation 'end.'
   ;

operation
   : assignment
   | read
   | write
   ;

variableDeclaration
   : WORD TYPE
   ;

assignment
   : WORD ':=' arithmetics
   ;

read
   : READ '(' WORD ');'
   ;

write
    :WRITE '(' (WRITE_ARGUMENT ',')*WRITE_ARGUMENT ');'
    ;

arithmetics
   : MATH_ARGUMENT
   | '('arithmetics')'
   | MATH_ARGUMENT MATH_OPERATION arithmetics
   ;

TYPE : 'integr' | 'real' | 'double' | 'char';
WORD : [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER : [0-9]+;
READ : 'read' | 'readln';
WRITE : 'write' | 'writeln';
WRITE_ARGUMENT : WORD | NUMBER | '\'' WORD '\'';
MATH_ARGUMENT : WORD | NUMBER;
MATH_OPERATION : '+' | '-' | '*' | '/';