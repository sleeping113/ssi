package com.soshow.ssi.county.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soshow.ssi.county.dao.CountyDao;
import com.soshow.ssi.county.domain.County;
import com.soshow.ssi.county.service.CountyService;

/**
 * 
 * @version 1.0
 * @author wlm
 * @date 2014年12月9日 下午2:25:21
 *
 */
@Service
public class CountyServiceImpl implements CountyService{

	@Autowired
	private CountyDao countyDao;
	
	public List<County> getCounties(Map<String, Object> param) {
		return countyDao.list(param);
	}

}
