package com.driving.model;

/**
 * created by wk on 2017-11-24
 * user 实体类
 */
public class User {

    private byte[] id;
    private byte[] accountId;
    private String name;
    private String img;
    private String district;

    public User() {
        super();
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public byte[] getAccountId() {
        return accountId;
    }

    public void setAccountId(byte[] accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

}
