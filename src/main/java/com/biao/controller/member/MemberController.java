package com.biao.controller.member;

import com.biao.entity.member.MemberDO;
import com.biao.param.request.DataRequest;
import com.biao.param.response.SuccessResponse;
import com.biao.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : kooing
 * @date : 2018/4/9 - 18:25
 * @desription :
 * @update by :
 */
@RestController
@RequestMapping("member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("/checkUsername")
    public SuccessResponse<Object> checkUsername(@RequestBody DataRequest<MemberDO> MemberDO) {
        return memberService.checkMember(MemberDO);
    }

    @PostMapping("/getMember")
    public SuccessResponse<MemberDO> getUsername(@RequestBody DataRequest<MemberDO> MemberDO) {
        return memberService.getMember(MemberDO);
    }

}
