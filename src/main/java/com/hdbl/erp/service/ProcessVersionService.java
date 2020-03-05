package com.hdbl.erp.service;



import com.hdbl.erp.dao.ProcessVersionDao;
import com.hdbl.erp.entity.ProcessVersionBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class ProcessVersionService {

    @Autowired
    ProcessVersionDao processVersionDao;

    /**
     * 获取指定的工艺版本
     * @param version_id : 指定工艺版本ID
     * @return
     */
    public ProcessVersionBean getProcessVersionById(int version_id){
        return processVersionDao.getVersionById(version_id);
    }

    /**
     * 获取指定产品的所有“逻辑存在的”工艺版本数据
     * @param product_id
     * @param type : 生产工艺/返修工艺
     * @return
     */
    public List<ProcessVersionBean> getVersionsByProduct(int product_id, int type){
        return processVersionDao.getVersionsByProduct(product_id, type, true);
    }

    /**
     * 提交工艺设计，进入工艺审核
     * @param product_id : 产品ID
     * @param version_id : 使用的工艺版本ID
     * @return
     */
    public int submitProcess(int product_id, int version_id){
        //
        return 0;
    }

    // 新建工艺工时表

    // 修改工艺工时表

    // 验证工艺工时表数据格式

    // 判断是否



//    /**
//     * 获取一个产品所有的工艺版本
//     * @param searchParam
//     * @return List<HashMap>
//     */
//    public List<HashMap> getProcessVersions(HashMap<String, Object> searchParam){
//        List<ProcessVersion> processVersionList = processVersionDao.select(searchParam);
//        List resultMap = new ArrayList();
//        for(ProcessVersion pv : processVersionList){
//            resultMap.add(getProcessVersion(pv.getId()));
//        }
//        return resultMap;
//    }

    /**
     * 获取产品指定的工艺版本
     * @param versionId
     * @return
     * ProcessVersion{
     *      version : ProcessVersion ,
     *      processes : [
     *          {   process : ProcessSequence ,
     *              equipHour : [ProcessHourBean]
     *          }
     *      ]
     * }
     */
//    public HashMap<String,Object> getProcessVersion(int versionId){
//        //获取所有工艺工时记录
//        HashMap<String, Object> searchParam = new HashMap<>();
//        searchParam.put("versionId", versionId);
//        List<ProcessVersion> processVersionList = processVersionDao.select(searchParam);
//        List<ProcessSequence> processSequenceList = processSequenceDao.select(searchParam);
//        List<ProcessHourBean> processHourList = processHourDao.getProcessHour(searchParam);
//        //封装返回
//        HashMap<String, Object> processVersionData = new HashMap<>();
//        processVersionData.put("version",processVersionList.get(0));
//        ArrayList processesList = new ArrayList();
//        for(ProcessSequence ps : processSequenceList){
//            HashMap<String, Object> processSequenceData = new HashMap<>();
//            processSequenceData.put("process",ps);
//            ArrayList equipHourList = new ArrayList();
//            for(ProcessHourBean ph : processHourList){
//                if(ph.getProcessSequenceId()==ps.getId()){
//                    equipHourList.add(ph);
//                }
//            }
//            processSequenceData.put("equipHour",equipHourList);
//            processesList.add(processSequenceData);
//        }
//        processVersionData.put("processes",processesList);
//        return processVersionData;
//    }

//    public void addNewVersion(){}




//
//    public ProcessVersion create(HashMap<String,Object> proc){
//        /**
//         * 创建一个工艺工时版本
//         * param:proc工艺工时参数
//         * return c创建成功的工艺工时
//         */
//        ProcessVersion pv = this.isFormat(proc);
//        if(pv==null)return null;
//        if(this.confit(pv))return null;
//        // TODO 新建逻辑并返回
//        return null;
//    }
//    private boolean confit(ProcessVersion proc){
//        // TODO 查重逻辑;
//        return false;
//    }


//    private ProcessVersion isFormat(HashMap<String,Object> proc){
//        /**
//         * 判断hashmap是否是合理的工艺工时格式
//         * param:proc 输入的工艺工时
//         * return：null->格式不正确 !null->格式正确
//         */
//        return null;
//    }


//    private ArrayList<ProcessVersion> search(ProcessVersion proc){
//        /**
//         * 查询工艺工时
//         * param:proc要查询的数据bean
//         * param:是用or模式还是用and模式 根据用途具体讨论是否启用
//         */
//        // TODO 查寻逻辑
//        return null;
//    }
}
