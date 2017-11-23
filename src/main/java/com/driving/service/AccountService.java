package com.driving.service;

import com.driving.model.Account;

import java.util.List;

/**
 * Created by wk on 2017-11-23
 * account的service的接口
 */
public interface AccountService {

    List<Account> findAll();
    void insertAccount(Account account);
}
