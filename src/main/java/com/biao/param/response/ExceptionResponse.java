package com.biao.param.response;

import lombok.Data;

/**
 * @author : kooing
 * @date : 2018/4/14 - 15:32
 * @desription :
 * @update by :
 */
@Data
public class ExceptionResponse {
    /** 是否成功*/
    private String code;
    /** 消息*/
    private String message;
}
