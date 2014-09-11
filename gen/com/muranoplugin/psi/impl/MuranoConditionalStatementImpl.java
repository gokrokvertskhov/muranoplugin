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

public class MuranoConditionalStatementImpl extends ASTWrapperPsiElement implements MuranoConditionalStatement {

  public MuranoConditionalStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitConditionalStatement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MuranoBody> getBodyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MuranoBody.class);
  }

  @Override
  @NotNull
  public MuranoExpression getExpression() {
    return findNotNullChildByClass(MuranoExpression.class);
  }

  @Override
  @NotNull
  public PsiElement getIfToken() {
    return findNotNullChildByType(IF_TOKEN);
  }

  @Override
  @NotNull
  public PsiElement getThenToken() {
    return findNotNullChildByType(THEN_TOKEN);
  }

}
