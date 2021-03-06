package com.hdbl.erp.dao;

import com.hdbl.erp.entity.RoleBean;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface RoleDao {
    public List<RoleBean> select(@Param("obj")HashMap<String,Object> obj);
    public int update(@Param("condition") HashMap<String,Object> condition,@Param("data")HashMap<String,Object> data);
    public int insert(List<RoleBean> list);
    public int delete(@Param("obj")HashMap<String,Object> obj);
}
