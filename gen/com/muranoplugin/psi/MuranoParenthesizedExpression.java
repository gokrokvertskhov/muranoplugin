// This is a generated file. Not intended for manual editing.
package com.muranoplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MuranoParenthesizedExpression extends MuranoExpression {

  @Nullable
  MuranoExpression getExpression();

  @NotNull
  PsiElement getLparenToken();

  @Nullable
  PsiElement getRparenToken();

}
