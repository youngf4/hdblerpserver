package com.hdbl.erp.dao;

import com.hdbl.erp.entity.ProdNotification;
import com.hdbl.erp.entity.ProductBean;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface ProdNotificationDao {
    public ArrayList<ProdNotification> select(@Param("args") HashMap<String,Object> args);
    public int update(@Param("condition") HashMap<String,Object> condition, @Param("data")HashMap<String,Object> data);
    public int insert(List<ProdNotification> list);
    public int delete(@Param("obj")HashMap<String,Object> obj);
}
