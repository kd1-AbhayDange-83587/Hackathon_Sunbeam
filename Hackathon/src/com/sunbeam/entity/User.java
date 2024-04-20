package com.sunbeam.entity;

import java.util.Date;

public class User {
	private int id;
	private String full_name;
	private String email;
	private String password;
	private String phone_no;
	private Date created_time;
	public User() {
		super();
	}
	public User(int id, String full_name, String email, String password, String phone_no, Date created_time) {
		super();
		this.id = id;
		this.full_name = full_name;
		this.email = email;
		this.password = password;
		this.phone_no = phone_no;
		this.created_time = created_time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public Date getCreated_time() {
		return created_time;
	}
	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", full_name=" + full_name + ", email=" + email + ", password=" + password
				+ ", phone_no=" + phone_no + ", created_time=" + created_time + "]";
	}
	
	
}
