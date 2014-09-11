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

public class MuranoBraketedExpressionImpl extends MuranoExpressionImpl implements MuranoBraketedExpression {

  public MuranoBraketedExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitBraketedExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MuranoNonListBody getNonListBody() {
    return findChildByClass(MuranoNonListBody.class);
  }

  @Override
  @NotNull
  public PsiElement getLbraketsToken() {
    return findNotNullChildByType(LBRAKETS_TOKEN);
  }

  @Override
  @Nullable
  public PsiElement getRbraketsToken() {
    return findChildByType(RBRAKETS_TOKEN);
  }

}
