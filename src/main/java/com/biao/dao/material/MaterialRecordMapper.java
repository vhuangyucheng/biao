package com.biao.dao.material;

import com.biao.entity.material.MaterialRecordDO;
import com.biao.param.request.material.ListMaterialRecordDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface MaterialRecordMapper {
    int deleteByPrimaryKey(Long materialRecordId);

    int insert(MaterialRecordDO record);

    int insertSelective(MaterialRecordDO record);

    MaterialRecordDO selectByPrimaryKey(Long materialRecordId);

    int updateByPrimaryKeySelective(MaterialRecordDO record);

    int updateByPrimaryKey(MaterialRecordDO record);


    /**
     * @author      : kooing
     * @Date        : 2018/4/25 13:09
     * @Desription  : 获得纪录列表
     * @return      :
     */
    List<MaterialRecordDO> listMaterialRecord(ListMaterialRecordDTO listMaterialRecordDTO);

    /**
     * @author      : kooing
     * @Date        : 2018/4/25 13:10
     * @Desription  : 获得单个原料纪录
     * @return      :
     */
    MaterialRecordDO getMaterialRecord(MaterialRecordDO materialRecordDO );
}