package com.driving.service.impl;

import com.driving.mapper.OrderMapper;
import com.driving.model.Order;
import com.driving.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wk on 2017-11-23
 * order 的 service 层的实现
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    /**
     * 添加 Order
     * @param order
     */
    @Override
    public void createOrder(Order order) {
        orderMapper.createOrder(order);
    }

}
