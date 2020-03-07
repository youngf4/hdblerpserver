package com.hdbl.erp;


import com.hdbl.erp.dao.ProcessVersionDao;
import com.hdbl.erp.entity.ProcessVersionBean;
import com.hdbl.erp.entity.UserBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.hdbl.erp.service.TestUserService;

import java.util.List;

@SpringBootTest
public class LCTest {

    @Autowired
    TestUserService testUserService;

    @Test
    void testGetUserById(){
        UserBean user = testUserService.getUserById(1);
        System.out.println( user );
    }

    @Test
    void testGetAllUsers(){
        List<UserBean> list = testUserService.getAllUser();
        System.out.println(list);
    }


}
