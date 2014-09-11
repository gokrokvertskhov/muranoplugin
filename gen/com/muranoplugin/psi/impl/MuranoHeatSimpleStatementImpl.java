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

public class MuranoHeatSimpleStatementImpl extends ASTWrapperPsiElement implements MuranoHeatSimpleStatement {

  public MuranoHeatSimpleStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitHeatSimpleStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MuranoLvalue getLvalue() {
    return findChildByClass(MuranoLvalue.class);
  }

  @Override
  @NotNull
  public PsiElement getAssignToken() {
    return findNotNullChildByType(ASSIGN_TOKEN);
  }

  @Override
  @Nullable
  public PsiElement getId() {
    return findChildByType(ID);
  }

}
