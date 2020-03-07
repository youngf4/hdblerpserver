package com.hdbl.erp.controller;


import com.fasterxml.jackson.databind.util.JSONPObject;
import com.hdbl.erp.entity.ProductProducingToolingDTO;
import com.hdbl.erp.service.ToolingProductService;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/02/product/tooling")
public class ToolingProductController {

    @Autowired
    ToolingProductService toolingProductService;


    @GetMapping
    public List<ProductProducingToolingDTO> getToolingProduct(@RequestParam String page) {
        System.out.println("GetMapping params : " + page);
        return null;
    }

    /**
     * 删除工装产品生产记录
     * @param params
     * @return
     */
    @DeleteMapping
    public HashMap<String, Object> deleteToolingProduct(@RequestBody HashMap params) {
        HashMap<String, Object> resultMap = new HashMap<>();
        String success;
        String msg;
        int toolingProductId = (int) params.get("id");
        ProductProducingToolingDTO toolingProduct = new ProductProducingToolingDTO(toolingProductId);
        int result = toolingProductService.removeToolingProduct(toolingProduct);
        if (result == toolingProductId) {
            success = "success";
            msg = "ToolingProducr( id=" + toolingProductId +" ) is Deleted";
        }else if(result == -2){
            success = "false";
            msg = "ToolingProducr( id=" + toolingProductId +" ) is Nonexistent ";
        }else{
            success = "false";
            msg = "ToolingProducr( id=" + toolingProductId +" ) is Producing ";
        }
        resultMap.put("success",success);
        resultMap.put("msg",msg);
        return resultMap;
    }

}
