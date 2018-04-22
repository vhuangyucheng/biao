package com.biao.service.accession.exception;

import com.biao.exception.BaseServiceException;
import lombok.Data;

/**
 * @author : kooing
 * @date : 2018/4/22 - 14:30
 * @desription :
 * @update by :
 */
@Data
public class AccessoriesException extends BaseServiceException {
    public AccessoriesException(String errorCode, String errorMsg) {
        super(errorCode, errorMsg);
    }
}
