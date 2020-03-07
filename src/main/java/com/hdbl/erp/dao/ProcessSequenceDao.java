package com.hdbl.erp.dao;

import com.hdbl.erp.entity.ProcessSequenceBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Mapper
public interface ProcessSequenceDao {
//    public ArrayList<ProcessSequence> select(@Param("args") HashMap<String,Object> args);
//    public int update(@Param("condition") HashMap<String,Object> condition, @Param("data")HashMap<String,Object> data);
//    public int insert(List<ProcessSequence> list);
//    public int delete(@Param("obj")HashMap<String,Object> obj);

    // 新建工艺版本
    int insertNewProcessVersion(@Param("newVersionSequenceList") List<ProcessSequenceBean> newVersionSequenceList);
}
