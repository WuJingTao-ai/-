package cn.zjs.service.impl;

import cn.zjs.entity.User;
import cn.zjs.mapper.UsersMapper;
import cn.zjs.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by AintccOut on 2019/11/18.
 */
@Service
public class UsersServiceimpl implements UsersService {
    @Autowired
    private UsersMapper UserMapper;

    @Override
    public List Query() {
        return UserMapper.Query();
    }

    @Override
    public void Add_Users(User user) {
        UserMapper.Add_Users(user);
    }

    @Override
    public List Query_type() {
        return UserMapper.Query_type();
    }

    @Override
    public List Query_Thelabe() {
        return UserMapper.Query_Thelabe();
    }

}
