package com.hdbl.erp.sevice;

import com.hdbl.erp.dao.UserBean;

import java.util.ArrayList;
import java.util.HashMap;

public class UserService{
    public static int SUCCESS=1,FILED=0;
    public UserBean vertify(String account, String password){
        /*
        验证用户名密码:
        param: account 账户
        param: password 密码
        return: 如果验证成功就返回用户信息，否者返回null
        */
        return null;
    }
    public int addUser(HashMap<String,Object> userinfo){
        /**
         * 添加员工
         * param: userinfo员工信息，包括工号等
         * return: 0->员工工号已存在 -1->员工信息格式错误 1->添加成功
         */
        return SUCCESS;
    }
    public int changepwd(String username,String pwd,String npwd){
        /**
         * 修改密码
         * param: username 用户名
         * param: pwd 旧密码
         * param: npwd 新密码
         * return: 1 修改成功 0修改失败
         */
        return SUCCESS;
    }
    public int modifyUser(HashMap<String,Object> userinfo){
        /**
         * 修改用户信息
         * param:收集的用户信息
         * return: 0-修改失败 1-修改成功
         * 将用户的信息转换成用户bean
         * 验证bean的格式
         * 将用户信息进行修改
         */
        return SUCCESS;
    }
    public UserBean getUserByAccount(String account){
        /**
         * 获取用户数据
         * param: account 用户账户
         * return: null->不存在用户
         */
        return null;
    }
    public ArrayList<UserBean> getAllUser(int page, int pageSize){
        /**
         * 获取用户数据
         * param: account 用户账户
         * return: null->不存在用户
         */
        return null;
    }
    public int delUser(String account){
        /**
         * 删除用户数据
         * param: account 用户账户
         * return: 0->不存在用户
         */
        return SUCCESS;
    }
    private ArrayList<UserBean> search(UserBean user){
        /**
         * 查找用户
         * param: user UserBean 对象，查找用户的模糊信息
         * return: 返回查找到的用户，没查找到返回空数组
         */
        return null;
    }
    private String hash(String password){
        /**
         * 提取摘要
         * param: password密码
         * return: 摘要处理后的密码
         */
        return null;
    }
    private int changeUser(UserBean old,UserBean new_){
        /**
         * 修改密码
         * param: old原始用户信息包括权限
         * param：new_新的用户信息new中有的都是要改的
         * 返回：1修改成功0修改失败或者没有这个用户
         */
        return SUCCESS;
    }

    private Boolean isFormated(UserBean user){
        /**
         * 验证员工数据格式是否正确，工号格式，日期信息等
         * param: user 要验证的员工
         * return: true 正确；false 错误
         */
        return true;
    }



}

