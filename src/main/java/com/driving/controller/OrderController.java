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
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 添加 order
     * @return
     */
    @RequestMapping(value="/order/create",method=RequestMethod.POST)
    public ListObject insertOrder(float pay) {
        Order order = new Order();
        order.setPaid(pay);
        order.setStatus(1);
        orderService.createOrder(order);
        ListObject list = new ListObject();
        list.setStatusObject(StatusHouse.COMMON_STATUS_OK);
        list.setMessage("提交成功");
        return list;
    }

}
