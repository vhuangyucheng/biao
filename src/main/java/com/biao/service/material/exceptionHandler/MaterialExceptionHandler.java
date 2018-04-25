package com.biao.service.material.exceptionHandler;

import com.biao.exception.BaseServiceException;
import com.biao.param.response.ExceptionResponse;
import com.biao.service.accession.exception.AccessoriesException;
import com.biao.service.material.exception.MaterialException;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : kooing
 * @date : 2018/4/24 - 12:05
 * @desription :
 * @update by :
 */
@RestController
@Slf4j
public class MaterialExceptionHandler {

    @ExceptionHandler(MaterialException.class)
    public Object BaseServiceException(HttpServletRequest req, BaseServiceException e) {
        log.error("---MaterialExceptionHandler Handler---Host {} invokes url {} CODE:{}  MESSAGE: {}", req.getRemoteHost()
                , req.getRequestURL()
                , e.getCode()
                , e.getMessage());
        ExceptionResponse exceptionResponse = new ExceptionResponse();
        exceptionResponse.setCode(e.getCode());
        exceptionResponse.setMessage(e.getMessage());
        return exceptionResponse;
    }
}
