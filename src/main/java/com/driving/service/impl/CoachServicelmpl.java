package com.driving.service.impl;

import com.driving.dao.CoachDao;
import com.driving.model.Coach;
import com.driving.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2017/11/24 0024.
 */
public class CoachServicelmpl implements CoachService {
    @Autowired
    private CoachDao coachDao;

    @Override
    public List<Coach> findAllCoach() {
        return coachDao.findAllCoach();
    }
}
