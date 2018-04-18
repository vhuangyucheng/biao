package com.biao.controller.member;

import com.biao.entity.member.MemberDO;
import com.biao.exception.MemberExceptionHandler;
import com.biao.param.request.DataRequest;
import com.biao.param.response.ExceptionResponse;
import com.biao.param.response.SuccessResponse;
import com.biao.service.member.MemberService;
import com.biao.service.member.exception.MemberCheckException;
import com.biao.service.member.exception.MemberException;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author : kooing
 * @date : 2018/4/9 - 18:25
 * @desription :
 * @update by :
 */
@Slf4j
@RestController
@RequestMapping("member")
public class MemberController extends MemberExceptionHandler {

    @Autowired
    MemberService memberService;
    @Autowired
    private Validator validator;

    @PostMapping("/checkUsername")
    public SuccessResponse<Object> checkUsername(@RequestBody @Valid DataRequest<MemberDO> MemberDO) {
        return memberService.checkMember(MemberDO);
    }

    @PostMapping("/getMember")
    public SuccessResponse<MemberDO> getUsername(@RequestBody DataRequest<MemberDO> MemberDO) {
        return memberService.getMember(MemberDO);
    }

}
