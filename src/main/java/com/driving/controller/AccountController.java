package com.driving.controller;

import com.driving.model.Account;
import com.driving.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * created by wk on 2017-11-23
 * account的Controller
 */
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 查询所有Account
     * @return
     */
    @RequestMapping(value="/getAllAccount",method= RequestMethod.GET)
    public List<Account> getAllAccount(){
        List<Account> accountList = accountService.findAllAccount();
        return accountList;
    }

    /**
     * 添加Account
     * @param account
     */
    @RequestMapping("/insertAccount")
    public void insertAccount(Account account) {
        accountService.insertAccount(account);
    }

    /**
     * 根据id删除Account
     * @param id
     * @return
     */
    /*@RequestMapping(value = "/deleteAccountById/{id}")
    public boolean deleteAccountById(@PathVariable("id") String id){
        accountService.deleteAccountById(id);
        return true;
    }*/
}
