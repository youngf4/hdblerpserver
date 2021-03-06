package com.hdbl.erp.dao;

import com.hdbl.erp.entity.ActualWorkhour;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Mapper
public interface ActualWorkhourDao {

    /**
     * select - 广义查询
     * @param obj 默认ActualWorkhour实体属性
     * @param obj - startTime 查询时间范围开始，注意：与实体属性beginTime无关
     * @param obj - finishTime 查询时间范围结束，注意：与实体属性endTime无关
     * @param obj - page （页号-1）* 页宽
     * @param obj - pageSize 页宽
     * @return
     */
    List<ActualWorkhour> getRecords(@Param("obj") HashMap<String , Object> obj);


    /**
     * insert - 插入实动工时记录
     * @param records ：实动工时列表
     * @return ：成功插入数据库记录条数，失败返回exception，需要上级处理
     */
    int insertRecords(List<ActualWorkhour> records);


    /**
     * update - 广义覆盖修改
     * @param valueMap - 要修改的字段map
     * @param location - 用来定位条件的map
     * @return - 修改成功数量
     */
    int updateRecords(@Param("valueMap") HashMap<String , Object> valueMap, @Param("location") HashMap<String , Object> location);


    /**
     * DELETE - 广义覆盖删除
     * @param obj 默认ActualWorkhour实体属性
     * @param obj - startTime 查询时间范围开始，注意：与实体属性beginTime无关
     * @param obj - finishTime 查询时间范围结束，注意：与实体属性endTime无关     * @return
     */
    int deleteRecords(@Param("obj") HashMap<String , Object> obj);
}
