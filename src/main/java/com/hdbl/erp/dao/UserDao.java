package com.hdbl.erp.dao;


import com.hdbl.erp.entity.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface UserDao {
    public ArrayList<UserBean> select(@Param("obj") HashMap<String,Object> obj);
    /**
     * param:obj - page 页号
     * param:obj - pageSize 页宽
     */
}
