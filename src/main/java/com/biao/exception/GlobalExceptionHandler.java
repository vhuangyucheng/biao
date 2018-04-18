package com.biao.exception;

import com.biao.exception.BaseServiceException;
import com.biao.exception.GlobalCode;
import com.biao.param.response.ExceptionResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.validation.ConstraintViolationException;

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

    @ExceptionHandler(value = NoHandlerFoundException.class)
    public Object noHandlerFoundException(HttpServletRequest req, Exception e) throws Exception {
        log.error("---404 Handler---Host {} invokes url {} ERROR: {}", req.getRemoteHost(), req.getRequestURL(), e.getMessage());
        return new ExceptionResponse(GlobalCode.CODE_404, GlobalCode.MSG_404);
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Object bindException(HttpServletRequest req, Exception e) throws Exception {
        log.error("---controller---Host {} invokes url {} ERROR: {}", req.getRemoteHost(), req.getRequestURL(), e.getMessage());
        return new ExceptionResponse(GlobalCode.CODE_CONTROLLER, GlobalCode.MSG_CONTROLLER);
    }

    @ExceptionHandler(value = ConstraintViolationException.class)
    public Object methodArgumentNotValidException(HttpServletRequest req, Exception e) throws Exception {
        log.error("---service---Host {} invokes url {} ERROR: {}", req.getRemoteHost(), req.getRequestURL(), e.getMessage());
        return new ExceptionResponse(GlobalCode.CODE_SERVICE, GlobalCode.MSG_SERVICE);
    }

    @ExceptionHandler(BaseServiceException.class)
    public Object BaseServiceException(HttpServletRequest req, BaseServiceException e) {
        log.error("---service Exception Handler---Host {} invokes url {} CODE:{}  MESSAGE: {}", req.getRemoteHost()
                , req.getRequestURL()
                , e.getCode()
                , e.getMessage());
        ExceptionResponse exceptionResponse = new ExceptionResponse();
        exceptionResponse.setCode(e.getCode());
        exceptionResponse.setMessage(e.getMessage());
        return exceptionResponse;
    }


    @ExceptionHandler(value = Exception.class)
    public Object defaultErrorHandler(HttpServletRequest req, Exception e)  {
        log.error("---DefaultException Handler---Host {} invokes url {} ERROR: {}", req.getRemoteHost(), req.getRequestURL(), e.getMessage());
        return new ExceptionResponse(GlobalCode.CODE_UNKNOWN, GlobalCode.MSG_UNKNOWN);
    }

}
