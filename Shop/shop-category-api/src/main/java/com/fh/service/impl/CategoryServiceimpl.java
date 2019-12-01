package com.fh.service.impl;

import com.fh.bean.Category;
import com.fh.mapper.CategoryMapper;
import com.fh.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by AintccOut on 2019/11/25.
 */
@Service("categoryService")
public class CategoryServiceimpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Map<String, Object>> Query_Category() {
List<Category> categoryList = categoryMapper.Query_Category();
   //返回下面这个方法的数据pid = 0 和集合
        return getCategory("0",categoryList);
    }


    public   List<Map<String, Object>>  getCategory(String pid, List<Category> categoryList){
        List<Map<String, Object>> list = new ArrayList<>();
        categoryList.forEach(cate -> {
            Map<String, Object> map = null;
            if (pid.equals(cate.getPid())) {
                map = new HashMap<>();
                map.put("id", cate.getId());
                map.put("name", cate.getName());
                map.put("pid", cate.getPid());
                map.put("children", getCategory(cate.getId().toString(), categoryList));
            }
            if (map != null) {
                list.add(map);
            }
        });
        return list;
    }
}
