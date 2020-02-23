package com.hdbl.erp.entity;

import java.math.BigDecimal;

public class PriceBean {
    //工时单价类

    private int id;
    private String workType; //工时类型
    private BigDecimal price; //工时单价

    public PriceBean() {
    }

    public PriceBean(String workType, BigDecimal price) {
        this.workType = workType;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PriceBean{" +
                "id=" + id +
                ", workType='" + workType + '\'' +
                ", price=" + price +
                '}';
    }
}
