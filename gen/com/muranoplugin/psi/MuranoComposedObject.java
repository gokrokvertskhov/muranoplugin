// This is a generated file. Not intended for manual editing.
package com.muranoplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MuranoComposedObject extends PsiElement {

  @Nullable
  MuranoLvalue getLvalue();

  @NotNull
  PsiElement getAssignToken();

  @NotNull
  PsiElement getId();

  @Nullable
  PsiElement getNullToken();

}
