// This is a generated file. Not intended for manual editing.
package com.muranoplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.muranoplugin.psi.impl.MuranoPropertyItemImpl;

public interface MuranoPropertyItem extends PsiElement {

  @NotNull
  MuranoPropertyItemElems getPropertyItemElems();

  @NotNull
  PsiElement getAssignToken();

  @NotNull
  PsiElement getId();

  String getKey();

  String getValue();

  String getUsage();

}
