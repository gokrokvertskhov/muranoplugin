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

public class MuranoUnaryExpressionImpl extends MuranoExpressionImpl implements MuranoUnaryExpression {

  public MuranoUnaryExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitUnaryExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MuranoExpression getExpression() {
    return findNotNullChildByClass(MuranoExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getOpN() {
    return findChildByType(OP_N);
  }

  @Override
  @Nullable
  public PsiElement getOpNot() {
    return findChildByType(OP_NOT);
  }

}
