package com.driving.service;

import com.driving.model.Coach;

import java.util.List;

/**
 * Created by wk on 2017-11-23
 * account的service的接口
 */
public interface CoachService {

    /**
     * 查询所有Account
     * @return
     */
    List<Coach> findAllCoach();

}
