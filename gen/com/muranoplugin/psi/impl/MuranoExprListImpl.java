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

public class MuranoExprListImpl extends ASTWrapperPsiElement implements MuranoExprList {

  public MuranoExprListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitExprList(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MuranoExprList getExprList() {
    return findChildByClass(MuranoExprList.class);
  }

  @Override
  @Nullable
  public MuranoExpression getExpression() {
    return findChildByClass(MuranoExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getCommaToken() {
    return findChildByType(COMMA_TOKEN);
  }

  @Override
  @Nullable
  public PsiElement getId() {
    return findChildByType(ID);
  }

}
