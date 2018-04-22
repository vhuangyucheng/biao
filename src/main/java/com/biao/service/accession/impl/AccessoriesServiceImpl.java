package com.biao.service.accession.impl;

import com.biao.dao.accessories.AccessoriesMapper;
import com.biao.entity.accessories.AccessoriesDO;
import com.biao.param.response.SuccessResponse;
import com.biao.service.accession.AccessoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : kooing
 * @date : 2018/4/22 - 13:34
 * @desription :
 * @update by :
 */
@Service
public class AccessoriesServiceImpl implements AccessoriesService {
    @Autowired
    AccessoriesMapper accessoriesMapper;

    @Override
    public void insertAccessories(AccessoriesDO accessoriesDO) {
        accessoriesMapper.insertSelective(accessoriesDO);
    }

    @Override
    public void deleteAccessories(AccessoriesDO accessoriesDO) {
        accessoriesMapper.deleteByPrimaryKey(accessoriesDO.getAccessoriesId());
    }

    @Override
    public void updateAccessories(AccessoriesDO accessoriesDO) {
        accessoriesMapper.updateByPrimaryKeySelective(accessoriesDO);
    }

    @Override
    public List<AccessoriesDO> listAccessories(AccessoriesDO accessoriesDO) {
        List<AccessoriesDO> accessoriesDOList = accessoriesMapper.listAccessories(accessoriesDO);
        return accessoriesDOList;
    }
}
