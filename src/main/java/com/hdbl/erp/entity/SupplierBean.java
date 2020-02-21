package com.hdbl.erp.entity;

import java.util.Date;

public class SupplierBean {
    //供应商类

    private int id;
    private Date creatTime;
    private Date updateTime;
    private String name; //供应商名称
    private String simple_name; //供应商简称
    private boolean isPurchase; //可否外协
    private boolean isOutsource; //可否外购
    private boolean isCooperation; //合作状态

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSimple_name() {
        return simple_name;
    }

    public void setSimple_name(String simple_name) {
        this.simple_name = simple_name;
    }

    public boolean isPurchase() {
        return isPurchase;
    }

    public void setPurchase(boolean purchase) {
        isPurchase = purchase;
    }

    public boolean isOutsource() {
        return isOutsource;
    }

    public void setOutsource(boolean outsource) {
        isOutsource = outsource;
    }

    public boolean isCooperation() {
        return isCooperation;
    }

    public void setCooperation(boolean cooperation) {
        isCooperation = cooperation;
    }

    @Override
    public String toString() {
        return "SupplierBean{" +
                "id=" + id +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                ", name='" + name + '\'' +
                ", simple_name='" + simple_name + '\'' +
                ", isPurchase=" + isPurchase +
                ", isOutsource=" + isOutsource +
                ", isCooperation=" + isCooperation +
                '}';
    }
}
