package com.hdbl.erp.service;

import com.hdbl.erp.dao.ProductProducingDao;
import com.hdbl.erp.entity.ProductProducing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ToolingProductService {

    @Autowired
    ProductProducingDao productProducingDao;

    /**
     * 获取流程中的工装产品
     * @param searchMap
     * type==2 工装品
     * stateBegin 2-工艺设计，3-工艺审核，4-工艺审核未通过
     * stateEnd 5-生产中
     * @return
     */
    public List<HashMap> getToolingProductsUntreated(HashMap<String,Object> searchMap){
        searchMap.put("type",2);
        searchMap.put("stateBegin", 2);
        searchMap.put("stateEnd", 5);
        return productProducingDao.select(searchMap);
    }

    /**
     * 插入
     * @param list
     * @return 1-成功，2-失败
     */
    public int creatToolingProduct(List<ProductProducing> list){
        int result = productProducingDao.insert(list);
        if(result==list.size()){
            return 1;
        }else{
            return 0;
        }
    }

    /**
     * 修改工装产品单信息
     * @param condition
     * @param data
     * @return
     */
    public int modifyToolingProduct(HashMap<String,Object> condition,HashMap<String,Object> data){
        return productProducingDao.update(condition,data);
    }


    /**
     * 删除工装产品单
     * @param target
     * @return
     */
    public int removeToolingProduct(HashMap<String,Object> target){
        if(canRemove((int)target.get("id"))){
            return productProducingDao.delete(target);
        }
        return 0;
    }

    /**
     * 判断可否删除
     * 如果在[2,3,4] 工艺设计、工艺审核、审核未通过阶段阶段，可以修改，其他则不行
     * @param id 待删除的工装品id
     * @return true or false
     */
    private boolean canRemove(int id){
        HashMap<String,Object> map = new HashMap<>();
        map.put("id",id);
        HashMap<String,Object> resultMap = productProducingDao.select(map).get(0);
        int state = (int)resultMap.get("state");
        if(state>=2&&state<=4){
            return true;
        }
        return false;
    }
}
