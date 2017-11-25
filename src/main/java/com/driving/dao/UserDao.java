package com.driving.dao;

import com.driving.model.Account;
import com.driving.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * created by wk on 2017-11-24
 * UserMapper 映射，方法对应 UserMapper.xml 的 id 名
 */
@Component
public interface UserDao {

    int insertUser(String accountId, User user);
}
