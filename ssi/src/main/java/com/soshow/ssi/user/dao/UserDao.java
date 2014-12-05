package com.soshow.ssi.user.dao;

import java.util.Map;

import com.soshow.ssi.base.BaseDao;
import com.soshow.ssi.user.domain.User;

/**
 * 
 * @version 1.0
 * @author wlm
 * @date 2014年12月3日 下午6:09:42
 *
 */
public interface UserDao extends BaseDao<User>{

	/**
	 * 根据用户id获取用户信息
	 * 
	 * @param param
	 * @return
	 */
	public User getUserByID(Map<String, Object> param);
	
}
