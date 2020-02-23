package com.hdbl.erp.dao;

import com.hdbl.erp.entity.ProcessBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface ProcessDao {

    List<ProcessBean> getProcesses(@Param("obj") HashMap<String, Object> obj);

    int insertProcesses(List<ProcessBean> equipments);

    int updateProcesses(@Param("valueMap") HashMap<String, Object> valueMap, @Param("location") HashMap<String, Object> location);

    int deleteProcesses(@Param("obj") HashMap<String, Object> obj);


}
