// This is a generated file. Not intended for manual editing.
package com.muranoplugin.lex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.muranoplugin.lex.psi.MuranoTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.muranoplugin.lex.psi.*;

public class MuranoLexRootElementImpl extends ASTWrapperPsiElement implements MuranoLexRootElement {

  public MuranoLexRootElementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoLexVisitor) ((MuranoLexVisitor)visitor).visitRootElement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getFnIntToken() {
    return findNotNullChildByType(FN_INT_TOKEN);
  }

}
