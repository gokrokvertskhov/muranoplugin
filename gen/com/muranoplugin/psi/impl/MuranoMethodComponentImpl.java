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

public class MuranoMethodComponentImpl extends ASTWrapperPsiElement implements MuranoMethodComponent {

  public MuranoMethodComponentImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitMethodComponent(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MuranoArgumentsStatement getArgumentsStatement() {
    return findChildByClass(MuranoArgumentsStatement.class);
  }

  @Override
  @Nullable
  public MuranoBodyStatement getBodyStatement() {
    return findChildByClass(MuranoBodyStatement.class);
  }

}
