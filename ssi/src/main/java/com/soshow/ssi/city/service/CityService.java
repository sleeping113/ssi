package com.soshow.ssi.city.service;

import java.util.List;
import java.util.Map;

import com.soshow.ssi.city.domain.City;

/**
 * 
 * @version 1.0
 * @author wlm
 * @date 2014年12月9日 下午2:08:06
 *
 */
public interface CityService {

	/**
	 * 根据省id获取市
	 * 
	 * @param param
	 * @return
	 */
	public List<City> getCities(Map<String, Object> param);
}
