package com.biao.param.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : kooing
 * @date : 2018/4/14 - 15:32
 * @desription :
 * @update by :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponse {
    /** 是否成功*/
    private String code;
    /** 消息*/
    private String message;
}
