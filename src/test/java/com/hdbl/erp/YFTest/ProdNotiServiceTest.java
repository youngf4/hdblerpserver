package com.hdbl.erp.YFTest;

import com.hdbl.erp.service.ProdNotiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProdNotiServiceTest {

    ProdNotiService prodNotiService = new ProdNotiService();

    @Test
    void testCreat(){
        HashMap<String, Object> testMap = new HashMap<>();
        testMap.put("workingNumber","BL2001");
        testMap.put("orderUnit","百炼订货单位");
        System.out.println(prodNotiService.create(testMap));
    }
}