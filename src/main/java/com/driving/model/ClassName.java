package com.driving.model;

/**
 * Created by cuiyingGao on 2017/11/25 0025.
 * classname 实体类
 */
public class ClassName {

    private String id;
    private String name;
    private String intro;
    public ClassName(){super();}

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(String ID) {
        this.id = id;
    }

    public String getIntro() {
        return intro;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return id;
    }

    @Override
    public String toString() {

        return "ClassName{" +
                "ID=" + id +
                ", name='" + name + '\'' +
                ", intro='" + intro + '\'' +
                '}';
    }
}
