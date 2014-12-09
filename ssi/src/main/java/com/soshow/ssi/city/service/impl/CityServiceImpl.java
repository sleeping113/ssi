package com.soshow.ssi.city.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soshow.ssi.city.dao.CityDao;
import com.soshow.ssi.city.domain.City;
import com.soshow.ssi.city.service.CityService;

/**
 * 
 * @version 1.0
 * @author wlm
 * @date 2014年12月9日 下午2:09:48
 *
 */
@Service
public class CityServiceImpl implements CityService{

	@Autowired
	private CityDao cityDao;
	
	public List<City> getCities(Map<String, Object> param) {
		return cityDao.list(param);
	}

}
