package com.biao.dao.material;

import com.biao.entity.material.MaterialDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface MaterialMapper {
    int deleteByPrimaryKey(Long materialId);

    int insert(MaterialDO record);

    int insertSelective(MaterialDO record);

    MaterialDO selectByPrimaryKey(Long materialId);

    int updateByPrimaryKeySelective(MaterialDO record);

    int updateByPrimaryKey(MaterialDO record);


    /**
     * @author      : kooing
     * @Date        : 2018/4/24 12:28
     * @Desription  : 原料列表
     * @return      :
     */
    List<MaterialDO> listMaterial(MaterialDO materialDO);

    /**
     * @author      : kooing
     * @Date        : 2018/4/25 13:41
     * @Desription  : 单个原料
     * @return      :
     */
    MaterialDO getMaterial(Long materialDOId);
}