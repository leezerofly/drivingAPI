package com.driving.model;

/**
 * Created by cuiyingGao on 2017/11/25 0025.
 * classOutput 实体类
 */
public class ClassOutput {

    private String class_id;
    private String class_name;
    private Float class_min_price;

    public ClassOutput(){super();}
    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public Float getClass_minprice() {
        return class_min_price;
    }

    public void setClass_minprice(Float class_minprice) {
        this.class_min_price = class_minprice;
    }





    @Override
    public String toString() {

        return "ClassName{" +
                "class_id=" + class_id +
                ",class_name='" + class_name + '\'' +
                ", class_min_price='" + class_min_price + '\'' +
                '}';
    }
}
