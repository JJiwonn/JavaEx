package com.javaex.test0419;

public class Customer extends User{
	
	// 필드
	private int point;
	
	// 생성자
	public Customer() {
		
	}
	
	// 초기화하는 생성자
	public Customer(String id, String pw, String name, int point) {
		super(id,pw,name);
		this.point = point;
	}
	
    // getters/setters
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public String toString() {
		return "아이디:" + id + " 비번:" + pw + " 이름:" + name + " 포인트:" + point;
	}
	
	@Override
	public void showInfo() {
		System.out.printf("%s: %s: %s: %d)%n",
				  id, pw ,name, point);
	}
	

}
