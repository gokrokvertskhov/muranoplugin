package com.muranoplugin.psi;
import com.intellij.psi.tree.IElementType;
import com.muranoplugin.MuranoLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
/**
 * Created by gokrokve on 9/3/14.
 */
public class MuranoElementType extends IElementType{
    public MuranoElementType(@NotNull @NonNls String debugName) {
        super(debugName, MuranoLanguage.INSTANCE);
    }
}
