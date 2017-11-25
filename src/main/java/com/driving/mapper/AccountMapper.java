package com.driving.mapper;

import com.driving.model.Account;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * created by wk on 2017-11-23
 * AccountMapper 映射，方法对应 AccuntMapper.xml 的 id 名
 */
@Component
public interface AccountMapper {

    /**
     * 查询所有 account
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

   /* *//**
     * 添加 account
     * @param account
     *//*
    int insertAccount(Account account);

    *//**
     * 删除 account
     * @param id
     * @return
     *//*
    void deleteAccountById(String id);

    *//**
     * 修改 account
     * @param account
     *//*
    void updateAccount(Account account);*/
}