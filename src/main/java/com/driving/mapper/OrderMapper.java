package com.driving.mapper;

import com.driving.model.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * created by wk on 2017-11-23
 * mapper 映射，方法对应 mapper.xml 的 id 名
 */
@Component
public interface OrderMapper {

    /**
     * 添加 order
     * @param order
     */
    void createOrder(Order order);

}
