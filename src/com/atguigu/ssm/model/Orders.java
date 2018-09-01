package com.atguigu.ssm.model;

import java.util.Date;

public class Orders {

	private int id;
	private Date createtime;
	private String number;
	private String note;
	private int user_id;
	//多个订单对应一个用户
	private User user;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Orders(int id, Date createtime, String number, String note,
			int user_id, User user) {
		super();
		this.id = id;
		this.createtime = createtime;
		this.number = number;
		this.note = note;
		this.user_id = user_id;
		this.user = user;
	}

	public Orders() {
		super();
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", createtime=" + createtime + ", number="
				+ number + ", note=" + note + ", user_id=" + user_id
				+ ", user=" + user + "]";
	}
	
}
