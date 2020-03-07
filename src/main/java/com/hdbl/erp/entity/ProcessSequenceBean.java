package com.hdbl.erp.entity;

import java.util.Date;
import java.util.List;

public class ProcessSequenceBean {

    private int id;
    private Date creatTime;
    private Date updateTime;
    private int versionId; //版本ID
    private int sequenceNumber; //工序顺序号
    private int processId; //工序ID
    private String processName; //_工序名称
    private int executionStyle; //执行属性（代码）
    private String exeStye; //__执行属性（名称）
    private int supplierId; //供货商编号
    private int supplierName; //_供货商简称
    private boolean isSingle = true; //加工方式
    private List<ProcessHourBean> processHourList; //工序设备工时列表

    public ProcessSequenceBean() {
    }

    public ProcessSequenceBean( int sequenceNumber, int processId, String processName, int executionStyle, String exeStye, int supplierId, int supplierName, boolean isSingle) {
        this.sequenceNumber = sequenceNumber;
        this.processId = processId;
        this.processName = processName;
        this.executionStyle = executionStyle;
        this.exeStye = exeStye;
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.isSingle = isSingle;
    }

    @Override
    public String toString() {
        return "ProcessSequenceBean{" +
                "id=" + id +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                ", versionId=" + versionId +
                ", sequenceNumber=" + sequenceNumber +
                ", processId=" + processId +
                ", processName='" + processName + '\'' +
                ", executionStyle=" + executionStyle +
                ", exeStye='" + exeStye + '\'' +
                ", supplierId=" + supplierId +
                ", supplierName=" + supplierName +
                ", isSingle=" + isSingle +
                ", processHourList=" + processHourList +
                '}';
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getExeStye() {
        return exeStye;
    }

    public void setExeStye(String exeStye) {
        this.exeStye = exeStye;
    }

    public int getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(int supplierName) {
        this.supplierName = supplierName;
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

    public int getVersionId() {
        return versionId;
    }

    public void setVersionId(int versionId) {
        this.versionId = versionId;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public int getExecutionStyle() {
        return executionStyle;
    }

    public void setExecutionStyle(int executionStyle) {
        this.executionStyle = executionStyle;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public boolean isSingle() {
        return isSingle;
    }

    public void setSingle(boolean single) {
        isSingle = single;
    }

    public List<ProcessHourBean> getProcessHourList() {
        return processHourList;
    }

    public void setProcessHourList(List<ProcessHourBean> processHourList) {
        this.processHourList = processHourList;
    }
}
