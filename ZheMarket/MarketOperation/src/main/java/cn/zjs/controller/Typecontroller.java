package cn.zjs.controller;

import cn.zjs.entity.Type;
import cn.zjs.service.TypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by AintccOut on 2019/11/10.
 */@Controller
public class Typecontroller {
    @Resource
    private TypeService typeService;
    /*查询*/
    @RequestMapping("Query_Type")
    public ModelAndView Query_Type (){
        ModelAndView mv = new ModelAndView();
       List<Type>   typeList = typeService.Query_Type();
        mv.setViewName("Type/Type");
        mv.addObject("type", typeList);
              return mv;
    }
    /*增加*/
    @RequestMapping("Add_Type")
    public  String   Add_Type( Type  type){
        typeService.Add_Type(type);
        return "redirect:/Query_Type";
    }
    /*删除*/
    @RequestMapping("Delect_Type")
    public   String  Delect_Type(int  id){
        typeService.Delect_Type(id);
        return "redirect:/Query_Type";
    }


    /*修改回显*/
    @RequestMapping("Up_Date_Type")
    public   ModelAndView  Up_Date_Type(int  id){
        ModelAndView mv = new ModelAndView();
        Type  type = typeService.Up_Date_Type(id);
        mv.setViewName("Type/UpDateType");
        mv.addObject("type", type);
        return mv;

    }

/*修改*/
    @RequestMapping("UpData_Add_Type")
    public   String    UpData_Add_Type(Type type){
        typeService.UpData_Add_Type(type);
        return "redirect:/Query_Type";
    }
    /*去往增加页面*/
    @RequestMapping("to_Typeadd")
    public  String  to_add(){
        return "/Type/AddType";
    }
}
