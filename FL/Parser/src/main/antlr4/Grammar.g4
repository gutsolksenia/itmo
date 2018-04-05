grammar Grammar;

grammr
    : title notTerminal*
    ;

title
    : 'grammar' WORD END
    ;

notTerminal
    : WORD SEMI rul (OR rul)* END
    ;

rul
    : option+
    ;

option
    : OB option CB
    | option UN_OP
    | word+
    ;

word
   : WORD
   | LIIERAL
   | WORD UN_OP
   | LIIERAL UN_OP
   ;

WS : [ \n\t] -> skip;
OB : '(';
CB : ')';
SEMI : ':';
OR : '|';
END : ';';
WORD : [a-zA-Z_][a-zA-Z0-9_]*;
UN_OP : '+' | '*' | '?';
LIIERAL: '\'' .*? '\'';