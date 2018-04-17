package com.biao.param.request;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @author : kooing
 * @date : 2018/3/23 - 23:07
 * @desription :
 * @update by :
 */
@Data
public class DataRequest<T> {
    /** 公共参数*/
    private HeaderRequest header;

    /** 应用参数*/
    @Valid
    private T body;
}
