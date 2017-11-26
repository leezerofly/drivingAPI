package com.driving.controller;

import com.driving.mapper.OrderMapper;
import com.driving.model.Order;
import com.driving.status.ListObject;
import com.driving.status.StatusHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        /// order设置userID，calssDefID,groundID（待写入）
        order.setPaid(pay);
        order.setStatus(1);
        orderMapper.createOrder(order);
        ListObject list = new ListObject();
        list.setData(order);
        list.setStatusObject(StatusHouse.COMMON_STATUS_OK);
        list.setMessage("创建成功！");
        return list;
    }

    /**
     *  获取订单
     * @return
     */
    @RequestMapping(value = "",method = RequestMethod.GET)
    public ListObject getOrder() {
        /// 获取当前登录用户的cookie（待写入）
        Order order = orderMapper.findOrderByUser("612b6048-d29d-11e7-b576-525400932c89");
        ListObject list = new ListObject();
        list.setData(order);
        list.setStatusObject(StatusHouse.COMMON_STATUS_OK);
        list.setMessage("获取成功！");
        return list;
    }

    /**
     *  继续支付
     * @return
     */
    @RequestMapping(value = "/pay",method = RequestMethod.PUT)
    public ListObject payOrder(float pay) {
        /// 获取当前登录用户的cookie（待写入）
        Order order = orderMapper.findOrderByUser("612b6048-d29d-11e7-b576-525400932c89");
        float paid = order.getPaid() + pay;
        order.setPaid(paid);
        /// 判断总价和已支付的价格的比值，重新写入状态（待写入）
        if(true){
            order.setStatus(2);
        }
        orderMapper.updateOrder(order);
        ListObject list = new ListObject();
        list.setData(order);
        list.setStatusObject(StatusHouse.COMMON_STATUS_OK);
        list.setMessage("提交成功！");
        return list;
    }

    /**
     *  取消订单
     * @return
     */
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public ListObject cancelOrder() {
        /// 获取当前登录用户的cookie（待写入）
        Order order = orderMapper.findOrderByUser("dsad");
        order.setStatus(-1);
        orderMapper.updateOrder(order);
        ListObject list = new ListObject();
        list.setData(order);
        list.setStatusObject(StatusHouse.COMMON_STATUS_OK);
        list.setMessage("删除成功！");
        return list;
    }

}
