package com.hdbl.erp.service;


import com.hdbl.erp.dao.ProcessHourDao;
import com.hdbl.erp.dao.ProcessSequenceDao;
import com.hdbl.erp.dao.ProcessVersionDao;
import com.hdbl.erp.dao.ProductProducingDao;
import com.hdbl.erp.entity.ProcessHourBean;
import com.hdbl.erp.entity.ProcessSequenceBean;
import com.hdbl.erp.entity.ProcessVersionBean;
import com.hdbl.erp.entity.ProductBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessVersionService {

    @Autowired
    ProcessVersionDao processVersionDao;

    @Autowired
    ProcessSequenceDao processSequenceDao;

    @Autowired
    ProcessHourDao processHourDao;


    @Autowired
    ProductProducingDao productProducingDao;

    /**
     * 获取指定的工艺版本
     *
     * @param version_id : 指定工艺版本ID
     * @return
     */
    public ProcessVersionBean getProcessVersionById(int version_id) {
        return processVersionDao.getVersionById(version_id);
    }
    // TODO 在前端发送产品生产记录ID进行工艺数据查询时，在controller层判断其是否已经进行了工艺设计
    // 如果进行了工艺设计，则查询其投产的工艺版本
    // 如果将要进行工艺设计，则查询所有的工艺版本
    /**
     * 获取指定产品的所有“逻辑存在的”工艺版本数据
     *
     * @param product_id
     * @param type : 生产工艺/返修工艺
     * @return
     */
    public List<ProcessVersionBean> getVersionsByProduct(int product_id, int type) {
        return processVersionDao.getVersionsByProduct(product_id, type, true);
    }

    /**
     * 提交工艺设计==>进入工艺审核
     *
     * @param productPruducingId : 产品生产记录ID
     * @param versionId : 使用的工艺版本ID
     * @return : 状态码
     *        1：成功
     *        0：失败
     */
    public int submitProcess(int productPruducingId, int versionId) {
        int result = productProducingDao.updatePruductToProcessAudit(productPruducingId, versionId);
        if(result == 1){
            return 1;
        }
        return 0;
    }

    /**
     * 工艺路线审核
     * @param productProducingId : 产品生产记录ID
     * @param result : 审核结果
     * @return
     */
    public int auditProcess(int productProducingId, boolean result){
        if(result){
            productProducingDao.updateProductPruducingState(productProducingId,5);
        }else{
            productProducingDao.updateProductPruducingState(productProducingId,4);
        }
        return 1;
    }


    /**
     * 新建工艺工时表
     * @param newProcessVersion
     * @return
     */
    // TODO 需要在controller层关联产品和人员信息，并自动生成版本号
    public int addNewProcessVersion(ProcessVersionBean newProcessVersion){
        // 插入工艺版本表并获取主键，将主键与工序关联
        processVersionDao.insertNewProcessVersion(newProcessVersion);
        for(ProcessSequenceBean processSequence : newProcessVersion.getProcessSequenceList()){
            processSequence.setVersionId(newProcessVersion.getId());
        }
        // 插入工艺工序表并获取主键，将主键与工时关联，关联后插入工时记录
        processSequenceDao.insertNewProcessVersion(newProcessVersion.getProcessSequenceList());
        for(ProcessSequenceBean processSequence : newProcessVersion.getProcessSequenceList()){
            for(ProcessHourBean processHour : processSequence.getProcessHourList()){
                processHour.setProcessSequenceId(processSequence.getId());
            }
            processHourDao.insertNewProcessVersion(processSequence.getProcessHourList());
        }
        return 1;
    }


    // 修改工艺工时表


    /**
     * 删除工艺版本
     *
     * @param id : 要删除的工艺版本ID --- 注意不是版本号
     * @return : 状态代码
     * -1 : 工艺版本有产品投产
     * 1 : 删除成功
     */
    public int removeProcessVersion(int id) {
        // 判断是否处于可删除状态：即产品生产列表中该工艺版本有产品设计投产，状态>2
        if (productProducingDao.countProductsProducingByProcessVersion(id) > 0) {
            return -1;
        }
        // 逻辑删除，将其version_state设置为false
        processVersionDao.removeProcessVersionById(id);
        return 1;
    }



}
