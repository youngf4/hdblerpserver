package com.hdbl.erp.ServiceTestYF;

import com.hdbl.erp.entity.ProductProducing;
import com.hdbl.erp.service.ToolingProductService;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.constraints.AssertTrue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
public class ToolingProductServiceTest {

    @Autowired
    ToolingProductService toolingProductService;

    @Test
    void creatToolingProductTest(){
        List<ProductProducing> list = new ArrayList<>();
        list.add(new ProductProducing(1,"图号","品名",10,null));
        list.add(new ProductProducing(1,"图号","品名",10,null));
        list.add(new ProductProducing(1,"图号","品名",10,null));
        list.add(new ProductProducing(1,"图号","品名",10,null));
        list.add(new ProductProducing(1,"图号","品名",10,null));
        list.add(new ProductProducing(1,"图号","品名",10,null));
        int result = toolingProductService.creatToolingProduct(list);
        System.out.println(result);
    }

    @Test
    void getToolingProductsUntreatedTest(){
        HashMap<String,Object> searchMap = new HashMap<>();
        List<HashMap> result = toolingProductService.getToolingProductsUntreated(searchMap);
        System.out.println(result);
    }
}
