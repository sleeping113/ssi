package com.soshow.ssi.account.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soshow.ssi.account.dao.AccountDao;
import com.soshow.ssi.account.domain.Account;
import com.soshow.ssi.account.service.AccountService;

/**
 * 
 * @version 1.0
 * @author wlm
 * @date 2014年12月4日 下午1:46:08
 *
 */
@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountDao accountDao;
	
	public Account getAccout(Map<String, Object> param) {
		return accountDao.getModel(param);
	}

}
