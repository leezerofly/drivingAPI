package com.driving.controller;

import com.driving.mapper.GroundMapper;
import com.driving.model.Ground;
import com.driving.status.ListObject;
import com.driving.status.StatusHouse;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lwy on 2017/11/25/025.
 * ground的Controller
 */
@RestController
@RequestMapping("/ground")
public class GroundController {

    @Autowired
    private GroundMapper groundMapper;

    /**
     * 查询所有 Ground
     * @return
     */
    @RequestMapping(value="/list",method= RequestMethod.GET)
    public ListObject getAllGround(){
        List<Ground> groundList = groundMapper.findAllGround();
        ListObject list = new ListObject();
        list.setData(groundList);
        if (groundList!=null){
            list.setStatusObject(StatusHouse.COMMON_STATUS_OK);
            list.setMessage("获取成功");
        }
        return list;
    }
}
