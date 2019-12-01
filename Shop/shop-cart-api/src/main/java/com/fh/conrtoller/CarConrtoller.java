package com.fh.conrtoller;

import com.fh.baen.Cart;
import com.fh.baen.PageBean;
import com.fh.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by AintccOut on 2019/11/28.
 */
@RestController
@CrossOrigin(maxAge = 3600, origins = "http://localhost:8080")
@RequestMapping("/Cart")
public class CarConrtoller {
    @Autowired
    private CartService cartService;

    //查询
    @GetMapping("/dddd")
    public Object query(PageBean<Cart> page) {
        page = cartService.query( page );
        return page;
    }

    //删除
    @GetMapping("/{id}")
    public void delect(@PathVariable("id")int id) {
        cartService.delect( id );
    }


    //增加
    @GetMapping("add")
    public  void   add(Cart cart){
        cartService.add(cart);
    }
    @GetMapping
    public  Object    updata(int  id){
        Cart cart = cartService.updata(id);
        return cart;
    }

}