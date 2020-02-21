package com.hdbl.erp.entity;

import java.util.Date;

public class ProcessHour {
    //工序工时表，包含设备

    private int id;
    private Date creatTime;
    private Date updateTime;
    private int processId; //工艺工序ID
    private int equipmentId; //设备编号
    private int debugHour; //调试工时
    private int quotaHour; //定额工时

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

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }

    public int getDebugHour() {
        return debugHour;
    }

    public void setDebugHour(int debugHour) {
        this.debugHour = debugHour;
    }

    public int getQuotaHour() {
        return quotaHour;
    }

    public void setQuotaHour(int quotaHour) {
        this.quotaHour = quotaHour;
    }

    @Override
    public String toString() {
        return "ProcessHour{" +
                "id=" + id +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                ", processId=" + processId +
                ", equipmentId=" + equipmentId +
                ", debugHour=" + debugHour +
                ", quotaHour=" + quotaHour +
                '}';
    }
}
