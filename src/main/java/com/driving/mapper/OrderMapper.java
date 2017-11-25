package com.driving.mapper;

import com.driving.model.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * created by wk on 2017-11-23
 * OrderMapper 映射，方法对应 OrderMapper.xml 的 id 名
 */
@Component
public interface OrderMapper {

    /**
     * 创建 order
     * @param order
     */
    void createOrder(Order order);

    /**
     * 查找 order
     * @param user_id
     */
    Order findOrderByUser(@Param("user_id") byte[] user_id);

    /**
     * 返回 order 列表
     */
    List<Order> findAllOrder();

    /**
     * 更新 order
     * @param order
     */
    void updateOrder(Order order);

}
