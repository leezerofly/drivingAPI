package com.driving.model;

import java.util.Date;

/**
 * created by wk on 2017-11-25
 * token 实体类
 */
public class Token {

    private byte[] id;
    private byte[] accountId;
    private Integer clientType;
    private byte[] accessToken;
    private Date refreshTime;

    public Token() {
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

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public byte[] getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(byte[] accessToken) {
        this.accessToken = accessToken;
    }

    public Date getRefreshTime() {
        return refreshTime;
    }

    public void setRefreshTime(Date refreshTime) {
        this.refreshTime = refreshTime;
    }

}
