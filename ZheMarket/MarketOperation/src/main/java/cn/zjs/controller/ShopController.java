package cn.zjs.controller;

import cn.zjs.service.ShopService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by AintccOut on 2019/11/24.
 */
@Controller
public class ShopController {
    @Resource
    private ShopService shopService;


}
