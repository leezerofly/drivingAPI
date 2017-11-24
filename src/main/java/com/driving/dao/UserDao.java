package com.driving.dao;

import com.driving.model.Account;
import com.driving.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * created by wk on 2017-11-24
 * usermapper映射，方法对应UserMapper.xml的id名
 */
public interface UserDao {

    int insertUser(String accountId, User user);
}
