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

public class MuranoAssignmentStatementImpl extends MuranoAssignMixin implements MuranoAssignmentStatement {

  public MuranoAssignmentStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitAssignmentStatement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MuranoExpression getExpression() {
    return findNotNullChildByClass(MuranoExpression.class);
  }

  @Override
  @NotNull
  public MuranoLvalue getLvalue() {
    return findNotNullChildByClass(MuranoLvalue.class);
  }

  @Override
  @NotNull
  public PsiElement getAssignToken() {
    return findNotNullChildByType(ASSIGN_TOKEN);
  }

}
