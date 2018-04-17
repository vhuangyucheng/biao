package com.biao.controller.exception;

import com.biao.exception.BaseException;
import com.biao.param.response.ExceptionResponse;
import com.biao.service.member.exception.MemberCheckException;
import com.biao.service.member.exception.MemberException;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : kooing
 * @date : 2018/4/17 - 21:42
 * @desription :
 * @update by :
 */
@RestController
@ControllerAdvice
@Slf4j
public class MemberExceptionHandler {
//TODO
    @ExceptionHandler(value = MemberCheckException.class)
    public Object baseErrorHandler(HttpServletRequest req, MemberCheckException  e) throws Exception {
        log.error("---MemberException Handler---Host {} invokes url {} CODE:{}  MESSAGE: {}", req.getRemoteHost()
            , req.getRequestURL()
            , e.getCode()
            , e.getMessage());
        ExceptionResponse exceptionResponse = new ExceptionResponse();
        exceptionResponse.setCode(e.getCode());
        exceptionResponse.setCode(e.getMessage());
        return exceptionResponse;
    }
}
