package com.soshow.ssi.account.domain;
/**
 * 
 * @version 1.0
 * @author wlm
 * @date 2014年12月4日 下午1:40:39
 *
 */
public class Account {

	private String entertime;
	
	private String updatetime;
	
	private int gold;

	public String getEntertime() {
		return entertime;
	}

	public void setEntertime(String entertime) {
		this.entertime = entertime;
	}

	public String getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	@Override
	public String toString() {
		return "Account [entertime=" + entertime + ", updatetime=" + updatetime + ", gold=" + gold
				+ "]";
	}
	
}
