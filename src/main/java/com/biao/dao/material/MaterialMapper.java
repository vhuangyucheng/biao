package com.biao.dao.material;

import com.biao.entity.material.MaterialDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface MaterialMapper {
    int deleteByPrimaryKey(Long materialId);

    int insert(MaterialDO record);

    int insertSelective(MaterialDO record);

    MaterialDO selectByPrimaryKey(Long materialId);

    int updateByPrimaryKeySelective(MaterialDO record);

    int updateByPrimaryKey(MaterialDO record);
}