package com.driving.model.dbmodel;

import com.driving.model.jsonmodel.OrderJSON;
import sun.nio.cs.ext.GBK;

import java.util.Arrays;
import java.util.UUID;

/**
 * created by wk on 2017-11-23
 * Order 实体类
 */
public class Order {

    private byte[] id;
    private byte[] userID;
    private byte[] classDefID;
    private byte[] groundID;
    private int status;
    private float paid;

    public Order() {
        super();
    }

    public OrderJSON toFrom(){
        OrderJSON json = new OrderJSON();
        json.setId(new String(id));
        json.setUserID(new String(userID));
        json.setClassDefID(new String(classDefID));
        json.setGroundID(new String(groundID));
        json.setStatus(status);
        json.setPaid(paid);
        return json;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public byte[] getUserID() {
        return userID;
    }

    public void setUserID(byte[] userID) {
        this.userID = userID;
    }

    public byte[] getClassDefID() {
        return classDefID;
    }

    public void setClassDefID(byte[] classDefID) {
        this.classDefID = classDefID;
    }

    public byte[] getGroundID() {
        return groundID;
    }

    public void setGroundID(byte[] groundID) {
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