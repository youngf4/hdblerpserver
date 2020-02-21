package com.hdbl.erp.entity;

import java.util.Date;

public class ProcessVersion {
    // TODO 用于存放工艺工时的bean

    private int id;
    private Date creatTime;
    private Date updateTime;
    private int updater;
    private int type;
    private int productId;
    private String  drawingNumber;
    private String versionNumber;
    private int versionState;
//    private List<Process> process;//派工单执行工序列表

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

    public int getUpdater() {
        return updater;
    }

    public void setUpdater(int updater) {
        this.updater = updater;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public int getVersionState() {
        return versionState;
    }

    public void setVersionState(int versionState) {
        this.versionState = versionState;
    }

    @Override
    public String toString() {
        return "ProcessVersion{" +
                "id=" + id +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                ", updater=" + updater +
                ", type=" + type +
                ", productId=" + productId +
                ", drawingNumber='" + drawingNumber + '\'' +
                ", versionNumber='" + versionNumber + '\'' +
                ", versionState=" + versionState +
                '}';
    }
}
