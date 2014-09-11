// This is a generated file. Not intended for manual editing.
package com.muranoplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MuranoConditionalStatement extends PsiElement {

  @NotNull
  List<MuranoBody> getBodyList();

  @NotNull
  MuranoExpression getExpression();

  @NotNull
  PsiElement getIfToken();

  @NotNull
  PsiElement getThenToken();

}
