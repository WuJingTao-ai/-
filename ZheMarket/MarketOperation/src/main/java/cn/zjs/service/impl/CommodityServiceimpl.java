package cn.zjs.service.impl;

import cn.zjs.dao.CommodityDao;
import cn.zjs.entity.Commodity;
import cn.zjs.service.CommodityService;
import cn.zjs.utlis.PageEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by AintccOut on 2019/11/14.
 */
@Service
public class  CommodityServiceimpl implements CommodityService {
    @Resource
    private CommodityDao commodityDao;

    @Override
    public PageEntity<Commodity> Query_User(Map<String, Object> map) {
        int count = commodityDao.Count_Commodity( map );
        PageEntity<Commodity> pageBean = new PageEntity<Commodity>( ( Integer ) map.get( "pageNum" ), ( Integer ) map.get( "pageSize" ), ( int ) count );
        map.put( "startIndex", pageBean.getStartIndex() );
        List<Commodity> list = commodityDao.CommodityQuery( map );
        pageBean.setList( list );
        return pageBean;
    }

    @Override
    public void Delect_Commodity(int id) {
        commodityDao.Delect_Commodity(id);
    }

    @Override
    public Commodity UpDate_Commodity(int id) {
        return commodityDao.UpDate_Commodity(id);
    }
}
