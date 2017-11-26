package com.driving.controller;

import com.driving.mapper.ClassDetailMapper;
import com.driving.model.ClassDetail;
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
@RequestMapping("/class")
public class ClassDetailController {

    @Autowired
    private ClassDetailMapper classDetailMapper;

    /**
     * 查询所有 ClassOutput
     * @return
     */
    @RequestMapping(value="/detail",method= RequestMethod.GET)
    public ListObject getAllClassDetail(String ClassNameId){
        List<ClassDetail> classDetailList = classDetailMapper.findAllClassDetail(ClassNameId);
        ListObject list = new ListObject();
        list.setData(classDetailList);
        if (classDetailList!=null && ClassNameId!=null){
            list.setStatusObject(StatusHouse.COMMON_STATUS_OK);
            list.setMessage("获取成功");
        }
        return list;
    }

}
