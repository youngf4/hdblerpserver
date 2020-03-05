package com.hdbl.erp.entity;

import java.util.Date;
import java.util.List;

public class ProcessVersionBean {

    private int id;
    private Date creatTime;
    private Date updateTime;
    private int updaterId;
    private int productId;
    private String versionNumber;
    private int type;
    private boolean versionState;
    private List<ProcessSequenceBean> processSequenceList; //工艺版本中的工序

    public ProcessVersionBean() {
    }

    @Override
    public String toString() {
        return "ProcessVersionBean{" +
                "id=" + id +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                ", updaterId=" + updaterId +
                ", productId=" + productId +
                ", versionNumber='" + versionNumber + '\'' +
                ", type=" + type +
                ", versionState=" + versionState +
                ", processSequenceList=" + processSequenceList +
                '}';
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

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isVersionState() {
        return versionState;
    }

    public void setVersionState(boolean versionState) {
        this.versionState = versionState;
    }

    public List<ProcessSequenceBean> getProcessSequenceList() {
        return processSequenceList;
    }

    public void setProcessSequenceList(List<ProcessSequenceBean> processSequenceList) {
        this.processSequenceList = processSequenceList;
    }
}
