package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetU(Model model){
        model.addAttribute("username", "홍길동");
        return "greetings";
    }
    @GetMapping("/bye")
    public String seeUNext(Model model){
        model.addAttribute("nickname", "홍길동");
        return "goodbye";
    }

}
