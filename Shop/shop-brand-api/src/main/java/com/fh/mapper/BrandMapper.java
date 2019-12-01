package com.fh.mapper;

import com.fh.bean.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by AintccOut on 2019/11/26.
 */
@Mapper
@Repository
public interface BrandMapper {

    String Query_Brand_ByPid(Integer pid);

    List<Brand> queryBrandByCateId();

}
