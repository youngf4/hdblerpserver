package com.hdbl.erp.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ProcessExecution {
    //工序执行及质检记录表类

    private int id;
    private Date CreatTime;
    private Date  updateTime;
    private int sequenceId; //工序顺序号
    private int dispatchRecordId; //派工单记录ID
    private int processHourId; //工序工时ID
    private int workerId; //执行工人ID
    private int state; //状态
    private BigDecimal numberDebug; //调试合格数量，允许小数
    private int numberQualified; //合格数量
    private int numberPending; //待处理数量
    private int numberWasteMaterial; //料废数量
    private int numberWasteIndustrial; //工废数量
    private int numberRework; //返修数量
    private int numberReturned; //退换货数量
    private boolean isConfirm; //是否合格确认
    private Date confirmTime; //确认时间
    private int iconfirmerId; //质检确认人
    private int parentId; //返修或退换货追踪编号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatTime() {
        return CreatTime;
    }

    public void setCreatTime(Date creatTime) {
        CreatTime = creatTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(int sequenceId) {
        this.sequenceId = sequenceId;
    }

    public int getDispatchRecordId() {
        return dispatchRecordId;
    }

    public void setDispatchRecordId(int dispatchRecordId) {
        this.dispatchRecordId = dispatchRecordId;
    }

    public int getProcessHourId() {
        return processHourId;
    }

    public void setProcessHourId(int processHourId) {
        this.processHourId = processHourId;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public BigDecimal getNumberDebug() {
        return numberDebug;
    }

    public void setNumberDebug(BigDecimal numberDebug) {
        this.numberDebug = numberDebug;
    }

    public int getNumberQualified() {
        return numberQualified;
    }

    public void setNumberQualified(int numberQualified) {
        this.numberQualified = numberQualified;
    }

    public int getNumberPending() {
        return numberPending;
    }

    public void setNumberPending(int numberPending) {
        this.numberPending = numberPending;
    }

    public int getNumberWasteMaterial() {
        return numberWasteMaterial;
    }

    public void setNumberWasteMaterial(int numberWasteMaterial) {
        this.numberWasteMaterial = numberWasteMaterial;
    }

    public int getNumberWasteIndustrial() {
        return numberWasteIndustrial;
    }

    public void setNumberWasteIndustrial(int numberWasteIndustrial) {
        this.numberWasteIndustrial = numberWasteIndustrial;
    }

    public int getNumberRework() {
        return numberRework;
    }

    public void setNumberRework(int numberRework) {
        this.numberRework = numberRework;
    }

    public int getNumberReturned() {
        return numberReturned;
    }

    public void setNumberReturned(int numberReturned) {
        this.numberReturned = numberReturned;
    }

    public boolean isConfirm() {
        return isConfirm;
    }

    public void setConfirm(boolean confirm) {
        isConfirm = confirm;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public int getIconfirmerId() {
        return iconfirmerId;
    }

    public void setIconfirmerId(int iconfirmerId) {
        this.iconfirmerId = iconfirmerId;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "ProcessExecution{" +
                "id=" + id +
                ", CreatTime=" + CreatTime +
                ", updateTime=" + updateTime +
                ", sequenceId=" + sequenceId +
                ", dispatchRecordId=" + dispatchRecordId +
                ", processHourId=" + processHourId +
                ", workerId=" + workerId +
                ", state=" + state +
                ", numberDebug=" + numberDebug +
                ", numberQualified=" + numberQualified +
                ", numberPending=" + numberPending +
                ", numberWasteMaterial=" + numberWasteMaterial +
                ", numberWasteIndustrial=" + numberWasteIndustrial +
                ", numberRework=" + numberRework +
                ", numberReturned=" + numberReturned +
                ", isConfirm=" + isConfirm +
                ", confirmTime=" + confirmTime +
                ", iconfirmerId=" + iconfirmerId +
                ", parentId=" + parentId +
                '}';
    }
}
