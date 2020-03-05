package com.hdbl.erp.dao;

import com.hdbl.erp.entity.ProductBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Mapper
public interface ProductBeanDao {
    public ArrayList<ProductBean> select(@Param("args") HashMap<String,Object> args);
    public int update(@Param("condition") HashMap<String,Object> condition, @Param("data")HashMap<String,Object> data);
    public int insert(List<ProductBean> list);
    public int delete(@Param("obj")HashMap<String,Object> obj);
    public ProductBean getProductByDrawing(@Param("drawingNumber") String drawingNumber);
    public ProductBean getProductById(@Param("id") int id);
    public int addNewProduct(@Param("product") ProductBean product);
}
