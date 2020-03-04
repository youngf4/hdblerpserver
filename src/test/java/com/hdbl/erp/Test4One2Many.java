package com.hdbl.erp;


import com.hdbl.erp.dao.One2ManyDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test4One2Many {
    @Autowired
    One2ManyDao one2ManyDao;
    @Test
    void test(){
        System.out.println(one2ManyDao.select());
    }
}
