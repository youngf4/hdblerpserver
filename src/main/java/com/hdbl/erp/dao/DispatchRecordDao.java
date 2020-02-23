package com.hdbl.erp.dao;

import com.hdbl.erp.entity.DispatchRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface DispatchRecordDao {

    /**
     * select - 广义查询
     * @param obj 默认DispatchRecord实体属性
     * @param obj - startTime 查询时间范围开始，注意：与实体属性beginTime无关
     * @param obj - finishTime 查询时间范围结束，注意：与实体属性endTime无关
     * @param obj - page （页号-1）* 页宽
     * @param obj - pageSize 页宽
     * @return
     */
//    List<DispatchRecord> getRecords(@Param("obj") HashMap<String, Object> obj);
    HashMap getRecords(@Param("obj") HashMap<String, Object> obj);


    /**
     * INSERT - 批量插入记录
     * @param records - 日工记录列表
     * @return 成功插入记录条数
     */
    int insertRecords(List<DispatchRecord> records);


    /**
     * UPDATE - 广义覆盖修改
     * @param valueMap - 要修改的字段map
     * @param location - 用来定位条件的map
     * @return - 修改成功数量
     */
    int updateRecords(@Param("valueMap") HashMap<String, Object> valueMap, @Param("location") HashMap<String, Object> location);


    /**
     * DELETE - 广义覆盖删除
     * @param obj 默认DispatchRecord实体属性
     * @param obj - startTime 删除时间范围开始，注意：与实体属性beginTime无关
     * @param obj - finishTime 删除时间范围结束，注意：与实体属性endTime无关
     * @return
     */
    int deleteRecords(@Param("obj") HashMap<String, Object> obj);
}
