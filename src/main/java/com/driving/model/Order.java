package com.driving.model;

import java.util.Arrays;
import java.util.UUID;

/**
 * created by wk on 2017-11-23
 * Order 实体类
 */
public class Order {

    private byte[] id;
    private byte[] user_id;
    private byte[] class_def_id;
    private byte[] ground_id;
    private int status;
    private float paid;

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public byte[] getUser_id() {
        return user_id;
    }

    public void setUser_id(byte[] user_id) {
        this.user_id = user_id;
    }

    public byte[] getClass_def_id() {
        return class_def_id;
    }

    public void setClass_def_id(byte[] class_def_id) {
        this.class_def_id = class_def_id;
    }

    public byte[] getGround_id() {
        return ground_id;
    }

    public void setGround_id(byte[] ground_id) {
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
                "id=" + Arrays.toString(id) +
                ", user_id=" + Arrays.toString(user_id) +
                ", class_def_id=" + Arrays.toString(class_def_id) +
                ", ground_id=" + Arrays.toString(ground_id) +
                ", status=" + status +
                ", paid=" + paid +
                '}';
    }
}
