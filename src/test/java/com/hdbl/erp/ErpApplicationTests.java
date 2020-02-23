package com.hdbl.erp;

import com.hdbl.erp.dao.ActualWorkhourDao;
import com.hdbl.erp.dao.UserDao;
import com.hdbl.erp.entity.ActualWorkhour;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
class ErpApplicationTests {
    @Autowired
    UserDao userDao;
    @Test
    void contextLoads() {
        System.out.println("-----------------");
        System.out.println(userDao.select(new HashMap<>()));
        System.out.println("123");
    }
}
