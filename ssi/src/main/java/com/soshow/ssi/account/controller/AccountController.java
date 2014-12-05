package com.soshow.ssi.account.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soshow.ssi.account.domain.Account;
import com.soshow.ssi.account.service.AccountService;

/**
 * 
 * @version 1.0
 * @author wlm
 * @date 2014年12月4日 下午1:48:39
 *
 */
@Controller
public class AccountController {

	private Logger logger = Logger.getLogger(AccountController.class);
	
	@Autowired
	private AccountService accountService;
	
	@ResponseBody
	@RequestMapping("/getAccount")
	public Account getAccount(){
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("id", 1);
		Account account = accountService.getAccout(param);
		logger.info(account);
		return account;
	}
}
