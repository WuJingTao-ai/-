package cn.zjs.mapper;

import cn.zjs.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by AintccOut on 2019/11/18.
 */
@Mapper
@Repository
public interface UsersMapper {

    public List Query();

    public void Add_Users(User user);

    public  List Query_type();

    public  List Query_Thelabe();
}
