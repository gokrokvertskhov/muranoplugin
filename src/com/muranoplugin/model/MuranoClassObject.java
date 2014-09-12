package com.muranoplugin.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by gokrokve on 9/10/14.
 */
public class MuranoClassObject {
    public Set<String> getProperties() {
        return properties;
    }

    Set<String> properties = new HashSet<String>();

    public Map<String, MuranoMethodObject> getMethods() {
        return methods;
    }

    Map<String, MuranoMethodObject> methods = new HashMap<String, MuranoMethodObject>();

    public MuranoClassObject() {
        this.addMethod("getAttr");
        this.addMethod("setAttr");
        this.addMethod("find");
        this.addMethod("string");
        this.addMethod("int");
        this.addMethod("class");
        this.addProperty("environment");
    }

    public Boolean hasMethod(String method){
        return this.methods.containsKey(method);
    }

    public MuranoMethodObject getMethod(String method){
        return this.methods.get(method);
    }

    public Boolean hasProperty(String property){
        return this.properties.contains(property);
    }

    public void addProperty(String property){
        this.properties.add(property);
    }

    public void addMethod(String name){
        if (!this.hasMethod(name))
           this.methods.put(name, new MuranoMethodObject());
    }
}
