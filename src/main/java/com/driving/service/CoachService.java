package com.driving.service;

import com.driving.model.Coach;
import java.util.List;

/**
 * Created by Cuiying Gao on 2017-11-24
 * coach 的 service 的接口
 */

public interface CoachService {

    /**
     * 查询所有 Coach
     * @return
     */
    List<Coach> findAllCoach();

}
