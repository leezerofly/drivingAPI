package com.driving.model;

/**
 * Created by pxq on 2017/11/25.
 */
public class ClassDef {
    private byte[] id;
    private byte[] name_id;
    private byte[] type_id;
    private String service_list;
    private String cost_list;
    private String price;

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public byte[] getName_id() {
        return name_id;
    }

    public void setName_id(byte[] name_id) {
        this.name_id = name_id;
    }

    public byte[] getType_id() {
        return type_id;
    }

    public void setType_id(byte[] type_id) {
        this.type_id = type_id;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
