package com.muranoplugin;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by gokrokve on 9/3/14.
 */
public class MuranoFileType extends LanguageFileType {
    public static final MuranoFileType INSTANCE = new MuranoFileType();
        private MuranoFileType() {
            super(MuranoLanguage.INSTANCE);
        }

        @NotNull
        @Override
        public String getName() {
            return "Murano File";
        }

        @NotNull
        @Override
        public String getDescription() {
            return "Murano language file";
        }

        @NotNull
        @Override
        public String getDefaultExtension() {
            return "murano";
        }

        @Nullable
        @Override
        public Icon getIcon() {
            return MuranoIcons.FILE;
        }
}

