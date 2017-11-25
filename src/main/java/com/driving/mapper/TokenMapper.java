package com.driving.mapper;

import com.driving.model.Account;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * created by wk on 2017-11-25
 * TokenMapper 映射，方法对应 TokenMapper.xml 的 id 名
 */

@Component
public interface TokenMapper {

    int insertToken(String id);

}
