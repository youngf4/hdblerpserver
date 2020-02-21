package com.hdbl.erp.entity;

import java.util.Date;

public class ProcessSequence {
    //工艺工序表，工序执行顺序

    private int id;
    private Date creatTime;
    private Date updateTime;
    private int updaterId;
    private int productId; //产品ID
    private String drawingNumber; //图号
    private int versionId; //版本ID
    private String versionNumber; //版本号
    private int sequenceNumber; //工序顺序号
    private int processId; //工序ID
    private String processName; //工序名称
    private int executionStyle; //执行属性
    private int supplierId; //供货商编号
    private boolean isDouble; //加工方式

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

    public int getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(int updaterId) {
        this.updaterId = updaterId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getDrawingNumber() {
        return drawingNumber;
    }

    public void setDrawingNumber(String drawingNumber) {
        this.drawingNumber = drawingNumber;
    }

    public int getVersionId() {
        return versionId;
    }

    public void setVersionId(int versionId) {
        this.versionId = versionId;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
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

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
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

    public boolean isDouble() {
        return isDouble;
    }

    public void setDouble(boolean aDouble) {
        isDouble = aDouble;
    }

    @Override
    public String toString() {
        return "ProcessSequence{" +
                "id=" + id +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                ", updaterId=" + updaterId +
                ", productId=" + productId +
                ", drawingNumber='" + drawingNumber + '\'' +
                ", versionId=" + versionId +
                ", versionNumber='" + versionNumber + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                ", processId=" + processId +
                ", processName='" + processName + '\'' +
                ", executionStyle=" + executionStyle +
                ", supplierId=" + supplierId +
                ", isDouble=" + isDouble +
                '}';
    }
}
