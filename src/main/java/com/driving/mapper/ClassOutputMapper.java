package com.driving.mapper;

import com.driving.model.ClassOutput;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * created by Cuiying Gao on 2017-11-24
 * ClassOutputMapper 映射，方法对应 ClassOutputMapper.xml 的 id 名
 */

@Component
public interface ClassOutputMapper {

    /**
     * 查询所有 Coach
     * @return
     */
    List<ClassOutput> findAllClassOutput();

}
