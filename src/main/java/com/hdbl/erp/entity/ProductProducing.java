package com.hdbl.erp.entity;

import java.util.Date;

public class ProductProducing {
    //生产产品列表

    private int id;
    private Date creatTime;
    private Date updateTime;
    private int creater;
    private int type; //类型(生产品/返修品/工装品）
    private int state;
    private int noticeId; //通知单ID
    private String noticeNumber; //通知单号
    private int processVersionId; //工艺版本ID
    private String processVersionNumber; //工艺版本号
    private int executionId; //执行工序ID（返修品）
    private int orderNumber; //通知单产品序号
    private String drawingNumber; //图号
    private String productName; //品名
    private String materialQuality;  //材质
    private int  number; //数量
    private Date deliveryDate; //交货日期
    private String remark; //备注
    private boolean  visibility; //可见性

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

    public int getCreater() {
        return creater;
    }

    public void setCreater(int creater) {
        this.creater = creater;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(int noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeNumber() {
        return noticeNumber;
    }

    public void setNoticeNumber(String noticeNumber) {
        this.noticeNumber = noticeNumber;
    }

    public int getProcessVersionId() {
        return processVersionId;
    }

    public void setProcessVersionId(int processVersionId) {
        this.processVersionId = processVersionId;
    }

    public String getProcessVersionNumber() {
        return processVersionNumber;
    }

    public void setProcessVersionNumber(String processVersionNumber) {
        this.processVersionNumber = processVersionNumber;
    }

    public int getExecutionId() {
        return executionId;
    }

    public void setExecutionId(int executionId) {
        this.executionId = executionId;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getDrawingNumber() {
        return drawingNumber;
    }

    public void setDrawingNumber(String drawingNumber) {
        this.drawingNumber = drawingNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMaterialQuality() {
        return materialQuality;
    }

    public void setMaterialQuality(String materialQuality) {
        this.materialQuality = materialQuality;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    @Override
    public String toString() {
        return "ProductProducing{" +
                "id=" + id +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                ", creater=" + creater +
                ", type=" + type +
                ", state=" + state +
                ", noticeId=" + noticeId +
                ", noticeNumber='" + noticeNumber + '\'' +
                ", processVersionId=" + processVersionId +
                ", processVersionNumber='" + processVersionNumber + '\'' +
                ", executionId=" + executionId +
                ", orderNumber=" + orderNumber +
                ", drawingNumber='" + drawingNumber + '\'' +
                ", productName='" + productName + '\'' +
                ", materialQuality='" + materialQuality + '\'' +
                ", number=" + number +
                ", deliveryDate=" + deliveryDate +
                ", remark='" + remark + '\'' +
                ", visibility=" + visibility +
                '}';
    }
}
