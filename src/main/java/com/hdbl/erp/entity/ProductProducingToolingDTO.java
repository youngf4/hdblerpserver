package com.hdbl.erp.entity;

import java.util.Date;

public class ProductProducingToolingDTO {
    // 下单生产的工装产品 数据传输对象

    private boolean  visibility = true; //可见性
    private int productType = 2; //产品类型：工装品

    private int id;
    private Date creatTime;
    private Date updateTime;
    private int createrId; //工装品下单人
    private int pruducingType; //类型(生产品/返修品）
    private int state; //状态
    private int processVersionId; //工艺版本ID
    private int  productId; //产品ID
    private String drawingNumber; //图号
    private String name; //品名
    private String materialQuality;  //材质
    private int  number; //数量
    private String remark; //备注

    public ProductProducingToolingDTO() {
    }

    @Override
    public String toString() {
        return "ProductProducingToolingDTO{" +
                "visibility=" + visibility +
                ", productType=" + productType +
                ", id=" + id +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                ", createrId=" + createrId +
                ", pruducingType=" + pruducingType +
                ", state=" + state +
                ", processVersionId=" + processVersionId +
                ", productId=" + productId +
                ", drawingNumber='" + drawingNumber + '\'' +
                ", name='" + name + '\'' +
                ", materialQuality='" + materialQuality + '\'' +
                ", number=" + number +
                ", remark='" + remark + '\'' +
                '}';
    }

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
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

    public int getPruducingType() {
        return pruducingType;
    }

    public void setPruducingType(int pruducingType) {
        this.pruducingType = pruducingType;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getProcessVersionId() {
        return processVersionId;
    }

    public void setProcessVersionId(int processVersionId) {
        this.processVersionId = processVersionId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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
}
