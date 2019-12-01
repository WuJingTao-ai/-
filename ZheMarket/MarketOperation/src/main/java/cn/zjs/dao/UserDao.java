package cn.zjs.dao;

import cn.zjs.entity.Shop;
import cn.zjs.entity.User;

import java.util.List;
import java.util.Map;

/**
 * Created by AintccOut on 2019/10/27.
 */
public interface UserDao {

    void Add_shop(Shop shop);

    List<Shop> Query_user(Map<String,Object> map);

    int CountQuery(Map<String,Object> map);


    void Delect_shop(String id);

    User getUserByName(String userName);

    int Count_UserQuery(Map<String,Object> map);

    List<User> UserQuery(Map<String,Object> map);
}
