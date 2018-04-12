package com.biao.dao.member;

import com.biao.entity.member.MemberDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberMapper {
    int deleteByPrimaryKey(Long memberId);

    int insert(MemberDO record);

    int insertSelective(MemberDO record);

    MemberDO selectByPrimaryKey(Long memberId);

    int updateByPrimaryKeySelective(MemberDO record);

    int updateByPrimaryKey(MemberDO record);


    /**
     * @author      : kooing
     * @Date        : 2018/4/9 21:22
     * @Desription  : 获得一个会员
     * @return      :
     */
    @Select("SELECT * FROM member WHERE member_username = #{memberUsername} and " +
            "member_password = #{memberPassword}")
    MemberDO getMember(MemberDO memberDO);

    /**
     * @author      : kooing
     * @Date        : 2018/4/10 21:46
     * @Desription  : 根据会员id获得会员信息
     * @return      :
     */
    MemberDO getMemberInfo(MemberDO memberDO);
}