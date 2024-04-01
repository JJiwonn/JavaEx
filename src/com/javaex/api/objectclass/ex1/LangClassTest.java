package com.javaex.api.objectclass.ex1;

public class LangClassTest {

	public static void main(String[] args) {
		// Object 클래스의 기본 메서드들
		Point p = new Point(10,10);
		
		// Java의 최상위 클래스는 Object-> 모든 기본 기능을 물려받는다.
		System.out.println(p.getClass().getName()); // 클래스의 이름 반환
		System.out.println(p.hashCode()); // hashCode-> 객체 식별값(기본적으로는 문자열이 아닌메모리주소이다)
		System.out.println(p.toString()); // 객체의 내용을 문자열로 출력 가능
		System.out.println(p);
		
		// p의 부모 객체 정보 확인
		System.out.println(p.getClass()      // 현재 클래스의 정보확인
				            .getSuperclass() // 현재 클래스의 부모 클래스 정보확인
				            .getName());     // 이름확인
		
		Point p2 = new Point(10,10);
		System.out.println(p2.hashCode());   // hashCode
		//p와 p2의 주소는 동일하지만 둘의 hashCode는 다르다

	}

}
