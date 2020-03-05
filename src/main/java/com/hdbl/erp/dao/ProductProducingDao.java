package com.hdbl.erp.dao;

import com.hdbl.erp.entity.ProductProducingBean;
import com.hdbl.erp.entity.ProductProducingToolingDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
@Mapper
public interface  ProductProducingDao{
    List<HashMap> select(@Param("obj") HashMap<String,Object> args);
    int update(@Param("condition") HashMap<String,Object> condition,@Param("data")HashMap<String,Object> data);
    int insert(List<ProductProducingBean> list);
    int delete(@Param("obj")HashMap<String,Object> obj);


    int addToolingProductToProducing(@Param("toolingProduct") ProductProducingToolingDTO toolingProduct);

    int removeToolingProductById(@Param("id") int id);

    ProductProducingToolingDTO getToolingProducrById(@Param("id") int id);

    List<ProductProducingToolingDTO> getToolingProducts( @Param("toolingProduct") ProductProducingToolingDTO toolingProduct,
                                                         @Param("beginIndex") int beginIndex,
                                                         @Param("pageSize") int pageSize );

}
