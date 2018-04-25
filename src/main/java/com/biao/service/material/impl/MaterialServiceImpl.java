package com.biao.service.material.impl;

import com.biao.dao.material.MaterialMapper;
import com.biao.entity.material.MaterialDO;
import com.biao.service.material.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : kooing
 * @date : 2018/4/24 - 12:09
 * @desription :
 * @update by :
 */
@Service
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    MaterialMapper materialMapper;

    @Override
    public void insertMaterial(MaterialDO materialDO) {
        materialMapper.insertSelective(materialDO);
    }

    @Override
    public void deleteMaterial(MaterialDO materialDO) {
        materialMapper.deleteByPrimaryKey(materialDO.getMaterialId());
    }

    @Override
    public void updateMaterial(MaterialDO materialDO) {
        materialMapper.updateByPrimaryKeySelective(materialDO);
    }

    @Override
    public List<MaterialDO> listMaterial(MaterialDO materialDO) {
        List<MaterialDO> materialDOList = materialMapper.listMaterial(materialDO);
        return materialDOList;
    }
}
