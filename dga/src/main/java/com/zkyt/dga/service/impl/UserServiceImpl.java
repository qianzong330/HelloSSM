package com.zkyt.dga.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zkyt.dga.mapper.TUserMapper;
import com.zkyt.dga.pojo.TUser;
import com.zkyt.dga.pojo.TUserExample;
import com.zkyt.dga.pojo.TUserExample.Criteria;
import com.zkyt.dga.service.UserService;
import com.zkyt.dga.utils.MD5Utils;
/**
 * 
 * Auth : hanzq
 * Desc : 用户动作业务实现
 * Time : 2018-1-12 下午2:13:53
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private TUserMapper mapper;
	/**
	 * 根据用户名和密码查询用户
	 */
	@Override
	public TUser getUserByUsernameAndPassword(String username, String password) {
		password = MD5Utils.md5(password);
		TUserExample example = new TUserExample();
		Criteria c = example.createCriteria();
		c.andUsernameEqualTo(username);
		c.andPasswordEqualTo(password);
		List<TUser> list = mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			TUser user = list.get(0);
			user.setPassword(null);
			return user;
		}else{
			return null;
		}
	}

}
