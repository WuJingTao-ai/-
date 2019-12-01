package cn.zjs.service;

import cn.zjs.entity.Shop;
import cn.zjs.entity.User;
import cn.zjs.utlis.PageEntity;

import java.util.Map;

/**
 * Created by AintccOut on 2019/10/27.
 */
public interface UserService {


    void Add_shop(Shop shop);

    PageEntity<Shop> Query_shop(Map<String,Object> map);


    void Delect_shop(String id);

    User getUserByName(String userName);

    PageEntity<User> Query_User(Map<String,Object> map);
}
