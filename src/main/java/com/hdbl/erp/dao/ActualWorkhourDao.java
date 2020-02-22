package com.hdbl.erp.dao;

import com.hdbl.erp.entity.ActualWorkhour;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface ActualWorkhourDao {

    /**
     * 查询执行工序下某一状态的实动工时记录
     * @param processId ：执行工序ID
     * @param state ：状态码
     * @return ：实动工时记录列表
     */
    List<ActualWorkhour> getRecordByProcess(int processId , int state);
    List<ActualWorkhour> getRecordByProcess(int processId);


    /**
     * 查询设备某时间段内实际开动工时（检查已确认合格的，即state = 合格码）
     * @param equipmentId : 设备ID
     * @param beginTime ：时间段开始时间，注意：与实体属性beginTime无关
     * @param endTime ：时间段结束时间，注意：与实体属性endTime无关
     * @return ：实动工时记录列表
     */
    List<ActualWorkhour> getRecordByEquipment(int equipmentId , Date beginTime , Date endTime);


    /**
     * insert：实动工时记录
     * @param records ：实动工时列表
     * @return ：成功匹配数据库记录条数，失败返回exception，需要上级处理
     */
    int putRecords(List<ActualWorkhour> records);


    /**
     * 质量检查确认，随执行工序的质量检查结果
     * @param processId ：执行工序ID
     * @param result ： 质检结果，合格/不合格
     * @return ： 匹配数据库记录条数
     */
    int checkRecords(int processId , boolean result);


}
