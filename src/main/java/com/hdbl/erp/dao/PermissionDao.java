package com.hdbl.erp.dao;

import com.hdbl.erp.entity.PermissionBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface PermissionDao {

    List<PermissionBean> getPermissions(@Param("obj") HashMap<String, Object> obj);

    int insertPermissions(List<PermissionBean> equipments);

    int updatePermissions(@Param("valueMap") HashMap<String, Object> valueMap, @Param("location") HashMap<String, Object> location);

    int deletePermissions(@Param("obj") HashMap<String, Object> obj);


}
