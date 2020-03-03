package com.hdbl.erp.service;

import com.hdbl.erp.dao.ProductProducingDao;
import com.hdbl.erp.entity.ProductProducing;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class ToolingProductService {

    @Autowired
    ProductProducingDao productProducingDao;

    public ArrayList getToolingProductList(){
        return null;
    }
}
