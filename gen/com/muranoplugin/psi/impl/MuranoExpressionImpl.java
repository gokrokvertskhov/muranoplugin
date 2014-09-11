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

public class MuranoExpressionImpl extends ASTWrapperPsiElement implements MuranoExpression {

  public MuranoExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MuranoComposedObjectStatement getComposedObjectStatement() {
    return findChildByClass(MuranoComposedObjectStatement.class);
  }

  @Override
  @Nullable
  public MuranoMapEntryElement getMapEntryElement() {
    return findChildByClass(MuranoMapEntryElement.class);
  }

  @Override
  @Nullable
  public MuranoThisProperty getThisProperty() {
    return findChildByClass(MuranoThisProperty.class);
  }

  @Override
  @Nullable
  public MuranoVariable getVariable() {
    return findChildByClass(MuranoVariable.class);
  }

  @Override
  @Nullable
  public PsiElement getAssignToken() {
    return findChildByType(ASSIGN_TOKEN);
  }

  @Override
  @Nullable
  public PsiElement getNullToken() {
    return findChildByType(NULL_TOKEN);
  }

}
