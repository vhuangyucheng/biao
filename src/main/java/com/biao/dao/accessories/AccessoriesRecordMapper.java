package com.biao.dao.accessories;

import com.biao.entity.accessories.AccessoriesRecordDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface AccessoriesRecordMapper {
    int deleteByPrimaryKey(Long accessoriesRecordId);

    int insert(AccessoriesRecordDO record);

    int insertSelective(AccessoriesRecordDO record);

    AccessoriesRecordDO selectByPrimaryKey(Long accessoriesRecordId);

    int updateByPrimaryKeySelective(AccessoriesRecordDO record);

    int updateByPrimaryKey(AccessoriesRecordDO record);
}