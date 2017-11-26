package com.driving.mapper;

import com.driving.model.User;
import org.springframework.stereotype.Component;

/**
 * created by wk on 2017-11-24
 * UserMapper 映射，方法对应 UserMapper.xml 的 id 名
 */
@Component
public interface UserMapper {

    int insertUser(User user);
}
