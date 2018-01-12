package com.zkyt.dga.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zkyt.dga.pojo.TUser;
import com.zkyt.dga.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	/**
	 * 用户登录-接入 
	 * @throws IOException 
	 */
	@RequestMapping("/checkLogin")
	public String ckeckLogin(String username,String password,String checkcode,HttpSession session,HttpServletRequest request,HttpServletResponse response) throws IOException{
		//验证码为空，返回登录页面，并提示验证码不能为空
		if(checkcode==null||checkcode.length()==0){
			//response.getWriter().write("server:checkcode is empty !");
			return "login";
			
		}else{
			//验证码不为空，则判断验证码输入是否正确
			String key = (String) session.getAttribute("key");
			//如果输入的验证码与session中的值不一样，返回登录页面，并提示验证码不正确
			//此处为了测试，加入key等于1234
			
			if(!checkcode.equals(key)){
				//response.getWriter().write("server:checkcode is error ！");
				return "login";
			}else{
				//验证码正确，则判断用户名和密码是否正确
				TUser user = userService.getUserByUsernameAndPassword(username, password);
				//如果用户不为空，则跳转到主页
				if(user!=null){
					//用户存在，保存用户到session
					session.setAttribute("currentUser", user);
					System.out.println("----------当前登录用户："+session.getAttribute("currentUser"));
					return "common/index";
				}else{
					//如果没查到，则返回登录首页，并提示用户名或密码不正确
					//response.getWriter().write("server:username or password is erroy ! ！");
					return "login";
				}
			}
		}
		
	}
	@RequestMapping("/population")
	public String topPopulation(){
		return "base/population";
	}
	@RequestMapping("/building")
	public String toBuilding(){
		return "base/building";
	}
	@RequestMapping("/house")
	public String toHouse(){
		return "base/house";
	}
	@RequestMapping("/unit")
	public String toUnit(){
		return "base/unit";
	}
	@RequestMapping("/home")
	public String toHome(){
		return "common/home";
	}
	@RequestMapping("/daiban")
	public String toDaiban(){
		return "portal/daiban";
	}
	@RequestMapping("/gonggao")
	public String toGonggao(){
		return "portal/daiban";
	}
	@RequestMapping("/bug")
	public String toBug(){
		return "portal/bug";
	}
	@RequestMapping("/yujing")
	public String toYujing(){
		return "portal/yujing";
	}
	//去用户列表页
	@RequestMapping("/userindex2")
	public String touUserindex(){
		return "admin/userlist";
	}
	@RequestMapping("/function")
	public String toFunction(){
		return "admin/function";
	}
	/**
	 * 去角色列表页
	 */
	@RequestMapping("/role")
	public String toRole(){
		return "admin/role";
	}
	/**
	 * 去用户添加页面
	 */
	@RequestMapping("/toUserAdd")
	public String toUserAdd(){
		
		return  "admin/user_add";
	}
	@RequestMapping("/role_add")
	public String toRole_add(){
		return "admin/role_add";
	}
}
