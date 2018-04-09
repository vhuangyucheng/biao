package com.biao.service.member;

import com.biao.dao.member.MemberMapper;
import com.biao.entity.member.MemberDO;
import com.biao.param.request.DataRequest;
import com.biao.param.response.SuccessResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : kooing
 * @date : 2018/4/9 - 18:59
 * @desription :
 * @update by :
 */

public interface MemberService {

    /**
     * @author      : kooing
     * @Date        : 2018/4/9 18:59
     * @Desription  : 检查账号密码
     * @return      :
     */
    public SuccessResponse<Object> checkMember(DataRequest<MemberDO> MemberDO);
}
