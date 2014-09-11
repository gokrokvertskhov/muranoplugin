// This is a generated file. Not intended for manual editing.
package com.muranoplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.muranoplugin.psi.impl.*;

public interface MuranoTypes {

  IElementType ARGUMENTS_STATEMENT = new MuranoElementType("ARGUMENTS_STATEMENT");
  IElementType ARRAY_EXPRESSION = new MuranoElementType("ARRAY_EXPRESSION");
  IElementType ASSIGNMENT_STATEMENT = new MuranoElementType("ASSIGNMENT_STATEMENT");
  IElementType BINARY_EXPRESSION = new MuranoElementType("BINARY_EXPRESSION");
  IElementType BINARY_OPERATIONS = new MuranoElementType("BINARY_OPERATIONS");
  IElementType BODY = new MuranoElementType("BODY");
  IElementType BODY_STATEMENT = new MuranoElementType("BODY_STATEMENT");
  IElementType BRAKETED_EXPRESSION = new MuranoElementType("BRAKETED_EXPRESSION");
  IElementType CLASS_BODY = new MuranoElementType("CLASS_BODY");
  IElementType CLASS_BODY_ITEMS = new MuranoElementType("CLASS_BODY_ITEMS");
  IElementType CLASS_STATEMENT = new MuranoElementType("CLASS_STATEMENT");
  IElementType COMMENT_STATEMENT = new MuranoElementType("COMMENT_STATEMENT");
  IElementType COMPOSED_OBJECT = new MuranoElementType("COMPOSED_OBJECT");
  IElementType COMPOSED_OBJECTS = new MuranoElementType("COMPOSED_OBJECTS");
  IElementType COMPOSED_OBJECT_STATEMENT = new MuranoElementType("COMPOSED_OBJECT_STATEMENT");
  IElementType CONDITIONAL_STATEMENT = new MuranoElementType("CONDITIONAL_STATEMENT");
  IElementType CONTRACT_STATEMENT = new MuranoElementType("CONTRACT_STATEMENT");
  IElementType DEFAULT_STATEMENT = new MuranoElementType("DEFAULT_STATEMENT");
  IElementType EXPRESSION = new MuranoElementType("EXPRESSION");
  IElementType EXPR_LIST = new MuranoElementType("EXPR_LIST");
  IElementType EXTENDS_STATEMENT = new MuranoElementType("EXTENDS_STATEMENT");
  IElementType FQDN = new MuranoElementType("FQDN");
  IElementType FUNCTION_NAME = new MuranoElementType("FUNCTION_NAME");
  IElementType HEAT_ASSIGNMENT_STATEMENT = new MuranoElementType("HEAT_ASSIGNMENT_STATEMENT");
  IElementType HEAT_OUTPUTS_EXPRESSION = new MuranoElementType("HEAT_OUTPUTS_EXPRESSION");
  IElementType HEAT_PROPERTIES_EXPRESSION = new MuranoElementType("HEAT_PROPERTIES_EXPRESSION");
  IElementType HEAT_PROPERTY_NAME_SATEMENT = new MuranoElementType("HEAT_PROPERTY_NAME_SATEMENT");
  IElementType HEAT_SIMPLE_STATEMENT = new MuranoElementType("HEAT_SIMPLE_STATEMENT");
  IElementType HEAT_VALUE_STATEMENT = new MuranoElementType("HEAT_VALUE_STATEMENT");
  IElementType INDEXED_EXPRESSION = new MuranoElementType("INDEXED_EXPRESSION");
  IElementType LVALUE = new MuranoElementType("LVALUE");
  IElementType MAP_ENTRY_ELEMENT = new MuranoElementType("MAP_ENTRY_ELEMENT");
  IElementType MAP_EXPRESSION = new MuranoElementType("MAP_EXPRESSION");
  IElementType METHOD_CALL_EXPRESSION = new MuranoElementType("METHOD_CALL_EXPRESSION");
  IElementType METHOD_COMPONENT = new MuranoElementType("METHOD_COMPONENT");
  IElementType METHOD_COMPONENTS = new MuranoElementType("METHOD_COMPONENTS");
  IElementType METHOD_ITEM = new MuranoElementType("METHOD_ITEM");
  IElementType METHOD_ITEMS = new MuranoElementType("METHOD_ITEMS");
  IElementType MURANOPL = new MuranoElementType("MURANOPL");
  IElementType MURANOPL_STATEMENT = new MuranoElementType("MURANOPL_STATEMENT");
  IElementType NAMEPSACED_CLASS = new MuranoElementType("NAMEPSACED_CLASS");
  IElementType NAMESPACES_STATEMENT = new MuranoElementType("NAMESPACES_STATEMENT");
  IElementType NAMESPACE_ITEM = new MuranoElementType("NAMESPACE_ITEM");
  IElementType NAMESPACE_ITEMS = new MuranoElementType("NAMESPACE_ITEMS");
  IElementType NON_LIST_BODY = new MuranoElementType("NON_LIST_BODY");
  IElementType NON_LIST_STATEMEMNT = new MuranoElementType("NON_LIST_STATEMEMNT");
  IElementType PARENTHESIZED_EXPRESSION = new MuranoElementType("PARENTHESIZED_EXPRESSION");
  IElementType PROPERTIES_ITEMS = new MuranoElementType("PROPERTIES_ITEMS");
  IElementType PROPERTIES_STATEMENT = new MuranoElementType("PROPERTIES_STATEMENT");
  IElementType PROPERTY_ITEM = new MuranoElementType("PROPERTY_ITEM");
  IElementType PROPERTY_ITEM_ELEM = new MuranoElementType("PROPERTY_ITEM_ELEM");
  IElementType PROPERTY_ITEM_ELEMS = new MuranoElementType("PROPERTY_ITEM_ELEMS");
  IElementType RESOURCES_EXPRESSION = new MuranoElementType("RESOURCES_EXPRESSION");
  IElementType RETURN_EXPRESSION = new MuranoElementType("RETURN_EXPRESSION");
  IElementType STATEMENT = new MuranoElementType("STATEMENT");
  IElementType SUB_METHOD = new MuranoElementType("SUB_METHOD");
  IElementType SUB_PROPERTY = new MuranoElementType("SUB_PROPERTY");
  IElementType THIS_PROPERTY = new MuranoElementType("THIS_PROPERTY");
  IElementType TYPE_EXPRESSION = new MuranoElementType("TYPE_EXPRESSION");
  IElementType UNARY_EXPRESSION = new MuranoElementType("UNARY_EXPRESSION");
  IElementType USAGE_STATEMENT = new MuranoElementType("USAGE_STATEMENT");
  IElementType VARIABLE = new MuranoElementType("VARIABLE");
  IElementType WORKFLOWS_STATEMENT = new MuranoElementType("WORKFLOWS_STATEMENT");

  IElementType ARGUMENTS_TOKEN = new MuranoTokenType("Arguments:");
  IElementType ASSIGN_TOKEN = new MuranoTokenType("ASSIGN_TOKEN");
  IElementType BODY_TOKEN = new MuranoTokenType("Body:");
  IElementType BOOL_TOKEN_F = new MuranoTokenType("False");
  IElementType BOOL_TOKEN_T = new MuranoTokenType("True");
  IElementType CLASSBODYITEMS_2_0 = new MuranoTokenType("classBodyItems_2_0");
  IElementType COMMA_TOKEN = new MuranoTokenType("COMMA_TOKEN");
  IElementType COMMENT_TOKEN = new MuranoTokenType("COMMENT_TOKEN");
  IElementType COMPOSEDOBJECTS_2_0 = new MuranoTokenType("composedObjects_2_0");
  IElementType CONTRACT_TOKEN = new MuranoTokenType("Contract:");
  IElementType DEFAULTNS_TOKEN = new MuranoTokenType("DEFAULTNS_TOKEN");
  IElementType DEFAULT_TOKEN = new MuranoTokenType("Default:");
  IElementType DOLLAR_TOKEN = new MuranoTokenType("$");
  IElementType DOT_TOKEN = new MuranoTokenType(".");
  IElementType ELSE_TOKEN = new MuranoTokenType("Else:");
  IElementType EOF = new MuranoTokenType("EOF");
  IElementType EXPR_LIST_2_0 = new MuranoTokenType("expr_list_2_0");
  IElementType EXTENDS_TOKEN = new MuranoTokenType("Extends:");
  IElementType FN_DICT_TOKEN = new MuranoTokenType("FN_DICT_TOKEN");
  IElementType FN_FORMAT_TOKEN = new MuranoTokenType("FN_FORMAT_TOKEN");
  IElementType FN_NEW_TOKEN = new MuranoTokenType("FN_NEW_TOKEN");
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
  IElementType MAPEXPRESSION_2_0 = new MuranoTokenType("mapExpression_2_0");
  IElementType MAP_TOKEN = new MuranoTokenType("MAP_TOKEN");
  IElementType METHODCOMPONENTS_2_0 = new MuranoTokenType("methodComponents_2_0");
  IElementType METHODITEMS_2_0 = new MuranoTokenType("methodItems_2_0");
  IElementType METHODS_TOKEN = new MuranoTokenType("Methods:");
  IElementType MPL_BOOL_FALSE = new MuranoTokenType("false");
  IElementType MPL_BOOL_TRUE = new MuranoTokenType("true");
  IElementType MURANOPL_2_0 = new MuranoTokenType("muranopl_2_0");
  IElementType NAMESPACEITEMS_2_0 = new MuranoTokenType("namespaceItems_2_0");
  IElementType NAMESPACE_TOKEN = new MuranoTokenType("Namespaces:");
  IElementType NAME_TOKEN = new MuranoTokenType("Name:");
  IElementType NEWLINE = new MuranoTokenType("NEWLINE");
  IElementType NON_LIST_BODY_1_0 = new MuranoTokenType("non_list_body_1_0");
  IElementType NON_LIST_STATEMEMNT_6_0 = new MuranoTokenType("non_list_statememnt_6_0");
  IElementType NULL_TOKEN = new MuranoTokenType("NULL_TOKEN");
  IElementType NUMBER = new MuranoTokenType("NUMBER");
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
  IElementType PROPERTIESITEMS_2_0 = new MuranoTokenType("propertiesItems_2_0");
  IElementType PROPERTIES_TOKEN = new MuranoTokenType("PROPERTIES_TOKEN");
  IElementType PROPERTYITEMELEM_3_0 = new MuranoTokenType("propertyItemElem_3_0");
  IElementType RBRAKETS_TOKEN = new MuranoTokenType("RBRAKETS_TOKEN");
  IElementType RETURN_TOKEN = new MuranoTokenType("Return:");
  IElementType RPAREN_TOKEN = new MuranoTokenType("RPAREN_TOKEN");
  IElementType RSQBR_TOKEN = new MuranoTokenType("RSQBR_TOKEN");
  IElementType STRING = new MuranoTokenType("STRING");
  IElementType SUB_METHOD_2_0 = new MuranoTokenType("sub_method_2_0");
  IElementType THEN_TOKEN = new MuranoTokenType("THEN_TOKEN");
  IElementType USAGE_INOUT_TOKEN = new MuranoTokenType("USAGE_INOUT_TOKEN");
  IElementType USAGE_IN_TOKEN = new MuranoTokenType("USAGE_IN_TOKEN");
  IElementType USAGE_OUT_TOKEN = new MuranoTokenType("USAGE_OUT_TOKEN");
  IElementType USAGE_RUNTIME_TOKEN = new MuranoTokenType("USAGE_RUNTIME_TOKEN");
  IElementType USAGE_TOKEN = new MuranoTokenType("Usage:");
  IElementType WORKFLOW_TOKEN = new MuranoTokenType("Workflow:");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ARGUMENTS_STATEMENT) {
        return new MuranoArgumentsStatementImpl(node);
      }
      else if (type == ARRAY_EXPRESSION) {
        return new MuranoArrayExpressionImpl(node);
      }
      else if (type == ASSIGNMENT_STATEMENT) {
        return new MuranoAssignmentStatementImpl(node);
      }
      else if (type == BINARY_EXPRESSION) {
        return new MuranoBinaryExpressionImpl(node);
      }
      else if (type == BINARY_OPERATIONS) {
        return new MuranoBinaryOperationsImpl(node);
      }
      else if (type == BODY) {
        return new MuranoBodyImpl(node);
      }
      else if (type == BODY_STATEMENT) {
        return new MuranoBodyStatementImpl(node);
      }
      else if (type == BRAKETED_EXPRESSION) {
        return new MuranoBraketedExpressionImpl(node);
      }
      else if (type == CLASS_BODY) {
        return new MuranoClassBodyImpl(node);
      }
      else if (type == CLASS_BODY_ITEMS) {
        return new MuranoClassBodyItemsImpl(node);
      }
      else if (type == CLASS_STATEMENT) {
        return new MuranoClassStatementImpl(node);
      }
      else if (type == COMMENT_STATEMENT) {
        return new MuranoCommentStatementImpl(node);
      }
      else if (type == COMPOSED_OBJECT) {
        return new MuranoComposedObjectImpl(node);
      }
      else if (type == COMPOSED_OBJECTS) {
        return new MuranoComposedObjectsImpl(node);
      }
      else if (type == COMPOSED_OBJECT_STATEMENT) {
        return new MuranoComposedObjectStatementImpl(node);
      }
      else if (type == CONDITIONAL_STATEMENT) {
        return new MuranoConditionalStatementImpl(node);
      }
      else if (type == CONTRACT_STATEMENT) {
        return new MuranoContractStatementImpl(node);
      }
      else if (type == DEFAULT_STATEMENT) {
        return new MuranoDefaultStatementImpl(node);
      }
      else if (type == EXPRESSION) {
        return new MuranoExpressionImpl(node);
      }
      else if (type == EXPR_LIST) {
        return new MuranoExprListImpl(node);
      }
      else if (type == EXTENDS_STATEMENT) {
        return new MuranoExtendsStatementImpl(node);
      }
      else if (type == FQDN) {
        return new MuranoFqdnImpl(node);
      }
      else if (type == FUNCTION_NAME) {
        return new MuranoFunctionNameImpl(node);
      }
      else if (type == HEAT_ASSIGNMENT_STATEMENT) {
        return new MuranoHeatAssignmentStatementImpl(node);
      }
      else if (type == HEAT_OUTPUTS_EXPRESSION) {
        return new MuranoHeatOutputsExpressionImpl(node);
      }
      else if (type == HEAT_PROPERTIES_EXPRESSION) {
        return new MuranoHeatPropertiesExpressionImpl(node);
      }
      else if (type == HEAT_PROPERTY_NAME_SATEMENT) {
        return new MuranoHeatPropertyNameSatementImpl(node);
      }
      else if (type == HEAT_SIMPLE_STATEMENT) {
        return new MuranoHeatSimpleStatementImpl(node);
      }
      else if (type == HEAT_VALUE_STATEMENT) {
        return new MuranoHeatValueStatementImpl(node);
      }
      else if (type == INDEXED_EXPRESSION) {
        return new MuranoIndexedExpressionImpl(node);
      }
      else if (type == LVALUE) {
        return new MuranoLvalueImpl(node);
      }
      else if (type == MAP_ENTRY_ELEMENT) {
        return new MuranoMapEntryElementImpl(node);
      }
      else if (type == MAP_EXPRESSION) {
        return new MuranoMapExpressionImpl(node);
      }
      else if (type == METHOD_CALL_EXPRESSION) {
        return new MuranoMethodCallExpressionImpl(node);
      }
      else if (type == METHOD_COMPONENT) {
        return new MuranoMethodComponentImpl(node);
      }
      else if (type == METHOD_COMPONENTS) {
        return new MuranoMethodComponentsImpl(node);
      }
      else if (type == METHOD_ITEM) {
        return new MuranoMethodItemImpl(node);
      }
      else if (type == METHOD_ITEMS) {
        return new MuranoMethodItemsImpl(node);
      }
      else if (type == MURANOPL) {
        return new MuranoMuranoplImpl(node);
      }
      else if (type == MURANOPL_STATEMENT) {
        return new MuranoMuranoplStatementImpl(node);
      }
      else if (type == NAMEPSACED_CLASS) {
        return new MuranoNamepsacedClassImpl(node);
      }
      else if (type == NAMESPACES_STATEMENT) {
        return new MuranoNamespacesStatementImpl(node);
      }
      else if (type == NAMESPACE_ITEM) {
        return new MuranoNamespaceItemImpl(node);
      }
      else if (type == NAMESPACE_ITEMS) {
        return new MuranoNamespaceItemsImpl(node);
      }
      else if (type == NON_LIST_BODY) {
        return new MuranoNonListBodyImpl(node);
      }
      else if (type == NON_LIST_STATEMEMNT) {
        return new MuranoNonListStatememntImpl(node);
      }
      else if (type == PARENTHESIZED_EXPRESSION) {
        return new MuranoParenthesizedExpressionImpl(node);
      }
      else if (type == PROPERTIES_ITEMS) {
        return new MuranoPropertiesItemsImpl(node);
      }
      else if (type == PROPERTIES_STATEMENT) {
        return new MuranoPropertiesStatementImpl(node);
      }
      else if (type == PROPERTY_ITEM) {
        return new MuranoPropertyItemImpl(node);
      }
      else if (type == PROPERTY_ITEM_ELEM) {
        return new MuranoPropertyItemElemImpl(node);
      }
      else if (type == PROPERTY_ITEM_ELEMS) {
        return new MuranoPropertyItemElemsImpl(node);
      }
      else if (type == RESOURCES_EXPRESSION) {
        return new MuranoResourcesExpressionImpl(node);
      }
      else if (type == RETURN_EXPRESSION) {
        return new MuranoReturnExpressionImpl(node);
      }
      else if (type == STATEMENT) {
        return new MuranoStatementImpl(node);
      }
      else if (type == SUB_METHOD) {
        return new MuranoSubMethodImpl(node);
      }
      else if (type == SUB_PROPERTY) {
        return new MuranoSubPropertyImpl(node);
      }
      else if (type == THIS_PROPERTY) {
        return new MuranoThisPropertyImpl(node);
      }
      else if (type == TYPE_EXPRESSION) {
        return new MuranoTypeExpressionImpl(node);
      }
      else if (type == UNARY_EXPRESSION) {
        return new MuranoUnaryExpressionImpl(node);
      }
      else if (type == USAGE_STATEMENT) {
        return new MuranoUsageStatementImpl(node);
      }
      else if (type == VARIABLE) {
        return new MuranoVariableImpl(node);
      }
      else if (type == WORKFLOWS_STATEMENT) {
        return new MuranoWorkflowsStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
