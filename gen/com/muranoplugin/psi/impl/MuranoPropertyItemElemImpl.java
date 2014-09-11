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

public class MuranoPropertyItemElemImpl extends ASTWrapperPsiElement implements MuranoPropertyItemElem {

  public MuranoPropertyItemElemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitPropertyItemElem(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MuranoContractStatement getContractStatement() {
    return findChildByClass(MuranoContractStatement.class);
  }

  @Override
  @Nullable
  public MuranoDefaultStatement getDefaultStatement() {
    return findChildByClass(MuranoDefaultStatement.class);
  }

  @Override
  @Nullable
  public MuranoUsageStatement getUsageStatement() {
    return findChildByClass(MuranoUsageStatement.class);
  }

}
