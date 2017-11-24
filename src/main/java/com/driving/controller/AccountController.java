package com.driving.controller;

import com.driving.model.Account;
import com.driving.service.AccountService;
import com.driving.status.ListObject;
import com.driving.status.StatusHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value="/login")
    public ListObject login( String phone, String password) {
        List<Account> accountList = accountService.login(phone, password);
        System.out.println(phone);
        System.out.println(password);
        ListObject list = new ListObject();
        list.setData(accountList);
        if (accountList!=null){
            list.setStatusObject(StatusHouse.COMMON_STATUS_OK);
            list.setMessage("提交成功");
        }
        return list;
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
    @RequestMapping(value = "/deleteAccountById")
    public int deleteAccountById(String id){
        System.out.println(id);
        accountService.deleteAccountById(id);
        return 200;
    }

    @RequestMapping(value="/updateAccount")
    @ResponseBody
    public boolean updateUser(@RequestBody  Account account) {
        accountService.updateUser(account);
        return true;
    }
}
