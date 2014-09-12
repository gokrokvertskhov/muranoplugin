// This is a generated file. Not intended for manual editing.
package com.muranoplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static com.muranoplugin.psi.MuranoTypes.*;
import static com.muranoplugin.parser.MuranoParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MuranoParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("com.muranoplugin.parser.MuranoParser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, EXTENDS_SETS_);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == ARGUMENTS_STATEMENT) {
      result_ = argumentsStatement(builder_, 0);
    }
    else if (root_ == ARRAY_EXPRESSION) {
      result_ = arrayExpression(builder_, 0);
    }
    else if (root_ == ASSIGNMENT_STATEMENT) {
      result_ = assignmentStatement(builder_, 0);
    }
    else if (root_ == BINARY_EXPRESSION) {
      result_ = binaryExpression(builder_, 0);
    }
    else if (root_ == BINARY_OPERATIONS) {
      result_ = binary_operations(builder_, 0);
    }
    else if (root_ == BODY) {
      result_ = body(builder_, 0);
    }
    else if (root_ == BODY_STATEMENT) {
      result_ = bodyStatement(builder_, 0);
    }
    else if (root_ == BRAKETED_EXPRESSION) {
      result_ = braketedExpression(builder_, 0);
    }
    else if (root_ == CLASS_BODY) {
      result_ = classBody(builder_, 0);
    }
    else if (root_ == CLASS_BODY_ITEMS) {
      result_ = classBodyItems(builder_, 0);
    }
    else if (root_ == CLASS_STATEMENT) {
      result_ = classStatement(builder_, 0);
    }
    else if (root_ == COMMENT_STATEMENT) {
      result_ = commentStatement(builder_, 0);
    }
    else if (root_ == COMPOSED_OBJECT) {
      result_ = composedObject(builder_, 0);
    }
    else if (root_ == COMPOSED_OBJECT_STATEMENT) {
      result_ = composedObjectStatement(builder_, 0);
    }
    else if (root_ == COMPOSED_OBJECTS) {
      result_ = composedObjects(builder_, 0);
    }
    else if (root_ == CONDITIONAL_STATEMENT) {
      result_ = conditionalStatement(builder_, 0);
    }
    else if (root_ == CONTRACT_STATEMENT) {
      result_ = contractStatement(builder_, 0);
    }
    else if (root_ == DEFAULT_STATEMENT) {
      result_ = defaultStatement(builder_, 0);
    }
    else if (root_ == EXPR_LIST) {
      result_ = expr_list(builder_, 0);
    }
    else if (root_ == EXPRESSION) {
      result_ = expression(builder_, 0);
    }
    else if (root_ == EXTENDS_STATEMENT) {
      result_ = extendsStatement(builder_, 0);
    }
    else if (root_ == FOR_STATEMENT) {
      result_ = forStatement(builder_, 0);
    }
    else if (root_ == FQDN) {
      result_ = fqdn(builder_, 0);
    }
    else if (root_ == FUNCTION_NAME) {
      result_ = function_name(builder_, 0);
    }
    else if (root_ == HEAT_ASSIGNMENT_STATEMENT) {
      result_ = heatAssignmentStatement(builder_, 0);
    }
    else if (root_ == HEAT_OUTPUTS_EXPRESSION) {
      result_ = heatOutputsExpression(builder_, 0);
    }
    else if (root_ == HEAT_PROPERTIES_EXPRESSION) {
      result_ = heatPropertiesExpression(builder_, 0);
    }
    else if (root_ == HEAT_PROPERTY_NAME_SATEMENT) {
      result_ = heatPropertyNameSatement(builder_, 0);
    }
    else if (root_ == HEAT_SIMPLE_STATEMENT) {
      result_ = heatSimpleStatement(builder_, 0);
    }
    else if (root_ == HEAT_VALUE_STATEMENT) {
      result_ = heatValueStatement(builder_, 0);
    }
    else if (root_ == INDEXED_EXPRESSION) {
      result_ = indexedExpression(builder_, 0);
    }
    else if (root_ == LIST_ELEM) {
      result_ = list_elem(builder_, 0);
    }
    else if (root_ == LIST_OF_EXPR) {
      result_ = list_of_expr(builder_, 0);
    }
    else if (root_ == LVALUE) {
      result_ = lvalue(builder_, 0);
    }
    else if (root_ == MAP_ENTRY_ELEMENT) {
      result_ = mapEntryElement(builder_, 0);
    }
    else if (root_ == MAP_EXPRESSION) {
      result_ = mapExpression(builder_, 0);
    }
    else if (root_ == METHOD_COMPONENT) {
      result_ = methodComponent(builder_, 0);
    }
    else if (root_ == METHOD_COMPONENTS) {
      result_ = methodComponents(builder_, 0);
    }
    else if (root_ == METHOD_ITEM) {
      result_ = methodItem(builder_, 0);
    }
    else if (root_ == METHOD_ITEMS) {
      result_ = methodItems(builder_, 0);
    }
    else if (root_ == METHOD_USAGE_STATEMENT) {
      result_ = methodUsageStatement(builder_, 0);
    }
    else if (root_ == METHOD_CALL_EXPRESSION) {
      result_ = method_callExpression(builder_, 0);
    }
    else if (root_ == MURANOPL) {
      result_ = muranopl(builder_, 0);
    }
    else if (root_ == MURANOPL_STATEMENT) {
      result_ = muranoplStatement(builder_, 0);
    }
    else if (root_ == NAMEPSACED_CLASS) {
      result_ = namepsaced_class(builder_, 0);
    }
    else if (root_ == NAMESPACE_ITEM) {
      result_ = namespaceItem(builder_, 0);
    }
    else if (root_ == NAMESPACE_ITEMS) {
      result_ = namespaceItems(builder_, 0);
    }
    else if (root_ == NAMESPACES_STATEMENT) {
      result_ = namespacesStatement(builder_, 0);
    }
    else if (root_ == NON_LIST_BODY) {
      result_ = non_list_body(builder_, 0);
    }
    else if (root_ == NON_LIST_STATEMEMNT) {
      result_ = non_list_statememnt(builder_, 0);
    }
    else if (root_ == PARENTHESIZED_EXPRESSION) {
      result_ = parenthesizedExpression(builder_, 0);
    }
    else if (root_ == PROPERTIES_ITEMS) {
      result_ = propertiesItems(builder_, 0);
    }
    else if (root_ == PROPERTIES_STATEMENT) {
      result_ = propertiesStatement(builder_, 0);
    }
    else if (root_ == PROPERTY_ITEM) {
      result_ = propertyItem(builder_, 0);
    }
    else if (root_ == PROPERTY_ITEM_ELEM) {
      result_ = propertyItemElem(builder_, 0);
    }
    else if (root_ == PROPERTY_ITEM_ELEMS) {
      result_ = propertyItemElems(builder_, 0);
    }
    else if (root_ == RESOURCES_EXPRESSION) {
      result_ = resourcesExpression(builder_, 0);
    }
    else if (root_ == RETURN_EXPRESSION) {
      result_ = returnExpression(builder_, 0);
    }
    else if (root_ == STATEMENT) {
      result_ = statement(builder_, 0);
    }
    else if (root_ == SUB_METHOD) {
      result_ = sub_method(builder_, 0);
    }
    else if (root_ == SUB_PROPERTY) {
      result_ = sub_property(builder_, 0);
    }
    else if (root_ == THIS_PROPERTY) {
      result_ = this_property(builder_, 0);
    }
    else if (root_ == TYPE_EXPRESSION) {
      result_ = typeExpression(builder_, 0);
    }
    else if (root_ == UNARY_EXPRESSION) {
      result_ = unaryExpression(builder_, 0);
    }
    else if (root_ == USAGE_STATEMENT) {
      result_ = usageStatement(builder_, 0);
    }
    else if (root_ == VARIABLE) {
      result_ = variable(builder_, 0);
    }
    else if (root_ == WORKFLOWS_STATEMENT) {
      result_ = workflowsStatement(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return root(builder_, level_ + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ARRAY_EXPRESSION, BINARY_EXPRESSION, BRAKETED_EXPRESSION, EXPRESSION,
      HEAT_OUTPUTS_EXPRESSION, HEAT_PROPERTIES_EXPRESSION, INDEXED_EXPRESSION, MAP_EXPRESSION,
      METHOD_CALL_EXPRESSION, PARENTHESIZED_EXPRESSION, RESOURCES_EXPRESSION, RETURN_EXPRESSION,
      TYPE_EXPRESSION, UNARY_EXPRESSION),
  };

  /* ********************************************************** */
  // ARGUMENTS_TOKEN propertiesItems
  public static boolean argumentsStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "argumentsStatement")) return false;
    if (!nextTokenIs(builder_, ARGUMENTS_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ARGUMENTS_TOKEN);
    result_ = result_ && propertiesItems(builder_, level_ + 1);
    exit_section_(builder_, marker_, ARGUMENTS_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // LSQBR_TOKEN expr_list RSQBR_TOKEN
  public static boolean arrayExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayExpression")) return false;
    if (!nextTokenIs(builder_, LSQBR_TOKEN)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, LSQBR_TOKEN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, expr_list(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RSQBR_TOKEN) && result_;
    exit_section_(builder_, level_, marker_, ARRAY_EXPRESSION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // lvalue ASSIGN_TOKEN expression
  public static boolean assignmentStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignmentStatement")) return false;
    if (!nextTokenIs(builder_, DOLLAR_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = lvalue(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ASSIGN_TOKEN);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, ASSIGNMENT_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // values binary_operations expression
  public static boolean binaryExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "binaryExpression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<binary expression>");
    result_ = values(builder_, level_ + 1);
    result_ = result_ && binary_operations(builder_, level_ + 1);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, BINARY_EXPRESSION, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // OP_PLUS | OP_MINUS | OP_MULT | OP_DIV | OP_AND | OP_OR| OP_EQ|
  //                        OP_LS|
  //                        OP_LE|
  //                        OP_GR|
  //                        OP_GE|
  //                        OP_NE
  public static boolean binary_operations(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "binary_operations")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<operator>");
    result_ = consumeToken(builder_, OP_PLUS);
    if (!result_) result_ = consumeToken(builder_, OP_MINUS);
    if (!result_) result_ = consumeToken(builder_, OP_MULT);
    if (!result_) result_ = consumeToken(builder_, OP_DIV);
    if (!result_) result_ = consumeToken(builder_, OP_AND);
    if (!result_) result_ = consumeToken(builder_, OP_OR);
    if (!result_) result_ = consumeToken(builder_, OP_EQ);
    if (!result_) result_ = consumeToken(builder_, OP_LS);
    if (!result_) result_ = consumeToken(builder_, OP_LE);
    if (!result_) result_ = consumeToken(builder_, OP_GR);
    if (!result_) result_ = consumeToken(builder_, OP_GE);
    if (!result_) result_ = consumeToken(builder_, OP_NE);
    exit_section_(builder_, level_, marker_, BINARY_OPERATIONS, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // statement body | statement?
  public static boolean body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<body>");
    result_ = body_0(builder_, level_ + 1);
    if (!result_) result_ = body_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, BODY, result_, false, null);
    return result_;
  }

  // statement body
  private static boolean body_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = statement(builder_, level_ + 1);
    result_ = result_ && body(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // statement?
  private static boolean body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "body_1")) return false;
    statement(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // BODY_TOKEN body
  public static boolean bodyStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bodyStatement")) return false;
    if (!nextTokenIs(builder_, BODY_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BODY_TOKEN);
    result_ = result_ && body(builder_, level_ + 1);
    exit_section_(builder_, marker_, BODY_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // MPL_BOOL_TRUE | MPL_BOOL_FALSE | muranoPLBooleans
  static boolean booleanLiteralExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "booleanLiteralExpression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MPL_BOOL_TRUE);
    if (!result_) result_ = consumeToken(builder_, MPL_BOOL_FALSE);
    if (!result_) result_ = muranoPLBooleans(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LBRAKETS_TOKEN non_list_body  RBRAKETS_TOKEN
  public static boolean braketedExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "braketedExpression")) return false;
    if (!nextTokenIs(builder_, LBRAKETS_TOKEN)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, LBRAKETS_TOKEN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, non_list_body(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RBRAKETS_TOKEN) && result_;
    exit_section_(builder_, level_, marker_, BRAKETED_EXPRESSION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // FN_NEW_TOKEN | FN_FORMAT_TOKEN |FN_DICT_TOKEN | FN_JOIN_TOKEN
  static boolean builtin_functions(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "builtin_functions")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, FN_NEW_TOKEN);
    if (!result_) result_ = consumeToken(builder_, FN_FORMAT_TOKEN);
    if (!result_) result_ = consumeToken(builder_, FN_DICT_TOKEN);
    if (!result_) result_ = consumeToken(builder_, FN_JOIN_TOKEN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // extendsStatement | propertiesStatement | workflowsStatement | commentStatement
  public static boolean classBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classBody")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<class body>");
    result_ = extendsStatement(builder_, level_ + 1);
    if (!result_) result_ = propertiesStatement(builder_, level_ + 1);
    if (!result_) result_ = workflowsStatement(builder_, level_ + 1);
    if (!result_) result_ = commentStatement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CLASS_BODY, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // classBody classBodyItems | classBody |
  public static boolean classBodyItems(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classBodyItems")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<class body items>");
    result_ = classBodyItems_0(builder_, level_ + 1);
    if (!result_) result_ = classBody(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, CLASSBODYITEMS_2_0);
    exit_section_(builder_, level_, marker_, CLASS_BODY_ITEMS, result_, false, null);
    return result_;
  }

  // classBody classBodyItems
  private static boolean classBodyItems_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classBodyItems_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = classBody(builder_, level_ + 1);
    result_ = result_ && classBodyItems(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // NAME_TOKEN fqdn classBodyItems
  public static boolean classStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classStatement")) return false;
    if (!nextTokenIs(builder_, NAME_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NAME_TOKEN);
    result_ = result_ && fqdn(builder_, level_ + 1);
    result_ = result_ && classBodyItems(builder_, level_ + 1);
    exit_section_(builder_, marker_, CLASS_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // COMMENT_TOKEN
  public static boolean commentStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "commentStatement")) return false;
    if (!nextTokenIs(builder_, COMMENT_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMENT_TOKEN);
    exit_section_(builder_, marker_, COMMENT_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // ID ASSIGN_TOKEN (literals | lvalue)
  public static boolean composedObject(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "composedObject")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ID, ASSIGN_TOKEN);
    result_ = result_ && composedObject_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, COMPOSED_OBJECT, result_);
    return result_;
  }

  // literals | lvalue
  private static boolean composedObject_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "composedObject_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = literals(builder_, level_ + 1);
    if (!result_) result_ = lvalue(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // INDENT composedObjects
  public static boolean composedObjectStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "composedObjectStatement")) return false;
    if (!nextTokenIs(builder_, INDENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, INDENT);
    result_ = result_ && composedObjects(builder_, level_ + 1);
    exit_section_(builder_, marker_, COMPOSED_OBJECT_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // composedObject composedObjects | composedObject |
  // //Operators
  public static boolean composedObjects(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "composedObjects")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<composed objects>");
    result_ = composedObjects_0(builder_, level_ + 1);
    if (!result_) result_ = composedObject(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, COMPOSEDOBJECTS_2_0);
    exit_section_(builder_, level_, marker_, COMPOSED_OBJECTS, result_, false, null);
    return result_;
  }

  // composedObject composedObjects
  private static boolean composedObjects_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "composedObjects_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = composedObject(builder_, level_ + 1);
    result_ = result_ && composedObjects(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IF_TOKEN expression THEN_TOKEN body (ELSE_TOKEN body)?{ /* ++indent */ }
  public static boolean conditionalStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditionalStatement")) return false;
    if (!nextTokenIs(builder_, IF_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IF_TOKEN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, THEN_TOKEN);
    result_ = result_ && body(builder_, level_ + 1);
    result_ = result_ && conditionalStatement_4(builder_, level_ + 1);
    result_ = result_ && conditionalStatement_5(builder_, level_ + 1);
    exit_section_(builder_, marker_, CONDITIONAL_STATEMENT, result_);
    return result_;
  }

  // (ELSE_TOKEN body)?
  private static boolean conditionalStatement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditionalStatement_4")) return false;
    conditionalStatement_4_0(builder_, level_ + 1);
    return true;
  }

  // ELSE_TOKEN body
  private static boolean conditionalStatement_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conditionalStatement_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSE_TOKEN);
    result_ = result_ && body(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // { /* ++indent */ }
  private static boolean conditionalStatement_5(PsiBuilder builder_, int level_) {
    return true;
  }

  /* ********************************************************** */
  // CONTRACT_TOKEN (list_of_expr | expression)
  public static boolean contractStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "contractStatement")) return false;
    if (!nextTokenIs(builder_, CONTRACT_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CONTRACT_TOKEN);
    result_ = result_ && contractStatement_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, CONTRACT_STATEMENT, result_);
    return result_;
  }

  // list_of_expr | expression
  private static boolean contractStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "contractStatement_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = list_of_expr(builder_, level_ + 1);
    if (!result_) result_ = expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DEFAULT_TOKEN expression
  public static boolean defaultStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "defaultStatement")) return false;
    if (!nextTokenIs(builder_, DEFAULT_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DEFAULT_TOKEN);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, DEFAULT_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // (expression | ID) COMMA_TOKEN expr_list | expression |
  public static boolean expr_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_list")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expr list>");
    result_ = expr_list_0(builder_, level_ + 1);
    if (!result_) result_ = expression(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, EXPR_LIST_2_0);
    exit_section_(builder_, level_, marker_, EXPR_LIST, result_, false, null);
    return result_;
  }

  // (expression | ID) COMMA_TOKEN expr_list
  private static boolean expr_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_list_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr_list_0_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA_TOKEN);
    result_ = result_ && expr_list(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expression | ID
  private static boolean expr_list_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_list_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, ID);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // unaryExpression| binaryExpression | indexedExpression| values
  public static boolean expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<expression>");
    result_ = unaryExpression(builder_, level_ + 1);
    if (!result_) result_ = binaryExpression(builder_, level_ + 1);
    if (!result_) result_ = indexedExpression(builder_, level_ + 1);
    if (!result_) result_ = values(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EXPRESSION, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // EXTENDS_TOKEN (ID ASSIGN_TOKEN ID|fqdn )
  public static boolean extendsStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extendsStatement")) return false;
    if (!nextTokenIs(builder_, EXTENDS_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EXTENDS_TOKEN);
    result_ = result_ && extendsStatement_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, EXTENDS_STATEMENT, result_);
    return result_;
  }

  // ID ASSIGN_TOKEN ID|fqdn
  private static boolean extendsStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "extendsStatement_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parseTokens(builder_, 0, ID, ASSIGN_TOKEN, ID);
    if (!result_) result_ = fqdn(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // FOR_TOKEN ID IN_TOKEN expression DO_TOKEN body
  public static boolean forStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forStatement")) return false;
    if (!nextTokenIs(builder_, FOR_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, FOR_TOKEN, ID, IN_TOKEN);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DO_TOKEN);
    result_ = result_ && body(builder_, level_ + 1);
    exit_section_(builder_, marker_, FOR_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // ID ('.' ID)*
  public static boolean fqdn(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fqdn")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ID);
    result_ = result_ && fqdn_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, FQDN, result_);
    return result_;
  }

  // ('.' ID)*
  private static boolean fqdn_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fqdn_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!fqdn_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "fqdn_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // '.' ID
  private static boolean fqdn_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fqdn_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT_TOKEN);
    result_ = result_ && consumeToken(builder_, ID);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // builtin_functions | ID | STRING DOT_TOKEN builtin_functions
  public static boolean function_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_name")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<function name>");
    result_ = builtin_functions(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, ID);
    if (!result_) result_ = function_name_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, FUNCTION_NAME, result_, false, null);
    return result_;
  }

  // STRING DOT_TOKEN builtin_functions
  private static boolean function_name_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_name_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, STRING, DOT_TOKEN);
    result_ = result_ && builtin_functions(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ID ASSIGN_TOKEN expression
  public static boolean heatAssignmentStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "heatAssignmentStatement")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ID, ASSIGN_TOKEN);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, HEAT_ASSIGNMENT_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // resourcesExpression | typeExpression | heatPropertiesExpression | heatOutputsExpression
  static boolean heatExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "heatExpression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = resourcesExpression(builder_, level_ + 1);
    if (!result_) result_ = typeExpression(builder_, level_ + 1);
    if (!result_) result_ = heatPropertiesExpression(builder_, level_ + 1);
    if (!result_) result_ = heatOutputsExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // HOUTPUTS_TOKEN non_list_body
  public static boolean heatOutputsExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "heatOutputsExpression")) return false;
    if (!nextTokenIs(builder_, HOUTPUTS_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, HOUTPUTS_TOKEN);
    result_ = result_ && non_list_body(builder_, level_ + 1);
    exit_section_(builder_, marker_, HEAT_OUTPUTS_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // HPROPERTIES_TOKEN non_list_body
  public static boolean heatPropertiesExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "heatPropertiesExpression")) return false;
    if (!nextTokenIs(builder_, HPROPERTIES_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, HPROPERTIES_TOKEN);
    result_ = result_ && non_list_body(builder_, level_ + 1);
    exit_section_(builder_, marker_, HEAT_PROPERTIES_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // method_callExpression ASSIGN_TOKEN
  public static boolean heatPropertyNameSatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "heatPropertyNameSatement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<heat property name satement>");
    result_ = method_callExpression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ASSIGN_TOKEN);
    exit_section_(builder_, level_, marker_, HEAT_PROPERTY_NAME_SATEMENT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // lvalue ASSIGN_TOKEN | ID ASSIGN_TOKEN
  public static boolean heatSimpleStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "heatSimpleStatement")) return false;
    if (!nextTokenIs(builder_, "<heat simple statement>", DOLLAR_TOKEN, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<heat simple statement>");
    result_ = heatSimpleStatement_0(builder_, level_ + 1);
    if (!result_) result_ = parseTokens(builder_, 0, ID, ASSIGN_TOKEN);
    exit_section_(builder_, level_, marker_, HEAT_SIMPLE_STATEMENT, result_, false, null);
    return result_;
  }

  // lvalue ASSIGN_TOKEN
  private static boolean heatSimpleStatement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "heatSimpleStatement_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = lvalue(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ASSIGN_TOKEN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // HVALUE_TOKEN non_list_body
  public static boolean heatValueStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "heatValueStatement")) return false;
    if (!nextTokenIs(builder_, HVALUE_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, HVALUE_TOKEN);
    result_ = result_ && non_list_body(builder_, level_ + 1);
    exit_section_(builder_, marker_, HEAT_VALUE_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // values  '[' expression ']'
  public static boolean indexedExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "indexedExpression")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<indexed expression>");
    result_ = values(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "[");
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, expression(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, "]") && result_;
    exit_section_(builder_, level_, marker_, INDEXED_EXPRESSION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // INDENT expression
  public static boolean list_elem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_elem")) return false;
    if (!nextTokenIs(builder_, INDENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, INDENT);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, LIST_ELEM, result_);
    return result_;
  }

  /* ********************************************************** */
  // list_elem list_of_expr | list_elem
  public static boolean list_of_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_of_expr")) return false;
    if (!nextTokenIs(builder_, INDENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = list_of_expr_0(builder_, level_ + 1);
    if (!result_) result_ = list_elem(builder_, level_ + 1);
    exit_section_(builder_, marker_, LIST_OF_EXPR, result_);
    return result_;
  }

  // list_elem list_of_expr
  private static boolean list_of_expr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "list_of_expr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = list_elem(builder_, level_ + 1);
    result_ = result_ && list_of_expr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // numberLiteralExpression | booleanLiteralExpression | textLiteralExpression
  static boolean literals(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literals")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = numberLiteralExpression(builder_, level_ + 1);
    if (!result_) result_ = booleanLiteralExpression(builder_, level_ + 1);
    if (!result_) result_ = textLiteralExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // variable | this_property
  public static boolean lvalue(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lvalue")) return false;
    if (!nextTokenIs(builder_, DOLLAR_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variable(builder_, level_ + 1);
    if (!result_) result_ = this_property(builder_, level_ + 1);
    exit_section_(builder_, marker_, LVALUE, result_);
    return result_;
  }

  /* ********************************************************** */
  // ID  MAP_TOKEN  expression
  public static boolean mapEntryElement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mapEntryElement")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeTokens(builder_, 2, ID, MAP_TOKEN);
    pinned_ = result_; // pin = 2
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, MAP_ENTRY_ELEMENT, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // mapEntryElement COMMA_TOKEN mapExpression | mapEntryElement |
  public static boolean mapExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mapExpression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<map expression>");
    result_ = mapExpression_0(builder_, level_ + 1);
    if (!result_) result_ = mapEntryElement(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, MAPEXPRESSION_2_0);
    exit_section_(builder_, level_, marker_, MAP_EXPRESSION, result_, false, null);
    return result_;
  }

  // mapEntryElement COMMA_TOKEN mapExpression
  private static boolean mapExpression_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mapExpression_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = mapEntryElement(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA_TOKEN);
    result_ = result_ && mapExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // methodUsageStatement | argumentsStatement | bodyStatement
  public static boolean methodComponent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodComponent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<method component>");
    result_ = methodUsageStatement(builder_, level_ + 1);
    if (!result_) result_ = argumentsStatement(builder_, level_ + 1);
    if (!result_) result_ = bodyStatement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, METHOD_COMPONENT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // methodComponent methodComponents | methodComponent |
  public static boolean methodComponents(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodComponents")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<method components>");
    result_ = methodComponents_0(builder_, level_ + 1);
    if (!result_) result_ = methodComponent(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, METHODCOMPONENTS_2_0);
    exit_section_(builder_, level_, marker_, METHOD_COMPONENTS, result_, false, null);
    return result_;
  }

  // methodComponent methodComponents
  private static boolean methodComponents_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodComponents_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = methodComponent(builder_, level_ + 1);
    result_ = result_ && methodComponents(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ID ASSIGN_TOKEN methodComponents
  public static boolean methodItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodItem")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ID, ASSIGN_TOKEN);
    result_ = result_ && methodComponents(builder_, level_ + 1);
    exit_section_(builder_, marker_, METHOD_ITEM, result_);
    return result_;
  }

  /* ********************************************************** */
  // methodItem methodItems | methodItem |
  public static boolean methodItems(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodItems")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<method items>");
    result_ = methodItems_0(builder_, level_ + 1);
    if (!result_) result_ = methodItem(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, METHODITEMS_2_0);
    exit_section_(builder_, level_, marker_, METHOD_ITEMS, result_, false, null);
    return result_;
  }

  // methodItem methodItems
  private static boolean methodItems_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodItems_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = methodItem(builder_, level_ + 1);
    result_ = result_ && methodItems(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // USAGE_TOKEN ACTION_TOKEN
  public static boolean methodUsageStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodUsageStatement")) return false;
    if (!nextTokenIs(builder_, USAGE_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, USAGE_TOKEN, ACTION_TOKEN);
    exit_section_(builder_, marker_, METHOD_USAGE_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // (this_property | variable | function_name) LPAREN_TOKEN expr_list RPAREN_TOKEN sub_method
  public static boolean method_callExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_callExpression")) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<method call expression>");
    result_ = method_callExpression_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LPAREN_TOKEN);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, expr_list(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, RPAREN_TOKEN)) && result_;
    result_ = pinned_ && sub_method(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, METHOD_CALL_EXPRESSION, result_, pinned_, null);
    return result_ || pinned_;
  }

  // this_property | variable | function_name
  private static boolean method_callExpression_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_callExpression_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = this_property(builder_, level_ + 1);
    if (!result_) result_ = variable(builder_, level_ + 1);
    if (!result_) result_ = function_name(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // BOOL_TOKEN_T | BOOL_TOKEN_F
  static boolean muranoPLBooleans(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "muranoPLBooleans")) return false;
    if (!nextTokenIs(builder_, "", BOOL_TOKEN_F, BOOL_TOKEN_T)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BOOL_TOKEN_T);
    if (!result_) result_ = consumeToken(builder_, BOOL_TOKEN_F);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // muranoplStatement muranopl | (muranoplStatement | EOL |EOF) |
  public static boolean muranopl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "muranopl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<muranopl>");
    result_ = muranopl_0(builder_, level_ + 1);
    if (!result_) result_ = muranopl_1(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, MURANOPL_2_0);
    exit_section_(builder_, level_, marker_, MURANOPL, result_, false, null);
    return result_;
  }

  // muranoplStatement muranopl
  private static boolean muranopl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "muranopl_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = muranoplStatement(builder_, level_ + 1);
    result_ = result_ && muranopl(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // muranoplStatement | EOL |EOF
  private static boolean muranopl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "muranopl_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = muranoplStatement(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, EOL);
    if (!result_) result_ = consumeToken(builder_, EOF);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // namespacesStatement | classStatement | commentStatement
  public static boolean muranoplStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "muranoplStatement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<muranopl statement>");
    result_ = namespacesStatement(builder_, level_ + 1);
    if (!result_) result_ = classStatement(builder_, level_ + 1);
    if (!result_) result_ = commentStatement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, MURANOPL_STATEMENT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ID ASSIGN_TOKEN ID
  public static boolean namepsaced_class(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namepsaced_class")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ID, ASSIGN_TOKEN, ID);
    exit_section_(builder_, marker_, NAMEPSACED_CLASS, result_);
    return result_;
  }

  /* ********************************************************** */
  // (ID ASSIGN_TOKEN | DEFAULTNS_TOKEN)   fqdn
  public static boolean namespaceItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespaceItem")) return false;
    if (!nextTokenIs(builder_, "<namespace item>", DEFAULTNS_TOKEN, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<namespace item>");
    result_ = namespaceItem_0(builder_, level_ + 1);
    result_ = result_ && fqdn(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, NAMESPACE_ITEM, result_, false, null);
    return result_;
  }

  // ID ASSIGN_TOKEN | DEFAULTNS_TOKEN
  private static boolean namespaceItem_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespaceItem_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parseTokens(builder_, 0, ID, ASSIGN_TOKEN);
    if (!result_) result_ = consumeToken(builder_, DEFAULTNS_TOKEN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // namespaceItem namespaceItems | namespaceItem |
  public static boolean namespaceItems(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespaceItems")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<namespace items>");
    result_ = namespaceItems_0(builder_, level_ + 1);
    if (!result_) result_ = namespaceItem(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, NAMESPACEITEMS_2_0);
    exit_section_(builder_, level_, marker_, NAMESPACE_ITEMS, result_, false, null);
    return result_;
  }

  // namespaceItem namespaceItems
  private static boolean namespaceItems_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespaceItems_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = namespaceItem(builder_, level_ + 1);
    result_ = result_ && namespaceItems(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // NAMESPACE_TOKEN  namespaceItems
  public static boolean namespacesStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespacesStatement")) return false;
    if (!nextTokenIs(builder_, NAMESPACE_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NAMESPACE_TOKEN);
    result_ = result_ && namespaceItems(builder_, level_ + 1);
    exit_section_(builder_, marker_, NAMESPACES_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // non_list_statememnt non_list_body | //Only for Heat resources
  public static boolean non_list_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_list_body")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<non list body>");
    result_ = non_list_body_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, NON_LIST_BODY_1_0);
    exit_section_(builder_, level_, marker_, NON_LIST_BODY, result_, false, null);
    return result_;
  }

  // non_list_statememnt non_list_body
  private static boolean non_list_body_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_list_body_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = non_list_statememnt(builder_, level_ + 1);
    result_ = result_ && non_list_body(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // heatExpression|
  //                         heatSimpleStatement  |  //Only for Heat resources
  //                         heatValueStatement|
  //                         heatPropertyNameSatement |
  //                         heatAssignmentStatement |
  //                         method_callExpression|
  public static boolean non_list_statememnt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "non_list_statememnt")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<non list statememnt>");
    result_ = heatExpression(builder_, level_ + 1);
    if (!result_) result_ = heatSimpleStatement(builder_, level_ + 1);
    if (!result_) result_ = heatValueStatement(builder_, level_ + 1);
    if (!result_) result_ = heatPropertyNameSatement(builder_, level_ + 1);
    if (!result_) result_ = heatAssignmentStatement(builder_, level_ + 1);
    if (!result_) result_ = method_callExpression(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, NON_LIST_STATEMEMNT_6_0);
    exit_section_(builder_, level_, marker_, NON_LIST_STATEMEMNT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // NUMBER | NULL_TOKEN
  static boolean numberLiteralExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "numberLiteralExpression")) return false;
    if (!nextTokenIs(builder_, "", NULL_TOKEN, NUMBER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NUMBER);
    if (!result_) result_ = consumeToken(builder_, NULL_TOKEN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LPAREN_TOKEN expression RPAREN_TOKEN
  public static boolean parenthesizedExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parenthesizedExpression")) return false;
    if (!nextTokenIs(builder_, LPAREN_TOKEN)) return false;
    boolean result_;
    boolean pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, LPAREN_TOKEN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, expression(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RPAREN_TOKEN) && result_;
    exit_section_(builder_, level_, marker_, PARENTHESIZED_EXPRESSION, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // propertyItem propertiesItems | propertyItem |
  public static boolean propertiesItems(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "propertiesItems")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<properties items>");
    result_ = propertiesItems_0(builder_, level_ + 1);
    if (!result_) result_ = propertyItem(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PROPERTIESITEMS_2_0);
    exit_section_(builder_, level_, marker_, PROPERTIES_ITEMS, result_, false, null);
    return result_;
  }

  // propertyItem propertiesItems
  private static boolean propertiesItems_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "propertiesItems_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = propertyItem(builder_, level_ + 1);
    result_ = result_ && propertiesItems(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // PROPERTIES_TOKEN  propertiesItems
  public static boolean propertiesStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "propertiesStatement")) return false;
    if (!nextTokenIs(builder_, PROPERTIES_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PROPERTIES_TOKEN);
    result_ = result_ && propertiesItems(builder_, level_ + 1);
    exit_section_(builder_, marker_, PROPERTIES_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // ID ASSIGN_TOKEN propertyItemElems
  public static boolean propertyItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "propertyItem")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, ID, ASSIGN_TOKEN);
    result_ = result_ && propertyItemElems(builder_, level_ + 1);
    exit_section_(builder_, marker_, PROPERTY_ITEM, result_);
    return result_;
  }

  /* ********************************************************** */
  // contractStatement | defaultStatement | usageStatement |
  public static boolean propertyItemElem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "propertyItemElem")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<property item elem>");
    result_ = contractStatement(builder_, level_ + 1);
    if (!result_) result_ = defaultStatement(builder_, level_ + 1);
    if (!result_) result_ = usageStatement(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PROPERTYITEMELEM_3_0);
    exit_section_(builder_, level_, marker_, PROPERTY_ITEM_ELEM, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // propertyItemElem propertyItemElems | propertyItemElem
  public static boolean propertyItemElems(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "propertyItemElems")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<property item elems>");
    result_ = propertyItemElems_0(builder_, level_ + 1);
    if (!result_) result_ = propertyItemElem(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PROPERTY_ITEM_ELEMS, result_, false, null);
    return result_;
  }

  // propertyItemElem propertyItemElems
  private static boolean propertyItemElems_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "propertyItemElems_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = propertyItemElem(builder_, level_ + 1);
    result_ = result_ && propertyItemElems(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // HRESOURCES_TOKEN non_list_body
  public static boolean resourcesExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "resourcesExpression")) return false;
    if (!nextTokenIs(builder_, HRESOURCES_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, HRESOURCES_TOKEN);
    result_ = result_ && non_list_body(builder_, level_ + 1);
    exit_section_(builder_, marker_, RESOURCES_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // RETURN_TOKEN expression
  public static boolean returnExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "returnExpression")) return false;
    if (!nextTokenIs(builder_, RETURN_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, RETURN_TOKEN);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, RETURN_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // muranopl
  static boolean root(PsiBuilder builder_, int level_) {
    return muranopl(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // (INDENT (returnExpression|
  //                        conditionalStatement |
  //                        forStatement |
  //                        assignmentStatement |
  //                        method_callExpression )) |
  //                        commentStatement|
  //                        EOL | EOF | NEWLINE
  public static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<statement>");
    result_ = statement_0(builder_, level_ + 1);
    if (!result_) result_ = commentStatement(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, EOL);
    if (!result_) result_ = consumeToken(builder_, EOF);
    if (!result_) result_ = consumeToken(builder_, NEWLINE);
    exit_section_(builder_, level_, marker_, STATEMENT, result_, false, null);
    return result_;
  }

  // INDENT (returnExpression|
  //                        conditionalStatement |
  //                        forStatement |
  //                        assignmentStatement |
  //                        method_callExpression )
  private static boolean statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, INDENT);
    result_ = result_ && statement_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // returnExpression|
  //                        conditionalStatement |
  //                        forStatement |
  //                        assignmentStatement |
  //                        method_callExpression
  private static boolean statement_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = returnExpression(builder_, level_ + 1);
    if (!result_) result_ = conditionalStatement(builder_, level_ + 1);
    if (!result_) result_ = forStatement(builder_, level_ + 1);
    if (!result_) result_ = assignmentStatement(builder_, level_ + 1);
    if (!result_) result_ = method_callExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DOT_TOKEN ID sub_property LPAREN_TOKEN expr_list? RPAREN_TOKEN sub_method | DOT_TOKEN ID sub_property LPAREN_TOKEN expr_list? RPAREN_TOKEN |
  public static boolean sub_method(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sub_method")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<sub method>");
    result_ = sub_method_0(builder_, level_ + 1);
    if (!result_) result_ = sub_method_1(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, SUB_METHOD_2_0);
    exit_section_(builder_, level_, marker_, SUB_METHOD, result_, false, null);
    return result_;
  }

  // DOT_TOKEN ID sub_property LPAREN_TOKEN expr_list? RPAREN_TOKEN sub_method
  private static boolean sub_method_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sub_method_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT_TOKEN, ID);
    result_ = result_ && sub_property(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LPAREN_TOKEN);
    result_ = result_ && sub_method_0_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN_TOKEN);
    result_ = result_ && sub_method(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr_list?
  private static boolean sub_method_0_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sub_method_0_4")) return false;
    expr_list(builder_, level_ + 1);
    return true;
  }

  // DOT_TOKEN ID sub_property LPAREN_TOKEN expr_list? RPAREN_TOKEN
  private static boolean sub_method_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sub_method_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOT_TOKEN, ID);
    result_ = result_ && sub_property(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LPAREN_TOKEN);
    result_ = result_ && sub_method_1_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN_TOKEN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr_list?
  private static boolean sub_method_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sub_method_1_4")) return false;
    expr_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // DOT_TOKEN (ID | FN_FORMAT_TOKEN) sub_property | { /* append ID */}
  public static boolean sub_property(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sub_property")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<sub property>");
    result_ = sub_property_0(builder_, level_ + 1);
    if (!result_) result_ = sub_property_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SUB_PROPERTY, result_, false, null);
    return result_;
  }

  // DOT_TOKEN (ID | FN_FORMAT_TOKEN) sub_property
  private static boolean sub_property_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sub_property_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT_TOKEN);
    result_ = result_ && sub_property_0_1(builder_, level_ + 1);
    result_ = result_ && sub_property(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ID | FN_FORMAT_TOKEN
  private static boolean sub_property_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sub_property_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ID);
    if (!result_) result_ = consumeToken(builder_, FN_FORMAT_TOKEN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // { /* append ID */}
  private static boolean sub_property_1(PsiBuilder builder_, int level_) {
    return true;
  }

  /* ********************************************************** */
  // STRING
  static boolean textLiteralExpression(PsiBuilder builder_, int level_) {
    return consumeToken(builder_, STRING);
  }

  /* ********************************************************** */
  // DOLLAR_TOKEN DOT_TOKEN ID sub_property
  public static boolean this_property(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "this_property")) return false;
    if (!nextTokenIs(builder_, DOLLAR_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOLLAR_TOKEN, DOT_TOKEN, ID);
    result_ = result_ && sub_property(builder_, level_ + 1);
    exit_section_(builder_, marker_, THIS_PROPERTY, result_);
    return result_;
  }

  /* ********************************************************** */
  // HTYPE_TOKEN STRING
  public static boolean typeExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeExpression")) return false;
    if (!nextTokenIs(builder_, HTYPE_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, HTYPE_TOKEN, STRING);
    exit_section_(builder_, marker_, TYPE_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // unaryOperator expression
  public static boolean unaryExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unaryExpression")) return false;
    if (!nextTokenIs(builder_, "<unary expression>", OP_N, OP_NOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<unary expression>");
    result_ = unaryOperator(builder_, level_ + 1);
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, UNARY_EXPRESSION, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // OP_NOT | OP_N
  static boolean unaryOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unaryOperator")) return false;
    if (!nextTokenIs(builder_, "", OP_N, OP_NOT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OP_NOT);
    if (!result_) result_ = consumeToken(builder_, OP_N);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // USAGE_TOKEN (USAGE_IN_TOKEN |
  //                                 USAGE_OUT_TOKEN|
  //                                 USAGE_INOUT_TOKEN |
  //                                 USAGE_RUNTIME_TOKEN)
  public static boolean usageStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "usageStatement")) return false;
    if (!nextTokenIs(builder_, USAGE_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, USAGE_TOKEN);
    result_ = result_ && usageStatement_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, USAGE_STATEMENT, result_);
    return result_;
  }

  // USAGE_IN_TOKEN |
  //                                 USAGE_OUT_TOKEN|
  //                                 USAGE_INOUT_TOKEN |
  //                                 USAGE_RUNTIME_TOKEN
  private static boolean usageStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "usageStatement_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, USAGE_IN_TOKEN);
    if (!result_) result_ = consumeToken(builder_, USAGE_OUT_TOKEN);
    if (!result_) result_ = consumeToken(builder_, USAGE_INOUT_TOKEN);
    if (!result_) result_ = consumeToken(builder_, USAGE_RUNTIME_TOKEN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // mapEntryElement|
  //                    arrayExpression|
  //                    parenthesizedExpression|
  //                    braketedExpression |
  //                    method_callExpression|
  //                    heatExpression |
  //                    this_property |
  //                    variable |
  //                    composedObjectStatement |
  //                    ID ASSIGN_TOKEN ID |
  //                    literals | ID
  static boolean values(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "values")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = mapEntryElement(builder_, level_ + 1);
    if (!result_) result_ = arrayExpression(builder_, level_ + 1);
    if (!result_) result_ = parenthesizedExpression(builder_, level_ + 1);
    if (!result_) result_ = braketedExpression(builder_, level_ + 1);
    if (!result_) result_ = method_callExpression(builder_, level_ + 1);
    if (!result_) result_ = heatExpression(builder_, level_ + 1);
    if (!result_) result_ = this_property(builder_, level_ + 1);
    if (!result_) result_ = variable(builder_, level_ + 1);
    if (!result_) result_ = composedObjectStatement(builder_, level_ + 1);
    if (!result_) result_ = parseTokens(builder_, 0, ID, ASSIGN_TOKEN, ID);
    if (!result_) result_ = literals(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, ID);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DOLLAR_TOKEN ID sub_property
  public static boolean variable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variable")) return false;
    if (!nextTokenIs(builder_, DOLLAR_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DOLLAR_TOKEN, ID);
    result_ = result_ && sub_property(builder_, level_ + 1);
    exit_section_(builder_, marker_, VARIABLE, result_);
    return result_;
  }

  /* ********************************************************** */
  // (WORKFLOW_TOKEN|METHODS_TOKEN) methodItems
  public static boolean workflowsStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "workflowsStatement")) return false;
    if (!nextTokenIs(builder_, "<workflows statement>", METHODS_TOKEN, WORKFLOW_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<workflows statement>");
    result_ = workflowsStatement_0(builder_, level_ + 1);
    result_ = result_ && methodItems(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, WORKFLOWS_STATEMENT, result_, false, null);
    return result_;
  }

  // WORKFLOW_TOKEN|METHODS_TOKEN
  private static boolean workflowsStatement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "workflowsStatement_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, WORKFLOW_TOKEN);
    if (!result_) result_ = consumeToken(builder_, METHODS_TOKEN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

}
