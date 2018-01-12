package com.zkyt.dga.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zkyt.dga.mapper.AuthFunctionMapper;
import com.zkyt.dga.mapper.AuthRoleMapper;
import com.zkyt.dga.mapper.FunctionMapper;
import com.zkyt.dga.mapper.RoleFunctionMapper;
import com.zkyt.dga.mapper.TUserMapper;
import com.zkyt.dga.mapper.UserRoleMapper;
import com.zkyt.dga.pojo.AuthFunction;
import com.zkyt.dga.pojo.AuthFunctionExample;
import com.zkyt.dga.pojo.AuthRole;
import com.zkyt.dga.pojo.AuthRoleExample;
import com.zkyt.dga.pojo.RoleFunctionKey;
import com.zkyt.dga.pojo.TUser;
import com.zkyt.dga.pojo.TUserExample;
import com.zkyt.dga.pojo.UserRoleKey;
import com.zkyt.dga.utils.MD5Utils;
/**
 * 
 * Auth : hanzq
 * Desc : 权限操作业务实现
 * Time : 2018-1-12 上午8:46:09
 */
@Service
public class FunctionServiceImpl implements FunctionService {
	
	@Autowired
	private AuthFunctionMapper authFunctionMapper;
	@Autowired TUserMapper userMapper;
	@Autowired AuthRoleMapper roleMapper;
	@Autowired RoleFunctionMapper roleFunctionMapper;
	@Autowired UserRoleMapper userRoleMapper;
	/**
	 * 查询系统权限列表
	 */
	@Override
	public List<AuthFunction> getFunctionList() {
		AuthFunctionExample example = new AuthFunctionExample();
		List<AuthFunction> list = authFunctionMapper.selectByExample(example);
		return list;
	}
	
	/**
	 * 添加系统角色
	 */
	@Override
	public void saveRole(AuthRole role, String functions) {
		//添加角色，级联维护角色和权限数据
		role.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		String rid = role.getId();
		roleMapper.insert(role);
		String[] strings = functions.split(",");
		for (String id : strings) {
			RoleFunctionKey roleFunction = new RoleFunctionKey();
			roleFunction.setFunctionId(id);
			roleFunction.setRoleId(rid);
			roleFunctionMapper.insert(roleFunction);
		}
		
	}
	/**
	 * 查询角色列表
	 */
	@Override
	public List<AuthRole> getRoleList() {
		AuthRoleExample example = new AuthRoleExample();
		List<AuthRole> list = roleMapper.selectByExample(example);
		return list;
	}
	/**
	 * 添加系统用户
	 */
	@Override
	public void saveUser(TUser user, String[] roleIds) {
		user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		String password = user.getPassword();
		password = MD5Utils.md5(password);
		user.setPassword(password);
		userMapper.insertSelective(user);
		String uid = user.getId();
		if(roleIds!=null && roleIds.length>0){
			
			for (String rid : roleIds) {
				UserRoleKey record = new UserRoleKey();
				record.setUserId(uid);
				record.setRoleId(rid);
				userRoleMapper.insert(record);
			}
		}
		
	}

	/**
	 * 查询系统用户
	 */
	@Override
	public List<TUser> getUserList() {
		TUserExample example = new TUserExample();
		List<TUser> list = userMapper.selectByExample(example);
		return list;
	}
	
}
