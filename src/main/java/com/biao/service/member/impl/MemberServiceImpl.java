package com.biao.service.member.impl;

import com.biao.dao.member.MemberMapper;
import com.biao.entity.member.MemberDO;
import com.biao.param.request.DataRequest;
import com.biao.param.response.SuccessResponse;
import com.biao.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : kooing
 * @date : 2018/4/9 - 19:03
 * @desription :
 * @update by :
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberMapper ;

    @Override
    public SuccessResponse<Object> checkMember(DataRequest<MemberDO> dataRequest) {
        MemberDO memberDO = memberMapper.getMember(dataRequest.getBody());
        if(memberDO == null){
            return new SuccessResponse<Object>("1", "账号密码错误", null);
        }
        return new SuccessResponse<Object>("0", "成功", null);
    }

    @Override
    public SuccessResponse<MemberDO> getMember(DataRequest<MemberDO> dataRequest) {
        MemberDO memberDO = memberMapper.getMemberInfo(dataRequest.getBody());
        return new SuccessResponse<MemberDO>(memberDO);
    }
}
