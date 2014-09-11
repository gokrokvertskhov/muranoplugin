// This is a generated file. Not intended for manual editing.
package com.muranoplugin.lex.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static com.muranoplugin.lex.psi.MuranoTypes.*;
import static com.muranoplugin.lex.parser.MuranoParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MuranoParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("com.muranoplugin.lex.parser.MuranoParser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == ROOT_ELEMENT) {
      result_ = rootElement(builder_, 0);
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

  /* ********************************************************** */
  // rootElement
  static boolean root(PsiBuilder builder_, int level_) {
    return rootElement(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // FN_INT_TOKEN
  public static boolean rootElement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rootElement")) return false;
    if (!nextTokenIs(builder_, FN_INT_TOKEN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, FN_INT_TOKEN);
    exit_section_(builder_, marker_, ROOT_ELEMENT, result_);
    return result_;
  }

}
