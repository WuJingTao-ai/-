package cn.zjs.controller;

import cn.zjs.entity.Leave;
import cn.zjs.service.LeaveService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by AintccOut on 2019/11/12.
 */@Controller
public class LeaveContrller {
     @Resource
    private LeaveService leaveService;

    //去往请假页面
    @RequestMapping("To_leave")
    public   String  To_leave(){
        return "Technologicalprocess/leaveadd";
    }
  @RequestMapping("Add_leave")
    public  String  Add_leave(Leave  leave ){
       leaveService.Add_leave(leave);
        return "index";
  }
    @RequestMapping("Query_leave")
    public ModelAndView Query_leave(){
        ModelAndView mv = new ModelAndView();
        List<Leave>leaveist = leaveService.Query_leave();
        mv.setViewName("Technologicalprocess/leave");
        mv.addObject("leaveist", leaveist);
        return mv;
    }
    @RequestMapping("Receipt")
    public  String  Receipt(){
        return "Technologicalprocess/Receipt";
    }
}
