package com.hdbl.erp;

import com.hdbl.erp.dao.*;
import com.hdbl.erp.entity.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sun.security.util.Cache;

import java.math.BigDecimal;
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
    ProductProducingDao productProducingDao;

    @Test
    void testSelectOnProductProducingDao(){
        System.out.println("----------test testSelectOnProductProducingDao----------");
        HashMap<String,Object> map = new HashMap<>();
        map.put( "type" , 2);
//        map.put( "page" , 3);
//        map.put( "pageSize" , 5);
        List<HashMap> list =  productProducingDao.select(map);
        for(HashMap o : list){
            System.out.println(o.toString());
        }
    }




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
     * test ok
     ---------------------------*/
    @Autowired
    DispatchRecordDao dispatchRecordDao;

    @Test
    void testSelectOnDispatchRecordDao(){
        System.out.println("----------testSelectOnDispatchRecordDao----------");
        HashMap<String,Object> map = new HashMap<>();
        map.put( "id" , 2);
        List result =  dispatchRecordDao.getRecords(map);
        System.out.println(result);
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

    /* --------------------
     * test on EquipmentDao
     * test OK
     ---------------------- */

    @Autowired
    EquipmentDao equipmentDao;

    @Test
    void testSelectOnEquipmentDao(){
        System.out.println("----------testSelectOnEquipmentDao----------");
        HashMap<String,Object> testMap = new HashMap<>();
        testMap.put("state" , 1);
        List<EquipmentBean> result = equipmentDao.getEquipments(testMap);
        for(EquipmentBean o : result){
            System.out.println(o);
        }
    }

    @Test
    void testInsertOnEquipmentDao(){
        System.out.println("----------testInsertOnEquipmentDao----------");
        ArrayList<EquipmentBean> list = new ArrayList<>();
        list.add(new EquipmentBean("A01","车床", 160));
        list.add(new EquipmentBean("A02","车床", 160));
        list.add(new EquipmentBean("A03","车床" ));
        list.add(new EquipmentBean("A04","车床" ));
        list.add(new EquipmentBean("A05","车床", 200));
        list.add(new EquipmentBean("A06","车床", 200));
        list.add(new EquipmentBean("A07","车床", 190));
        list.add(new EquipmentBean("A08","车床", 190));
        int result = equipmentDao.insertEquipments(list);
        System.out.println(result);
    }

    @Test
    void testUpdateOnEquipmentDao(){
        System.out.println("----------testUpdateOnEquipmentDao----------");
        HashMap<String,Object> valueMap = new HashMap<>();
        HashMap<String,Object> location = new HashMap<>();
        valueMap.put("state",2);
        location.put("planHour",190);
        int result = equipmentDao.updateEquipments(valueMap,location);
        System.out.println(result);
    }

    @Test
    void testDeleteOnEquipmentDao(){
        System.out.println("----------testDeleteOnEquipmentDao----------");
        HashMap<String,Object> obj = new HashMap<>();
        obj.put("state",2);
        int result = equipmentDao.deleteEquipments(obj);
        System.out.println(result);
    }

    /* --------------------
     * test on PermissionDao
     * test OK
     ---------------------- */

    @Autowired
    PermissionDao permissionDao;

    @Test
    void testSelectOnPermissionDao(){
        System.out.println("----------testSelectOnPermissionDao----------");
        HashMap<String,Object> testMap = new HashMap<>();
//        testMap.put("id" , 1);
        List<PermissionBean> result = permissionDao.getPermissions(testMap);
        for(PermissionBean o : result){
            System.out.println(o);
        }
    }

    @Test
    void testInsertOnPermissionDao(){
        System.out.println("----------testInsertOnPermissionDao----------");
        ArrayList<PermissionBean> list = new ArrayList<>();
        list.add(new PermissionBean("per1"));
        list.add(new PermissionBean("per2"));
        list.add(new PermissionBean("per3"));
        list.add(new PermissionBean("per4"));
        list.add(new PermissionBean("per5"));
        list.add(new PermissionBean("per6"));
        int result = permissionDao.insertPermissions(list);
        System.out.println(result);
    }

    @Test
    void testUpdateOnPermissionDao(){
        System.out.println("----------testUpdateOnPermissionDao----------");
        HashMap<String,Object> valueMap = new HashMap<>();
        HashMap<String,Object> location = new HashMap<>();
        valueMap.put("name","newName");
        location.put("id",3);
        int result = permissionDao.updatePermissions(valueMap,location);
        System.out.println(result);
    }

    @Test
    void testDeleteOnPermissionDao(){
        System.out.println("----------testDeleteOnPermissionDao----------");
        HashMap<String,Object> obj = new HashMap<>();
        obj.put("name","newName");
        int result = permissionDao.deletePermissions(obj);
        System.out.println(result);
    }

    /* --------------------
     * test on PriceDao
     * test OK
     ---------------------- */

    @Autowired
    PriceDao priceDao;

    @Test
    void testSelectOnPriceDao(){
        System.out.println("----------testSelectOnPriceDao----------");
        HashMap<String,Object> testMap = new HashMap<>();
        testMap.put("price" , new BigDecimal(7.5));
        List<PriceBean> result = priceDao.getPrices(testMap);
        for(PriceBean o : result){
            System.out.println(o);
        }
    }

    @Test
    void testInsertOnPriceDao(){
        System.out.println("----------testInsertOnPriceDao----------");
        ArrayList<PriceBean> list = new ArrayList<>();
        list.add(new PriceBean("type1",new BigDecimal(7.5)));
        list.add(new PriceBean("type2",new BigDecimal(130)));
        list.add(new PriceBean("type3",new BigDecimal(160)));
        list.add(new PriceBean("type4",new BigDecimal(180)));
        int result = priceDao.insertPrices(list);
        System.out.println(result);
    }

    @Test
    void testUpdateOnPriceDao(){
        System.out.println("----------testUpdateOnPriceDao----------");
        HashMap<String,Object> valueMap = new HashMap<>();
        HashMap<String,Object> location = new HashMap<>();
        valueMap.put("price",new BigDecimal(100));
        location.put("id",3);
        int result = priceDao.updatePrices(valueMap,location);
        System.out.println(result);
    }

    @Test
    void testDeleteOnPriceDao(){
        System.out.println("----------testDeleteOnPriceDao----------");
        HashMap<String,Object> obj = new HashMap<>();
        obj.put("price",new BigDecimal(100));
        int result = priceDao.deletePrices(obj);
        System.out.println(result);
    }

     /* --------------------
     * test on ProcessDao
     * test OK
     ---------------------- */

    @Autowired
    ProcessDao processDao;

    @Test
    void testSelectOnProcessDao(){
        System.out.println("----------testSelectOnProcessDao----------");
        HashMap<String,Object> testMap = new HashMap<>();
        testMap.put("name" , "process2");
        List<ProcessBean> result = processDao.getProcesses(testMap);
        for(ProcessBean o : result){
            System.out.println(o);
        }
    }

    @Test
    void testInsertOnProcessDao(){
        System.out.println("----------testInsertOnProcessDao----------");
        ArrayList<ProcessBean> list = new ArrayList<>();
        list.add(new ProcessBean("process1"));
        list.add(new ProcessBean("process2"));
        list.add(new ProcessBean("process3"));
        list.add(new ProcessBean("process4"));
        list.add(new ProcessBean("process5"));
        int result = processDao.insertProcesses(list);
        System.out.println(result);
    }

    @Test
    void testUpdateOnProcessDao(){
        System.out.println("----------testUpdateOnProcessDao----------");
        HashMap<String,Object> valueMap = new HashMap<>();
        HashMap<String,Object> location = new HashMap<>();
        valueMap.put("name","newName");
        location.put("id",3);
        int result = processDao.updateProcesses(valueMap,location);
        System.out.println(result);
    }

    @Test
    void testDeleteOnProcessDao(){
        System.out.println("----------testDeleteOnProcessDao----------");
        HashMap<String,Object> obj = new HashMap<>();
        obj.put("name","newName");
        int result = processDao.deleteProcesses(obj);
        System.out.println(result);
    }


    /* --------------------
     * test on ProcessExecutionDao
     * test OK
     ---------------------- */

    @Autowired
    ProcessExecutionDao processExecutionDao;

    @Test
    void testSelectOnProcessExecutionDao(){
        System.out.println("----------testSelectOnProcessExecutionDao----------");
        HashMap<String,Object> testMap = new HashMap<>();
        testMap.put("productId" , 2);
        List<ProcessExecution> result = processExecutionDao.getProcessExecutions(testMap);
        for(ProcessExecution o : result){
            System.out.println(o);
        }
    }

    @Test
    void testInsertOnProcessExecutionDao(){
        System.out.println("----------testInsertOnProcessExecutionDao----------");
        ArrayList<ProcessExecution> list = new ArrayList<>();
        list.add(new ProcessExecution(1,1));
        list.add(new ProcessExecution(1,2));
        list.add(new ProcessExecution(1,3));
        list.add(new ProcessExecution(2,1));
        list.add(new ProcessExecution(2,2));
        list.add(new ProcessExecution(2,3));
        list.add(new ProcessExecution(3,1));
        list.add(new ProcessExecution(3,2));
        list.add(new ProcessExecution(3,3));
        list.add(new ProcessExecution(4,1));
        list.add(new ProcessExecution(4,2));
        int result = processExecutionDao.insertProcessExecutions(list);
        System.out.println(result);
    }

    @Test
    void testUpdateOnProcessExecutionDao(){
        System.out.println("----------testUpdateOnProcessExecutionDao----------");
        HashMap<String,Object> valueMap = new HashMap<>();
        HashMap<String,Object> location = new HashMap<>();
        valueMap.put("state","3");
        location.put("productId",4);
        location.put("sequenceId",2);
        int result = processExecutionDao.updateProcessExecutions(valueMap,location);
        System.out.println(result);
    }

    @Test
    void testDeleteOnProcessExecutionDao(){
        System.out.println("----------testDeleteOnProcessExecutionDao----------");
        HashMap<String,Object> obj = new HashMap<>();
        obj.put("state",3);
        int result = processExecutionDao.deleteProcessExecutions(obj);
        System.out.println(result);
    }

    /* --------------------
     * test on ProcessHourDao
     * test OK
     ---------------------- */

    @Autowired
    ProcessHourDao processHourDao;

    @Test
    void testSelectOnProcessHourDao(){
        System.out.println("----------testSelectOnProcessHourDao----------");
        HashMap<String,Object> testMap = new HashMap<>();
        testMap.put("processId" , 2);
        List<ProcessHour> result = processHourDao.getProcessHour(testMap);
        for(ProcessHour o : result){
            System.out.println(o);
        }
    }

    @Test
    void testInsertOnProcessHourDao(){
        System.out.println("----------testInsertOnProcessHourDao----------");
        ArrayList<ProcessHour> list = new ArrayList<>();
        list.add(new ProcessHour(1,1,12,15));
        list.add(new ProcessHour(1,2,10,10));
        list.add(new ProcessHour(1,3,12,10));
        list.add(new ProcessHour(2,1,12,15));
        list.add(new ProcessHour(2,2,5,7));
        list.add(new ProcessHour(2,3,12,10));
        list.add(new ProcessHour(2,4,5,15));
        int result = processHourDao.insertProcessHour(list);
        System.out.println(result);
    }

    @Test
    void testUpdateOnProcessHourDao(){
        System.out.println("----------testUpdateOnProcessHourDao----------");
        HashMap<String,Object> valueMap = new HashMap<>();
        HashMap<String,Object> location = new HashMap<>();
        valueMap.put("debugHour",10);
        location.put("processId",2);
        location.put("equipmentId",4);
        int result = processHourDao.updateProcessHour(valueMap,location);
        System.out.println(result);
    }

    @Test
    void testDeleteOnProcessHourDao(){
        System.out.println("----------testDeleteOnProcessHourDao----------");
        HashMap<String,Object> obj = new HashMap<>();
        obj.put("equipmentId",1);
        int result = processHourDao.deleteProcessHour(obj);
        System.out.println(result);
    }

}
