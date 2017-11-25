package com.driving.controller;

import com.driving.mapper.OrderMapper;
import com.driving.model.Order;
import com.driving.status.ListObject;
import com.driving.status.StatusHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
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
//        List<Order> orderList = orderMapper.findAllOrder();
//        System.out.println(orderList);
        Order order = orderMapper.findOrderByUser("23ec5d1f-d1d5-11".getBytes());
        ListObject list = new ListObject();
//        list.setData(Arrays.toString(orderList.get(0).getUserID()));
        list.setData(order);
        list.setStatusObject(StatusHouse.COMMON_STATUS_OK);
        list.setMessage("提交成功");
        return list;
    }
    /**
     *  测试
     * @return
     */
    @RequestMapping(value = "/test",method = RequestMethod.PUT)
    public ListObject Test(float pay) {
        List<Order> orderList = orderMapper.findAllOrder();
//        System.out.println(orderList);
//        Order order = orderMapper.findOrderByUser("[50, 51, 101, 99, 53, 100, 49, 102, 45, 100, 49, 100, 53, 45, 49, 49]".getBytes());
        ListObject list = new ListObject();
        list.setData(new String(orderList.get(0).getUserID()));
//        list.setData(order);
        list.setStatusObject(StatusHouse.COMMON_STATUS_OK);
        list.setMessage("提交成功");
        return list;
    }

}
