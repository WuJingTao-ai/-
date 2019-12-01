package com.fh.controller;

import com.fh.bean.ProductParamter;
import com.fh.bean.TShopProduct;
import com.fh.service.ProductService;
import com.fh.utlis.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@CrossOrigin(maxAge = 3600,origins = "http://localhost:8080")
public class ProductController {
    @Autowired
    private ProductService productService;


    @PostMapping("a")
    public   Object     Query_shop_Product(PageBean<TShopProduct> page, ProductParamter paramter){
        page=productService.productService(page,paramter);
        return page;
    }
    //查询分页数据
    @PostMapping("query")
    public  Object   query(PageBean<TShopProduct> page){
        page=productService.query(page);
        return page;
    }






}











