package cn.zjs.service.impl;

import cn.zjs.dao.TypeDao;
import cn.zjs.entity.Type;
import cn.zjs.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by AintccOut on 2019/11/10.
 */@Service
public class TypeServiceimpl implements TypeService {
    @Resource
     private TypeDao typeDao;
    @Override
    public List<Type> Query_Type() {
        return typeDao.Query_Type();
    }

    @Override
    public void Add_Type(Type type) {
        Date date = new Date();
        type.setTypeDate(date);
        /*插入新增时间*/
        typeDao.Add_Type(type);
    }

    @Override
    public void Delect_Type(int id) {
      typeDao.Delect_Type(id);
    }

    @Override
    public Type Up_Date_Type(int id) {
        return typeDao.Up_Date_Type(id);
    }

    @Override
    public void UpData_Add_Type(Type type) {
        typeDao.UpData_Add_Type(type);
    }
}
