package com.hdbl.erp.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;

@Mapper
public interface UtilDao {
    public HashMap<String,Object> getMaxValue(@Param("name") String name);
}
