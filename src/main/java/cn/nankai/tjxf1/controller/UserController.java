package cn.nankai.tjxf1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.nankai.tjxf1.util.ResultBean;
import org.apache.ibatis.annotations.Param;
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
	public String welcome() {
		return "welcome";
	}

}
