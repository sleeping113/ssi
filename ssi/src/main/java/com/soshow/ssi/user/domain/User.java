package com.soshow.ssi.user.domain;

/**
 * 
 * @version 1.0
 * @author wlm
 * @date 2014年12月3日 下午6:12:42
 *
 */
public class User {

	private String username;

	private String password;

	private String sex;

	private int age;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", sex=" + sex + ", age="
				+ age + "]";
	}

}
