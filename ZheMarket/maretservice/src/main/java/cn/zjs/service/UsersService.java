package cn.zjs.service;

import cn.zjs.entity.User;

import java.util.List;

/**
 * Created by AintccOut on 2019/11/18.
 */
public interface UsersService {

    List Query();

    void Add_Users(User user);

    List Query_type();

    List Query_Thelabe();
}
