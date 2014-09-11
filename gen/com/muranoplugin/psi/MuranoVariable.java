// This is a generated file. Not intended for manual editing.
package com.muranoplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.muranoplugin.psi.impl.MuranoVariableImpl;

public interface MuranoVariable extends PsiElement {

  @NotNull
  MuranoSubProperty getSubProperty();

  @NotNull
  PsiElement getId();

  String getName();

}
