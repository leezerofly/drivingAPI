package com.driving.model;

/**
 * Created by cuiyingGao on 2017/11/25 0025.
 * classOutput 实体类
 */
public class ClassOutput {

    private byte[] id;
    private String name;
    private Float price;
    public ClassOutput(){super();}

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(ClassName className) {
        return className.getName();
    }


    public byte[] getId(ClassName className) {

        return className.getId();
    }

    public Float getPrice(ClassDef classDef) {
        return classDef.getPrice();
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
