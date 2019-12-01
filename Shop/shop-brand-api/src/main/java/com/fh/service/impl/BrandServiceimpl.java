package com.fh.service.impl;

import com.fh.bean.Brand;
import com.fh.mapper.BrandMapper;
import com.fh.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by AintccOut on 2019/11/26.
 */
@Service("brandService")
public class BrandServiceimpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> Query_Brand_ByPid(Integer pid) {
        List<Brand> brandBeans = new ArrayList<>();
        brandBeans = brandMapper.queryBrandByCateId();

        List<Brand> returnList = brandBeans.stream()
                .filter( brand -> brand.getCategoryId().equals( pid ) )
                .collect( Collectors.toList() );
        return returnList;

    }

}
