package com.hdbl.erp.dao;

import com.hdbl.erp.entity.ProductProducingBean;
import com.hdbl.erp.entity.ProductProducingToolingDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.List;
@Mapper
public interface  ProductProducingDao{
    List<HashMap> select(@Param("obj") HashMap<String,Object> args);
    int update(@Param("condition") HashMap<String,Object> condition,@Param("data")HashMap<String,Object> data);
    int insert(List<ProductProducingBean> list);
    int delete(@Param("obj")HashMap<String,Object> obj);

    // 查询某工艺版本投产的产品数量
    int countProductsProducingByProcessVersion(@Param("versionId") int versionId);

    // 工艺设计提交，进入工艺审核
    int updatePruductToProcessAudit(@Param("productPruducingId") int productPruducingId, @Param("processVersionId") int processVersionId);

    // 工艺审核，yes-5 or no-4
    int updateProductPruducingState(@Param("productProducingId") int productProducingId, @Param("state") int state);

    // 添加工装品订单
    int addToolingProductToProducing(@Param("toolingProduct") ProductProducingToolingDTO toolingProduct);

    // 删除工装产品下单生产记录
    int removeToolingProductById(@Param("id") int id);

    // 查询工装品  单条记录  指定ID
    ProductProducingToolingDTO getToolingProducrById(@Param("id") int id);

    // 查询工装品  多条记录  指定条件  分页查询
    List<ProductProducingToolingDTO> getToolingProducts( @Param("toolingProduct") ProductProducingToolingDTO toolingProduct,
                                                         @Param("beginIndex") int beginIndex,
                                                         @Param("pageSize") int pageSize );

}
