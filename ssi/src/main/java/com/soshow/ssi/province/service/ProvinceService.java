package com.soshow.ssi.province.service;

import java.util.List;

import com.soshow.ssi.province.domain.Province;

/**
 * 
 * @version 1.0
 * @author wlm
 * @date 2014年12月9日 上午11:17:27
 *
 */
public interface ProvinceService {

	/**
	 * 获取省
	 * 
	 * @param param
	 * @return
	 */
	public List<Province> geProvinces();
}
