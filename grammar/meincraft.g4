grammar meincraft;

prog: stat+ ;

stat
    : ID '=' expr ';'                         # AssignStat
    | 'print' expr ';'                        # PrintStat
    | ID '=' 'read' ';'                       # ReadStat
    | ID (LBRACK expr RBRACK)+ '=' expr ';'   # ArrayAssignStat
    ;

expr
  : LBRACK exprList? RBRACK              # ArrayLiteral
  | expr '*' expr                        # MulExpr
  | expr '/' expr                        # DivExpr
  | expr '+' expr                        # AddExpr
  | expr '-' expr                        # SubExpr
  | ID (LBRACK expr RBRACK)+             # ArrayAccess
  | INT                                  # IntExpr
  | FLOAT                                # FloatExpr
  | ID                                   # IdExpr
  | '(' expr ')'                         # ParensExpr
  | 'read'                               # ReadExpr
  ;

exprList
  : expr (COMMA expr)* ;

ID  : [a-zA-Z]+ ;
INT : [0-9]+ ;
FLOAT : [0-9]+ '.' [0-9]+;
WS  : [ \t\r\n]+ -> skip ;
LBRACK : '[' ;
RBRACK : ']' ;
COMMA  : ',' ;