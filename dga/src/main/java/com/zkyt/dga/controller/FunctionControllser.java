package com.zkyt.dga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zkyt.dga.pojo.AuthFunction;
import com.zkyt.dga.pojo.AuthRole;
import com.zkyt.dga.pojo.Function;
import com.zkyt.dga.pojo.TUser;
import com.zkyt.dga.service.FunctionService;
/**
 * 
 * Auth : hanzq
 * Desc : 权限控制-表现层
 * Time : 2018-1-12 上午9:12:12
 */
@Controller
public class FunctionControllser {
	@Autowired
	private FunctionService service;
	/**
	 * 查询系统权限列表-接入
	 */
	@RequestMapping("/getFunctionList")
	@ResponseBody
	public List<AuthFunction> getFunctionList(){
		List<AuthFunction> list = service.getFunctionList();
		return list;
	}
	/**
	 * 查询系统用户列表-接入
	 */
	@RequestMapping("/systemUserList")
	@ResponseBody
	public List<TUser> getUserList(){
		List<TUser> list = service.getUserList();
		return list;
	}
	/**
	 * 查询系统角色列表-接入
	 */
	@RequestMapping("/getRoleList")
	@ResponseBody
	public List<AuthRole> getRoleList(){
		List<AuthRole> list = service.getRoleList();
		return list;
	}
	/**
	 * 添加角色-接入
	 */
	@RequestMapping("/saveRole")
	public String addRole(AuthRole role,String functions){
		service.saveRole(role,functions);
		return "admin/role";
	}
	/**
	 * 保存系统用户-接入
	 */
	@RequestMapping("/savaSystemUser")
	public String savaSystemUser(TUser user,String[] roleIds){
		service.saveUser(user,roleIds);
		return "admin/userlist";
	}
}
