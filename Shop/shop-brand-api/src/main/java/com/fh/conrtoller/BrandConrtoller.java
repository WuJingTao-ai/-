package com.fh.conrtoller;

import com.fh.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by AintccOut on 2019/11/26.
 */
@RestController
@CrossOrigin(maxAge = 3600 ,origins = "http://localhost:8080")
@RequestMapping("/brands")
public class BrandConrtoller {
    @Autowired
    private BrandService brandService;


    @GetMapping("/{pid}")
    public Object Query_Brand_ByPid(@PathVariable("pid") Integer pid) {
        return brandService.Query_Brand_ByPid( pid );
    }

}
