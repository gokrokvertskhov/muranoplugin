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

public class MuranoClassStatementImpl extends MuranoClassMixin implements MuranoClassStatement {

  public MuranoClassStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitClassStatement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MuranoClassBodyItems getClassBodyItems() {
    return findNotNullChildByClass(MuranoClassBodyItems.class);
  }

  @Override
  @NotNull
  public MuranoFqdn getFqdn() {
    return findNotNullChildByClass(MuranoFqdn.class);
  }

}
