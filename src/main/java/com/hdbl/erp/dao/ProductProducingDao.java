package com.hdbl.erp.dao;

import com.hdbl.erp.entity.ProductProducingBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
@Mapper
public interface  ProductProducingDao{
    public List<HashMap> select(@Param("obj") HashMap<String,Object> args);
    public int update(@Param("condition") HashMap<String,Object> condition,@Param("data")HashMap<String,Object> data);
    public int insert(List<ProductProducingBean> list);
    public int delete(@Param("obj")HashMap<String,Object> obj);
}
