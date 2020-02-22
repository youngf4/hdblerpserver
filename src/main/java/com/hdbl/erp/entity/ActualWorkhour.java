package com.hdbl.erp.entity;

import java.util.Date;

public class ActualWorkhour {
    //实动工时表对应类，存放工人上报的加工时间及设备记录

    private int id;
    private Date creatTime;
    private Date updateTime;
    private int state;
    private int executionId; //执行工序ID
    private Date beginTime;
    private Date endTime;
    private int equipmentId; //设备ID

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

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getExecutionId() {
        return executionId;
    }

    public void setExecutionId(int executionId) {
        this.executionId = executionId;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }

    @Override
    public String toString() {
        return "ActualWorkhourDao{" +
                "id=" + id +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                ", state=" + state +
                ", executionId=" + executionId +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", equipmentId=" + equipmentId +
                '}';
    }
}
