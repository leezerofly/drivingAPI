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
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public void insertAccount(Account account) {
        accountDao.insertAccount(account);
    }
}
