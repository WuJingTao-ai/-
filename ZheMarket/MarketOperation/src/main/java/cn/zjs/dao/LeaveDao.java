package cn.zjs.dao;

import cn.zjs.entity.Leave;

import java.util.List;

/**
 * Created by AintccOut on 2019/11/12.
 */
public interface LeaveDao {
    void Add_leave(Leave leave);


    List<Leave> Query_leave();
}
