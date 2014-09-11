package com.muranoplugin;

import com.intellij.lexer.FlexAdapter;
import java.io.Reader;

/**
 * Created by gokrokve on 9/3/14.
 */
public class MuranoLexerAdapter extends FlexAdapter {
    public MuranoLexerAdapter() {
        super(new _MuranoLexer((Reader) null));
    }
}
