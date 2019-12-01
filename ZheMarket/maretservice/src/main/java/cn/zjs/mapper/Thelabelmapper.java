package cn.zjs.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by AintccOut on 2019/11/21.
 */
@Mapper
@Repository
public interface Thelabelmapper {

    List Thelabel_Query();
}
