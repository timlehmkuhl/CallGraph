/** Simple statically-typed programming language with functions and variables
 *  taken from "Language Implementation Patterns" book.
 */
grammar Cymbol;

file:   (functionDecl | varDecl)+ ;

varDecl
    :   type ID ('=' expr)? ';'
    ;
type:   'float' | 'int' | 'void' ; // user-defined types

functionDecl
    :   type ID '(' formalParameters? ')' block // "void f(int x) {...}"
    ;

formalParameters
    :   formalParameter (',' formalParameter)*
    ;
formalParameter
    :   type ID
    ;

block:  '{' stat* '}' ;   // possibly empty statement block

stat:   block       # NoReturn
    |   varDecl     # NoReturn
    |   'if' expr stat ('else' stat)? # NoReturn
    |   'return' expr? ';'              # Return
    |   expr '=' expr ';'  # NoReturn // assignment
    |   expr ';'          # NoReturn // func call
    ;

/* expr below becomes the following non-left recursive rule:
expr[int _p]
    :   ( '-' expr[6]
        | '!' expr[5]
        | ID
        | INT
        | '(' expr ')'
        )
        ( {8 >= $_p}? '*' expr[9]
        | {7 >= $_p}? ('+'|'-') expr[8]
        | {4 >= $_p}? '==' expr[5]
        | {10 >= $_p}? '[' expr ']'
        | {9 >= $_p}? '(' exprList? ')'
        )*
    ;
*/

expr:   ID '(' exprList? ')'    # CallExpr
    |   expr '[' expr ']'       # NonCallExpr
    |   '-' expr                # NonCallExpr
    |   '!' expr                # NonCallExpr
    |   expr ('*'|'/') expr     # NonCallExpr
    |   expr ('+'|'-') expr     # NonCallExpr
    |   expr '==' expr          # NonCallExpr
    |   expr '!=' expr          # NonCallExpr
    |   expr '<' expr           # NonCallExpr
    |   expr '>' expr           # NonCallExpr
    |   expr '>=' expr          # NonCallExpr
    |   expr '<=' expr          # NonCallExpr
    |   ID                      # NonCallExpr
    |   INT                     # NonCallExpr
    |   '(' expr ')'            # NonCallExpr
    ;

exprList : expr (',' expr)* ;   // arg list

K_FLOAT : 'float';
K_INT   : 'int';
K_VOID  : 'void';
ID  :   LETTER (LETTER | [0-9])* ;
fragment
LETTER : [a-zA-Z] ;

INT :   [0-9]+ ;

WS  :   [ \t\n\r]+ -> skip ;

SL_COMMENT
    :   '//' .*? '\n' -> skip
    ;