package com.driving.model;

import java.io.Serializable;

/**
 * created by wk on 2017-11-23
 * account 实体类
 */
public class Account{

    private byte[] id;
    private String phone;
    private String wxAccount;
    private String loginPassword;
    //private User user;

    public Account() {
        super();
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWxAccount() {
        return wxAccount;
    }

    public void setWxAccount(String wxAccount) {
        this.wxAccount = wxAccount;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

}
