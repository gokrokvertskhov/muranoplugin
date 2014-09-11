// This is a generated file. Not intended for manual editing.
package com.muranoplugin.lex.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.muranoplugin.psi.MuranoElementType;
import com.muranoplugin.psi.MuranoTokenType;
import com.muranoplugin.lex.psi.impl.*;

public interface MuranoTypes {

  IElementType ROOT_ELEMENT = new MuranoElementType("ROOT_ELEMENT");

  IElementType ARGUMENTS_TOKEN = new MuranoTokenType("Arguments:");
  IElementType ASSIGN_TOKEN = new MuranoTokenType("ASSIGN_TOKEN");
  IElementType BODY_TOKEN = new MuranoTokenType("Body:");
  IElementType BOOL_TOKEN_F = new MuranoTokenType("False");
  IElementType BOOL_TOKEN_T = new MuranoTokenType("True");
  IElementType CLASS_NS_TOKEN = new MuranoTokenType("CLASS_NS_TOKEN");
  IElementType COMMA_TOKEN = new MuranoTokenType("COMMA_TOKEN");
  IElementType COMMENT_TOKEN = new MuranoTokenType("COMMENT_TOKEN");
  IElementType CONTRACT_TOKEN = new MuranoTokenType("Contract:");
  IElementType DEFAULTNS_TOKEN = new MuranoTokenType("DEFAULTNS_TOKEN");
  IElementType DEFAULT_TOKEN = new MuranoTokenType("Default:");
  IElementType DOLLAR_TOKEN = new MuranoTokenType("$");
  IElementType DOT_TOKEN = new MuranoTokenType(".");
  IElementType ELSE_TOKEN = new MuranoTokenType("Else:");
  IElementType EXTENDS_TOKEN = new MuranoTokenType("Extends:");
  IElementType FN_BIND_TOKEN = new MuranoTokenType("FN_BIND_TOKEN");
  IElementType FN_CLASS_TOKEN = new MuranoTokenType("FN_CLASS_TOKEN");
  IElementType FN_COAL_TOKEN = new MuranoTokenType("FN_COAL_TOKEN");
  IElementType FN_DICT_TOKEN = new MuranoTokenType("FN_DICT_TOKEN");
  IElementType FN_FIND_TOKEN = new MuranoTokenType("FN_FIND_TOKEN");
  IElementType FN_FORMAT_TOKEN = new MuranoTokenType("FN_FORMAT_TOKEN");
  IElementType FN_GETATTR_TOKEN = new MuranoTokenType("FN_GETATTR_TOKEN");
  IElementType FN_INT_TOKEN = new MuranoTokenType("FN_INT_TOKEN");
  IElementType FN_NEW_TOKEN = new MuranoTokenType("FN_NEW_TOKEN");
  IElementType FN_SETATTR_TOKEN = new MuranoTokenType("FN_SETATTR_TOKEN");
  IElementType FN_STRING_TOKEN = new MuranoTokenType("FN_STRING_TOKEN");
  IElementType HOUTPUTS_TOKEN = new MuranoTokenType("HOUTPUTS_TOKEN");
  IElementType HPROPERTIES_TOKEN = new MuranoTokenType("HPROPERTIES_TOKEN");
  IElementType HRESOURCES_TOKEN = new MuranoTokenType("HRESOURCES_TOKEN");
  IElementType HTYPE_TOKEN = new MuranoTokenType("HTYPE_TOKEN");
  IElementType HVALUE_TOKEN = new MuranoTokenType("HVALUE_TOKEN");
  IElementType ID = new MuranoTokenType("ID");
  IElementType IF_TOKEN = new MuranoTokenType("IF_TOKEN");
  IElementType INDENT = new MuranoTokenType("INDENT");
  IElementType LBRAKETS_TOKEN = new MuranoTokenType("LBRAKETS_TOKEN");
  IElementType LPAREN_TOKEN = new MuranoTokenType("LPAREN_TOKEN");
  IElementType LSQBR_TOKEN = new MuranoTokenType("LSQBR_TOKEN");
  IElementType MAP_TOKEN = new MuranoTokenType("MAP_TOKEN");
  IElementType METHODS_TOKEN = new MuranoTokenType("Methods:");
  IElementType METHOD_CALL_TOKEN = new MuranoTokenType("METHOD_CALL_TOKEN");
  IElementType MPL_BOOL_FALSE = new MuranoTokenType("false");
  IElementType MPL_BOOL_TRUE = new MuranoTokenType("true");
  IElementType NAMESPACE_TOKEN = new MuranoTokenType("Namespaces:");
  IElementType NAME_TOKEN = new MuranoTokenType("Name:");
  IElementType NEWLINE = new MuranoTokenType("NEWLINE");
  IElementType NULL_TOKEN = new MuranoTokenType("NULL_TOKEN");
  IElementType NUMBER = new MuranoTokenType("number");
  IElementType OP_AND = new MuranoTokenType("OP_AND");
  IElementType OP_DIV = new MuranoTokenType("OP_DIV");
  IElementType OP_EQ = new MuranoTokenType("OP_EQ");
  IElementType OP_GE = new MuranoTokenType("OP_GE");
  IElementType OP_GR = new MuranoTokenType("OP_GR");
  IElementType OP_LE = new MuranoTokenType("OP_LE");
  IElementType OP_LS = new MuranoTokenType("OP_LS");
  IElementType OP_MINUS = new MuranoTokenType("OP_MINUS");
  IElementType OP_MULT = new MuranoTokenType("OP_MULT");
  IElementType OP_N = new MuranoTokenType("OP_N");
  IElementType OP_NE = new MuranoTokenType("OP_NE");
  IElementType OP_NEG = new MuranoTokenType("!");
  IElementType OP_NOT = new MuranoTokenType("OP_NOT");
  IElementType OP_OR = new MuranoTokenType("OP_OR");
  IElementType OP_PLUS = new MuranoTokenType("OP_PLUS");
  IElementType PARAMETERS_TOKEN = new MuranoTokenType("Parameters:");
  IElementType PROPERTIES_TOKEN = new MuranoTokenType("PROPERTIES_TOKEN");
  IElementType PROPERTY_TOKEN = new MuranoTokenType("PROPERTY_TOKEN");
  IElementType RBRAKETS_TOKEN = new MuranoTokenType("RBRAKETS_TOKEN");
  IElementType RETURN_TOKEN = new MuranoTokenType("Return:");
  IElementType RPAREN_TOKEN = new MuranoTokenType("RPAREN_TOKEN");
  IElementType RSQBR_TOKEN = new MuranoTokenType("RSQBR_TOKEN");
  IElementType STRING = new MuranoTokenType("string");
  IElementType SUBITEM_TOKEN = new MuranoTokenType("SUBITEM_TOKEN");
  IElementType THEN_TOKEN = new MuranoTokenType("THEN_TOKEN");
  IElementType USAGE_INOUT_TOKEN = new MuranoTokenType("USAGE_INOUT_TOKEN");
  IElementType USAGE_IN_TOKEN = new MuranoTokenType("USAGE_IN_TOKEN");
  IElementType USAGE_OUT_TOKEN = new MuranoTokenType("USAGE_OUT_TOKEN");
  IElementType USAGE_RUNTIME_TOKEN = new MuranoTokenType("USAGE_RUNTIME_TOKEN");
  IElementType USAGE_TOKEN = new MuranoTokenType("Usage:");
  IElementType VARIABLE_TOKEN = new MuranoTokenType("VARIABLE_TOKEN");
  IElementType WORKFLOW_TOKEN = new MuranoTokenType("Workflow:");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ROOT_ELEMENT) {
        return new MuranoLexRootElementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
