package com.hdbl.erp.entity;

import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

public class ProductProducingBean {
    //生产产品列表

    private int id;
    private Date creatTime;
    private Date updateTime;
    private int createrId; //工装品下单人
    private int type; //类型(生产品/返修品）
    private int state; //状态
    private int noticeId; //通知单ID
    private int processVersionId; //工艺版本ID
    private int errorProcessId; //执行工序ID（返修品）
    private int orderNumber; //通知单产品序号
    private int  product_id; //产品ID
    private int  number; //数量
    private Date deliveryDate; //交货日期
    private String remark; //备注
    private boolean  visibility; //可见性

    public ProductProducingBean() {
    }

    @Override
    public String toString() {
        return "ProductProducingBean{" +
                "id=" + id +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                ", createrId=" + createrId +
                ", type=" + type +
                ", state=" + state +
                ", noticeId=" + noticeId +
                ", processVersionId=" + processVersionId +
                ", errorProcessId=" + errorProcessId +
                ", orderNumber=" + orderNumber +
                ", product_id=" + product_id +
                ", number=" + number +
                ", deliveryDate=" + deliveryDate +
                ", remark='" + remark + '\'' +
                ", visibility=" + visibility +
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

    public int getCreaterId() {
        return createrId;
    }

    public void setCreaterId(int createrId) {
        this.createrId = createrId;
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

    public int getProcessVersionId() {
        return processVersionId;
    }

    public void setProcessVersionId(int processVersionId) {
        this.processVersionId = processVersionId;
    }

    public int getErrorProcessId() {
        return errorProcessId;
    }

    public void setErrorProcessId(int errorProcessId) {
        this.errorProcessId = errorProcessId;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
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
}
