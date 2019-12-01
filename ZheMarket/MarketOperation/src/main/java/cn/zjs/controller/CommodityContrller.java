package cn.zjs.controller;

import cn.zjs.entity.Commodity;
import cn.zjs.service.CommodityService;
import cn.zjs.utlis.PageEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by AintccOut on 2019/11/14.
 */
@Controller
public class CommodityContrller {
    @Resource
    private CommodityService commodityService;//

    /*分页查询*/
    @RequestMapping("QueryCommodity")
    public ModelAndView QueryCommodity(
            @RequestParam(defaultValue = "1") Integer pageNum,
            @RequestParam(defaultValue = "5") Integer pageSize,
            String name) {
        ModelAndView mvc = new ModelAndView();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put( "pageSize", pageSize );
        map.put( "pageNum", pageNum );
        map.put( "name", name );
        PageEntity<Commodity> pager = commodityService.Query_User( map );
        mvc.setViewName( "Commodity/Commodity" );
        mvc.addObject( "pager", pager );
        return mvc;
    }

    /*删除*/
    @RequestMapping("Delect_Commodity")
    public String Delect_Commodity(int id) {
        commodityService.Delect_Commodity(id);
        return "/QueryCommodity";
    }

    /*回显修改*/
    @RequestMapping("UpDate_Commodity")
    public String UpDate_Commodity(int id,HttpServletRequest reuqest) {
        Commodity commodity  = commodityService.UpDate_Commodity(id);
        reuqest.setAttribute("commodity", commodity);
        return "/Commodity/UpdateCommodity";
    }



}
