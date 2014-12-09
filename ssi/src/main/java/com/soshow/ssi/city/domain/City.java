package com.soshow.ssi.city.domain;

/**
 * 
 * @version 1.0
 * @author wlm
 * @date 2014年12月9日 上午11:07:11
 *
 */
public class City {

	private int cityId;
	private String cityName;
	private int provinceId;

	public int getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}
