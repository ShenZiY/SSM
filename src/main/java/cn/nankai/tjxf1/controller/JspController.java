package cn.nankai.tjxf1.controller;


import cn.nankai.tjxf1.entity.BaseInfo;
import cn.nankai.tjxf1.service.BaseInfoService;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/jsp")
public class JspController {
    @Resource
    private BaseInfoService baseInfoService;

    @RequestMapping("/updatePassword")
    public String updatePassword (){
        return "updatePassword";
    }

    @RequestMapping("/uploadExcel")
    public String uploadExcel (){
        return "uploadExcel";
    }

    @RequestMapping("/newAccident")
    public String newAccident(Model model) {
        int todayAccNum = baseInfoService.countAccNum();
        System.out.println("todayAccNum"+todayAccNum);
        int num = todayAccNum+1;
        model.addAttribute("todayAccNum",todayAccNum);
        model.addAttribute("num",num);
        return "newAccident";
    }

    @RequestMapping ("/data")
    @ResponseBody
    public String data(HttpSession session, @RequestParam(value="page") String pageno, @RequestParam (value="limit") String pagesize ) throws ParseException {
        Integer id = (Integer) session.getAttribute("curUserId");
        System.out.println("userId:"+id+"|| pageno:"+pageno+"||pagesize:"+pagesize);
        JSONObject json = new JSONObject();
        //当前页
        Integer page = Integer.parseInt(pageno.trim());
        //每页的数量
        Integer size = Integer.parseInt(pagesize.trim());
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("id", id);
        paramMap.put("start", (page - 1) * size);
        paramMap.put("size", size);

        System.out.println("zhiqina1 ");

        List<BaseInfo> resultList = baseInfoService.getPageListInfo(paramMap);

        ArrayList<Map<String,String>> res = new ArrayList<>() ;

        for (int i = 0; i < resultList.size(); i++) {
            BaseInfo baseInfoTemp = resultList.get(i);
            String accId = Integer.toString(baseInfoTemp.getAccId()) ;
            String 	govLr = baseInfoTemp.getGovLr();
            String loc = baseInfoTemp.getLocSheng()+baseInfoTemp.getLocShi()+baseInfoTemp.getLocXian()+baseInfoTemp.getLocDetail();
            String timeInvest = handleDate(baseInfoTemp.getTimeInvest().toString());
            String Status = handleStatus(baseInfoTemp.getStatus());
            Map<String,String> map = new HashMap<>();
            map.put("accId",accId);
            map.put("govLr",govLr);
            map.put("loc",loc);
            map.put("timeInvest",timeInvest);
            map.put("Status",Status);
            System.out.println(map.toString());
            res.add(map);
        }

        int count =baseInfoService.getPageTotalCount(paramMap);

        if(!resultList.isEmpty()) {

            json.put("code", 0);
            json.put("msg","");
            json.put("count", count);
            json.put("data", res);
        }else{
            json.put("error","查询列表为空");
        }
        System.out.println(json.toString());
        return json.toString();
    }

    @RequestMapping ("/dataExcel")
    @ResponseBody
    public String dataExcel(HttpSession session, @RequestParam(value="page") String pageno, @RequestParam (value="limit") String pagesize ) throws ParseException {
        Integer id = (Integer) session.getAttribute("curUserId");
        System.out.println("userId:"+id+"|| pageno:"+pageno+"||pagesize:"+pagesize);
        JSONObject json = new JSONObject();
        //当前页
        Integer page = Integer.parseInt(pageno.trim());
        //每页的数量
        Integer size = Integer.parseInt(pagesize.trim());
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("id", id);
        paramMap.put("start", (page - 1) * size);
        paramMap.put("size", size);

        System.out.println("zhiqina1 ");

        List<BaseInfo> resultList = baseInfoService.getPageListInfoExcel(paramMap);

        ArrayList<Map<String,String>> res = new ArrayList<>() ;

        for (int i = 0; i < resultList.size(); i++) {
            BaseInfo baseInfoTemp = resultList.get(i);
            String accId = Integer.toString(baseInfoTemp.getAccId()) ;
            String 	govLr = baseInfoTemp.getGovLr();
            String loc = baseInfoTemp.getLocSheng()+baseInfoTemp.getLocShi()+baseInfoTemp.getLocXian()+baseInfoTemp.getLocDetail();
            String timeInvest = handleDate(baseInfoTemp.getTimeInvest().toString());
            String Status = handleStatus(baseInfoTemp.getStatus());
            Map<String,String> map = new HashMap<>();
            map.put("accId",accId);
            map.put("govLr",govLr);
            map.put("loc",loc);
            map.put("timeInvest",timeInvest);
            map.put("Status",Status);
            System.out.println(map.toString());
            res.add(map);
        }

        int count =baseInfoService.getPageTotalCountExcel(paramMap);

        if(!resultList.isEmpty()) {

            json.put("code", 0);
            json.put("msg","");
            json.put("count", count);
            json.put("data", res);
        }else{
            json.put("error","查询列表为空");
        }
        System.out.println(json.toString());
        return json.toString();
    }

    public static String handleDate (String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        Date d = sdf.parse(str);
        String formatDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d);
        return formatDate;
    }

    public static String handleStatus (Integer status){
        switch(status){
            case 0 :
                return "待上传数据";
            case 1 :
                return "已传EXCEL";
            case 2 :
                return "已传图片";
            case 3 :
                return "已处理图片";
            case 4 :
                return "处理完毕";

        }
        return "未知";
    }


}
