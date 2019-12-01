package cn.zjs.service;

import cn.zjs.entity.Leave;

import java.util.List;

/**
 * Created by AintccOut on 2019/11/12.
 */
public interface LeaveService {
    void Add_leave(Leave leave);


    List<Leave> Query_leave();
}
