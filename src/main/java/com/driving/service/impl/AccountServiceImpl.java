package com.driving.service.impl;

import com.driving.mapper.AccountMapper;
import com.driving.model.Account;
import com.driving.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import java.util.List;

/**
 * Created by wk on 2017-11-23
 * account 的 service 层的实现
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;
    //private UserDao userDao;
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 查询所有 Account
     * @return
     */
    @Override
    public List<Account> findAllAccount() {
        return accountMapper.findAllAccount();
    }

    /**
     * 登录
     * 如果缓存存在，从缓存中获取 account 信息
     * 如果缓存不存在，从DB中获取 account 信息，然后插入缓存
     * @param phone
     * @param password
     * @return
     */
    @Override
    public List<Account> login(String phone, String password) {
      /*  // 从缓存中获取信息
        String keyPhone = "phone" + phone;
        String keyPassword = "password" + password;
        ValueOperations<String, Account> operations = redisTemplate.opsForValue();

        // 缓存存在
        boolean hasKeyPhone = redisTemplate.hasKey(keyPhone);
        boolean hasKeyPassword = redisTemplate.hasKey(keyPassword);
        if (hasKeyPhone && hasKeyPassword){

        }*/
        return accountMapper.login(phone,password);
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
