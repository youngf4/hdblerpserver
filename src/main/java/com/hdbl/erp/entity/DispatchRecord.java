package com.hdbl.erp.entity;

import java.util.Date;

public class DispatchRecord {
    // 生产派工单
    private int id;
    private Date creatTime;
    private Date updateTime;
    private int createrId;
    private int state;
    private String sheetNumber;
    private int productId;
    private int number;
    private String remark;

//    public DispatchRecord(){};

    public DispatchRecord(int createrId, String sheetNumber, int productId, int number) {
        this.createrId = createrId;
        this.sheetNumber = sheetNumber;
        this.productId = productId;
        this.number = number;
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

    public int getCreaterId() {
        return createrId;
    }

    public void setCreaterId(int createrId) {
        this.createrId = createrId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getSheetNumber() {
        return sheetNumber;
    }

    public void setSheetNumber(String sheetNumber) {
        this.sheetNumber = sheetNumber;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "DispatchRecord{" +
                "id=" + id +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                ", createrId=" + createrId +
                ", state=" + state +
                ", sheetNumber='" + sheetNumber + '\'' +
                ", productId=" + productId +
                ", number" + number +
                ", remark='" + remark + '\'' +
                '}';
    }
}
