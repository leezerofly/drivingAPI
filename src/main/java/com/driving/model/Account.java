package com.driving.model;

import java.util.UUID;

/**
 * created by wk on 2017-11-23
 * account实体类
 */
public class Account {

    private String id;
    private String phone;
    private String wx_account;
    private String login_password;

    public Account() {
        super();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setWx_account(String wx_account) {
        this.wx_account = wx_account;
    }

    public void setLogin_password(String login_password) {
        this.login_password = login_password;
    }

    public String getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getWx_account() {
        return wx_account;
    }

    public String getLogin_password() {
        return login_password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", wx_account='" + wx_account + '\'' +
                ", login_password='" + login_password + '\'' +
                '}';
    }
}
