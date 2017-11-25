package com.driving.service.impl;

import com.driving.dao.AccountDao;
import com.driving.dao.UserDao;
import com.driving.model.Account;
import com.driving.model.User;
import com.driving.service.AccountService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by wk on 2017-11-23
 * account 的 service 层的实现
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    private UserDao userDao;

    /**
     * 查询所有 Account
     * @return
     */
    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    /**
     * 登录
     * @param phone
     * @param password
     * @return
     */
    @Override
    public List<Account> login(String phone, String password) {
        return accountDao.login(phone,password);
    }

   /* *//**
     * 添加 Account
     * @param account
     *//*
    @Override
    @Transactional
    public void insertAccount(Account account, User user) {
        int insertAccountCount = accountDao.insertAccount(account);
        String accountId = account.getID();
        if(insertAccountCount == 1){
            int insertUserCount = userDao.insertUser(accountId,user);
        }
    }

    *//**
     * 删除 deleteAccountById
     * @param id
     *//*
    @Override
    public void deleteAccountById(String id) {
        accountDao.deleteAccountById(id);
    }

    @Override
    public void updateUser(Account account) {
        accountDao.updateAccount(account);
    }*/
}
