package com.javaex.oop.staticmember;

public class SingletonApp {

	public static void main(String[] args) {
		//Singleton s1 = new Singleton(); // 오류: Singleton의 생성자가 private이기 때문에
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		
		// 두 객체는 같은 객체인가?
		System.out.println("s1 == s2 ? " + (s1 == s2));
	}

}
