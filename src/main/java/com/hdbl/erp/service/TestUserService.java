package com.hdbl.erp.service;

import com.hdbl.erp.dao.TestUserDao;
import com.hdbl.erp.entity.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestUserService {

    @Autowired
    TestUserDao testUserDao;

    public UserBean getUserById(int id){
        UserBean user = new UserBean();
        user = testUserDao.getUserById(1);
        return user;
    }

    public List<UserBean> getAllUser(){

        List<UserBean> userList = testUserDao.getAllUsers();
        return  userList;
    }

}
