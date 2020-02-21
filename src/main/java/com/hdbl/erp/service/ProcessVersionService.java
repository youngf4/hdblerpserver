package com.hdbl.erp.sevice;

import com.hdbl.erp.entity.ProcessVersion;

import java.util.ArrayList;
import java.util.HashMap;

public class ProcessVersionService {
    public ProcessVersion create(HashMap<String,Object> proc){
        /**
         * 创建一个工艺工时版本
         * param:proc工艺工时参数
         * return c创建成功的工艺工时
         */
        ProcessVersion pv = this.isFormat(proc);
        if(pv==null)return null;
        if(this.confit(pv))return null;
        // TODO 新建逻辑并返回
        return null;
    }
    private boolean confit(ProcessVersion proc){
        // TODO 查重逻辑;
        return false;
    }
    private ProcessVersion isFormat(HashMap<String,Object> proc){
        /**
         * 判断hashmap是否是合理的工艺工时格式
         * param:proc 输入的工艺工时
         * return：null->格式不正确 !null->格式正确
         */
        return null;
    }
    private ArrayList<ProcessVersion> search(ProcessVersion proc){
        /**
         * 查询工艺工时
         * param:proc要查询的数据bean
         * param:是用or模式还是用and模式 根据用途具体讨论是否启用
         */
        // TODO 查寻逻辑
        return null;
    }
}
