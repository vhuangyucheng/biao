package com.biao.service.member.exceptionHandler;

import com.biao.controller.member.MemberController;
import com.biao.exception.BaseServiceException;
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
@Slf4j
public class MemberExceptionHandler {

    @ExceptionHandler(MemberException.class)
    public Object BaseServiceException(HttpServletRequest req, BaseServiceException e) {
        log.error("---MemberException Handler---Host {} invokes url {} CODE:{}  MESSAGE: {}", req.getRemoteHost()
                , req.getRequestURL()
                , e.getCode()
                , e.getMessage());
        ExceptionResponse exceptionResponse = new ExceptionResponse();
        exceptionResponse.setCode(e.getCode());
        exceptionResponse.setMessage(e.getMessage());
        return exceptionResponse;
    }
}