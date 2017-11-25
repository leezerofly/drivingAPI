package com.driving.service.impl;

import com.driving.dao.OrderDao;
import com.driving.model.Order;
import com.driving.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wk on 2017-11-23
 * order的service层的实现
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    /**
     * 添加Order
     * @param order
     */
    @Override
    public void createOrder(Order order) {
        orderDao.createOrder(order);
    }

}
