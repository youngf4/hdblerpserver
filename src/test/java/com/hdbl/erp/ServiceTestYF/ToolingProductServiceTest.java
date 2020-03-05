package com.hdbl.erp.ServiceTestYF;

import com.hdbl.erp.entity.ProductProducingBean;
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
        List<ProductProducingBean> list = new ArrayList<>();
        list.add(new ProductProducingBean(1,"图号","品名",10,null));
        list.add(new ProductProducingBean(1,"图号","品名",10,null));
        list.add(new ProductProducingBean(1,"图号","品名",10,null));
        list.add(new ProductProducingBean(1,"图号","品名",10,null));
        list.add(new ProductProducingBean(1,"图号","品名",10,null));
        list.add(new ProductProducingBean(1,"图号","品名",10,null));
        int result = toolingProductService.creatToolingProduct(list);
        System.out.println(result);
    }

    @Test
    void getToolingProductsUntreatedTest(){
        HashMap<String,Object> searchMap = new HashMap<>();
        List<HashMap> result = toolingProductService.getToolingProductsUntreated(searchMap);
        System.out.println(result);
    }

    @Test
    void modifyToolingProductTest(){
        HashMap<String, Object> valueMap = new HashMap<>();
        HashMap<String, Object> locationMap = new HashMap<>();
        valueMap.put("state",3);
        valueMap.put("processVersionId",3);
        valueMap.put("processVersionNumber","V1");
        locationMap.put("id",10);
        int result = toolingProductService.modifyToolingProduct(locationMap, valueMap);
        System.out.println(result);
    }

    @Test
    void removeToolingProductTest(){
        HashMap<String, Object> target = new HashMap<>();
        target.put("id",10);
        int result = toolingProductService.removeToolingProduct(target);
        System.out.println(result);
    }
}
