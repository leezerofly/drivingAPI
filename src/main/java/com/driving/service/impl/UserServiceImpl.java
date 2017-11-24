package com.driving.service.impl;

import com.driving.dao.AccountDao;
import com.driving.model.Account;
import com.driving.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wk on 2017-11-23
 * account的service层的实现
 */
@Service
public class UserServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    /**
     * 查询所有Account
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

    /**
     * 添加Account
     * @param account
     */
    @Override
    public void insertAccount(Account account) {
        accountDao.insertAccount(account);
    }

    /**
     * 删除deleteAccountById
     * @param id
     */
    @Override
    public void deleteAccountById(String id) {
        accountDao.deleteAccountById(id);
    }

    @Override
    public void updateUser(Account account) {
        accountDao.updateAccount(account);
    }
}
