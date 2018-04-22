package com.biao.controller.member;

import com.biao.entity.member.MemberDO;
import com.biao.service.member.exceptionHandler.MemberExceptionHandler;
import com.biao.param.request.DataRequest;
import com.biao.param.response.SuccessResponse;
import com.biao.service.member.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Validator;
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

    @PostMapping("/checkUsername")
    public SuccessResponse<Object> checkUsername(@RequestBody @Valid DataRequest<MemberDO> dataRequest) {
        return memberService.checkMember(dataRequest.getBody());
    }

    @PostMapping("/getMember")
    public SuccessResponse<MemberDO> getUsername(@RequestBody @Valid DataRequest<MemberDO> dataRequest) {
        return memberService.getMember(dataRequest.getBody());
    }

}
