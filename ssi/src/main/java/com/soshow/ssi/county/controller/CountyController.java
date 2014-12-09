package com.soshow.ssi.county.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soshow.ssi.county.domain.County;
import com.soshow.ssi.county.service.CountyService;

/**
 * 
 * @version 1.0
 * @author wlm
 * @date 2014年12月9日 下午2:26:55
 *
 */
@Controller
public class CountyController {

	private final Logger logger = Logger.getLogger(CountyController.class);
	
	@Autowired
	private CountyService countyService;
	
	@ResponseBody
	@RequestMapping("/getCounties")
	public List<County> getCounties(int cityId){
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("cityId", cityId);
		List<County> counties = countyService.getCounties(param);
		logger.info(counties);
		return counties;
	}
	
}
