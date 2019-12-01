package cn.zjs.service;

import cn.zjs.entity.Type;

import java.util.List;

/**
 * Created by AintccOut on 2019/11/10.
 */
public interface TypeService {

    void Add_Type(Type type);

    void Delect_Type(int id);

    Type Up_Date_Type(int id);

    void UpData_Add_Type(Type type);

    List<Type> Query_Type();
}
