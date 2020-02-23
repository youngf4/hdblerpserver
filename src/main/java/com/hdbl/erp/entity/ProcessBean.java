package com.hdbl.erp.entity;

public class ProcessBean {
    //工序类

    private int id;  //工序编号
    private String name; //工序名称

    public ProcessBean() {
    }

    public ProcessBean(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
