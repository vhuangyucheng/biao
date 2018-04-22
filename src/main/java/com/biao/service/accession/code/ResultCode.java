package com.biao.service.accession.code;

import com.biao.exception.ErrorCodeBase;

/**
 * @author : kooing
 * @date : 2018/4/17 - 20:55
 * @desription :
 * @update by :
 */
public class ResultCode {
    public static final String CODE_NUMBER = String.valueOf(ErrorCodeBase.ACCESSION + 1L);
    public static final String MSG_NUMBER = "数量不够";

    public static final String CODE_RECORD = String.valueOf(ErrorCodeBase.ACCESSION + 2L);
    public static final String MSG_RECORD = "没有这个辅料出入库纪录";
}
