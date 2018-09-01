package com.atguigu.ssm.model;

import java.util.Date;
import java.util.Set;

public class User {
	private int id;
	private String username;
	private String sex;
	private Date birthday;
	private String address1;
	
	//一个用户对应多个订单
	private Set<Orders> orders;
	
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public User() {
		super();
	}
	public String getAddress1() {
		return address1;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", sex=" + sex
				+ ", birthday=" + birthday + ", address1=" + address1 + "]";
	}

	public Set<Orders> getOrders() {
		return orders;
	}

	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}
	
}
