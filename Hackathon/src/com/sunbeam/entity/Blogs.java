package com.sunbeam.entity;

import java.util.Date;

public class Blogs {
	private int id;
	private String title;
	private String contents;
	private Date date;
	private int user_id;
	private int category_d;
	public Blogs() {
		super();
	}
	public Blogs(int id, String title, String contents, Date date, int user_id, int category_d) {
		super();
		this.id = id;
		this.title = title;
		this.contents = contents;
		this.date = date;
		this.user_id = user_id;
		this.category_d = category_d;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getCategory_d() {
		return category_d;
	}
	public void setCategory_d(int category_d) {
		this.category_d = category_d;
	}
	@Override
	public String toString() {
		return "Blogs [id=" + id + ", title=" + title + ", contents=" + contents + ", date=" + date + ", user_id="
				+ user_id + ", category_d=" + category_d + "]";
	}
	
}
