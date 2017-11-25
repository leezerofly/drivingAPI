package com.driving.service;

import com.driving.model.Account;
import com.driving.model.User;

import java.util.List;

/**
 * Created by wk on 2017-11-23
 * account 的 service 的接口
 */
public interface AccountService {

    /**
     * 查询所有 Account
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 登录
     * @param phone
     * @param password
     * @return
     */
    Account login(String phone, String password);

    /**
     * 添加 Account
     * @param account
     *//*
    void insertAccount(Account account,User user);

    *//**
     * 删除 Account
     * @param id
     * @return
     *//*
    void deleteAccountById(String id);

    void updateUser(Account account);*/
}
