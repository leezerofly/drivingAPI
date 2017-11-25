package com.driving.controller;

import com.driving.mapper.ClassOutputMapper;
import com.driving.mapper.CoachMapper;
import com.driving.model.Coach;
import com.driving.status.ListObject;
import com.driving.status.StatusHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//import com.driving.mapper.CoachService;

/**
 * Created by Cuiying Gao on 2017/11/24 0024.
 */
@RestController
@RequestMapping("/coach")
public class ClassOutputController {

    @Autowired
    private ClassOutputMapper classOutputMapper;

    /**
     * 查询所有 Coach
     * @return
     */
    @RequestMapping(value="/list",method= RequestMethod.GET)
    public ListObject getAllCoach(){
        List<Coach> coachList = classOutputMapper.findAllCoach();
        ListObject list = new ListObject();
        list.setData(coachList);
        if (coachList!=null){
            list.setStatusObject(StatusHouse.COMMON_STATUS_OK);
            list.setMessage("获取成功");
        }
        return list;
    }

}
