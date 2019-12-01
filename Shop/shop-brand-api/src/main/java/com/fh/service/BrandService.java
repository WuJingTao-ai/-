package com.fh.service;

import com.fh.bean.Brand;

import java.util.List;

/**
 * Created by AintccOut on 2019/11/26.
 */
public interface BrandService {
    List<Brand> Query_Brand_ByPid(Integer pid);

}
