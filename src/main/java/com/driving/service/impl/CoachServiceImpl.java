package com.driving.service.impl;

import com.driving.dao.CoachDao;
import com.driving.model.Coach;
import com.driving.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Cuiying Gao on 2017/11/24 0024.
 * coach 的 service 层的实现
 */
@Service
public class CoachServiceImpl implements CoachService {
    @Autowired
    private CoachDao coachDao;

    @Override
    public List<Coach> findAllCoach() {
        return coachDao.findAllCoach();
    }
}
