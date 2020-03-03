package com.hdbl.erp;

import com.hdbl.erp.dao.ProductProducingDao;
import com.hdbl.erp.dao.UserDao;
import com.hdbl.erp.dao.UtilDao;
import com.hdbl.erp.entity.UserBean;
import com.hdbl.erp.service.ProdNotiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
public class HQTest {
    @Autowired
    UserDao userDao;
    @Test
    void contextLoads() {

//        userDao.insert(list);
    }


    @Autowired
    ProdNotiService prodNotiService;
    @Test
    void tes4ProductService(){
        HashMap<String,Object> map = new HashMap<String,Object>();

    }
    @Autowired
    UtilDao utilDao;
    @Test
    void test4util(){
        System.out.println(utilDao.getMaxValue("notice_number"));
    }
    @Test
    void test4UserDao() {
        System.out.println("-----------------");
        System.out.println(userDao.select(new HashMap<>()));
        System.out.println("123");
        Date e = new Date();
        UserBean userBean = new UserBean();
        userBean.setCreatTime(e);
        userBean.setName("hhh");
        userBean.setOpenid("openid");
        userBean.setPassword("password");
        userBean.setState(1);
        userBean.setUpdateTime(e);
        userBean.setUsername("us");
        List<UserBean> list = new ArrayList<>();
        list.add(userBean);
        System.out.println(list.get(0).getCreatTime());
        userDao.insert(list);
    }
}
