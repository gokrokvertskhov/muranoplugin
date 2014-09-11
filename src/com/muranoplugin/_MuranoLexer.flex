package com.muranoplugin;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.muranoplugin.psi.MuranoTypes.*;

%%

%{
  public _MuranoLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _MuranoLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")
COMMENT_TOKEN=[ \t\n\x0B\f\r]*#[\p[:letter:]\,\.\:\$\(\) \t]*
NUMBER=[0-9]+(\.[0-9]*)?
PROPERTIES_TOKEN=[ \t\n\x0B\f\r]*Properties:
USAGE_IN_TOKEN=[ \t\n\x0B\f\r]+In[ \t\n\x0B\f\r]+
USAGE_OUT_TOKEN=[ \t\n\x0B\f\r]+Out[ \t\n\x0B\f\r]+
USAGE_INOUT_TOKEN=[ \t\n\x0B\f\r]+InOut[ \t\n\x0B\f\r]+
USAGE_RUNTIME_TOKEN=[ \t\n\x0B\f\r]+Runtime[ \t\n\x0B\f\r]+
IF_TOKEN=[ \t\n\x0B\f\r]*If\:[ \t\n\x0B\f\r]*
THEN_TOKEN=[ \t\n\x0B\f\r]*Then\:
MAP_TOKEN=[ \t\n\x0B\f\r]*=>[ \t\n\x0B\f\r]*
INDENT=[ \t\n\x0B\f\r]+\-[ \t\n\x0B\f\r]+
NULL_TOKEN=[ \t\n\x0B\f\r]*null[ \t]*
DEFAULTNS_TOKEN=[ \t\n\x0B\f\r]+\=\:[ \t\n\x0B\f\r]+
ASSIGN_TOKEN=[ \t\n\x0B\f\r]*\:[ \t]*
LPAREN_TOKEN=[ \t\n\x0B\f\r]*\([ \t\n\x0B\f\r]*
RPAREN_TOKEN=[ \t\n\x0B\f\r]*\)
LBRAKETS_TOKEN=[ \t\n\x0B\f\r]*\{[ \t\n\x0B\f\r]*
RBRAKETS_TOKEN=[ \t\n\x0B\f\r]*\}
LSQBR_TOKEN=[ \t\n\x0B\f\r]*\[[ \t\n\x0B\f\r]*
RSQBR_TOKEN=[ \t\n\x0B\f\r]*\]
OP_PLUS=[ \t\n\x0B\f\r]*\+[ \t\n\x0B\f\r]*
OP_MINUS=[ \t\n\x0B\f\r]*\-m[ \t\n\x0B\f\r]*
OP_MULT=[ \t\n\x0B\f\r]*\*[ \t\n\x0B\f\r]*
OP_DIV=[ \t\n\x0B\f\r]*"/"[ \t\n\x0B\f\r]*
COMMA_TOKEN=[ \t\n\x0B\f\r]*,[ \t\n\x0B\f\r]*
NEWLINE=\n
OP_AND=[ \t\n\x0B\f\r]*and[ \t\n\x0B\f\r]*
OP_OR=[ \t\n\x0B\f\r]*or[ \t\n\x0B\f\r]*
OP_EQ=[ \t\n\x0B\f\r]*\=[ \t\n\x0B\f\r]*
OP_NOT=[ \t\n\x0B\f\r]*not[ \t\n\x0B\f\r]*
OP_LS=[ \t\n\x0B\f\r]*\<[ \t\n\x0B\f\r]*
OP_LE=[ \t\n\x0B\f\r]*\<\=[ \t\n\x0B\f\r]*
OP_GR=[ \t\n\x0B\f\r]*\>[ \t\n\x0B\f\r]*
OP_GE=[ \t\n\x0B\f\r]*\>\=[ \t\n\x0B\f\r]*
OP_NE=[ \t\n\x0B\f\r]*\!\=[ \t\n\x0B\f\r]*
OP_N=[ \t\n\x0B\f\r]*\![ \t\n\x0B\f\r]*
FN_NEW_TOKEN=[ \t\n\x0B\f\r]*new
FN_FORMAT_TOKEN=[ \t\n\x0B\f\r]*format
FN_DICT_TOKEN=[ \t\n\x0B\f\r]*dict
HRESOURCES_TOKEN=[ \t\n\x0B\f\r]+resources\:[ \t\n\x0B\f\r]*
HTYPE_TOKEN=[ \t\n\x0B\f\r]type\:[ \t\n\x0B\f\r]*
HPROPERTIES_TOKEN=[ \t\n\x0B\f\r]*properties\:[ \t\n\x0B\f\r]*
HOUTPUTS_TOKEN=[ \t\n\x0B\f\r]+outputs\:[ \t\n\x0B\f\r]*
HVALUE_TOKEN=[ \t\n\x0B\f\r]+value\:[ \t\n\x0B\f\r]+
ID=[\p[:letter:]\_]*

%%
<YYINITIAL> {
  {WHITE_SPACE}              { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "Namespaces:"              { return NAMESPACE_TOKEN; }
  "Name:"                    { return NAME_TOKEN; }
  "Workflow:"                { return WORKFLOW_TOKEN; }
  "Methods:"                 { return METHODS_TOKEN; }
  "Parameters:"              { return PARAMETERS_TOKEN; }
  "Extends:"                 { return EXTENDS_TOKEN; }
  "Contract:"                { return CONTRACT_TOKEN; }
  "Arguments:"               { return ARGUMENTS_TOKEN; }
  "Default:"                 { return DEFAULT_TOKEN; }
  "Usage:"                   { return USAGE_TOKEN; }
  "Return:"                  { return RETURN_TOKEN; }
  "Else:"                    { return ELSE_TOKEN; }
  "Body:"                    { return BODY_TOKEN; }
  "True"                     { return BOOL_TOKEN_T; }
  "False"                    { return BOOL_TOKEN_F; }
  "true"                     { return MPL_BOOL_TRUE; }
  "false"                    { return MPL_BOOL_FALSE; }
  "$"                        { return DOLLAR_TOKEN; }
  "."                        { return DOT_TOKEN; }
  "!"                        { return OP_NEG; }
  "EOF"                      { return EOF; }

  {STRING}                   { return STRING; }
  {COMMENT_TOKEN}            { return COMMENT_TOKEN; }
  {NUMBER}                   { return NUMBER; }
  {PROPERTIES_TOKEN}         { return PROPERTIES_TOKEN; }
  {USAGE_IN_TOKEN}           { return USAGE_IN_TOKEN; }
  {USAGE_OUT_TOKEN}          { return USAGE_OUT_TOKEN; }
  {USAGE_INOUT_TOKEN}        { return USAGE_INOUT_TOKEN; }
  {USAGE_RUNTIME_TOKEN}      { return USAGE_RUNTIME_TOKEN; }
  {IF_TOKEN}                 { return IF_TOKEN; }
  {THEN_TOKEN}               { return THEN_TOKEN; }
  {MAP_TOKEN}                { return MAP_TOKEN; }
  {INDENT}                   { return INDENT; }
  {NULL_TOKEN}               { return NULL_TOKEN; }
  {DEFAULTNS_TOKEN}          { return DEFAULTNS_TOKEN; }
  {ASSIGN_TOKEN}             { return ASSIGN_TOKEN; }
  {LPAREN_TOKEN}             { return LPAREN_TOKEN; }
  {RPAREN_TOKEN}             { return RPAREN_TOKEN; }
  {LBRAKETS_TOKEN}           { return LBRAKETS_TOKEN; }
  {RBRAKETS_TOKEN}           { return RBRAKETS_TOKEN; }
  {LSQBR_TOKEN}              { return LSQBR_TOKEN; }
  {RSQBR_TOKEN}              { return RSQBR_TOKEN; }
  {OP_PLUS}                  { return OP_PLUS; }
  {OP_MINUS}                 { return OP_MINUS; }
  {OP_MULT}                  { return OP_MULT; }
  {OP_DIV}                   { return OP_DIV; }
  {COMMA_TOKEN}              { return COMMA_TOKEN; }
  {NEWLINE}                  { return NEWLINE; }
  {OP_AND}                   { return OP_AND; }
  {OP_OR}                    { return OP_OR; }
  {OP_EQ}                    { return OP_EQ; }
  {OP_NOT}                   { return OP_NOT; }
  {OP_LS}                    { return OP_LS; }
  {OP_LE}                    { return OP_LE; }
  {OP_GR}                    { return OP_GR; }
  {OP_GE}                    { return OP_GE; }
  {OP_NE}                    { return OP_NE; }
  {OP_N}                     { return OP_N; }
  {FN_NEW_TOKEN}             { return FN_NEW_TOKEN; }
  {FN_FORMAT_TOKEN}          { return FN_FORMAT_TOKEN; }
  {FN_DICT_TOKEN}            { return FN_DICT_TOKEN; }
  {HRESOURCES_TOKEN}         { return HRESOURCES_TOKEN; }
  {HTYPE_TOKEN}              { return HTYPE_TOKEN; }
  {HPROPERTIES_TOKEN}        { return HPROPERTIES_TOKEN; }
  {HOUTPUTS_TOKEN}           { return HOUTPUTS_TOKEN; }
  {HVALUE_TOKEN}             { return HVALUE_TOKEN; }
  {ID}                       { return ID; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
