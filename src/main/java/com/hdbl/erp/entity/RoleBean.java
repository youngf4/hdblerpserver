package com.hdbl.erp.entity;

public class RoleBean {
    //角色类

    private int id;
    private String role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "RoleBean{" +
                "id=" + id +
                ", role='" + role + '\'' +
                '}';
    }
}
