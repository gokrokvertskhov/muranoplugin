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

public class MuranoNonListStatememntImpl extends ASTWrapperPsiElement implements MuranoNonListStatememnt {

  public MuranoNonListStatememntImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitNonListStatememnt(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MuranoExpression getExpression() {
    return findChildByClass(MuranoExpression.class);
  }

  @Override
  @Nullable
  public MuranoHeatAssignmentStatement getHeatAssignmentStatement() {
    return findChildByClass(MuranoHeatAssignmentStatement.class);
  }

  @Override
  @Nullable
  public MuranoHeatPropertyNameSatement getHeatPropertyNameSatement() {
    return findChildByClass(MuranoHeatPropertyNameSatement.class);
  }

  @Override
  @Nullable
  public MuranoHeatSimpleStatement getHeatSimpleStatement() {
    return findChildByClass(MuranoHeatSimpleStatement.class);
  }

  @Override
  @Nullable
  public MuranoHeatValueStatement getHeatValueStatement() {
    return findChildByClass(MuranoHeatValueStatement.class);
  }

}
