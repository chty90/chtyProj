package chty.first.member.svc;

import chty.comm.Dao.CommonDao;
import chty.first.member.vo.MemberVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("memberSvi")
public class MemberSvc implements MemberSvi{

    @Resource(name = "commonDao")
    private CommonDao commonDao;

    public List<MemberVo> selectMemberList(MemberVo memberVo) throws Exception {
        List<MemberVo> list = commonDao.selectList("memberMapper_selectMemberList", memberVo);
        System.out.println(list);
        return list;
    }
}
