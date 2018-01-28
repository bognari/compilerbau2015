package minijava; // The generated parser will belong to this package 

import minijava.MJParser.Terminals; 
// The terminals are implicitly defined in the parser
%%

// define the signature for the generated scanner
%public
%final
%class MJScanner 
%extends beaver.Scanner

// the interface between the scanner and the parser is the nextToken() method
%type beaver.Symbol 
%function nextToken 
%yylexthrow beaver.Scanner.Exception
%eofval{
	return new beaver.Symbol(Terminals.EOF, "end-of-file");
%eofval}

// store line and column information in the tokens
%line
%column

// this code will be inlined in the body of the generated scanner class
%{
  private beaver.Symbol sym(short id) {
    return new beaver.Symbol(id, yyline + 1, yycolumn + 1, yylength(), yytext());
  }
  private beaver.Symbol sym(short id, Object val) {
    return new beaver.Symbol(id, yyline + 1, yycolumn + 1, yylength(), val);
  }
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

Comment = {TraditionalComment} | {EndOfLineComment}
TraditionalComment   = "/*" ~"*/"
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?

%%

{Comment} {/* discard */}
{WhiteSpace} {/* discard */}

"class" { return sym(Terminals.CLASS); }
"extends" { return sym(Terminals.EXTENDS); }
"public" { return sym(Terminals.PUBLIC); }
"static" { return sym(Terminals.STATIC); }
"void" { return sym(Terminals.VOID); }
"main" { return sym(Terminals.MAIN); }
"String" { return sym(Terminals.STRING); }
"int" { return sym(Terminals.INT); }
"boolean" { return sym(Terminals.BOOLEAN); }
"this" { return sym(Terminals.THIS); }
"false" { return sym(Terminals.FALSE); }
"true" { return sym(Terminals.TRUE); }
"new" { return sym(Terminals.NEW); }
"length" { return sym(Terminals.LENGTH); }
"if" { return sym(Terminals.IF); }
"else" { return sym(Terminals.ELSE); }
"while" { return sym(Terminals.WHILE); }
"return" { return sym(Terminals.RETURN); }
"System.out.println" { return sym(Terminals.PRINTLN); }
"{" { return sym(Terminals.LCURLY); }
"(" { return sym(Terminals.LPAR); }
"}" { return sym(Terminals.RCURLY); }
")" { return sym(Terminals.RPAR); }
"[" { return sym(Terminals.LSQ); }
"]" { return sym(Terminals.RSQ); }
"&&" { return sym(Terminals.AND); }
"+" { return sym(Terminals.PLUS); }
"-" { return sym(Terminals.MINUS); }
"*" { return sym(Terminals.TIMES); }
"<" { return sym(Terminals.LT); }
"!" { return sym(Terminals.NOT); }
"=" { return sym(Terminals.ASSIGN); }
"." { return sym(Terminals.DOT); }
";" { return sym(Terminals.SEMICOLON); }
"," { return sym(Terminals.COMMA); }
0|[1-9][0-9]* { return sym(Terminals.INTEGER, Integer.valueOf(yytext())); }
[:jletter:][:jletterdigit:]* { return sym(Terminals.ID); }


// fall through errors
.            { throw new beaver.Scanner.Exception("illegal character \"" + yytext() + "\" at line " + yyline + "," + yycolumn); }
