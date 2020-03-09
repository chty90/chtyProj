package kcnet.first.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

    @RequestMapping(value = "/")
    public String openIndex(){
        return "index";
    }


}
