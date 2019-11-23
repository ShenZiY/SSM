package cn.nankai.tjxf1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.nankai.tjxf1.entity.BaseInfo;
import cn.nankai.tjxf1.service.BaseInfoService;
import cn.nankai.tjxf1.util.ResultBean;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.apache.ibatis.annotations.Param;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.nankai.tjxf1.entity.User;
import cn.nankai.tjxf1.service.UserService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userServivce;

	@Autowired
	private BaseInfoService baseInfoService;
	
	/*//正常访问login页面
	@RequestMapping("/login")
	public String login(){
		return "login";
	}*/
	
	//注册功能
	@RequestMapping("/signup")
    @ResponseBody
	public ResultBean signup(User user, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception{

	    Integer id = user.getId();
	    boolean isOnly = userServivce.registerIdOnly(id);
	    if(isOnly == true )
	        return ResultBean.error("用户ID已经存在！");

		/*response.setContentType("text/html;charset=utf-8");
		if(userServivce.addUser(user)){
			//request.getSession().setAttribute("user", user);
			//out.print("<script language='JavaScript'>alert('注册成功! ');window.location.href='"+request.getContextPath()+"/login.jsp';</script>");
			//return "sectionElementshow";
			//return "redirect:/login.jsp";
			return ;
		}
		else{
			//out.print("<script language='JavaScript'>alert('注册失败! ');window.location.href='"+request.getContextPath()+"/login.jsp';</script>");
			//return "redirect:/login.jsp";
			return "fail";
		}*/
		return ResultBean.success(userServivce.addUser(user));
	}
	
	
	//表单提交过来的路径
    /*@RequestMapping("/checkLogin")
    public ResultBean checkLogin(@RequestParam(value = "id") Integer id, @RequestParam(value = "password") String password){
        System.out.println(id);
        System.out.println(password);
	    if(userServivce.checkLogin(id,password)){
	        return ResultBean.success("登录成功！");
        }else{
	        return ResultBean.error("登录失败！");
        }
    }*/

	@RequestMapping("/checkLogin")
	@ResponseBody
	public ResultBean checkLogin(Integer id, String password,HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception{
		boolean isOnly = userServivce.registerIdOnly(id);
		if(isOnly == false ){
			return ResultBean.error("用户ID不存在！");
		}
		//调用service方法
		boolean res = userServivce.checkLogin(id , password);

		if(res){
			User user = userServivce.findUserById(id);
			request.getSession().setAttribute("curUserName",user.getUsername());
			request.getSession().setAttribute("curUserId",user.getId());
			session.setAttribute("id",user.getId());
			session.setAttribute("user",user);
			System.out.println("登录成功");
			return ResultBean.success("登录成功");
		}
		else{
			System.out.println("密码错误！");
			return ResultBean.error("密码错误！");
		}

	}
	
	
	//用来判断用户名是否唯一
    @RequestMapping("/registerId")
    @ResponseBody
    public boolean registerUserName(Integer  userId , Model model,HttpServletRequest request,HttpServletResponse response) throws IOException{
        boolean tof = userServivce.registerIdOnly(userId);
        /*if(tOf == true){
            resultMap.put("result", "success");
            return resultMap;
        }else{
            resultMap.put("result", "notsuccess");
            return resultMap;
        }
        */
        return tof;
		/*if(tOf == true){
			out.print("success");
		}
		else{
			out.print("fail");
			//out.print("<script language='JavaScript'>alert('用户名已存在! ');window.location.href='"+request.getContextPath()+"/regist.jsp';</script>");
			//return "redirect:/login.jsp";
		}*/
    }

	@RequestMapping("/register")
	public String registerUserName(){
		return "register";
	}
	@RequestMapping("/main")
	public String main3(){
		return "main3";
	}

	//注销方法
	@RequestMapping("/outLogin")
	public String outLogin(HttpSession session){
		//通过session.invalidata()方法来注销当前的session
		session.invalidate();
		return"redirect:login";

	}
//	@RequestMapping("/login")
//	public void login(Model model,HttpServletRequest request,HttpServletResponse response) throws IOException{
//		response.sendRedirect(request.getContextPath()+"/login.jsp");
//	}
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

	@RequestMapping("/welcome")
	public String welcome(Model model,HttpSession session) {
		Integer id = (Integer) session.getAttribute("curUserId");


		String[] date = test1(7);
		int[] newAcc = new int[7];
		int[] done = new int[7];
		int[] doing = new int[7];
		for (int i = 0,j=0; i < 7&&j>-7; i++,j--) {
			int[] temp = baseInfoService.countStatusByDay(id,j);
			newAcc[i] = temp[0];
			doing[i] = temp[1];
			done[i] =temp[2];
		}
		int[] statusTotal = baseInfoService.countStatusById(id);
		int[] statusToday = baseInfoService.countTodayStatusById(id);
		int[] statusWeek = baseInfoService.countWeekStatusById(id);
		int[] statusMonth = baseInfoService.countMonthStatusById(id);
		model.addAttribute("statusTotal",statusTotal);
		model.addAttribute("statusToday",statusToday);
		model.addAttribute("statusWeek",statusWeek);
		model.addAttribute("statusMonth",statusMonth);
		model.addAttribute("date",date);
		model.addAttribute("newAcc",newAcc);
		model.addAttribute("done",done);
		model.addAttribute("doing",doing);
		return "welcome";
	}

	public static String[] test1(int intervals ) {
		String[] result = new String[7];
		for (int i = 0; i <intervals; i++) {
			result[i]=getPastDate(i);
		}
		return result;
	}


	public static String getPastDate(int past) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - past);
		Date today = calendar.getTime();
		SimpleDateFormat format = new SimpleDateFormat("MM月dd日");
		String result = format.format(today);
		return result;
	}

}
