package com.soshow.ssi.county.domain;

/**
 * 
 * @version 1.0
 * @author wlm
 * @date 2014年12月9日 上午11:09:41
 *
 */
public class County {

	private int countyId;
	private String countyName;
	private int cityId;

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getCountyId() {
		return countyId;
	}

	public void setCountyId(int countyId) {
		this.countyId = countyId;
	}

	public String getCountyName() {
		return countyName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

}
