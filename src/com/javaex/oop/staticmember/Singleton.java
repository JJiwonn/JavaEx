package com.javaex.oop.staticmember;

// static 영역 활용
// Singleton의 목적은 단 하나의 인스턴스만 유지하는 것, 생성자를 막아버려야하는 것
// new  Singleton() -> 이 생성자가 실행되면 안되기에 아예 막아버려야한다.
public class Singleton {
	private static Singleton instance =
			new Singleton();
	
	private Singleton(){
		// private을 사용하면 new 생성 불가해진다
	}
	public static Singleton getInstance() {
		// 유일한 인스턴스 반환
		return instance;
	}
}
