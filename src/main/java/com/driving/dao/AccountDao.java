package com.driving.dao;

import com.driving.model.Account;

import java.util.List;

/**
 * created by wk on 2017-11-23
 * mapper映射，方法对应mapper.xml的id名
 */
public interface AccountDao {

    /**
     * 查询所有account
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 添加account
     * @param account
     */
    void insertAccount(Account account);

    /**
     * 删除account
     * @param id
     * @return
     */
    void deleteAccountById(String id);

    /**
     * 修改account
     * @param account
     */
    void updateAccount(Account account);
}
