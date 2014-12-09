package com.soshow.ssi.province.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soshow.ssi.province.domain.Province;
import com.soshow.ssi.province.service.ProvinceService;

/**
 * 
 * @version 1.0
 * @author wlm
 * @date 2014年12月9日 上午11:25:16
 *
 */
@Controller
public class ProvinceController {

	private final Logger logger = Logger.getLogger(ProvinceController.class);
	
	@Autowired
	private ProvinceService provinceService;
	
	@ResponseBody
	@RequestMapping("/getProvinces")
	public List<Province> geProvinces(){
		List<Province> provinces = provinceService.geProvinces();
		logger.info(provinces);
		return provinces;
	}
}
