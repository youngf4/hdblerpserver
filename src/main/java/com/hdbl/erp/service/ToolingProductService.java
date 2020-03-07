package com.hdbl.erp.service;

import com.hdbl.erp.dao.ProductBeanDao;
import com.hdbl.erp.dao.ProductProducingDao;
import com.hdbl.erp.entity.ProductBean;
import com.hdbl.erp.entity.ProductProducingToolingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToolingProductService {

    @Autowired
    ProductBeanDao productBeanDao;

    @Autowired
    ProductProducingDao productProducingDao;


    /**
     * 按照指定的三个条件（或少）分页查询工装产品下单生产记录
     *
     * @param toolingProduct : 指定查询条件封装对象
     * @param page           : 页码
     * @param pageSize       : 页宽
     * @return 返回查询到的工装产品下单生产记录列表
     */
    // TODO 调用时指定默认页码页宽
    public List<ProductProducingToolingDTO> getToolingProducts(ProductProducingToolingDTO toolingProduct, int page, int pageSize) {
        return productProducingDao.getToolingProducts(toolingProduct, (page - 1) * pageSize, pageSize);
    }


    /**
     * 工装产品下单
     *
     * @param toolingProduct : 工装产品数据传输对象
     * @return : 返回新增工装产品生产记录
     */
    // TODO 调用时对数据进行约束，保证ToolingProduct中的drawingNumber、name、materialQuality、productType必须有值
    public ProductProducingToolingDTO orderToolingProduct(ProductProducingToolingDTO toolingProduct) {
        // 获取工装产品ID，如果没有就新建
        ProductBean product = productBeanDao.getProductByDrawing(toolingProduct.getDrawingNumber());
        if (product == null) {
            product = new ProductBean(toolingProduct);
            productBeanDao.addNewProduct(product);
            // System.out.println(product.getId()); //成功返回插入记录的id
        }
        toolingProduct.setProductId(product.getId());
        // 工装产品下单
        productProducingDao.addToolingProductToProducing(toolingProduct);
        return toolingProduct;
    }

    /**
     * 删除工装产品下单生产记录（单条）
     *
     * @param toolingProduct : 工装产品下单生产记录
     * @return : 删除的工装产品下单记录ID
     * -1 产品正在生产
     * -2 产品不存在
     * id 删除产品ID
     */
    public int removeToolingProduct(ProductProducingToolingDTO toolingProduct) {
        //查询到工装产品记录
        toolingProduct = productProducingDao.getToolingProducrById(toolingProduct.getId());
        // 判断是否可删除，可删除状态：2-工艺设计，4-工艺审核未通过
        if(toolingProduct == null){
            return -2;
        }
        int state = toolingProduct.getState();
        if (state == 2 || state == 4) {
            // 执行逻辑删除，返回
            productProducingDao.removeToolingProductById(toolingProduct.getId());
            return toolingProduct.getId();
        }
        // 不允许删除返回
        return -1;
    }

//    取消多条删除功能，只能单条删除
//    /**
//     * 删除工装产品下单生产记录（多条）
//     *
//     * @param toolingProductList : 工装产品下单生产记录列表
//     * @param requesterId        : 请求人ID
//     * @return : 已删除的工装产品下单生产记录ID列表
//     */
//    public List<Integer> removeToolingProducts(List<ProductProducingToolingDTO> toolingProductList, int requesterId) {
//        List<Integer> removedIdList = new ArrayList<>();
//        for (ProductProducingToolingDTO toolingProduct : toolingProductList) {
//            int result = removeToolingProduct(toolingProduct, requesterId);
//            if (result > 0) {
//                removedIdList.add(result);
//            }
//        }
//        return removedIdList;
//    }

}
