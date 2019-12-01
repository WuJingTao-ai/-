package com.fh.mapper;

import com.fh.bean.ProductParamter;
import com.fh.bean.TShopProduct;
import com.fh.utlis.PageBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ProductMapper {

    Long queryProductCount(@Param("paramter") ProductParamter paramter);

    List<TShopProduct> queryList(@Param("page") PageBean<TShopProduct> page, @Param("paramter") ProductParamter paramter);

    TShopProduct getProductById(Integer productId);

    Long queryCount();

    List<TShopProduct> querylist(@Param("page") PageBean<TShopProduct> page);
}
