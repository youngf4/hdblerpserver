package com.hdbl.erp.service;

import com.hdbl.erp.dao.ProdNotificationDao;
import com.hdbl.erp.dao.UtilDao;
import com.hdbl.erp.entity.ProdNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

// 生产通知
@Service
public class ProdNotiService {
    public static int SUCCESS=1,FAILLED=0,ABORD=-1;
    @Autowired
    private ProdNotificationDao prodNotificationDao;
    public ArrayList<ProdNotification> getProdNotifications(HashMap<String,Object> searchMap){
        /*
        * 查找的接口方法
         * param: p产品信息,如果有范围相关的参数，范围参数的开始用着个传递
         * param: end如果有范围相关的参数，范围参数的结尾用着个传递，没有范围相关则为null
         * param: like模糊匹配使用
         * param: page分页的话使用的分页页数
         * param: pageSize分页的话每页的大小pp
        * */
        return this.search(searchMap,true);
    }

    public ArrayList<ProdNotification> getAllProdNotifications(HashMap<String,Object> searchMap){

        return this.search(searchMap,false);

    }
    public HashMap<String,Object> getSummary(){
        return prodNotificationDao.summary();
    }
    public int insertProdNotification(HashMap<String,Object> prod){
        List<HashMap<String,Object>> s=new ArrayList<HashMap<String,Object>>();
        prod = formatInsertMap(prod);
        s.add(prod);
        int res = prodNotificationDao.insert(s);
        return res;
    }
    @Autowired
    UtilDao utilDao;
    private HashMap<String,Object> formatInsertMap(HashMap<String,Object> map){
        //,,,,,,,,,,,,,,,,,)
        HashMap<String,Object> defaultMap=new HashMap<String, Object>();
        defaultMap.put("state",1);
        defaultMap.put("visibility",1);
        defaultMap.put("noticeNumber",utilDao.getMaxValue("notice_number").get("value"));
        defaultMap.put("workingNumber","none");
        defaultMap.put("orderUnit","none");
        defaultMap.put("deliveryMethod","none");
        defaultMap.put("deliveryState","none");
        defaultMap.put("deliveryPlace","none");
        defaultMap.put("isInBatches",0);
        defaultMap.put("deliveryDate",new Date());
        defaultMap.put("remark","");
        defaultMap.put("compilingPerson",1);
        defaultMap.put("submitTime",new Date());
        defaultMap.put("auditor",1);//审核者id
        defaultMap.put("auditTime", new Date());
        defaultMap.put("auditRemark","none");
        defaultMap.put("approver",11);
        defaultMap.put("approveTime",new Date());
        defaultMap.put("approveRemark","none");
        Set<String> set = defaultMap.keySet();
        for(String key:set){
            if (!map.containsKey(key)){
                System.out.println(key+defaultMap.get(key));
                map.put(key,defaultMap.get(key));
            }
        }
        System.out.println(map);
        return map;
    }
    /**
     * 通过 id 查询一个生产通知单的详细信息
     * @param id
     * @return 返回结果
     */
    public ProdNotification getProdNotficationById(String id){
        HashMap<String,Object> searchMap = this.buildDefaultSearchMap();
        searchMap.put("id",id);
        ArrayList<ProdNotification> resault = this.search(searchMap,false);
        if (resault.size() != 1)return null;
        return resault.get(0);
    }

    private HashMap<String,Object> buildDefaultSearchMap(){
        HashMap<String,Object> defaultMap = new HashMap<String, Object>();
        defaultMap.put("page",0);
        defaultMap.put("pageSize",20);
        return defaultMap;
    }
    public String create(HashMap<String,Object> prod){
        /**
         * 创建一个生产通知
         * param:prod要创建的生产通知
         * return null-创建失败 通知单号-创建成功 -1-格式错误
         */
        // TODO 先转换后创建
    return null;
    }
    // 默认锁定时长20分钟，20分钟后无人更新锁数据锁自动释放
    public String lock(String num) {
        /**
         * 为一个通知单加锁
         * param:num通知单号
         * return null-枷锁失败 锁id-创建成功 -1-格式错误
         */
        return null;
    }
    public String modify(HashMap<String,Object> prod,String locknum){
        /**
         * 创建一个生产通知
         * param:locknum锁id
         * param:prod通知单包括通知单号
         * return null-枷锁失败 锁id-创建成功 -1-格式错误
         */
        // TODO 先验证验证是否有锁以及锁的存活性
        // TODO 修改产品信息
        // TODO 返回锁号
        return null;
    }
    public int unlock(String locknum){
        /**
         * 取消锁
         * param:locknum锁id
         * return: 1-解锁成功 0-无此锁
         */
        // TODO 解锁（清除锁号或者时间调后）
        return 0;
    }
    public int del(String num){
        /**
         * 删除通知单
         * param:通知单id
         * return: 1-删除成功 0-删除失败
         */
        // TODO 删除逻辑
        return 0;
    }
    private int isFormat(HashMap<String,Object> prod){
        /*
        * 检验产品通知单的参数形势正确性
        * param:prod 产品通知单数据
        * */
        return 0;
    }
    public String toWORDFile(String num){
        /**
         * 通知单号
         * return 文件位置
         */
        return null;
    }
    private ArrayList<ProdNotification> search(HashMap<String,Object> searchMap,boolean mask){
        /*
        *查找方法
        * param: p产品信息,如果有范围相关的参数，范围参数的开始用着个传递
        * param: end如果有范围相关的参数，范围参数的结尾用着个传递，没有范围相关则为null
        * param: like模糊匹配使用
        * param: page分页的话使用的分页页数
        * param: pageSize分页的话每页的大小
        * param: mask 是否隐藏部分操作
        * */
        if (mask){
            searchMap.put("visibility",1);
        }else {
//            searchMap.put("visibility",0);
        }
        return null;
    }
}
