package com.hdbl.erp.service;

import com.hdbl.erp.dao.ProdNotificationDao;
import com.hdbl.erp.entity.ProdNotification;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

public class ProdNotiService {
    public static int SUCCESS=1,FAILLED=0,ABORD=-1;
    public ArrayList<ProdNotification> getProdNotifications(ProdNotification p,HashMap<String,Object> searchMap,String like,int page,int pageSize){
        /*
        * 查找的接口方法
         * param: p产品信息,如果有范围相关的参数，范围参数的开始用着个传递
         * param: end如果有范围相关的参数，范围参数的结尾用着个传递，没有范围相关则为null
         * param: like模糊匹配使用
         * param: page分页的话使用的分页页数
         * param: pageSize分页的话每页的大小
        * */
        return this.search(p,searchMap,like,page,pageSize,true);
    }
    public ArrayList<ProdNotification> getAllProdNotifications(ProdNotification p,HashMap<String,Object> searchMap,String like,int page,int pageSize,String username){
        /*
         * 查找的接口方法
         * param: p产品信息,如果有范围相关的参数，范围参数的开始用着个传递
         * param: end如果有范围相关的参数，范围参数的结尾用着个传递，没有范围相关则为null
         * param: like模糊匹配使用
         * param: page分页的话使用的分页页数
         * param: pageSize分页的话每页的大小
         * param: pageSize分页
         * */
        // TODO 先掉用userservice查询是否能看再返回结果
        return this.search(p,searchMap,like,page,pageSize,false);

    }
    public String create(HashMap<String,Object> prod){
        /**
         * 创建一个生产通知
         * param:prod要创建的生产通知
         * return null-创建失败 通知单号-创建成功 -1-格式错误
         */
        //查询接口
        SqlSession session = this.getSqlFactory().openSession();
        ProdNotificationDao prodNotificationDao = session.getMapper(ProdNotificationDao.class);
        //获取最新通知单号
        HashMap<String, Object> searchMap = new HashMap<>();
        searchMap.put("decs", "desc");
        searchMap.put("page",0);
        searchMap.put("pageSoze",1);
        String lastNoticedNumber = prodNotificationDao.select(searchMap).get(0).getNotice_number();
        String newNumber = String.valueOf(Integer.parseInt(lastNoticedNumber)+1);
        //转换后创建
        ProdNotification prodNotification = new ProdNotification();
        prodNotification.setNotice_number(newNumber);
        prodNotification.setWorking_number((String)prod.get("workingNumber"));
        prodNotification.setWorking_number((String)prod.get("orderUnit"));
        ArrayList<ProdNotification> list = new ArrayList<>();
        list.add(prodNotification);
        int result = prodNotificationDao.insert(list);
        if(result==1) {
            return newNumber;
        }
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
    private ArrayList<ProdNotification> search(ProdNotification p,HashMap<String,Object> searchMap,String like,int page,int pageSize,boolean mask){
        /*
        *查找方法
        * param: p产品信息,如果有范围相关的参数，范围参数的开始用着个传递
        * param: end如果有范围相关的参数，范围参数的结尾用着个传递，没有范围相关则为null
        * param: like模糊匹配使用
        * param: page分页的话使用的分页页数
        * param: pageSize分页的话每页的大小
        * param: mask 是否隐藏部分操作
        * */
        SqlSession session = this.getSqlFactory().openSession();
        ProdNotificationDao prodNotificationDao = session.getMapper(ProdNotificationDao.class);
        //对象转成map，稍后抽象成方法调用
        Field[] fields = p.getClass().getDeclaredFields();
        for(Field f : fields){
            try {
                searchMap.put(f.getName(),f.get(p));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        //分页查询参数
        int start = (page-1)*pageSize;
        searchMap.put("page", start);
        searchMap.put("pageSize", pageSize);
        //调用DAO查询
        ArrayList<ProdNotification> prodNotifications = prodNotificationDao.select(searchMap);
        session.close();
        // mark = true：隐藏部分操作。将visibility = false（不可见）的记录剔除掉
        if(mask){
            for(ProdNotification prod : prodNotifications){
                if(!prod.isVisibility()){
                    prodNotifications.remove(prod);
                }
            }
        }
        return prodNotifications;
    }

    /**
     * 获取SqlSessionFactory
     * @return
     */
    private SqlSessionFactory getSqlFactory(){
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = null;
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            return sqlSessionFactory;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
