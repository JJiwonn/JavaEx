package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		// List는 객체가 아니라 인터페이스(특정기능을 사용할 수 있는 것)
		// 순서가 있다.
		// 중복을 허용한다.
		
		List<String> lst = new LinkedList<>();
//		List<String> lst = new ArrayList<>();
		
		// 객체 추가 : .add
		lst.add("Java");
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		
		System.out.println("lst=" + lst);
		
		// 객체 삽입
		lst.add(2,"C#");
		System.out.println("lst=" + lst);
		
		// 리스트는 중복 삽입을 허용한다.
		lst.add("Java");
		System.out.println("lst=" + lst);
		
		System.out.println("size:" + lst.size());
//		System.out.println("capacity:" + lst.capacity());
		
		// 삭제 : 인덱스 삭제
		lst.remove(2);
		// 객체 삭제
		lst.remove("Python");
		
		System.out.println("lst=" + lst);
				
	      // TODO : List 순회
		System.out.println("==========Iterator");
		Iterator<String> it = lst.iterator(); // 반복자 추출
		
		while(it.hasNext()){ // 뒤에 더 있니?
			String item = it.next();
			System.out.print(item + " ");
		}
		
		// 비워보자
		lst.clear();
		System.out.println("lst=" + lst);
	}

}
