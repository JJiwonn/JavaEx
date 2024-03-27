package com.javaex.oop.casting;

public class Animal {
// 필드
	protected String name;
	
	// 생성자
	public Animal(String name) {
		//외부로 부터 받은 생성자를 셋팅한다는 의미
		this.name = name;
	}
	
	// 메서드
	public void eat() {
		System.out.println(name + "이 먹고 있다.");		
	}
	
	public void walk() {
		System.out.println(name + "은 산책중...");
	}
	
}
