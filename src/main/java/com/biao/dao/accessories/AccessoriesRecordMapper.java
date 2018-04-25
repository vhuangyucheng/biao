package com.biao.dao.accessories;

import com.biao.entity.accessories.AccessoriesRecordDO;
import com.biao.param.request.accession.ListAccessoriesRecordDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccessoriesRecordMapper {
    int deleteByPrimaryKey(Long accessoriesRecordId);

    int insert(AccessoriesRecordDO record);

    int insertSelective(AccessoriesRecordDO record);

    AccessoriesRecordDO selectByPrimaryKey(Long accessoriesRecordId);

    int updateByPrimaryKeySelective(AccessoriesRecordDO record);

    int updateByPrimaryKey(AccessoriesRecordDO record);

    /**
     * @author      : kooing
     * @Date        : 2018/4/22 20:26
     * @Desription  : 纪录列表
     * @return      :
     */
    List<AccessoriesRecordDO> listAccessoriesRecord(ListAccessoriesRecordDTO listAccessoriesRecordDTO);


    /**
     * @author      : kooing
     * @Date        : 2018/4/22 20:27
     * @Desription  : 单个纪录
     * @return      :
     */
    AccessoriesRecordDO getAccessoriesRecord(AccessoriesRecordDO accessoriesRecordDO);
}