package com.driving.controller;

import com.driving.model.Coach;
import com.driving.service.CoachService;
import com.driving.status.ListObject;
import com.driving.status.StatusHouse;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Cuiying Gao on 2017/11/24 0024.
 */
@RestController
@RequestMapping("/coach")
public class CoachController {

    @Autowired
    private CoachService coachService;

    /**
     * 查询所有 Coach
     * @return
     */
    @RequestMapping(value="/list",method= RequestMethod.GET)
    public ListObject getAllCoach(){
        List<Coach> coachList = coachService.findAllCoach();
        ListObject list = new ListObject();
        list.setData(coachList);
        if (coachList!=null){
            list.setStatusObjectTwo(StatusHouse.COMMON_STATUS_OK);
            list.setMessage("获取成功");
        }
        return list;
    }

}
