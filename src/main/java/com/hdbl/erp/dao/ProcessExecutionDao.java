package com.hdbl.erp.dao;

import com.hdbl.erp.entity.ProcessExecution;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface ProcessExecutionDao {

    List<ProcessExecution> getProcessExecutions(@Param("obj") HashMap<String, Object> obj);

    int insertProcessExecutions(List<ProcessExecution> equipments);

    int updateProcessExecutions(@Param("valueMap") HashMap<String, Object> valueMap, @Param("location") HashMap<String, Object> location);

    int deleteProcessExecutions(@Param("obj") HashMap<String, Object> obj);


}
