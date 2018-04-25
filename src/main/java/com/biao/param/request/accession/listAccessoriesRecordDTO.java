package com.biao.param.request.accession;

import com.biao.entity.accessories.AccessoriesDO;
import com.biao.entity.accessories.AccessoriesRecordDO;
import lombok.Data;

/**
 * @author : kooing
 * @date : 2018/4/25 - 13:29
 * @desription :
 * @update by :
 */
@Data
public class ListAccessoriesRecordDTO extends AccessoriesRecordDO {
    private String accessoriesSpecification;

}
