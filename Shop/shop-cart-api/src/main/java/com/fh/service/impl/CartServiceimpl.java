package com.fh.service.impl;

import com.fh.baen.Cart;
import com.fh.baen.PageBean;
import com.fh.mapper.CartMaper;
import com.fh.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by AintccOut on 2019/11/28.
 */
@Service("cartService")
public class CartServiceimpl implements CartService {
    @Autowired
    private CartMaper cartMaper;

    @Override
    public PageBean<Cart> query(PageBean<Cart> page) {
        Long  count   = cartMaper.queryCount();
        page.setRecordsTotal(count);
        page.setRecordsFiltered(count);
        List<Cart> list = cartMaper.querylist(page);
        page.setData(list);
        return page;
    }

    @Override
    public void delect(int id) {
        cartMaper.delect(id);
    }

    @Override
    public void add(Cart cart) {
        cartMaper.add(cart);
    }

}
