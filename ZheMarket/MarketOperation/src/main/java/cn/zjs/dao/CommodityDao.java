package cn.zjs.dao;

import cn.zjs.entity.Commodity;

import java.util.List;
import java.util.Map;

/**
 * Created by AintccOut on 2019/11/14.
 */
public interface CommodityDao {

    int Count_Commodity(Map<String,Object> map);

    List<Commodity> CommodityQuery(Map<String,Object> map);

    void Delect_Commodity(int id);

    Commodity UpDate_Commodity(int id);
}
