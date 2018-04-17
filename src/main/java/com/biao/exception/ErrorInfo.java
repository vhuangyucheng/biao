package com.biao.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : kooing
 * @date : 2018/4/17 - 20:52
 * @desription :
 * @update by :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorInfo {
    private String code ;
    private String message ;
}
