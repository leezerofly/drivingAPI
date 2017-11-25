package com.driving.controller;

import com.driving.model.Order;
import com.driving.service.OrderService;
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
    private OrderService orderService;

    /**
     * 创建订单
     * @return
     */
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ListObject createOrder(float pay) {
        Order order = new Order();
        order.setPaid(pay);
        order.setStatus(1);
        orderService.createOrder(order);
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
        Order order = orderService.findOrderByUser("0x1E54C0A8D1BB11E7B576525400932C89");
        ListObject list = new ListObject();
        list.setData(order);
        list.setStatusObject(StatusHouse.COMMON_STATUS_OK);
        list.setMessage("提交成功");
        return list;
    }

}
