package com.driving.service.impl;

import com.driving.dao.AccountDao;
import com.driving.model.Account;
import com.driving.model.User;
import com.driving.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wk on 2017-11-23
 * account 的 service 层的实现
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public int insertUser(User user) {
        return 1;
    }
}
