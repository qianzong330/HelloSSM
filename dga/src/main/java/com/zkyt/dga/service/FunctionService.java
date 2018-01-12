package com.zkyt.dga.service;

import java.util.List;

import com.zkyt.dga.pojo.AuthFunction;
import com.zkyt.dga.pojo.AuthRole;
import com.zkyt.dga.pojo.Function;
import com.zkyt.dga.pojo.TUser;

public interface FunctionService {
	
	public List<AuthFunction> getFunctionList();
	public List<TUser> getUserList();
	public void saveRole(AuthRole role, String functions);
	public List<AuthRole> getRoleList();
	public void saveUser(TUser user, String[] roleIds);
}
