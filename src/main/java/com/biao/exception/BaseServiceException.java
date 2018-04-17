package com.biao.exception;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author : kooing
 * @date : 2018/4/17 - 20:51
 * @desription :
 * @update by :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseServiceException extends RuntimeException {
    private String code;
    private String message;
}