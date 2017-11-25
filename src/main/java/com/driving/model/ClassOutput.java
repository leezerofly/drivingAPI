package com.driving.model;

/**
 * Created by cuiyingGao on 2017/11/25 0025.
 * classname 实体类
 */
public class ClassOutput {

    private String id;
    private String name;
    private String intro;
    private Float price;
    public ClassOutput(){super();}

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getIntro() {
        return intro;
    }

    public String getName() {
        return name;
    }


    public String getId() {
        return id;
    }

    public Float getPrice() {
        return price;
    }

    @Override
    public String toString() {

        return "ClassName{" +
                "ID=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
