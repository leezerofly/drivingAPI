package com.driving.dao;

import com.driving.model.Account;

import java.util.List;

public interface AccountDao {

    List<Account> findAll();
    void insertAccount(Account account);
}
