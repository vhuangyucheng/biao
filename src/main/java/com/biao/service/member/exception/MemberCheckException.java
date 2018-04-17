package com.biao.service.member.exception;

import com.biao.service.member.code.ResultCode;

/**
 * @author : kooing
 * @date : 2018/4/17 - 21:27
 * @desription :
 * @update by :
 */
public class MemberCheckException extends MemberException{
    public MemberCheckException() {
        super(ResultCode.CODE_CHECK, ResultCode.MSG_DOFAILDATA);
    }
}
