grammar PFunc;

program
    : entity*
    ;

entity
    : dataDeclaration
    | variableDeclaration
    | variableAssignment
    | placeholder
    | runExpression
    ;

dataDeclaration
    : DATA_KEYWORD LITERAL EQ dataConstructor (DISJ dataConstructor)*
    ;

dataConstructor
    : LITERAL (type)*
    ;

variableDeclaration
    : LITERAL COLON type
    ;

type
    : atomType ARROW type
    | atomType
    ;

atomType
    : LPAR type RPAR
    | LITERAL
    ;

variableAssignment
    : LITERAL (pattern)* EQ expression
    ;

pattern
    : LITERAL
    | LPAR LITERAL (pattern)* RPAR
    ;

expression
    : atomExpression+
    ;

atomExpression
    : LITERAL
    | LPAR expression RPAR
    ;

runExpression
    : RUN expression
    ;

placeholder
    : NEW_LINE
    ;

WS : ' ' -> skip;
NEW_LINE : '\n';
EQ: '=';
DISJ: '|';
COLON: ':';
LPAR: '(';
RPAR: ')';
ARROW: '->';
RUN: '>';
DATA_KEYWORD : 'data';
LITERAL : [a-zA-Z_][a-zA-Z0-9_]*;
