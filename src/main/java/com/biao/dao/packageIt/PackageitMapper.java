package com.biao.dao.packageIt;

import com.biao.entity.packageIt.PackageitDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface PackageitMapper {
    int deleteByPrimaryKey(Long packageId);

    int insert(PackageitDO record);

    int insertSelective(PackageitDO record);

    PackageitDO selectByPrimaryKey(Long packageId);

    int updateByPrimaryKeySelective(PackageitDO record);

    int updateByPrimaryKey(PackageitDO record);
}