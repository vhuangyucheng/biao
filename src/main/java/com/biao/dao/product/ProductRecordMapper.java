package com.biao.dao.product;

import com.biao.entity.product.ProductRecordDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface ProductRecordMapper {
    int deleteByPrimaryKey(Long productRecordId);

    int insert(ProductRecordDO record);

    int insertSelective(ProductRecordDO record);

    ProductRecordDO selectByPrimaryKey(Long productRecordId);

    int updateByPrimaryKeySelective(ProductRecordDO record);

    int updateByPrimaryKey(ProductRecordDO record);
}