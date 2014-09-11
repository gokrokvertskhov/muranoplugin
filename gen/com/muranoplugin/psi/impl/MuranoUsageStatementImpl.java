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

public class MuranoUsageStatementImpl extends ASTWrapperPsiElement implements MuranoUsageStatement {

  public MuranoUsageStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitUsageStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getUsageInoutToken() {
    return findChildByType(USAGE_INOUT_TOKEN);
  }

  @Override
  @Nullable
  public PsiElement getUsageInToken() {
    return findChildByType(USAGE_IN_TOKEN);
  }

  @Override
  @Nullable
  public PsiElement getUsageOutToken() {
    return findChildByType(USAGE_OUT_TOKEN);
  }

  @Override
  @Nullable
  public PsiElement getUsageRuntimeToken() {
    return findChildByType(USAGE_RUNTIME_TOKEN);
  }

}
