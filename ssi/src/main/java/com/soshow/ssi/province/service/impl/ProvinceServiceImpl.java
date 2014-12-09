package com.soshow.ssi.province.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soshow.ssi.province.dao.ProvinceDao;
import com.soshow.ssi.province.domain.Province;
import com.soshow.ssi.province.service.ProvinceService;

/**
 * 
 * @version 1.0
 * @author wlm
 * @date 2014年12月9日 上午11:17:55
 *
 */
@Service
public class ProvinceServiceImpl implements ProvinceService{

	@Autowired
	private ProvinceDao provinceDao;
	
	public List<Province> geProvinces() {
		return provinceDao.list();
	}

}
