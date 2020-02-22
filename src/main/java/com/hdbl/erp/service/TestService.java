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

    @Autowired
    private ActualWorkhourDao actualWorkhourDao;

    public TestEntity getById(Integer id){
        return testDao.getById(id);
    }

    public Integer insertList(){
        ArrayList<ActualWorkhour> list = new ArrayList<ActualWorkhour>();
        list.add(new ActualWorkhour(1, 1, new Date(), new Date(), 1 ));
        list.add(new ActualWorkhour(1, 1, new Date(), new Date(), 1 ));
        list.add(new ActualWorkhour(1, 2, new Date(), new Date(), 1 ));
        list.add(new ActualWorkhour(1, 2, new Date(), new Date(), 1 ));
        list.add(new ActualWorkhour(2, 2, new Date(), new Date(), 1 ));
        list.add(new ActualWorkhour(2, 2, new Date(), new Date(), 1 ));
        int k = actualWorkhourDao.insertRecords(list);
        return k;
    }
}