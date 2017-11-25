package com.driving.dao;

import com.driving.model.Coach;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * created by wk on 2017-11-23
 * mapper映射，方法对应mapper.xml的id名
 */
public interface CoachDao {

    /**
     * 查询所有Coach
     * @return
     */
    List<Coach> findAllCoach();

}
