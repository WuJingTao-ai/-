package com.fh.service.impl;

import com.fh.bean.ProductParamter;
import com.fh.bean.TShopProduct;
import com.fh.mapper.ProductMapper;
import com.fh.service.ProductService;
import com.fh.utlis.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceimpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public PageBean<TShopProduct> productService(PageBean<TShopProduct> page, ProductParamter paramter) {
        //查询出总条数
        Long count = productMapper.queryProductCount( paramter );
        //统计条数方法
        page.setRecordsFiltered( count );
        //统计总页数
        page.setRecordsTotal( count );
        //查询分页数据
        List<TShopProduct> productList = productMapper.queryList( page, paramter );
        page.setData( productList );
        return page;
    }

    @Override
    public Object getProductById(Integer productId) {
        TShopProduct product = productMapper.getProductById( productId );
        return product;
    }

    @Override
    public PageBean<TShopProduct> query(PageBean<TShopProduct> page) {
        //查询出总条数
        Long count = productMapper.queryCount();
        //统计条数方法
        page.setRecordsFiltered( count );
        //统计总页数
        page.setRecordsTotal( count );
        //查询分页数据
        List<TShopProduct> productList = productMapper.querylist( page );
        page.setData( productList );
        return page;
    }

}
