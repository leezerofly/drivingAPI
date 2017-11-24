package com.driving.model;

/**
 * created by wk on 2017-11-24
 * user实体类
 */
public class User {

    private String ID;
    private String accountId;
    private String name;
    private String img;
    private String district;

    public User() {
        super();
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
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

    @Override
    public String toString() {
        return "User{" +
                "ID='" + ID + '\'' +
                ", accountId='" + accountId + '\'' +
                ", name='" + name + '\'' +
                ", img='" + img + '\'' +
                ", district='" + district + '\'' +
                '}';
    }
}
