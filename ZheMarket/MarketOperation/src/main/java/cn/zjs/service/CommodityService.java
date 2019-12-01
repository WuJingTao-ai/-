package cn.zjs.service;

import cn.zjs.entity.Commodity;
import cn.zjs.utlis.PageEntity;

import java.util.Map;

/**
 * Created by AintccOut on 2019/11/14.
 */
public interface CommodityService {
    PageEntity<Commodity> Query_User(Map<String,Object> map);

    void Delect_Commodity(int id);

    Commodity UpDate_Commodity(int id);
}
