package com.muranoplugin.psi;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.muranoplugin.MuranoFileType;
import com.muranoplugin.MuranoLanguage;
import org.jetbrains.annotations.NotNull;
import javax.swing.*;
/**
 * Created by gokrokve on 9/3/14.
 */
public class MuranoFile extends PsiFileBase{
    public MuranoFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, MuranoLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return MuranoFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Simple File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
