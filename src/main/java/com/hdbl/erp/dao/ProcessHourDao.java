package com.hdbl.erp.dao;

import com.hdbl.erp.entity.ProcessHour;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface ProcessHourDao {

    List<ProcessHour> getProcessHour(@Param("obj") HashMap<String, Object> obj);

    int insertProcessHour(List<ProcessHour> equipments);

    int updateProcessHour(@Param("valueMap") HashMap<String, Object> valueMap, @Param("location") HashMap<String, Object> location);

    int deleteProcessHour(@Param("obj") HashMap<String, Object> obj);


}
