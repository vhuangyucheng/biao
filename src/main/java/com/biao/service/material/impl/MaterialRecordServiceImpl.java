package com.biao.service.material.impl;

import com.biao.dao.material.MaterialMapper;
import com.biao.dao.material.MaterialRecordMapper;
import com.biao.entity.accessories.AccessoriesDO;
import com.biao.entity.accessories.AccessoriesRecordDO;
import com.biao.entity.material.MaterialDO;
import com.biao.entity.material.MaterialRecordDO;
import com.biao.param.request.material.ListMaterialRecordDTO;
import com.biao.service.accession.code.ResultCode;
import com.biao.service.accession.exception.AccessoriesException;
import com.biao.service.material.exception.MaterialException;
import com.biao.service.material.service.MaterialRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : kooing
 * @date : 2018/4/24 - 12:08
 * @desription :
 * @update by :
 */
@Service
public class MaterialRecordServiceImpl implements MaterialRecordService {
    @Autowired
    MaterialRecordMapper materialRecordMapper;
    @Autowired
    MaterialMapper materialMapper;

    @Transactional(rollbackFor = {MaterialException.class})
    @Override
    public void insertMaterialRecord(MaterialRecordDO materialRecordDO) {
        //约束
        //增加纪录要看原料数量
        insertStorage(materialRecordDO);
        //业务
        materialRecordMapper.insertSelective(materialRecordDO);
    }

    @Transactional(rollbackFor = {MaterialException.class})
    @Override
    public void deleteMaterialRecord(MaterialRecordDO materialRecordDO) {
        //约束条件
        MaterialRecordDO materialRecordTemp = materialRecordMapper.getMaterialRecord(materialRecordDO);
        if(materialRecordTemp == null){
            throw new MaterialException(ResultCode.CODE_RECORD, ResultCode.CODE_RECORD);
        }
        //减少库存
        deleteStorage(materialRecordTemp);
        materialRecordMapper.deleteByPrimaryKey(materialRecordDO.getMaterialRecordId());
    }

    @Transactional(rollbackFor = {MaterialException.class})
    @Override
    public void updateMaterialRecord(MaterialRecordDO materialRecordDO) {
        //约束条件
        //根据id获得纪录
        MaterialRecordDO materialRecordTemp = materialRecordMapper.getMaterialRecord(materialRecordDO);
        if(materialRecordTemp == null){
            throw new AccessoriesException(ResultCode.CODE_RECORD, ResultCode.MSG_RECORD);
        }
        //获得旧纪录了
        int nowNum = materialRecordTemp.getMaterialRecordTransmission();
        //获得结果纪录：旧纪录-修改后记录
        int resultNum = nowNum - materialRecordDO.getMaterialRecordTransmission();
        //对比修改记录,比旧纪录多了就减少库存，比就记录少了就增加库存
        if (resultNum <= 0) {
            //把新结果放进去(绝对值
            materialRecordTemp.setMaterialRecordTransmission(Math.abs(resultNum));
            insertStorage(materialRecordTemp);
        } else {
            //把新结果放进去(绝对值
            materialRecordTemp.setMaterialRecordTransmission(Math.abs(resultNum));
            deleteStorage(materialRecordTemp);
        }
        //业务
        materialRecordMapper.updateByPrimaryKeySelective(materialRecordDO);
    }

    @Override
    public List<MaterialRecordDO> listMaterialRecord(ListMaterialRecordDTO listMaterialRecordDTO) {
        return materialRecordMapper.listMaterialRecord(listMaterialRecordDTO);
    }


    /**
     * @author      : kooing
     * @Date        : 2018/4/25 13:06
     * @Desription  : 增加纪录减少库的约束条件
     * @return      :
     */
    private void insertStorage(MaterialRecordDO materialRecordDO){
        //查出现在有多少
        int nowNum = materialMapper.getMaterial(materialRecordDO.getMaterialId()).getMeterialQuantity();
        //减了
        int resultNum = nowNum - materialRecordDO.getMaterialRecordTransmission();
        //减了少于0
        if (resultNum < 0) {
            throw new MaterialException(ResultCode.CODE_NUMBER, ResultCode.MSG_NUMBER);
        }
        //构造一个新的
        MaterialDO materialDO = new MaterialDO();
        materialDO.setMeterialQuantity(resultNum);
        materialDO.setMaterialId(materialRecordDO.getMaterialId());
        //更新
        materialMapper.updateByPrimaryKeySelective(materialDO);
    }
    /**
     * @return :
     * @author : kooing
     * @Date : 2018/4/22 20:07
     * @Desription : 减少纪录
     */
    private void deleteStorage(MaterialRecordDO materialRecordDO) {
        //查出现在有多少
        int nowNum = materialMapper.getMaterial(materialRecordDO.getMaterialId()).getMeterialQuantity();
        //加回去
        int resultNum = nowNum + materialRecordDO.getMaterialRecordTransmission();
        //构造一个新的
        MaterialDO materialDO = new MaterialDO();
        materialDO.setMeterialQuantity(resultNum);
        materialDO.setMaterialId(materialRecordDO.getMaterialId());
        //更新
        materialMapper.updateByPrimaryKeySelective(materialDO);
    }
}
