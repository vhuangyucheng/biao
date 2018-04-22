package com.biao.dao.accessories;

import com.biao.entity.accessories.AccessoriesDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface AccessoriesMapper {
    int deleteByPrimaryKey(Long accessoriesId);

    int insert(AccessoriesDO record);

    int insertSelective(AccessoriesDO record);

    AccessoriesDO selectByPrimaryKey(Long accessoriesId);

    int updateByPrimaryKeySelective(AccessoriesDO record);

    int updateByPrimaryKey(AccessoriesDO record);

    /**
     * @author      : kooing
     * @Date        : 2018/4/22 14:00
     * @Desription  : 获得Accessories列表
     * @return      :
     */
    List<AccessoriesDO> listAccessories(AccessoriesDO accessoriesDO);

    /**
     * @author      : kooing
     * @Date        : 2018/4/22 19:38
     * @Desription  : 获得单个
     * @return      :
     */
    AccessoriesDO getAccessories(Long accessoriesId);
}