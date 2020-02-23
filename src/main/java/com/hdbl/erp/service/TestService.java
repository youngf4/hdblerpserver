package com.hdbl.erp.service;

import com.hdbl.erp.dao.ActualWorkhourDao;
import com.hdbl.erp.dao.TestDao;
import com.hdbl.erp.entity.ActualWorkhour;
import com.hdbl.erp.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public TestEntity getById(Integer id){
        return testDao.getById(id);
    }


}