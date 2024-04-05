package com.javaex.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	@SuppressWarnings("unchecked")
	public static <E> void main(String[] args) {
		// 벡터 선언
		// 모든 객체(Object)를 담을 수 있는 컬렉션 객체
		// .elementAt등 참조를 위해서 실제 클래스로 Casting
		Vector v = new Vector(); // 기본 벡터 버퍼 용량 10
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		
		for(int i = 0; i < 10; i++) {
			// 요소 추가
			v.addElement(i); // auto boxing
		}
		
		System.out.println("Size:" + v.size() + 
				", Capacity:" + v.capacity());
		
		// 허용량 초과
		v.addElement(10);
		
		System.out.println("Size:" + v.size() + 
				", Capacity:" + v.capacity());
		
		// 조회 : elementAt
		Integer val = (Integer)v.elementAt(5);
		//ㄴ elementAt -> Object로 리턴해줘야함.
		System.out.println(".elementAt(5)" + val);
		
		// 역참조(검색)
		// 객체의 인덱스 조회
		System.out.println(".indexOf(5)" + v.indexOf(5));
		System.out.println(".indexOf(20)" + v.indexOf(20));
		// ㄴ 없는 객체는 -1로 표기된다.
		
		// 객체 포함 여부 : .contains
		System.out.println(".contains(7)" + v.contains(7));
		System.out.println(".contains(20)" + v.contains(20));
		// ㄴ 없는 객체는 false로 표기한다.
		
		// 삭제 : .removeElement
		v.removeElement(7);
		
		for(int i = 0; i < 10; i++) {
			Integer item = (Integer)v.elementAt(i);
			System.out.print(item + " ");
		}
		// 컬랙션 프레임워크에서는 루프의 개선이 필요
		// TODO : 루프 방식 개선
		System.out.println("\n=========== Enumeration");
		Enumeration<E> e =v.elements();
		while(e.hasMoreElements()) {
			//뒤쪽에 요소가 더 있는가?
			Integer item = (Integer)e.nextElement();
			System.out.print(item + " ");
		}
		System.out.println();
		
		System.out.println("Size:" + v.size() + 
				", Capacity:" + v.capacity());
		
		// 버퍼 비우기
		v.clear();
		System.out.println("v=" +v);
		
		System.out.println("Size:" + v.size() + 
				", Capacity:" + v.capacity());
		
		// Generic을 사용하여 코드 개선 가능
		// 예) Number을 상속한 모든 객체를 담을 수 있는 Generic을 사용
		Vector<Integer>v2 = new Vector<>();
		
		Enumeration<Integer> e2 = v2.elements();
		while(e2.hasMoreElements()) { // 뒤에 요소가 더 있니?
		   System.out.println(e2.nextElement());
			
		}

	}

}
