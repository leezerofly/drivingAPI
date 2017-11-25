package com.driving.mapper;

import com.driving.model.ClassName;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * created by Cuiying Gao on 2017-11-24
 * ClassNameMapper 映射，方法对应 ClassNameMapper.xml 的 id 名
 */

@Component
public interface ClassNameMapper {

    /**
     * 查询所有 ClassName
     * @return
     */
    List<ClassName> findAllClassName();

}
