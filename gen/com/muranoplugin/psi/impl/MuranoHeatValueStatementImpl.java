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

public class MuranoHeatValueStatementImpl extends ASTWrapperPsiElement implements MuranoHeatValueStatement {

  public MuranoHeatValueStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitHeatValueStatement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MuranoNonListBody getNonListBody() {
    return findNotNullChildByClass(MuranoNonListBody.class);
  }

  @Override
  @NotNull
  public PsiElement getHvalueToken() {
    return findNotNullChildByType(HVALUE_TOKEN);
  }

}
