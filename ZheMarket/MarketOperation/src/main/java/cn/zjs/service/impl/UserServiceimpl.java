package cn.zjs.service.impl;

import cn.zjs.dao.UserDao;
import cn.zjs.entity.Shop;
import cn.zjs.entity.User;
import cn.zjs.service.UserService;
import cn.zjs.utlis.PageEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by AintccOut on 2019/10/27.
 */
@Service
public class UserServiceimpl implements UserService {
    @Resource
    private UserDao userDao;


    @Override
    public void Add_shop(Shop shop) {
        Date date = new Date();
        //存入用户注册时间
        /*十年老店都是这么来的*/
        shop.setUserDate(date);
        userDao.Add_shop(shop);
    }



    @Override
    public PageEntity<Shop> Query_shop(Map<String, Object> map) {
        int  count = userDao.CountQuery(map);
        PageEntity<Shop> pageBean = new PageEntity<Shop>((Integer)map.get("pageNum"),(Integer)map.get("pageSize"), (int) count);
        map.put("startIndex",pageBean.getStartIndex());
        List<Shop>  list = userDao.Query_user(map);
        pageBean.setList(list);
        return pageBean;
        }

    @Override
    public void Delect_shop(String id) {
        userDao.Delect_shop(id);
    }



    @Override
    public User getUserByName(String userName) {
        return userDao.getUserByName(userName);
    }

    @Override
    public PageEntity<User> Query_User(Map<String, Object> map) {
        int  count = userDao.Count_UserQuery(map);
        PageEntity<User> pageBean = new PageEntity<User>((Integer)map.get("pageNum"),(Integer)map.get("pageSize"), (int) count);
        map.put("startIndex",pageBean.getStartIndex());
        List<User>  list = userDao.UserQuery(map);
        pageBean.setList(list);
        return pageBean;
    }

}
