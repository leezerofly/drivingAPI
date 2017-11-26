package com.driving.model;

/**
 * Created by lwy on 2017/11/26/026.
 */
public class ClassDetail {
    private byte[] class_id;
    private ClassName class_name;
    private ClassType class_type;
    private String service_list;
    private String cost_list;
    private Float price;

    public byte[] getId() {
        return class_id;
    }

    public void setId(byte[] id) {
        this.class_id = id;
    }

    public ClassName getClass_name() {
        return class_name;
    }

    public void setClass_name(ClassName class_name) {
        this.class_name = class_name;
    }

    public ClassType getClass_Type() { return class_type; }

    public void setClass_Type(ClassType type_id) {
        this.class_type = class_type;
    }

    public String getService_list() {
        return service_list;
    }

    public void setService_list(String service_list) {
        this.service_list = service_list;
    }

    public String getCost_list() {
        return cost_list;
    }

    public void setCost_list(String cost_list) {
        this.cost_list = cost_list;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
