package com.driving.service;

import com.driving.model.Account;

import java.util.List;

/**
 * Created by Administrator on 2017/8/16.
 */
public interface AccountService {

    List<Account> findAll();
    void insertAccount(Account account);
}
