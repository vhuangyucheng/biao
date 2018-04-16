package com.biao.param.response;

import com.biao.common.pagination.Pagination;
import lombok.Data;

/**
 * @author : kooing
 * @date : 2018/3/23 - 23:43
 * @desription :
 * @update by :
 */
@Data
public class SuccessResponse<T>  {
    /** 是否成功*/
    private String code;
    /** 消息*/
    private String message;
    /** 分页*/
    private Pagination pagination;

    private T data;


    /**
     * @author      : kooing
     * @Date        : 2017/11/7 23:29
     * @Desription  : 不配置分页的情况
     * @return      :
     */
    public SuccessResponse(T data){
        code = "0";
        message = "成功";
        pagination = null;
        this.data = data;
    }

    /**
     * @author      : kooing
     * @Date        : 2017/11/7 23:35
     * @Desription  : 配置分页的情况
     * @return      :
     */
    public SuccessResponse(Pagination pagination, T data){
        code = "0";
        message = "成功";
        this.pagination = pagination;
        this.data = data;
    }

    /**
     * @author      : kooing
     * @Date        : 2017/11/7 23:37
     * @Desription  : 自定义code和message，带pagination情况
     * @return      :
     */
    public SuccessResponse(String code, String message, Pagination pagination, T data){
        this.code = code;
        this.message = message;
        this.pagination = pagination;
        this.data = data;
    }

    /**
     * @author      : kooing
     * @Date        : 2017/11/7 23:39
     * @Desription  : 自定义code和message，不带pagination情况
     * @return      :
     */
    public SuccessResponse(String code, String message, T data){
        this.code = code;
        this.message = message;
        this.pagination = null;
        this.data = data;
    }
}
