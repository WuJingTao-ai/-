package cn.zjs.contrller;

import cn.zjs.entity.User;
import cn.zjs.service.UsersService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by AintccOut on 2019/11/18.
 */
@RestController
@RequestMapping("user")
public class UsersContrller {

    @Resource
    private UsersService userService;


  /*查询用户*/
    @GetMapping("Query")
    @CrossOrigin(maxAge = 3600,origins = "http://127.0.0.1:")
    public List<User> Query() {
        List list = userService.Query();
        return list;
    }

    /*注册*/
    @PutMapping("Add_Users")
    @CrossOrigin(maxAge = 3600,origins = "http://127.0.0.1:")
    public   String  Add_Users(User user){
        userService.Add_Users(user);
        return "";
    }
}
