// This is a generated file. Not intended for manual editing.
package com.muranoplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MuranoNamespaceItem extends PsiElement {

  @NotNull
  MuranoFqdn getFqdn();

  @Nullable
  PsiElement getAssignToken();

  @Nullable
  PsiElement getDefaultnsToken();

  @Nullable
  PsiElement getId();

}
