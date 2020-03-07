package com.hdbl.erp.dao;

import com.hdbl.erp.entity.ProcessVersionBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProcessVersionDao {

    /**
     * 获取指定的工艺版本数据
     * @param id : 工艺版本ID
     * @return
     */
    ProcessVersionBean getVersionById(@Param("id") int id);

    /**
     * 获取指定产品的所有工艺版本数据
     * @param id : 产品ID
     * @param type : 工艺类型：生产/返修
     * @return
     */
    List<ProcessVersionBean> getVersionsByProduct(@Param("id") int id, @Param("type") int type, @Param("state") boolean state);


    // 删除工艺版本（逻辑删除）
    int removeProcessVersionById(int id);

    // 新建工艺版本
    int insertNewProcessVersion(@Param("newVersion") ProcessVersionBean newVersion);
}
