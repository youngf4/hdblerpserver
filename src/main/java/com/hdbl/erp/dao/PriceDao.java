package com.hdbl.erp.dao;

import com.hdbl.erp.entity.PriceBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface PriceDao {

    List<PriceBean> getPrices(@Param("obj") HashMap<String, Object> obj);

    int insertPrices(List<PriceBean> equipments);

    int updatePrices(@Param("valueMap") HashMap<String, Object> valueMap, @Param("location") HashMap<String, Object> location);

    int deletePrices(@Param("obj") HashMap<String, Object> obj);


}
