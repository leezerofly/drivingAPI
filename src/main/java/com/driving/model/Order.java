package com.driving.model;

import java.util.UUID;

/**
 * created by wk on 2017-11-23
 * Order 实体类
 */
public class Order {

    private String id;
    private String user_id;
    private String class_def_id;
    private String ground_id;
    private int status;
    private float paid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getClass_def_id() {
        return class_def_id;
    }

    public void setClass_def_id(String class_def_id) {
        this.class_def_id = class_def_id;
    }

    public String getGround_id() {
        return ground_id;
    }

    public void setGround_id(String ground_id) {
        this.ground_id = ground_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public float getPaid() {
        return paid;
    }

    public void setPaid(float paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", class_def_id='" + class_def_id + '\'' +
                ", ground_id='" + ground_id + '\'' +
                ", status=" + status +
                ", paid=" + paid +
                '}';
    }
}
