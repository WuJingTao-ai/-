package cn.zjs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.UnsupportedEncodingException;

/**
 * Created by AintccOut on 2019/11/21.
 */
@Controller
@RequestMapping("wed")
public class PageController {
    /*调用回显导航栏*/
    @RequestMapping("query")
    public String query(ModelMap mapl) throws UnsupportedEncodingException {
        String s = new String(HttpRequestUtil.doGet("http://localhost:8999/Thelabel/Thelabel_Query",null).getBytes("iso8859-1"), "utf-8");
        mapl.put( "info", s );
        return "a";
    }

}
