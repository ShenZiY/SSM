package cn.nankai.tjxf1.controller;

import cn.nankai.tjxf1.entity.BaseInfo;
import cn.nankai.tjxf1.service.BaseInfoService;
import cn.nankai.tjxf1.util.ResultBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Controller
public class BaseInfoController {

    @Autowired
    private BaseInfoService baseInfoService;

    @RequestMapping("/addBaseInfo")
    @ResponseBody
    public ResultBean addBaseInfo(HttpSession session,HttpServletRequest request) throws ParseException {
        SimpleDateFormat sdf =  new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
        BaseInfo baseInfo = new BaseInfo();
        Integer accId = (Integer) session.getAttribute("curAccId");
        Integer id = (Integer) session.getAttribute("curUserId");
        baseInfo.setId(id);
        baseInfo.setAccId(accId);
        baseInfo.setStatus(0);
        baseInfo.setLocSheng(request.getParameter("province"));
        baseInfo.setLocShi(request.getParameter("city"));
        baseInfo.setLocXian(request.getParameter("district"));
        baseInfo.setLocDetail(request.getParameter("locDetail"));
        baseInfo.setCarNum(Integer.parseInt(request.getParameter("carNum")));
        baseInfo.setHurtNum(Integer.parseInt(request.getParameter("hurtNum")));
        baseInfo.setPeopleNum(Integer.parseInt(request.getParameter("peopleNum")));
        baseInfo.setGovCj(request.getParameter("govCJ"));
        baseInfo.setGovLr(request.getParameter("govLR"));
        baseInfo.setState(request.getParameter("state"));
        baseInfo.setFireTru(request.getParameter("fireTru"));
        baseInfo.setAmbulance(request.getParameter("ambulance"));
        Date date1 = sdf.parse(request.getParameter("timeFireTru"));
        baseInfo.setTimeFiretru(date1);
        Date date2 = sdf.parse(request.getParameter("timeAmbu"));
        baseInfo.setTimeAmbu(date2);
        Date date3 = sdf.parse(request.getParameter("timePolice"));
        baseInfo.setTimePolice(date3);
        Date date4 = sdf.parse(request.getParameter("timeInvest"));
        baseInfo.setTimeInvest(date4);
        Date date5 = sdf.parse(request.getParameter("timeFind"));
        baseInfo.setTimeFind(date5);
        return ResultBean.success(baseInfoService.addBaseInfo(baseInfo));
    }

    @RequestMapping("/insertBaseInfoId")
    @ResponseBody
    public ResultBean insertBaseInfoId (Integer accId, HttpServletRequest request,HttpSession session)  {
        System.out.println( baseInfoService.findByAccId(accId));
        if(baseInfoService.findByAccId(accId) == true){
                return ResultBean.error("该编号已存在");
        }
        session.setAttribute("curAccId",accId);
        System.out.println(session.getId()+"session"+session.getAttribute("curAccId"));
        return ResultBean.success("编号可用");
    }

    @RequestMapping("/accNum")
    @ResponseBody
    public void accNum(HttpSession session) {
        int todayAccNum = baseInfoService.countAccNum();
        System.out.println("todayAccNum"+todayAccNum);
        int num = todayAccNum+1;
        session.setAttribute("todayAccNum",todayAccNum);
        session.setAttribute("num",num);
    }

}
