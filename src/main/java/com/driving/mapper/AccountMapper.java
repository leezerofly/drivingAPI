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
     * 注册
     * @param account
     */
    void register(Account account);


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
    Account login(@Param("phone") String phone, @Param("password") String password);

}
