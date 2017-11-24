package com.driving.dao;

import com.driving.model.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * created by wk on 2017-11-23
 * mapper映射，方法对应mapper.xml的id名
 */
public interface UserDao {

    /**
     * 查询所有account
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 登录
     * @param phone
     * @param password
     * @return
     */
    List<Account> login(@Param("phone") String phone, @Param("password") String password);

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
