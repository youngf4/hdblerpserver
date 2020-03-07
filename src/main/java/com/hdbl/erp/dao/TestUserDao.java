package com.hdbl.erp.dao;


import com.hdbl.erp.entity.UserBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestUserDao {

    UserBean getUserById( int id );

    List<UserBean> getAllUsers();
}
