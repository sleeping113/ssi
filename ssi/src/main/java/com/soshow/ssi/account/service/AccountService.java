package com.soshow.ssi.account.service;

import java.util.Map;

import com.soshow.ssi.account.domain.Account;


/**
 * 
 * @version 1.0
 * @author wlm
 * @date 2014年12月4日 下午1:45:08
 *
 */
public interface AccountService{

	public Account getAccout(Map<String, Object> param);
	
}
