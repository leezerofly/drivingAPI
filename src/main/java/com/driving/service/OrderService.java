package com.driving.service;

import com.driving.model.Order;

import java.util.List;

/**
 * Created by wk on 2017-11-23
 * order 的 service 的接口
 */
public interface OrderService {

    /**
     * 添加 Order
     * @param order
     */
    void createOrder(Order order);


}
