package cn.zjs.controller;

import cn.zjs.entity.User;
import cn.zjs.service.UserService;
import cn.zjs.utlis.PageEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by AintccOut on 2019/10/27.
 */
@Controller
public class UserContrller extends HttpServlet {
    @Resource
    private UserService userService;
    private Map<String, Object> map;



    /*登陆拦截*/


    @ResponseBody
    @RequestMapping("LoginUser")
    public Map<String, Object> LongUser(User user, String code, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        Map<String, Object> usermap = new HashMap<String, Object>();
        String sessionCode = request.getSession().getAttribute( "code" ).toString();
        //验证验证码
        if (code != null && !"".equals( code ) && sessionCode != null && !"".equals( sessionCode )) {
            //验证验证码
            if (code.equalsIgnoreCase( sessionCode )) {
                //账号验证是否重复  获取username
                User us = userService.getUserByName( user.getUserName() );
                //证是否为空
                if (us != null) {
                    //验证密码是否错误
                    if (us.getUserPasswrod().equals( user.getUserPasswrod() ) && user.getUserPasswrod() != null) {
                        //验证码正确
                        //账号正确
                        //密码正确
                        session.setAttribute( "user", user );
                        usermap.put( "login", 1 );
                    } else {
                        //密码错误
                        usermap.put( "login", 5 );
                    }

                } else {
                    //用户名为空或不正确
                    usermap.put( "login", 4 );
                }
            } else {
                //验证码错误
                usermap.put( "login", 2 );
            }
        } else {
            //验证码错误  为空或错误
            usermap.put( "login", 3 );
        }
        return usermap;
    }



    //去往展示
    @RequestMapping("To_index")
    public String To_index() {
        return "index";
    }

    @RequestMapping("Query_Userss")
    public ModelAndView Query_User(
            @RequestParam(defaultValue = "1") Integer pageNum,
            @RequestParam(defaultValue = "5") Integer pageSize,
            String name) {
        ModelAndView mvc = new ModelAndView();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put( "pageSize", pageSize );
        map.put( "pageNum", pageNum );
        map.put( "name", name );
        PageEntity<User> pager = userService.Query_User( map );
        mvc.setViewName( "UserS/user" );
        mvc.addObject( "pager", pager );
        return mvc;
    }
/*logintou夹短信验证*/
    @RequestMapping("logintou")
    public   String   logintou(){



        return "";
    }
    @RequestMapping("Technologicalprocess")
    public  String  Technologicalprocess(){
        return "Technologicalprocess/Technologicalprocess";
    }
}