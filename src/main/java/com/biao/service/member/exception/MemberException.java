package com.biao.service.member.exception;

import com.biao.exception.BaseServiceException;
import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @author : kooing
 * @date : 2018/4/17 - 21:09
 * @desription :
 * @update by :
 */
@Data
public class MemberException extends BaseServiceException {
    public MemberException(String errorCode, String errorMsg) {
        super(errorCode, errorMsg);
    }
}
