package com.hdbl.erp.entity;

public class ProcessBean {
    //工序类

    private int id;  //工序编号
    private int name; //工序名称

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProcessBean{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
