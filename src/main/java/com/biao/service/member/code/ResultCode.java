package com.biao.service.member.code;

import com.biao.exception.ErrorCodeBase;

/**
 * @author : kooing
 * @date : 2018/4/17 - 20:55
 * @desription :
 * @update by :
 */
public class ResultCode {
    public static final String CODE_CHECK = String.valueOf(ErrorCodeBase.MEMBER + 1L);
    public static final String MSG_DOFAILDATA = "账号密码错误";
}
