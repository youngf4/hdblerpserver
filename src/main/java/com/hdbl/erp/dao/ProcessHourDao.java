package com.hdbl.erp.dao;

import com.hdbl.erp.entity.ProcessHourBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface ProcessHourDao {

    // 新建工艺版本
    int insertNewProcessVersion(@Param("newVersionHourList") List<ProcessHourBean> newVersionHourList);
}
