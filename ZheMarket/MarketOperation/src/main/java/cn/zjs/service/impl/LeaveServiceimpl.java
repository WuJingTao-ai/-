package cn.zjs.service.impl;

import cn.zjs.dao.LeaveDao;
import cn.zjs.entity.Leave;
import cn.zjs.service.LeaveService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by AintccOut on 2019/11/12.
 */@Service
public class LeaveServiceimpl implements LeaveService {
    @Resource
    private LeaveDao leaveDao;

    @Override
    public void Add_leave(Leave leave) {
        leaveDao.Add_leave(leave);
    }

    @Override
    public List<Leave> Query_leave() {
        return leaveDao.Query_leave();
    }

}
