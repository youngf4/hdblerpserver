package com.hdbl.erp.entity;

import java.util.Date;

public class ProdNotification {
    /*
    * 生产通知单bean
    * */

    private int id;
    private Date creat_time;
    private Date update_time;
    private int state;
    private boolean visibility;
    private String notice_number;
    private String working_number;
    private String order_unit;
    private String delivery_method;
    private String delivery_state;
    private String delivery_place;
    private boolean is_in_batches;
    private Date delivery_date;
    private String remark;
    private int compiling_person;
    private Date submit_time;
    private int auditor;
    private Date audit_time;
    private String audit_remark;
    private int approver;
    private Date approve_time;
    private String approve_remark;
//    private List<Production> productinons;//产品列表


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreat_time() {
        return creat_time;
    }

    public void setCreat_time(Date creat_time) {
        this.creat_time = creat_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
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

    public String getOrder_unit() {
        return order_unit;
    }

    public void setOrder_unit(String order_unit) {
        this.order_unit = order_unit;
    }

    public String getDelivery_method() {
        return delivery_method;
    }

    public void setDelivery_method(String delivery_method) {
        this.delivery_method = delivery_method;
    }

    public String getDelivery_state() {
        return delivery_state;
    }

    public void setDelivery_state(String delivery_state) {
        this.delivery_state = delivery_state;
    }

    public String getDelivery_place() {
        return delivery_place;
    }

    public void setDelivery_place(String delivery_place) {
        this.delivery_place = delivery_place;
    }

    public boolean isIs_in_batches() {
        return is_in_batches;
    }

    public void setIs_in_batches(boolean is_in_batches) {
        this.is_in_batches = is_in_batches;
    }

    public Date getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(Date delivery_date) {
        this.delivery_date = delivery_date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getCompiling_person() {
        return compiling_person;
    }

    public void setCompiling_person(int compiling_person) {
        this.compiling_person = compiling_person;
    }

    public Date getSubmit_time() {
        return submit_time;
    }

    public void setSubmit_time(Date submit_time) {
        this.submit_time = submit_time;
    }

    public int getAuditor() {
        return auditor;
    }

    public void setAuditor(int auditor) {
        this.auditor = auditor;
    }

    public Date getAudit_time() {
        return audit_time;
    }

    public void setAudit_time(Date audit_time) {
        this.audit_time = audit_time;
    }

    public String getAudit_remark() {
        return audit_remark;
    }

    public void setAudit_remark(String audit_remark) {
        this.audit_remark = audit_remark;
    }

    public int getApprover() {
        return approver;
    }

    public void setApprover(int approver) {
        this.approver = approver;
    }

    public Date getApprove_time() {
        return approve_time;
    }

    public void setApprove_time(Date approve_time) {
        this.approve_time = approve_time;
    }

    public String getApprove_remark() {
        return approve_remark;
    }

    public void setApprove_remark(String approve_remark) {
        this.approve_remark = approve_remark;
    }

    @Override
    public String toString() {
        return "ProdNotification{" +
                "id=" + id +
                ", creat_time=" + creat_time +
                ", update_time=" + update_time +
                ", state=" + state +
                ", visibility=" + visibility +
                ", notice_number='" + notice_number + '\'' +
                ", working_number='" + working_number + '\'' +
                ", order_unit='" + order_unit + '\'' +
                ", delivery_method='" + delivery_method + '\'' +
                ", delivery_state='" + delivery_state + '\'' +
                ", delivery_place='" + delivery_place + '\'' +
                ", is_in_batches=" + is_in_batches +
                ", delivery_date=" + delivery_date +
                ", remark='" + remark + '\'' +
                ", compiling_person=" + compiling_person +
                ", submit_time=" + submit_time +
                ", auditor=" + auditor +
                ", audit_time=" + audit_time +
                ", audit_remark='" + audit_remark + '\'' +
                ", approver=" + approver +
                ", approve_time=" + approve_time +
                ", approve_remark='" + approve_remark + '\'' +
                '}';
    }
}
