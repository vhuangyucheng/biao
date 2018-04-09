package com.biao.controller.member;

import com.biao.entity.member.MemberDO;
import com.biao.param.request.DataRequest;
import com.biao.param.response.SuccessResponse;
import com.biao.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("/checkUsername")//TODO
    public SuccessResponse<Object> checkUsername(DataRequest<MemberDO> MemberDO) {
        return memberService.checkMember(MemberDO);
    }

}
