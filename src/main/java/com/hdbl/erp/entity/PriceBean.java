package com.hdbl.erp.entity;

import java.math.BigDecimal;

public class PriceBean {
    //工时单价类

    private int id;
    private String work_type; //工时类型
    private BigDecimal price; //工时单价

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWork_type() {
        return work_type;
    }

    public void setWork_type(String work_type) {
        this.work_type = work_type;
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
                ", work_type='" + work_type + '\'' +
                ", price=" + price +
                '}';
    }
}
