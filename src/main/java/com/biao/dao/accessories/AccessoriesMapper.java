package com.biao.dao.accessories;

import com.biao.entity.accessories.AccessoriesDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface AccessoriesMapper {
    int deleteByPrimaryKey(Long accessoriesId);

    int insert(AccessoriesDO record);

    int insertSelective(AccessoriesDO record);

    AccessoriesDO selectByPrimaryKey(Long accessoriesId);

    int updateByPrimaryKeySelective(AccessoriesDO record);

    int updateByPrimaryKey(AccessoriesDO record);
}