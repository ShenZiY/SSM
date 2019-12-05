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
import cn.nankai.tjxf1.entity.PeolpleInfo;
import cn.nankai.tjxf1.service.BaseInfoService;
import cn.nankai.tjxf1.service.PeopleInfoService;
import cn.nankai.tjxf1.util.ResultBean;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.google.common.collect.Lists;
import com.wuwenze.poi.ExcelKit;
import com.wuwenze.poi.handler.ExcelReadHandler;
import com.wuwenze.poi.pojo.ExcelErrorField;
import org.apache.commons.collections.MapUtils;
import org.apache.ibatis.annotations.Param;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.nankai.tjxf1.entity.User;
import cn.nankai.tjxf1.service.UserService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userServivce;

	@Autowired
	private BaseInfoService baseInfoService;

	@Autowired
	private PeopleInfoService peopleInfoService;
	
	/*//正常访问login页面
	@RequestMapping("/login")
	public String login(){
		return "login";
	}*/

	@RequestMapping(value = "/import", method = RequestMethod.POST)
	public ResponseEntity<?> importUser(@RequestParam MultipartFile file)
			throws IOException {

		System.out.println("进入controller" );
		long beginMillis = System.currentTimeMillis();

		List<PeolpleInfo> successList = Lists.newArrayList();
		List<Map<String, Object>> errorList = Lists.newArrayList();

		List<User> successList1 = Lists.newArrayList();

		ExcelKit.$Import(User.class)
				.readXlsx(file.getInputStream(), new ExcelReadHandler<User>() {

					@Override
					public void onSuccess(int sheetIndex, int rowIndex, User entity) {
						if(sheetIndex == 1){
							System.out.println(sheetIndex);
							System.out.println(entity.toString());
							successList1.add(entity); // 单行读取成功，加入入库队列。
						}
					}

					@Override
					public void onError(int sheetIndex, int rowIndex,
										List<ExcelErrorField> errorFields) {
						// 读取数据失败，记录了当前行所有失败的数据
						Map<String, Object> map = new HashMap<>();
						map.put("sheetIndex", sheetIndex);
						map.put("rowIndex", rowIndex);
						map.put("errorFields", errorFields);
						errorList.add(map);
					}
				});

		ExcelKit.$Import(PeolpleInfo.class)
				.readXlsx(file.getInputStream(), new ExcelReadHandler<PeolpleInfo>() {

					@Override
					public void onSuccess(int sheetIndex, int rowIndex, PeolpleInfo entity) {
						if(sheetIndex == 0){
							System.out.println(sheetIndex);
							System.out.println(entity.toString());
							successList.add(entity); // 单行读取成功，加入入库队列。
						}

					}

					@Override
					public void onError(int sheetIndex, int rowIndex,
										List<ExcelErrorField> errorFields) {
						// 读取数据失败，记录了当前行所有失败的数据
						Map<String, Object> map = new HashMap<>();
						map.put("sheetIndex", sheetIndex);
						map.put("rowIndex", rowIndex);
						map.put("errorFields", errorFields);
						errorList.add(map);
					}
				});



		for (int i = 0; i < successList1.size(); i++) {
			User user = successList1.get(i);
			Date date = new Date();// 获取当前时间
			user.setRegisterTime(date);
			userServivce.addUser(user);
		}

		// TODO: 执行successList的入库操作。
		int flag = peopleInfoService.insertSelective(successList);
		boolean haveError = errorList.isEmpty();
		Map<String, Object> map1 = new HashMap<>();
		map1.put("data", successList);
		map1.put("haveError", haveError);
		map1.put("error", errorList);
		map1.put("timeConsuming", (System.currentTimeMillis() - beginMillis) / 1000L);
		map1.put("flag", flag);

		return ResponseEntity.ok(map1);
	}




	@RequestMapping(value = "/downTemplate", method = RequestMethod.GET)
    public void downTemplate(HttpServletResponse response) {
    	User user = userServivce.findUserById(1006);
    	List<User> userList = new ArrayList<>();
    	userList.add(user);
		ExcelKit.$Export(User.class, response).downXlsx(userList, true);

    }
	
	//注册功能
	@RequestMapping("/signup")
    @ResponseBody
	public ResultBean signup(@RequestParam(value="id") Integer id,@RequestParam(value="password") String password,@RequestParam(value="username") String username,@RequestParam(value="phone") String phone,@RequestParam(value="mail") String mail, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception{
		User user = new User();
		user.setId(id);
		user.setPassword(password);
		user.setPhone(phone);
		user.setMail(mail);
		user.setUsername(username);
		Date date = new Date();// 获取当前时间
		user.setRegisterTime(date);

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

	@RequestMapping("/userInfo")
	public String userInfo(Model model,HttpSession session) throws ParseException {
		Integer id = (Integer) session.getAttribute("curUserId");
		User user = userServivce.findUserById(id);
		int[] statusTotal = baseInfoService.countStatusById(id);
		String registerTime = handleDate(user.getRegisterTime().toString());
		model.addAttribute("statusTotal",statusTotal);
		model.addAttribute("user",user);
		model.addAttribute("registerTime",registerTime);

		return "userInfo";
	}

	@RequestMapping("/updatePwd")
	@ResponseBody
	public ResultBean updatePwd(HttpSession session,String oldPassword, String newPassword){
		Integer id = (Integer) session.getAttribute("curUserId");
		boolean res = userServivce.checkLogin(id , oldPassword);
		if(res){
			if(userServivce.updatePwd(id,newPassword)){
				System.out.println("修改密码成功");
				return ResultBean.success("修改密码成功");
			}else{
				return ResultBean.error("异常！请重新操作");
			}
		}else{
			return ResultBean.error("旧密码错误！");
		}
	}


	public static String handleDate (String str) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
		Date d = sdf.parse(str);
		String formatDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d);
		return formatDate;
	}
}
