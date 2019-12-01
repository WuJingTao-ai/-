package cn.zjs.service.impl;

import cn.zjs.dao.PageDao;
import cn.zjs.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by AintccOut on 2019/11/21.
 */@Service
public class PageServiceimpl implements PageService {
     @Autowired
     private PageDao pageDao;
}
