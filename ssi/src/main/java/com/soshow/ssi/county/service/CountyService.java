package com.soshow.ssi.county.service;

import java.util.List;
import java.util.Map;

import com.soshow.ssi.county.domain.County;

/**
 * 
 * @version 1.0
 * @author wlm
 * @date 2014年12月9日 下午2:24:34
 *
 */
public interface CountyService {

	public List<County> getCounties(Map<String, Object> param);
}
