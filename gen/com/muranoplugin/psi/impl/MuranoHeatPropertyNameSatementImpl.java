// This is a generated file. Not intended for manual editing.
package com.muranoplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.muranoplugin.psi.MuranoTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.muranoplugin.psi.*;

public class MuranoHeatPropertyNameSatementImpl extends ASTWrapperPsiElement implements MuranoHeatPropertyNameSatement {

  public MuranoHeatPropertyNameSatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitHeatPropertyNameSatement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MuranoMethodCallExpression getMethodCallExpression() {
    return findNotNullChildByClass(MuranoMethodCallExpression.class);
  }

  @Override
  @NotNull
  public PsiElement getAssignToken() {
    return findNotNullChildByType(ASSIGN_TOKEN);
  }

}