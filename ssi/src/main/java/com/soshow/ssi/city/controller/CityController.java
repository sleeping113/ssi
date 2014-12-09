package com.soshow.ssi.city.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soshow.ssi.city.domain.City;
import com.soshow.ssi.city.service.CityService;

/**
 * 
 * @version 1.0
 * @author wlm
 * @date 2014年12月9日 下午2:11:33
 *
 */
@Controller
public class CityController {

	private final Logger logger = Logger.getLogger(CityController.class);
	
	@Autowired
	private CityService cityService;
	
	@ResponseBody
	@RequestMapping("/getCities")
	public List<City> getCities(int provinceId){
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("provinceId", provinceId);
		List<City> cities = cityService.getCities(param);
		logger.info(cities);
		return cities;
	}
}
