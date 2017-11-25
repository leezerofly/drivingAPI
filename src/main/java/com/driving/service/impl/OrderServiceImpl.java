package com.driving.service.impl;

import com.driving.mapper.OrderMapper;
import com.driving.model.Order;
import com.driving.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by wk on 2017-11-23
 * order 的 service 层的实现
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    /**
     * 添加 order
     * @param order
     */
    @Override
    public void createOrder(Order order) {
        orderMapper.createOrder(order);
    }
    /**
     * 查找 order
     * @param user_id
     * return
     */

    /**
     * 返回 order 列表
     * return
     */
    public List<Order> findAllOrder(){
        return orderMapper.findAllOrder();
    }

}
