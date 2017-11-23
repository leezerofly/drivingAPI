package com.driving.service;

import com.driving.model.Account;

import java.util.List;

/**
 * Created by wk on 2017-11-23
 * account的service的接口
 */
public interface AccountService {

    /**
     * 查询所有Account
     * @return
     */
    List<Account> findAllAccount();

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
    /*void deleteAccountById(String id);*/
}
