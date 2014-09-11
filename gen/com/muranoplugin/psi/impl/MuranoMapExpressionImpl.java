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

public class MuranoMapExpressionImpl extends MuranoExpressionImpl implements MuranoMapExpression {

  public MuranoMapExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MuranoVisitor) ((MuranoVisitor)visitor).visitMapExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MuranoMapEntryElement getMapEntryElement() {
    return findChildByClass(MuranoMapEntryElement.class);
  }

  @Override
  @Nullable
  public PsiElement getCommaToken() {
    return findChildByType(COMMA_TOKEN);
  }

}
