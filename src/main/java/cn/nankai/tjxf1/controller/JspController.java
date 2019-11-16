package cn.nankai.tjxf1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsp")
public class JspController {
    @RequestMapping("/newAccident")
    public String newAccident() {
        return "newAccident";
    }


}
