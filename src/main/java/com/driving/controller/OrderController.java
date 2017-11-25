package com.driving.controller;

import com.driving.mapper.OrderMapper;
import com.driving.model.Order;
import com.driving.status.ListObject;
import com.driving.status.StatusHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * created by wk on 2017-11-23
 * order的Controller
 */
@RestController
@RequestMapping("/order")
public class OrderController {


    @Autowired
    private OrderMapper orderMapper;

    /**
     * 创建订单
     * @return
     */
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ListObject createOrder(float pay) {
        Order order = new Order();
        order.setPaid(pay);
        order.setStatus(1);
        orderMapper.createOrder(order);
        ListObject list = new ListObject();
        list.setStatusObject(StatusHouse.COMMON_STATUS_OK);
        list.setMessage("提交成功");
        return list;
    }
    /**
     *  继续支付
     * @return
     */
    @RequestMapping(value = "/pay",method = RequestMethod.PUT)
    public ListObject payOrder(float pay) {
//        List<Order> orderList = orderService.findAllOrder();
//        System.out.println(orderList);
        Order order = orderMapper.findOrderByUser("MjNlYzVkMWYtZDFkNS0xMQ==".getBytes());
        ListObject list = new ListObject();
        list.setData(order);
        list.setStatusObject(StatusHouse.COMMON_STATUS_OK);
        list.setMessage("提交成功");
        return list;
    }

}
