package chty.first.member.controller;

import chty.first.member.svc.MemberSvi;
import chty.first.member.vo.MemberVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Resource(name = "memberSvi")
    private MemberSvi memberSvi;

    @RequestMapping(value = "/selectMemberList")
    public String selectMemberList(MemberVo memberVo, ModelMap model) throws Exception {
        System.out.println("selectMemberList");

        List<MemberVo> list = memberSvi.selectMemberList(memberVo);
        System.out.println(list);


        model.addAttribute("list",list);

        return "member/memberList";
    }
}
