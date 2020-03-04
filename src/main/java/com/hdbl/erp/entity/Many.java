package com.hdbl.erp.entity;

public class Many {
    private int id;
    private int outid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOutid() {
        return outid;
    }

    public void setOutid(int outid) {
        this.outid = outid;
    }

    @Override
    public String toString() {
        return "Many{" +
                "id=" + id +
                ", outid=" + outid +
                '}';
    }
}
