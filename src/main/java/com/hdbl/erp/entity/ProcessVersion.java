package com.hdbl.erp.entity;

import java.util.Date;

public class ProcessVersion {
    // TODO 用于存放工艺工时的bean

    private int id;
    private Date creat_time;
    private Date update_time;
    private int updater;
    private int type;
    private int product_id;
    private String  drawing_number;
    private String version_number;
    private int version_state;
//    private List<Process> process;//派工单执行工序列表


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

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getDrawing_number() {
        return drawing_number;
    }

    public void setDrawing_number(String drawing_number) {
        this.drawing_number = drawing_number;
    }

    public String getVersion_number() {
        return version_number;
    }

    public void setVersion_number(String version_number) {
        this.version_number = version_number;
    }

    public int getVersion_state() {
        return version_state;
    }

    public void setVersion_state(int version_state) {
        this.version_state = version_state;
    }

    @Override
    public String toString() {
        return "ProcessVersion{" +
                "id=" + id +
                ", creat_time=" + creat_time +
                ", update_time=" + update_time +
                ", updater=" + updater +
                ", type=" + type +
                ", product_id=" + product_id +
                ", drawing_number='" + drawing_number + '\'' +
                ", version_number='" + version_number + '\'' +
                ", version_state=" + version_state +
                '}';
    }
}
