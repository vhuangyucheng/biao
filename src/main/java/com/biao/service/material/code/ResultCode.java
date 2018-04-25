package com.biao.service.material.code;

import com.biao.exception.ErrorCodeBase;

/**
 * @author : kooing
 * @date : 2018/4/24 - 12:04
 * @desription :
 * @update by :
 */
public class ResultCode {
    public static final String CODE_NUMBER = String.valueOf(ErrorCodeBase.MATERIAL + 1L);
    public static final String MSG_NUMBER = "数量不够";

    public static final String CODE_RECORD = String.valueOf(ErrorCodeBase.MATERIAL + 2L);
    public static final String MSG_RECORD = "没有这个原料出入库纪录";
}
