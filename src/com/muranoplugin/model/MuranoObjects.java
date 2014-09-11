package com.muranoplugin.model;

import com.intellij.openapi.diagnostic.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gokrokve on 9/10/14.
 */

public class MuranoObjects {
    private final static MuranoObjects store = new MuranoObjects();

    public static MuranoObjects getStore(){
        return store;
    }

    public static final Logger LOG_ = Logger.getInstance("com.muranoplugin.model.MuranoObjects");

    Map<String, MuranoClassObject> classes = new HashMap<String, MuranoClassObject>();

    public void addClass(String name){
        if (!this.hasClass(name)) {
            classes.put(name, new MuranoClassObject());
            LOG_.info("Added class to object store: " + name);
        }
    }

    public MuranoClassObject getClass(String name){
        return this.classes.get(name);
    }

    public Boolean hasClass(String name){
        return this.classes.containsKey(name);
    }
}
