package com.biao.param.request.material;

import com.biao.entity.material.MaterialRecordDO;
import lombok.Data;

/**
 * @author : kooing
 * @date : 2018/4/25 - 13:33
 * @desription :
 * @update by :
 */
@Data
public class ListMaterialRecordDTO extends MaterialRecordDO {
    private String materialName;
}
