package cn.zjs.service.impl;

import cn.zjs.dao.ShopDao;
import cn.zjs.service.ShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by AintccOut on 2019/11/24.
 */
@Service
public class ShopServiceimpl implements ShopService {
    @Resource
   private ShopDao shopDao;



}
