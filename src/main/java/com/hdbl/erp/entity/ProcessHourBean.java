package com.hdbl.erp.entity;

import java.util.Date;

public class ProcessHourBean {
    //工序工时表，包含设备

    private int id;
    private Date creatTime;
    private Date updateTime;
    private int processSequenceId; //工艺工序ID
    private int equipmentId; //设备ID
    private String equipmentNumber; //设备编号
    private String equipmentName; //设备名称
    private int debugHour; //调试工时
    private int quotaHour; //定额工时

    public ProcessHourBean() {}

    public ProcessHourBean(int equipmentId, String equipmentNumber, String equipmentName, int debugHour, int quotaHour) {
        this.equipmentId = equipmentId;
        this.equipmentNumber = equipmentNumber;
        this.equipmentName = equipmentName;
        this.debugHour = debugHour;
        this.quotaHour = quotaHour;
    }

    @Override
    public String toString() {
        return "ProcessHourBean{" +
                "id=" + id +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                ", processSequenceId=" + processSequenceId +
                ", equipmentId=" + equipmentId +
                ", equipmentNumber='" + equipmentNumber + '\'' +
                ", equipmentName='" + equipmentName + '\'' +
                ", debugHour=" + debugHour +
                ", quotaHour=" + quotaHour +
                '}';
    }

    public String getEquipmentNumber() {
        return equipmentNumber;
    }

    public void setEquipmentNumber(String equipmentNumber) {
        this.equipmentNumber = equipmentNumber;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

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

    public int getProcessSequenceId() {
        return processSequenceId;
    }

    public void setProcessSequenceId(int processSequenceId) {
        this.processSequenceId = processSequenceId;
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

}
