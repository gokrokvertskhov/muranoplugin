package com.muranoplugin.psi;
import com.intellij.psi.tree.IElementType;
import com.muranoplugin.MuranoLanguage;
import com.muranoplugin.MuranoLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by gokrokve on 9/3/14.
 */
public class MuranoTokenType extends IElementType{
    public MuranoTokenType(@NotNull @NonNls String debugName) {
        super(debugName, MuranoLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "MuranoTokenType." + super.toString();
    }




}
