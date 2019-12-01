package com.fh.controller;

import com.fh.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by AintccOut on 2019/11/25.
 */
@RestController
@CrossOrigin(maxAge = 3600, origins = "http://localhost:8080")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    /*查询出导航栏数据*/
    @GetMapping("Query_Category_Type")
    public  List   Query_Category(){
      List  list = categoryService.Query_Category();
      return list;

    }



}
