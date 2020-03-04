package com.hdbl.erp;


import com.hdbl.erp.service.ProdNotiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
public class HQTest4ProductNoticeService {
    @Autowired
    ProdNotiService prodNotiService;
    @Test
    void getsummary(){
        HashMap map = prodNotiService.getSummary();
        System.out.println(map);

    }
    @Test
    void insertProdNotification(){
        HashMap map = new HashMap<String,Object>();
        map.put("state",3);
        prodNotiService.insertProdNotification(map);
    }
}
