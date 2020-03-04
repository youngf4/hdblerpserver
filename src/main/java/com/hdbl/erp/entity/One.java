package com.hdbl.erp.entity;

import java.util.List;

public class One {
    private int id;
    private String name;
    private List<Many> manyList;
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

    public List<Many> getManyList() {
        return manyList;
    }

    public void setManyList(List<Many> manyList) {
        this.manyList = manyList;
    }

    @Override
    public String toString() {
        return "One{" +
                "id=" + id +
                ", name=" + name +
                ", manyList=" + manyList +
                '}';
    }
}
