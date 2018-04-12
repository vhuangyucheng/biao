package com.biao.dao.material;

import com.biao.entity.material.MaterialRecordDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface MaterialRecordMapper {
    int deleteByPrimaryKey(Long materialRecordId);

    int insert(MaterialRecordDO record);

    int insertSelective(MaterialRecordDO record);

    MaterialRecordDO selectByPrimaryKey(Long materialRecordId);

    int updateByPrimaryKeySelective(MaterialRecordDO record);

    int updateByPrimaryKey(MaterialRecordDO record);
}