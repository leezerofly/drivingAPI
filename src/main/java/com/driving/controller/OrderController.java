package com.driving.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import com.driving.mapper.OrderMapper;
import com.driving.model.dbmodel.Order;
import com.driving.model.jsonmodel.OrderJSON;
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
        Order order = orderMapper.findOrderByUser("23ec5d1f-d1d5-11".getBytes());
        OrderJSON orderJSON = order.toFrom();
        ListObject list = new ListObject();
        list.setData(orderJSON);
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
        Order order = orderMapper.findOrderByUser("23ec5d1f-d1d5-11".getBytes());
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
        Order order = orderMapper.findOrderByUser("1E54C0A8D1BB11E7B576525400932C89".getBytes());
        order.setStatus(-1);
        orderMapper.updateOrder(order);
        ListObject list = new ListObject();
        list.setData(order);
        list.setStatusObject(StatusHouse.COMMON_STATUS_OK);
        list.setMessage("删除成功！");
        return list;
    }

    /**
     *  测试（待删除）
     * @return
     */
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public ListObject Test() {
        List<Order> orderList = orderMapper.findAllOrder();
        List<OrderJSON> orderJSONList = new ArrayList();
        ListObject list = new ListObject();
        for (int i = 0; i < orderList.size(); i++) {
            orderJSONList.add(orderList.get(i).toFrom());
        }
        list.setData(orderList);
        list.setStatusObject(StatusHouse.COMMON_STATUS_OK);
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<orderList.get(0).getGroundID().length;i++){
            sb.append((char)orderList.get(0).getGroundID()[i]);
        }
        System.out.println(bytes2HexString(orderList.get(0).getGroundID()));
        list.setMessage(new String(orderList.get(0).getGroundID()));
        return list;
    }
    public static String bytes2HexString(byte[] b) {
        String ret = "";
        for (int i = 0; i < b.length; i++) {
            String hex = Integer.toHexString(b[ i ] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            ret += hex.toUpperCase();
        }
        return ret;
    }

}
