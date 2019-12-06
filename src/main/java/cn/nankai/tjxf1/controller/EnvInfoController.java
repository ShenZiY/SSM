package cn.nankai.tjxf1.controller;

import cn.nankai.tjxf1.entity.EnvInfo;
import cn.nankai.tjxf1.service.EnvInfoService;
import cn.nankai.tjxf1.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class EnvInfoController {
    @Autowired
    EnvInfoService envInfoService;

    @RequestMapping("/saveEnvInfo")
    @ResponseBody
    public ResultBean insertBaseInfoId (String clbh, String xcbh, HttpServletRequest request, HttpSession session)  {

        session.setAttribute("clbh",clbh);
        session.setAttribute("xcbh",xcbh);
        System.out.println(session.getId()+"session"+session.getAttribute("clbh")+session.getAttribute("xcbh"));
        return ResultBean.success("保存成功！");
    }

    @RequestMapping("/addEnvInfo")
    @ResponseBody
    public ResultBean addEnvInfo(HttpSession session,HttpServletRequest request) throws Exception{
        Integer accId = (Integer) session.getAttribute("curAccId");
        String clbh = (String) session.getAttribute("clbh");
        String xcbh = (String) session.getAttribute("xcbh");
        EnvInfo envInfo = new EnvInfo();
        envInfo.setAccId(accId);
        envInfo.setProtectXc(xcbh);
        envInfo.setProtectCl(clbh);
        envInfo.setLocation(request.getParameter("location"));
        envInfo.setRoadinfoCt(request.getParameter("ctqs"));
        envInfo.setRoadinfoPd(Integer .parseInt(request.getParameter("pd")));
        envInfo.setRoadinfoCz(request.getParameter("bmcz"));
        envInfo.setRoadinfoZk(request.getParameter("bmzk"));
        envInfo.setRoadinfoJk(request.getParameter("zwjk"));
        envInfo.setWeainfoFx(request.getParameter("fx"));
        envInfo.setWeainfoFl(request.getParameter("fl"));
        envInfo.setWeainfoFs(Integer .parseInt(request.getParameter("fs")));
        envInfo.setWeainfoTq(request.getParameter("tq"));
        envInfo.setWeainfoWd(Integer .parseInt(request.getParameter("wd")));
        return ResultBean.success(envInfoService.addEnvInfo(envInfo));

    }

}
