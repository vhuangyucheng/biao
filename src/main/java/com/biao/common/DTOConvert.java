package com.biao.common;

/**
 * @author : kooing
 * @date : 2018/4/25 - 20:29
 * @desription :
 * @update by :
 */
public interface DTOConvert<S,T> {
    T convert(S s);
}
