package com.driving.mapper;

import com.driving.model.Ground;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * Created by lwy on 2017/11/25/025.
 * GroundMapper 映射，方法对应 GroundMapper.xml 的 id 名
 */
@Component
public interface GroundMapper {
    /**
     * 查询所有 ground
     * @return
     */
    List<Ground> findAllGround();
}
