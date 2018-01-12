package com.zkyt.dga.service;

import org.springframework.stereotype.Service;

import com.zkyt.dga.pojo.TUser;

/**
 * 
 * Auth : hanzq
 * Desc : 用户接口
 * Time : 2018-1-12 下午2:12:08
 */
@Service
public interface UserService {
	public TUser getUserByUsernameAndPassword(String username,String password);
}
