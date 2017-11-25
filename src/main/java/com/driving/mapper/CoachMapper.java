package com.driving.mapper;

import com.driving.model.Coach;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * created by Cuiying Gao on 2017-11-24
 * CoachMapper 映射，方法对应 CoachMapper.xml 的 id 名
 */

@Component
public interface CoachMapper {

    /**
     * 查询所有 Coach
     * @return
     */
    List<Coach> findAllCoach();

}
