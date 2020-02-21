package com.hdbl.erp.entity;

import java.util.Date;

public class ProductBean {
    //产品表

    private int id;
    private Date creatTime;
    private Date updateTime;
    private String drawingNumber; //图号
    private String name; //品名
    private String materialQuality;  //材质
    private int type; //类型

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

    public String getDrawingNumber() {
        return drawingNumber;
    }

    public void setDrawingNumber(String drawingNumber) {
        this.drawingNumber = drawingNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterialQuality() {
        return materialQuality;
    }

    public void setMaterialQuality(String materialQuality) {
        this.materialQuality = materialQuality;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ProductBean{" +
                "id=" + id +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                ", drawingNumber='" + drawingNumber + '\'' +
                ", name='" + name + '\'' +
                ", materialQuality='" + materialQuality + '\'' +
                ", type=" + type +
                '}';
    }
}
