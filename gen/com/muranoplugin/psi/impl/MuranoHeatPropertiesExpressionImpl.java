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

public class MuranoHeatPropertiesExpressionImpl extends MuranoExpressionImpl implements MuranoHeatPropertiesExpression {

  public MuranoHeatPropertiesExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitHeatPropertiesExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MuranoNonListBody getNonListBody() {
    return findNotNullChildByClass(MuranoNonListBody.class);
  }

  @Override
  @NotNull
  public PsiElement getHpropertiesToken() {
    return findNotNullChildByType(HPROPERTIES_TOKEN);
  }

}
