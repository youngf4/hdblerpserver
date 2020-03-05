package com.hdbl.erp.ServiceTestYF;

import com.hdbl.erp.entity.ProductProducingBean;
import com.hdbl.erp.entity.ProductProducingToolingDTO;
import com.hdbl.erp.service.ToolingProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
public class ToolingProductServiceTest {

    @Autowired
    ToolingProductService toolingProductService;

    @Test
    void creatToolingProductTest(){
        ProductProducingToolingDTO toolingProduct = new ProductProducingToolingDTO();
        toolingProduct.setDrawingNumber("图号Test");
        toolingProduct.setName("品名Test");
        toolingProduct.setMaterialQuality("材质Test");
        toolingProduct = toolingProductService.orderToolingProduct(toolingProduct);
        System.out.println(toolingProduct);
    }

//    @Test
//    void getToolingProductsUntreatedTest(){
//        HashMap<String,Object> searchMap = new HashMap<>();
//        List<HashMap> result = toolingProductService.getToolingProductsUntreated(searchMap);
//        System.out.println(result);
//    }

//    @Test
//    void modifyToolingProductTest(){
//        HashMap<String, Object> valueMap = new HashMap<>();
//        HashMap<String, Object> locationMap = new HashMap<>();
//        valueMap.put("state",3);
//        valueMap.put("processVersionId",3);
//        valueMap.put("processVersionNumber","V1");
//        locationMap.put("id",10);
//        int result = toolingProductService.modifyToolingProduct(locationMap, valueMap);
//        System.out.println(result);
//    }

//    @Test
//    void removeToolingProductTest(){
//        HashMap<String, Object> target = new HashMap<>();
//        target.put("id",10);
//        int result = toolingProductService.removeToolingProduct(target);
//        System.out.println(result);
//    }
}
