package com.driving.service;

import com.driving.model.Account;

import java.util.List;

/**
 * Created by wk on 2017-11-23
 * account的service的接口
 */
public interface UserService {

    /**
     * 查询所有Account
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 登录
     * @param phone
     * @param password
     * @return
     */
    List<Account> login(String phone, String password);

    /**
     * 添加Account
     * @param account
     */
    void insertAccount(Account account);

    /**
     * 删除Account
     * @param id
     * @return
     */
    void deleteAccountById(String id);

    void updateUser(Account account);
}
