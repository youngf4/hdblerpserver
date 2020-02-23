package com.hdbl.erp.dao;

import com.hdbl.erp.entity.SupplierBean;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface SupplierDao {
    public ArrayList<SupplierBean> select(@Param("args")HashMap<String,Object> args);
    public int update(@Param("condition") HashMap<String,Object> condition,@Param("data")HashMap<String,Object> data);
    public int insert(List<SupplierBean> list);
    public int delete(@Param("args")HashMap<String,Object> args);

}
