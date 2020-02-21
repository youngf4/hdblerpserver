package com.hdbl.erp.entity;

public class PermissionBean {
        //权限类

    private int id; //权限编号
    private String name; //权限名

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
        return "PermissionBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
