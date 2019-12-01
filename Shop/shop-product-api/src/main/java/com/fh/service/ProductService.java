package com.fh.service;

import com.fh.bean.ProductParamter;
import com.fh.bean.TShopProduct;
import com.fh.utlis.PageBean;

public interface ProductService {
    PageBean<TShopProduct> productService(PageBean<TShopProduct> page, ProductParamter paramter);

    Object getProductById(Integer productId);

    PageBean<TShopProduct> query(PageBean<TShopProduct> page);
}
