package com.hdbl.erp.dao;

import com.hdbl.erp.entity.EquipmentBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.jdbc.support.incrementer.HsqlMaxValueIncrementer;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface EquipmentDao {

    List<EquipmentBean> getEquipments(@Param("obj")HashMap<String, Object> obj);

    int insertEquipments(List<EquipmentBean> equipments);

    int updateEquipments(@Param("valueMap")HashMap<String,Object> valueMap, @Param("location")HashMap<String,Object> location);

    int deleteEquipments(@Param("obj")HashMap<String,Object> obj);


}
