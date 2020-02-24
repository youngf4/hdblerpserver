package com.hdbl.erp.dao;

import com.hdbl.erp.entity.ProcessVersion;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface ProcessVersionDao {
    public ArrayList<ProcessVersion> select(@Param("args") HashMap<String,Object> args);
    public int update(@Param("condition") HashMap<String,Object> condition, @Param("data")HashMap<String,Object> data);
    public int insert(List<ProcessVersion> list);
    public int delete(@Param("obj")HashMap<String,Object> obj);
}
