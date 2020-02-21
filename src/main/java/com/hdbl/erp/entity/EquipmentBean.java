package com.hdbl.erp.entity;

import java.util.Date;

public class EquipmentBean {
    //设备信息表

    private int id;
    private Date creatTime;
    private Date updateTime;
    private String number; //设备编号
    private String name;
    private int planHour; //应动工时
    private int state;

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlanHour() {
        return planHour;
    }

    public void setPlanHour(int planHour) {
        this.planHour = planHour;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "EquipmentBean{" +
                "id=" + id +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", planHour=" + planHour +
                ", state=" + state +
                '}';
    }
}
