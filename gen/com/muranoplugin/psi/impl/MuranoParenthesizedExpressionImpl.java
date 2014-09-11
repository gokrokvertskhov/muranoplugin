// This is a generated file. Not intended for manual editing.
package com.muranoplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.muranoplugin.psi.MuranoTypes.*;
import com.muranoplugin.psi.*;

public class MuranoParenthesizedExpressionImpl extends MuranoExpressionImpl implements MuranoParenthesizedExpression {

  public MuranoParenthesizedExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitParenthesizedExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MuranoExpression getExpression() {
    return findChildByClass(MuranoExpression.class);
  }

  @Override
  @NotNull
  public PsiElement getLparenToken() {
    return findNotNullChildByType(LPAREN_TOKEN);
  }

  @Override
  @Nullable
  public PsiElement getRparenToken() {
    return findChildByType(RPAREN_TOKEN);
  }

}
