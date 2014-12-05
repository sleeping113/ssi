package com.soshow.ssi.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soshow.ssi.user.domain.User;
import com.soshow.ssi.user.service.UserService;

/**
 * 
 * @version 1.0
 * @author wlm
 * @date 2014年12月3日 下午5:42:09
 *
 */
@Controller
public class UserController {

	private Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/getUser")
	public User getUser(){
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("id", 1);
		User user = userService.getUser(param);
		logger.info(user);
		return user;
	}
	
	@ResponseBody
	@RequestMapping("/getUserByID")
	public User getUserByID(){
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("id", 1);
		User user = userService.getUserByID(param);
		logger.info(user);
		return user;
	}
}
