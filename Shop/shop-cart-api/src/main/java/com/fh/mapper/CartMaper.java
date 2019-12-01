package com.fh.mapper;

import com.fh.baen.Cart;
import com.fh.baen.PageBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by AintccOut on 2019/11/28.
 */
@Mapper
@Repository
public interface CartMaper {

    Long queryCount();

    List<Cart> querylist(@Param("page")PageBean<Cart> page);

    void delect(@Param("id")int id);

    void add(Cart cart);
}
