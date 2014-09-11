package com.muranoplugin;
import com.intellij.lang.Language;
/**
 * Created by gokrokve on 9/3/14.
 */
public class MuranoLanguage extends Language {
    public static final MuranoLanguage INSTANCE = new MuranoLanguage();

    private MuranoLanguage() {
        super("MuranoPL");
    }
}

