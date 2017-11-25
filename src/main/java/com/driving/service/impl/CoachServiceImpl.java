package com.driving.service.impl;

import com.driving.mapper.CoachMapper;
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
    private CoachMapper coachMapper;

    @Override
    public List<Coach> findAllCoach() {
        return coachMapper.findAllCoach();
    }
}
