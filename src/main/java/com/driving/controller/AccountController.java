package com.driving.controller;

import com.driving.model.Account;
import com.driving.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
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
//    private AccountDao accountDao;
//
//    @RequestMapping("/hello")
//    public String say(){
//        return "Hello SpringBoot!";
//    }

    @RequestMapping(value="/getAllAccount",method= RequestMethod.GET)
    public List<Account> getAllAccount(){
        List<Account> accountList = accountService.findAll();
        return accountList;
    }

    @RequestMapping("/add")
    public void save(Account account) {
        accountService.insertAccount(account);
    }

    /*@RequestMapping(value={"/addAccount"}, method=RequestMethod.POST)
    public void addUser(Account account){
        accountDao.addUser(account);
    }*/
    /*public List<Account> getHeroList(){
        List<Account> accountList = accountService.findAllUser();
        return accountList;
    }*/
}
