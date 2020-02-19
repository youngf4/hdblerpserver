package com.hdbl.erp.service;

import com.hdbl.erp.dao.TestDao;
import com.hdbl.erp.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public TestEntity getById(Integer id){
        return testDao.getById(id);
    }
}