package com.soshow.ssi.user.service;

import java.util.Map;

import com.soshow.ssi.user.domain.User;


/**
 * 
 * @version 1.0
 * @author wlm
 * @date 2014年12月3日 下午6:11:18
 *
 */
public interface UserService {

	/**
	 * 获取用户信息
	 * 
	 * @param param
	 * @return
	 */
	public User getUser(Map<String, Object> param);
	
	/**
	 * 根据用户id获取用户信息
	 * 
	 * @param param
	 * @return
	 */
	public User getUserByID(Map<String, Object> param);
	
}
