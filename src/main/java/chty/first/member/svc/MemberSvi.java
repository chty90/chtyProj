package chty.first.member.svc;

import chty.first.member.vo.MemberVo;

import java.util.List;

public interface MemberSvi {

    List<MemberVo> selectMemberList(MemberVo memberVo) throws Exception;


}
