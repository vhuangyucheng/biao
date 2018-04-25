package com.biao.service.accession.impl;

import com.biao.dao.accessories.AccessoriesMapper;
import com.biao.dao.accessories.AccessoriesRecordMapper;
import com.biao.entity.accessories.AccessoriesDO;
import com.biao.entity.accessories.AccessoriesRecordDO;
import com.biao.param.request.accession.ListAccessoriesRecordDTO;
import com.biao.service.accession.service.AccessoriesRecordService;
import com.biao.service.accession.code.ResultCode;
import com.biao.service.accession.exception.AccessoriesException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : kooing
 * @date : 2018/4/22 - 15:41
 * @desription :
 * @update by :
 */
@Service
public class AccessoriesRecordServiceImpl implements AccessoriesRecordService {
    @Autowired
    AccessoriesRecordMapper accessoriesRecordMapper;
    @Autowired
    AccessoriesMapper accessoriesMapper;

    @Transactional(rollbackFor = {AccessoriesException.class})
    @Override
    public void insertAccessories(AccessoriesRecordDO accessoriesRecordDO) {
        //约束条件
        insertStorage(accessoriesRecordDO);
        //业务
        accessoriesRecordMapper.insertSelective(accessoriesRecordDO);
    }

    @Override
    public void deleteAccessories(AccessoriesRecordDO accessoriesRecordDO) {
        //约束条件
        AccessoriesRecordDO accessoriesRecordDOTemp = accessoriesRecordMapper.getAccessoriesRecord(accessoriesRecordDO);
        if(accessoriesRecordDOTemp == null){
            throw new AccessoriesException(ResultCode.CODE_RECORD, ResultCode.CODE_RECORD);
        }
        //减少库存
        deleteStorage(accessoriesRecordDOTemp);
        //业务
        accessoriesRecordMapper.deleteByPrimaryKey(accessoriesRecordDO.getAccessoriesRecordId());
    }

    @Transactional(rollbackFor = {AccessoriesException.class})
    @Override
    public void updateAccessories(AccessoriesRecordDO accessoriesRecordDO) {
        //约束条件
        //根据id获得纪录
        AccessoriesRecordDO accessoriesRecordDOTemp = accessoriesRecordMapper.getAccessoriesRecord(accessoriesRecordDO);
        if(accessoriesRecordDOTemp == null){
            throw new AccessoriesException(ResultCode.CODE_RECORD, ResultCode.MSG_RECORD);
        }
        //获得旧纪录了
        int nowNum = accessoriesRecordDOTemp.getAccessoriesTransmission();
        //获得结果纪录：旧纪录-修改后记录
        int resultNum = nowNum - accessoriesRecordDO.getAccessoriesTransmission();
        //对比修改记录,比旧纪录多了就减少库存，比就记录少了就增加库存
        if (resultNum <= 0) {
            //把新结果放进去(绝对值
            accessoriesRecordDOTemp.setAccessoriesTransmission(Math.abs(resultNum));
            insertStorage(accessoriesRecordDOTemp);
        } else {
            //把新结果放进去(绝对值
            accessoriesRecordDOTemp.setAccessoriesTransmission(Math.abs(resultNum));
            deleteStorage(accessoriesRecordDOTemp);
        }
        //业务
        accessoriesRecordMapper.updateByPrimaryKeySelective(accessoriesRecordDO);
    }

    @Override
    public List<AccessoriesRecordDO> listAccessories(ListAccessoriesRecordDTO listAccessoriesRecordDTO) {
        return accessoriesRecordMapper.listAccessoriesRecord(listAccessoriesRecordDTO);
    }

    /**
     * @return :
     * @author : kooing
     * @Date : 2018/4/22 20:07
     * @Desription : 增加纪录
     */
    private void insertStorage(AccessoriesRecordDO accessoriesRecordDO) {
        //查出现在有多少
        int nowNum = accessoriesMapper.getAccessories(accessoriesRecordDO.getAccessoriesId()).getAccessoriesQuantityReal();
        //减了
        int resultNum = nowNum - accessoriesRecordDO.getAccessoriesTransmission();
        //减了少于0
        if (resultNum < 0) {
            throw new AccessoriesException(ResultCode.CODE_NUMBER, ResultCode.MSG_NUMBER);
        }
        //构造一个新的
        AccessoriesDO accessoriesDO = new AccessoriesDO();
        accessoriesDO.setAccessoriesQuantityReal(resultNum);
        accessoriesDO.setAccessoriesId(accessoriesRecordDO.getAccessoriesId());
        //更新
        accessoriesMapper.updateByPrimaryKeySelective(accessoriesDO);
    }

    /**
     * @return :
     * @author : kooing
     * @Date : 2018/4/22 20:07
     * @Desription : 减少纪录
     */
    private void deleteStorage(AccessoriesRecordDO accessoriesRecordDO) {
        //查出现在有多少
        int nowNum = accessoriesMapper.getAccessories(accessoriesRecordDO.getAccessoriesId()).getAccessoriesQuantityReal();
        //加回去
        int resultNum = nowNum + accessoriesRecordDO.getAccessoriesTransmission();
        //构造一个新的
        AccessoriesDO accessoriesDO = new AccessoriesDO();
        accessoriesDO.setAccessoriesQuantityReal(resultNum);
        accessoriesDO.setAccessoriesId(accessoriesRecordDO.getAccessoriesId());
        //更新
        accessoriesMapper.updateByPrimaryKeySelective(accessoriesDO);
    }
}
