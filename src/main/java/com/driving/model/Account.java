package com.driving.model;

import java.io.Serializable;


public class Account implements Serializable {

    private String ID;
    private String phone;
    private String wx_account;
    private String login_password;
    private User user;

    public Account() {
        super();
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public String getID() {
        return ID;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ID=" + ID +
                ", phone='" + phone + '\'' +
                ", wx_account='" + wx_account + '\'' +
                ", login_password='" + login_password + '\'' +
                '}';
    }
}
