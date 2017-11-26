package com.driving.model;

import sun.nio.cs.ext.GBK;

import java.util.Arrays;
import java.util.UUID;

/**
 * created by wk on 2017-11-23
 * Order 实体类
 */
public class Order {

    private String id;
    private String userID;
    private String classDefID;
    private String groundID;
    private int status;
    private float paid;

    public Order() {
        super();
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getClassDefID() {
        return classDefID;
    }

    public void setClassDefID(String classDefID) {
        this.classDefID = classDefID;
    }

    public String getGroundID() {
        return groundID;
    }

    public void setGroundID(String groundID) {
        this.groundID = groundID;
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
}
