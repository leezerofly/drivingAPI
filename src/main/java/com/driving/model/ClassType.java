package com.driving.model;

/**
 * Created by pxq on 2017/11/25.
 */
public class ClassType {

    private String id;
    private String name;
    private ClassDef classDef;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassDef getClassDef() {
        return classDef;
    }

    public void setClassDef(ClassDef classDef) {
        this.classDef = classDef;
    }

}
