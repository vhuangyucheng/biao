package com.biao.controller.exception;

import com.biao.exception.BaseException;
import com.biao.param.response.ExceptionResponse;
import com.biao.service.member.exception.MemberCheckException;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.bind.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sun.security.validator.ValidatorException;

import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;

/**
 * @author : kooing
 * @date : 2018/4/13 - 21:49
 * @desription :
 * @update by :
 */
@RestController
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = BaseException.class)
    @ResponseBody
    public Object baseErrorHandler(HttpServletRequest req, Exception e) throws Exception {

        log.error("--333-BaseException Handler---Host {} invokes url {} ERROR: {}", req.getRemoteHost(), req.getRequestURL(), e.getMessage());
        return e.getMessage();
    }
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseBody
    public Object BindException(HttpServletRequest req, Exception e) throws Exception {
        log.error("---controller---Host {} invokes url {} ERROR: {}", req.getRemoteHost(), req.getRequestURL(), e.getMessage());
        return e.getMessage();
    }

    @ExceptionHandler(value = ConstraintViolationException.class)
    @ResponseBody
    public Object MethodArgumentNotValidException(HttpServletRequest req, Exception e) throws Exception {
        log.error("---service---Host {} invokes url {} ERROR: {}", req.getRemoteHost(), req.getRequestURL(), e.getMessage());
        return e.getMessage();
    }



    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        log.error("---DefaultException Handler---Host {} invokes url {} ERROR: {},{}", req.getRemoteHost(), req.getRequestURL(), e.getCause());
        return e.getMessage();
    }
}
