package com.hdbl.erp;

import com.hdbl.erp.dao.*;
import com.hdbl.erp.entity.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
public class TestYF {

    /*---------------------------
     * test on ActualWorkhourDao
     * test OK
     ---------------------------*/

    @Autowired
    ActualWorkhourDao actualWorkhourDao;

    @Test
    void testSelectOnActualWorkhourDao(){
        System.out.println("----------test select----------");
        HashMap<String,Object> map = new HashMap<>();
        map.put( "equipmentId" , 1);
//        map.put( "page" , 3);
//        map.put( "pageSize" , 5);
        List<ActualWorkhour> list =  actualWorkhourDao.getRecords(map);
        for(ActualWorkhour o : list){
            System.out.println(o.toString());
        }
    }

    @Test
    void testInsertOnActualWorkhourDao(){
        ArrayList<ActualWorkhour> list = new ArrayList<ActualWorkhour>();
        list.add(new ActualWorkhour(1,new Date(), new Date(),1));
        list.add(new ActualWorkhour(1,new Date(), new Date(),2));
        list.add(new ActualWorkhour(2,new Date(), new Date(),1));
        list.add(new ActualWorkhour(2,new Date(), new Date(),2));
        list.add(new ActualWorkhour(3,new Date(), new Date(),1));
        list.add(new ActualWorkhour(3,new Date(), new Date(),2));
        list.add(new ActualWorkhour(4,new Date(), new Date(),1));
        list.add(new ActualWorkhour(4,new Date(), new Date(),5));
        list.add(new ActualWorkhour(4,new Date(), new Date(),3));
        list.add(new ActualWorkhour(5,new Date(), new Date(),1));
        list.add(new ActualWorkhour(5,new Date(), new Date(),3));
        list.add(new ActualWorkhour(5,new Date(), new Date(),2));
        int result = actualWorkhourDao.insertRecords(list);
        System.out.println(result);
    }

    @Test
    void testUpdateOnActualWorkhourDao(){
        System.out.println("----------test update----------");
        HashMap<String,Object> valueMap = new HashMap<>();
        HashMap<String,Object> location = new HashMap<>();
        valueMap.put("state",2);
        location.put("executionId",1);
        System.out.println( actualWorkhourDao.updateRecords(valueMap,location));
    }

    @Test
    void testDeleteOnActualWorkhourDao(){
        System.out.println("----------test delete----------");
        HashMap<String,Object> obj = new HashMap<>();
        obj.put("state",2);
        System.out.println( actualWorkhourDao.deleteRecords(obj));
    }

    /*---------------------------
     * test on DayworkHourDao
     * test OK
     ---------------------------*/

    @Autowired
    DayworkRecordDao dayworkRecordDao;

    @Test
    void testSelectOnDayworkRecordDao(){
        System.out.println("----------testSelectOnDayworkRecordDao----------");
        HashMap<String,Object> map = new HashMap<>();
        map.put( "page" , 2);
        map.put( "pageSize" , 5);
        List<DayworkRecord> list =  dayworkRecordDao.getRecords(map);
        for(DayworkRecord o : list){
            System.out.println(o.toString());
        }
    }

    @Test
    void testInsertOnDayworkRecordDao(){
        ArrayList<DayworkRecord> list = new ArrayList<DayworkRecord>();
        list.add(new DayworkRecord(1, new Date(), new Date(), "remark" ));
        list.add(new DayworkRecord(1, new Date(), new Date(), "remark" ));
        list.add(new DayworkRecord(2, new Date(), new Date(), "remark" ));
        list.add(new DayworkRecord(2, new Date(), new Date(), "remark" ));
        list.add(new DayworkRecord(3, new Date(), new Date(), "remark" ));
        list.add(new DayworkRecord(3, new Date(), new Date(), "remark" ));
        list.add(new DayworkRecord(3, new Date(), new Date(), "remark" ));
        list.add(new DayworkRecord(4, new Date(), new Date(), "remark" ));
        list.add(new DayworkRecord(4, new Date(), new Date(), "remark" ));
        list.add(new DayworkRecord(4, new Date(), new Date(), "remark" ));
        list.add(new DayworkRecord(5, new Date(), new Date(), "remark" ));
        list.add(new DayworkRecord(5, new Date(), new Date(), "remark" ));
        list.add(new DayworkRecord(5, new Date(), new Date(), "remark" ));
        list.add(new DayworkRecord(6, new Date(), new Date(), "remark" ));
        list.add(new DayworkRecord(6, new Date(), new Date(), "remark" ));
        list.add(new DayworkRecord(6, new Date(), new Date(), "remark" ));
        list.add(new DayworkRecord(7, new Date(), new Date(), "remark" ));
        list.add(new DayworkRecord(8, new Date(), new Date(), "remark" ));
        list.add(new DayworkRecord(9, new Date(), new Date(), "remark" ));
        list.add(new DayworkRecord(9, new Date(), new Date(), "remark" ));
        list.add(new DayworkRecord(9, new Date(), new Date(), "remark" ));
        int result = dayworkRecordDao.insertRecords(list);
        System.out.println(result);
    }

    @Test
    void testUpdateOnDayworkRecordDao(){
        System.out.println("----------ttestUpdateOnDayworkRecordDao----------");
        HashMap<String,Object> valueMap = new HashMap<>();
        HashMap<String,Object> location = new HashMap<>();
        valueMap.put("state",1);
        location.put("workerId",6);
        location.put("state",1);
        System.out.println( dayworkRecordDao.updateRecords(valueMap,location));
    }

    @Test
    void testDeleteOnDayworkRecordDao(){
        System.out.println("----------testDeleteOnDayworkRecordDao----------");
        HashMap<String,Object> obj = new HashMap<>();
        obj.put("state",0);
        System.out.println( dayworkRecordDao.deleteRecords(obj));
    }

    /*---------------------------
     * test on DispatchRecordDao
     * test ing
     ---------------------------*/
    @Autowired
    DispatchRecordDao dispatchRecordDao;

    @Test
    void testSelectOnDispatchRecordDao(){
        System.out.println("----------testSelectOnDispatchRecordDao----------");
        HashMap<String,Object> map = new HashMap<>();
        map.put( "id" , 2);

        List result =  dispatchRecordDao.getRecords(map);
//        System.out.println(result.get("updateTime") instanceof Date);
        System.out.println(result);

//        List<DispatchRecord> list =  dispatchRecordDao.getRecords(map);
//        for(DispatchRecord o : list){
//            System.out.println(o.toString());
//        }
    }

    @Test
    void testInsertOnDispatchRecordDao(){
        ArrayList<DispatchRecord> list = new ArrayList<DispatchRecord>();
        list.add(new DispatchRecord(0100,"20001",1,10));
        list.add(new DispatchRecord(0100,"20002",5,10));
        list.add(new DispatchRecord(0100,"20003",1,120));
        list.add(new DispatchRecord(0100,"20004",2,100));
        list.add(new DispatchRecord(0200,"20005",1,100));
        list.add(new DispatchRecord(0200,"20006",2,120));
        list.add(new DispatchRecord(0200,"20007",1,10));
        int result = dispatchRecordDao.insertRecords(list);
        System.out.println(result);
    }

    @Test
    void testUpdateOnDispatchRecordDao(){
        System.out.println("----------testUpdateOnDispatchRecordDao----------");
        HashMap<String,Object> valueMap = new HashMap<>();
        HashMap<String,Object> location = new HashMap<>();
        valueMap.put("state",2);
        location.put("createrId",128);
        System.out.println( dispatchRecordDao.updateRecords(valueMap,location));
    }

    @Test
    void testDeleteOnDispatchRecordDao(){
        System.out.println("----------testDeleteOnDayworkRecordDao----------");
        HashMap<String,Object> obj = new HashMap<>();
        obj.put("productId",1);
        System.out.println( dispatchRecordDao.deleteRecords(obj));
    }
}
