package com.hdbl.erp.entity;

import java.util.Date;

public class ProdNotification {
    /*
    * 生产通知单bean
    * */

    private int id;
    private Date creatTime;
    private Date updateTime;
    private int state;
    private boolean visibility;
    private String notice_number;
    private String working_number;
    private String orderUnit;
    private String deliveryMethod;
    private String deliveryState;
    private String deliveryPlace;
    private boolean isInBatches;
    private Date deliveryDate;
    private String remark;
    private int compilingPerson;
    private Date submitTime;
    private int auditor;
    private Date auditTime;
    private String auditRemark;
    private int approver;
    private Date approveTime;
    private String approveRemark;
//    private List<Production> productinons;//产品列表


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

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public String getNotice_number() {
        return notice_number;
    }

    public void setNotice_number(String notice_number) {
        this.notice_number = notice_number;
    }

    public String getWorking_number() {
        return working_number;
    }

    public void setWorking_number(String working_number) {
        this.working_number = working_number;
    }

    public String getOrderUnit() {
        return orderUnit;
    }

    public void setOrderUnit(String orderUnit) {
        this.orderUnit = orderUnit;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getDeliveryState() {
        return deliveryState;
    }

    public void setDeliveryState(String deliveryState) {
        this.deliveryState = deliveryState;
    }

    public String getDeliveryPlace() {
        return deliveryPlace;
    }

    public void setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }

    public boolean isInBatches() {
        return isInBatches;
    }

    public void setInBatches(boolean inBatches) {
        isInBatches = inBatches;
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

    public int getCompilingPerson() {
        return compilingPerson;
    }

    public void setCompilingPerson(int compilingPerson) {
        this.compilingPerson = compilingPerson;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public int getAuditor() {
        return auditor;
    }

    public void setAuditor(int auditor) {
        this.auditor = auditor;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditRemark() {
        return auditRemark;
    }

    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark;
    }

    public int getApprover() {
        return approver;
    }

    public void setApprover(int approver) {
        this.approver = approver;
    }

    public Date getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    public String getApproveRemark() {
        return approveRemark;
    }

    public void setApproveRemark(String approveRemark) {
        this.approveRemark = approveRemark;
    }

    @Override
    public String toString() {
        return "ProdNotification{" +
                "id=" + id +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                ", state=" + state +
                ", visibility=" + visibility +
                ", notice_number='" + notice_number + '\'' +
                ", working_number='" + working_number + '\'' +
                ", orderUnit='" + orderUnit + '\'' +
                ", deliveryMethod='" + deliveryMethod + '\'' +
                ", deliveryState='" + deliveryState + '\'' +
                ", deliveryPlace='" + deliveryPlace + '\'' +
                ", isInBatches=" + isInBatches +
                ", deliveryDate=" + deliveryDate +
                ", remark='" + remark + '\'' +
                ", compilingPerson=" + compilingPerson +
                ", submitTime=" + submitTime +
                ", auditor=" + auditor +
                ", auditTime=" + auditTime +
                ", auditRemark='" + auditRemark + '\'' +
                ", approver=" + approver +
                ", approveTime=" + approveTime +
                ", approveRemark='" + approveRemark + '\'' +
                '}';
    }
}
