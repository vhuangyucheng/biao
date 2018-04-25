package com.biao.service.accession.service;

import com.biao.entity.accessories.AccessoriesRecordDO;
import com.biao.param.request.DataRequest;
import com.biao.param.request.accession.ListAccessoriesRecordDTO;

import java.util.List;

/**
 * @author : kooing
 * @date : 2018/4/22 - 14:30
 * @desription :
 * @update by :
 */
public interface AccessoriesRecordService {

    /**
     * @author      : kooing
     * @Date        : 2018/4/22 14:33
     * @Desription  : 增加辅料纪录
     * @return      :
     */
    public void insertAccessories(AccessoriesRecordDO accessoriesRecordDO);

    /**
     * @author      : kooing
     * @Date        : 2018/4/22 14:35
     * @Desription  : 删除辅料纪录
     * @return      :
     */
    public void deleteAccessories(AccessoriesRecordDO accessoriesRecordDO);

    /**
     * @author      : kooing
     * @Date        : 2018/4/22 14:37
     * @Desription  : 修改辅料纪录
     * @return      :
     */
    public void updateAccessories(AccessoriesRecordDO accessoriesRecordDO);

    /**
     * @author      : kooing
     * @Date        : 2018/4/22 15:42
     * @Desription  : 辅料纪录列表
     * @return      :
     */
    public List<AccessoriesRecordDO> listAccessories(ListAccessoriesRecordDTO listAccessoriesRecordDTO);
}
