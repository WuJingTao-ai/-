package com.fh.service;

import com.fh.baen.Cart;
import com.fh.baen.PageBean;

/**
 * Created by AintccOut on 2019/11/28.
 */
public interface CartService {

    PageBean<Cart> query(PageBean<Cart> page);

    void delect(int id);

    void add(Cart cart);

    Cart updata(int id);


}
