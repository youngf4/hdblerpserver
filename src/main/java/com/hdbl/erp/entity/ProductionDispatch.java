package com.hdbl.erp.entity;

import java.util.Date;

public class ProductionDispatch {
    // 生产派工单
    private int id;
    private Date creat_time;
    private Date update_time;
    private int updater;
    private int state;
    private String sheet_number;
    private int product_id;
    private int number;
    private String remark;
//    private List<Process> processes;//派工单工序表
}
