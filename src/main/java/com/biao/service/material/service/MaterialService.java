package com.biao.service.material.service;

import com.biao.entity.material.MaterialDO;

import java.util.List;

/**
 * @author : kooing
 * @date : 2018/4/24 - 12:02
 * @desription :
 * @update by :
 */
public interface MaterialService {

    /**
     * @author      : kooing
     * @Date        : 2018/4/24 12:15
     * @Desription  : 增加原料
     * @return      :
     */
    public void insertMaterial(MaterialDO materialDO);

    /**
     * @author      : kooing
     * @Date        : 2018/4/24 12:16
     * @Desription  : 删除原料
     * @return      :
     */
    public void deleteMaterial(MaterialDO materialDO);

    /**
     * @author      : kooing
     * @Date        : 2018/4/24 12:17
     * @Desription  : 修改原料
     * @return      :
     */
    public void updateMaterial(MaterialDO materialDO);

    /**
     * @author      : kooing
     * @Date        : 2018/4/24 12:19
     * @Desription  : 查询原料
     * @return      :
     */
    public List<MaterialDO> listMaterial(MaterialDO materialDO);
}
