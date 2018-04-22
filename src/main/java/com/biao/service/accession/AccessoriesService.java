package com.biao.service.accession;

import com.biao.entity.accessories.AccessoriesDO;
import com.biao.param.response.SuccessResponse;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.List;

/**
 * @author : kooing
 * @date : 2018/4/22 - 13:23
 * @desription :
 * @update by :
 */
@Validated
public interface AccessoriesService {

    /**
     * @author      : kooing
     * @Date        : 2018/4/22 13:24
     * @Desription  : 增加辅料
     * @return      :
     */
    public void insertAccessories(@Valid AccessoriesDO accessoriesDO);


    /**
     * @author      : kooing
     * @Date        : 2018/4/22 13:27
     * @Desription  : 删除辅料
     * @return      :
     */
    public void deleteAccessories(@Valid AccessoriesDO accessoriesDO);

    /**
     * @author      : kooing
     * @Date        : 2018/4/22 13:28
     * @Desription  : 修改辅料
     * @return      :
     */
    public void updateAccessories(@Valid AccessoriesDO accessoriesDO );

    /**
     * @author      : kooing
     * @Date        : 2018/4/22 13:29
     * @Desription  : 辅料列表
     * @return      :
     */
    public List<AccessoriesDO> listAccessories(@Valid AccessoriesDO accessoriesDO);
}
