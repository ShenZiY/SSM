package cn.nankai.tjxf1.controller;


import cn.nankai.tjxf1.entity.BaseInfo;
import cn.nankai.tjxf1.service.BaseInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/jsp")
public class JspController {
    @Resource
    private BaseInfoService baseInfoService;
    @RequestMapping("/newAccident")
    public String newAccident(Model model) {
        int todayAccNum = baseInfoService.countAccNum();
        System.out.println("todayAccNum"+todayAccNum);
        int num = todayAccNum+1;
        model.addAttribute("todayAccNum",todayAccNum);
        model.addAttribute("num",num);
        return "newAccident";
    }


}
