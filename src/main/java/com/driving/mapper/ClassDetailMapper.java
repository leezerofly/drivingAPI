package com.driving.mapper;

import com.driving.model.ClassDetail;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lwy on 2017/11/26/026.
 * ClassDetailMapper 映射，方法对应 ClassDetailMapper.xml 的 id 名
 */
@Component
public interface ClassDetailMapper {
    /**
     * 查询所有 ClassDetail
     * @return
     */
    List<ClassDetail> findAllClassDetail(String ClassNameId);
    ClassDetail getAllClassDetail (@Param("ClassNameId") String ClassNameId);
}
