package cn.zjs.contrller;

import cn.zjs.entity.Thelabel;
import cn.zjs.service.ThelabelService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by AintccOut on 2019/11/21.
 */
@RestController
@RequestMapping("Thelabel")
public class ThelabelContrller {
    @Resource
    private ThelabelService thelabelService;

    /*获取导航栏父类*/
   //@RequestMapping(value = "Thelabel_Query", method = RequestMethod.GET)
   @GetMapping("Thelabel_Query")
   @CrossOrigin(maxAge = 3600,origins = "http://127.0.0.1:")
    public List<Thelabel> Thelabel_Query() {
        List list = thelabelService.Thelabel_Query();
        return list;
    }


}
