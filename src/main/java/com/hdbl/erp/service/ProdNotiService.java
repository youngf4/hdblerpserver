package com.hdbl.erp.sevice;

import com.hdbl.erp.entity.ProdNotification;

import java.util.ArrayList;
import java.util.HashMap;

public class ProdNotiService {
    public static int SUCCESS=1,FAILLED=0,ABORD=-1;
    public ArrayList<ProdNotification> getProdNotifications(ProdNotification p,ProdNotification end,String like,int page,int pageSize){
        /*
        * 查找的接口方法
         * param: p产品信息,如果有范围相关的参数，范围参数的开始用着个传递
         * param: end如果有范围相关的参数，范围参数的结尾用着个传递，没有范围相关则为null
         * param: like模糊匹配使用
         * param: page分页的话使用的分页页数
         * param: pageSize分页的话每页的大小
        * */
        return this.search(p,end,like,page,pageSize,true);
    }
    public ArrayList<ProdNotification> getAllProdNotifications(ProdNotification p,ProdNotification end,String like,int page,int pageSize,String username){
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
        return this.search(p,end,like,page,pageSize,false);

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
    private ArrayList<ProdNotification> search(ProdNotification p,ProdNotification end,String like,int page,int pageSize,boolean mask){
        /*
        *查找方法
        * param: p产品信息,如果有范围相关的参数，范围参数的开始用着个传递
        * param: end如果有范围相关的参数，范围参数的结尾用着个传递，没有范围相关则为null
        * param: like模糊匹配使用
        * param: page分页的话使用的分页页数
        * param: pageSize分页的话每页的大小
        * param: mask 是否隐藏部分操作
        * */
        return null;
    }
}
