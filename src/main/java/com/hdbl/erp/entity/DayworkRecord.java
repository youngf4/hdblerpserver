package com.hdbl.erp.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DayworkRecord {
    //日工考勤上报记录

    private int id;
    private Date creatTime;
    private Date updateTime;
    private int workerId;
    private Date beginTime;
    private Date endTime;
    private String remark;
    private BigDecimal price;
    private int state;
    private int auditorId;

    public DayworkRecord(int workerId, Date beginTime, Date endTime, String remark) {
        this.workerId = workerId;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.remark = remark;
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

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(int auditorId) {
        this.auditorId = auditorId;
    }

    @Override
    public String toString() {
        return "DayworkRecord{" +
                "id=" + id +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                ", workerId=" + workerId +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", remark='" + remark + '\'' +
                ", price=" + price +
                ", state=" + state +
                ", auditorId=" + auditorId +
                '}';
    }
}
