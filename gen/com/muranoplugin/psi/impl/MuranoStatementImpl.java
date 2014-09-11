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

public class MuranoStatementImpl extends ASTWrapperPsiElement implements MuranoStatement {

  public MuranoStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MuranoAssignmentStatement getAssignmentStatement() {
    return findChildByClass(MuranoAssignmentStatement.class);
  }

  @Override
  @Nullable
  public MuranoCommentStatement getCommentStatement() {
    return findChildByClass(MuranoCommentStatement.class);
  }

  @Override
  @Nullable
  public MuranoConditionalStatement getConditionalStatement() {
    return findChildByClass(MuranoConditionalStatement.class);
  }

  @Override
  @Nullable
  public MuranoExpression getExpression() {
    return findChildByClass(MuranoExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getIndent() {
    return findChildByType(INDENT);
  }

  public void setIndent() {
    MuranoPsiImplUtil.setIndent(this);
  }

  public Boolean checkIndent() {
    return MuranoPsiImplUtil.checkIndent(this);
  }

}
