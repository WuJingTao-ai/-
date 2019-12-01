package cn.zjs.service.impl;

import cn.zjs.mapper.Thelabelmapper;
import cn.zjs.service.ThelabelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by AintccOut on 2019/11/21.
 */
@Service
public class ThelabelServiceimpl implements ThelabelService {
    @Resource
    private Thelabelmapper thelabelmapper;

    @Override
    public List Thelabel_Query() {
        return thelabelmapper.Thelabel_Query();
    }
}
