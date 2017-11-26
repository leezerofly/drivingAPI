package com.driving.controller;

import com.driving.mapper.AccountMapper;
import com.driving.mapper.TokenMapper;
import com.driving.mapper.UserMapper;
import com.driving.model.Account;
import com.driving.model.Token;
import com.driving.model.User;
import com.driving.status.ListObject;
import com.driving.status.StatusHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * created by wk on 2017-11-23
 * account的Controller
 */
@RestController
public class AccountController {

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private TokenMapper tokenMapper;

    @Autowired
    private UserMapper userMapper;

    @Transactional
    @RequestMapping(value="/register", method = RequestMethod.POST)
    public ListObject register(String phone,String password,String username){
        ListObject list = new ListObject();
        Account account = new Account();
        User user = new User();
        Token token = new Token();
        account.setPhone(phone);
        account.setLoginPassword(password);
        user.setAccountId(account.getId());
        token.setAccountId(account.getId());
        String uuid = UUID.randomUUID().toString();
        String accessToken = uuid.replace("-", "");
        token.setAccessToken(accessToken);
        accountMapper.register(account);
        userMapper.insertUser(user);
        tokenMapper.insertToken(token);
        list.setData(account);
        list.setStatusObject(StatusHouse.COMMON_STATUS_OK);
        list.setMessage("提交成功");
        return list;
    }

    /**
     * 查询所有Account
     * @return
     *//*
    @RequestMapping(value="/getAllAccount")
    public ListObject getAllAccount(){
        List<Account> accountList = accountService.findAllAccount();
        ListObject list = new ListObject();
        list.setData(accountList);
        if (accountList!=null){
//            list.setCode("200");
//            list.setStatus("success");
            list.setStatusObject(StatusHouse.COMMON_STATUS_OK);
            list.setMessage("成功");
        }
        return list;
    }

    /**
     * 登录
     * @param phone
     * @param password
     * @return
     */
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public ListObject login( String phone, String password) {
        ListObject list = new ListObject();
        Account account = accountMapper.login(phone, password);
        Token token = new Token();
        token.setAccountId(account.getId());
        tokenMapper.insertToken(token);
        list.setData(account);
        if (account!=null){
            list.setStatusObject(StatusHouse.COMMON_STATUS_OK);
            list.setMessage("提交成功");
        }
        return list;
    }

    /**
     * 添加Account
     * @param account
     *//**//*
    @RequestMapping("/insertAccount")
    public void insertAccount(Account account,User user) {
        accountService.insertAccount(account,user);
    }*//*

    *//**
     * 根据id删除Account
     * @param id
     * @return
     *//*
    @RequestMapping(value = "/deleteAccountById")
    public int deleteAccountById(String id){
        System.out.println(id);
        accountService.deleteAccountById(id);
        return 200;
    }

    /*@RequestMapping(value="/updateAccount")
    @ResponseBody
    public boolean updateUser(@RequestBody  Account account) {
        accountService.updateUser(account);
        return true;
    }*/
}
