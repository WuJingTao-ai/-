package com.fh.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by AintccOut on 2019/11/25.
 */
@Repository
@Mapper
public interface CategoryMapper {

    List Query_Category();
}
