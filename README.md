# simpleInterpretor

Basic interpretor that features integers, while loops, if-else statements, and more. 

Language Grammar: 

prog::= statement

statement::= input | output | assignment | conditional | loop 

input::= input(ID);

output::= output(exp);

assignment::= ID is exp; 

loop::= while(relation) block

conditional::= if(relation) block (else block)? 

relation::= exp equals exp | exp is not exp | exp less than exp | exp greater than exp | exp less or equal exp | exp greater or equal exp 

block::= {statement*}

exp::= exp plus term. | exp minus term. | term

term::= term times factor. | term divided by factor. | term modulo factor. | factor 

factor ::= ID | INT | (exp) 
