package com.biao.service.material.service;

import com.biao.entity.material.MaterialDO;
import com.biao.entity.material.MaterialRecordDO;
import com.biao.param.request.material.ListMaterialRecordDTO;

import java.util.List;

/**
 * @author : kooing
 * @date : 2018/4/24 - 12:03
 * @desription :
 * @update by :
 */
public interface MaterialRecordService {
    /**
     * @author      : kooing
     * @Date        : 2018/4/24 12:15
     * @Desription  : 增加原料纪录
     * @return      :
     */
    public void insertMaterialRecord(MaterialRecordDO materialRecordDO);

    /**
     * @author      : kooing
     * @Date        : 2018/4/24 12:16
     * @Desription  : 删除原料纪录
     * @return      :
     */
    public void deleteMaterialRecord(MaterialRecordDO materialRecordDO);

    /**
     * @author      : kooing
     * @Date        : 2018/4/24 12:17
     * @Desription  : 修改原料纪录
     * @return      :
     */
    public void updateMaterialRecord(MaterialRecordDO materialRecordDO);

    /**
     * @author      : kooing
     * @Date        : 2018/4/24 12:19
     * @Desription  : 查询原料纪录
     * @return      :
     */
    public List<MaterialRecordDO> listMaterialRecord(ListMaterialRecordDTO listMaterialRecordDTO);


}
