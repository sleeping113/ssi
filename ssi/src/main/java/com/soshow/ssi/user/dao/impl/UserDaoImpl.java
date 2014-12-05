package com.soshow.ssi.user.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.soshow.ssi.base.BaseDaoImpl;
import com.soshow.ssi.user.dao.UserDao;
import com.soshow.ssi.user.domain.User;

/**
 * 
 * @version 1.0
 * @author wlm
 * @date 2014年12月3日 下午6:10:45
 *
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

	public User getUserByID(Map<String, Object> param) {
		return (User) this.sqlMapClientTemplate.queryForObject("getUserByID", param);
	}

}
