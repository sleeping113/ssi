package com.soshow.ssi.user.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soshow.ssi.user.dao.UserDao;
import com.soshow.ssi.user.domain.User;
import com.soshow.ssi.user.service.UserService;

/**
 * 
 * @version 1.0
 * @author wlm
 * @date 2014年12月3日 下午6:12:04
 *
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public User getUser(Map<String, Object> param) {
		return userDao.getModel(param);
	}

	public User getUserByID(Map<String, Object> param) {
		return userDao.getUserByID(param);
	}

}
