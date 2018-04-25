package com.biao.service.material.exception;

import com.biao.exception.BaseServiceException;
import lombok.Data;

/**
 * @author : kooing
 * @date : 2018/4/24 - 12:04
 * @desription :
 * @update by :
 */
@Data
public class MaterialException extends BaseServiceException {
    public MaterialException(String errorCode, String errorMsg) {
        super(errorCode, errorMsg);
    }
}
