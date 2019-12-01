package com.fh.controller;

import com.fh.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/productSearch")
public class ProductSearchController {

    @Resource
    private ProductService productService;

    @GetMapping("/{productId}")
    public Object getProductById(@PathVariable Integer productId) {
        return productService.getProductById(productId);
    }
}
