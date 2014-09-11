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

public class MuranoClassBodyImpl extends ASTWrapperPsiElement implements MuranoClassBody {

  public MuranoClassBodyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitClassBody(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MuranoCommentStatement getCommentStatement() {
    return findChildByClass(MuranoCommentStatement.class);
  }

  @Override
  @Nullable
  public MuranoExtendsStatement getExtendsStatement() {
    return findChildByClass(MuranoExtendsStatement.class);
  }

  @Override
  @Nullable
  public MuranoPropertiesStatement getPropertiesStatement() {
    return findChildByClass(MuranoPropertiesStatement.class);
  }

  @Override
  @Nullable
  public MuranoWorkflowsStatement getWorkflowsStatement() {
    return findChildByClass(MuranoWorkflowsStatement.class);
  }

}
