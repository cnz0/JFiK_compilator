grammar meincraft;

prog: stat+ ;

stat
    : ID '=' expr ';'                         # AssignStat
    | 'private' ID '=' expr ';'   # PrivateAssignStat
    | 'print' expr ';'                        # PrintStat
    | ID '=' 'read' ';'                       # ReadStat
    | ID (LBRACK expr RBRACK)+ '=' expr ';'   # ArrayAssignStat
    | 'if' '(' cond=expr ')' 'then:' ifBranch+=stat+
      ('elif' '(' elifCond+=expr ')' 'then:' elifBranch+=stat+)* 
      ('else:' elseBranch+=stat+)? 'end'      # IfStat
    | 'for' '(' ID '=' expr 'to' ID '=' expr ')' 'do:' stat+ 'end' # ForStat
    | 'while' '(' expr ')' 'do:' stat+ 'end'  # WhileStat
    | functionDef                              # FunctionDefStat
    | functionCall ';'                         # FunctionCallStat
    | 'struct' ID ':' structField* 'end'       # StructDefStat
    | 'return' expr ';'                        # ReturnStat
    ;

functionDef
    : 'def' ID '(' paramList? ')' 'as:' stat+ ('return' expr ';')? 'end'
    ;

functionCall
    : ID '(' argList? ')'
    ;

paramList
    : ID (COMMA ID)*
    ;

argList
    : expr (COMMA expr)*
    ;

structField
    : ID '=' expr ';'
    ;

expr
    : expr '==' expr                      # EqExpr
    | LBRACK exprList? RBRACK             # ArrayLiteral
    | expr AND expr                       # AndExpr
    | expr OR expr                        # OrExpr
    | expr XOR expr                       # XorExpr
    | expr NEG                            # NegExpr
    | TRUE                                # TrueExpr
    | FALSE                               # FalseExpr
    | STRING                              # StringExpr
    | expr '*' expr                       # MulExpr
    | expr '/' expr                       # DivExpr
    | expr '+' expr                       # AddExpr
    | expr '-' expr                       # SubExpr
    | ID (LBRACK expr RBRACK)+            # ArrayAccess
    | ID '.' 'get' '(' ID ')'             # StructGetExpr
    | ID '.' 'set' '(' ID '=' expr ')'    # StructSetExpr
    | functionCall                        # FunctionCallExpr
    | INT                                 # IntExpr
    | FLOAT                               # FloatExpr
    | ID                                  # IdExpr
    | '(' expr ')'                        # ParensExpr
    | 'read'                              # ReadExpr
    ;

exprList
    : expr (COMMA expr)* ;

TRUE    : 'true';
FALSE   : 'false';
AND     : 'AND';
OR      : 'OR';
XOR     : 'XOR';
NEG     : 'NEG';
STRING  : '"' ( ~["\\\r\n] )* '"' ;
ID      : [a-zA-Z_][a-zA-Z_0-9]* ;
INT     : [0-9]+ ;
FLOAT   : [0-9]+ '.' [0-9]+ ;
WS      : [ \t\r\n]+ -> skip ;
LBRACK  : '[' ;
RBRACK  : ']' ;
COMMA   : ',' ;
