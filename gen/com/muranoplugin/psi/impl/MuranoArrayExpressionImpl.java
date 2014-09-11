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

public class MuranoArrayExpressionImpl extends MuranoExpressionImpl implements MuranoArrayExpression {

  public MuranoArrayExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitArrayExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MuranoExprList getExprList() {
    return findChildByClass(MuranoExprList.class);
  }

  @Override
  @NotNull
  public PsiElement getLsqbrToken() {
    return findNotNullChildByType(LSQBR_TOKEN);
  }

  @Override
  @Nullable
  public PsiElement getRsqbrToken() {
    return findChildByType(RSQBR_TOKEN);
  }

}
