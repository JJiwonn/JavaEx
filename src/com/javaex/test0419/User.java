package com.javaex.test0419;

public abstract class User {
	
	public abstract void showInfo();
	
	// 필드
	protected String id;
	protected String pw;
	protected String name;
	
	// 생성자
	public User () {
		
	}
	
	// 전체 생성자
	public User (String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	// getters/setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "id:" + id + " pw:" + pw + " name:" + name;
	}
	
	
}
