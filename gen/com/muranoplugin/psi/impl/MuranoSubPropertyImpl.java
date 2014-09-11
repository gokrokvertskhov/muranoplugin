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

public class MuranoSubPropertyImpl extends ASTWrapperPsiElement implements MuranoSubProperty {

  public MuranoSubPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitSubProperty(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MuranoSubProperty getSubProperty() {
    return findChildByClass(MuranoSubProperty.class);
  }

  @Override
  @Nullable
  public PsiElement getFnFormatToken() {
    return findChildByType(FN_FORMAT_TOKEN);
  }

  @Override
  @Nullable
  public PsiElement getId() {
    return findChildByType(ID);
  }

}
