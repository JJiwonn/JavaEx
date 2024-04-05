package com.javaex.api.arrays;

import java.util.Arrays;
import java.util.Collections;

// 사용자 정의 클래스를 Sort 하고자 할 때, Comparable 인터페이스를 구현해야한다.
class Member implements Comparable { // (원래는 따로 클래스를 만들어야하지만 편의상 위쪽에 만듦)

	// 필드 선언
	String name;
	
	// 생성자 
	public Member(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		// 두 객체의 선후 관계를 비교해서 -1, 0, 1을 return.
		// 비교 대상의 순서가
		// 작은 경우: -1, 동일한 경우 : 0, 큰 경우: 1
		if(o instanceof Member) {
			// Member로 캐스팅 가능
			Member other = (Member)o;
			// 대소 관계의 비교는 name 필드로 비교하기로 함.
			return name.compareTo(other.name);
		}
		
		return 0;
	}
	
	
}

public class SortEx {

	public static void main(String[] args) {
		// 1. 기본 소팅(정렬)
		basicSort();
		// 2. 역순정렬
		basicDescSort();
		// 3. 사용자 정의 클래스 정렬
		customClassSort();

	}
	
	private static void basicSort() {
		int [] scores = {80, 50, 30, 90, 75, 88, 77};
		//ㄴ
		System.out.println("배열 원본: " + Arrays.toString(scores));
		
		// 작은숫자에서 큰숫자로 올라가는 것 : 오름차순(Ascending)
		Arrays.sort(scores);
		System.out.println("오름차순 정렬: " + Arrays.toString(scores));
	}
	
	private static void basicDescSort() {
		Integer[] scores = {80, 50, 30, 90, 75, 88, 77};
		// ㄴ객체 내부의 Comparator객체의 선후 관계를 규정해야 하기 때문에 프리미티브타입은 역순정렬 될 수 없다.
		// ㄴ객체타입이기 때문에 객체비교가 이루어지기에 int가 아닌 Integer을 써야한다.
		System.out.println("배열 원본: " + Arrays.toString(scores));
		
		// 큰숫자에서 작은숫자로 내려가는 것 : 내림차순(Descending)
		Arrays.sort(scores,      // 정렬할 배열
				    Collections.reverseOrder());
		System.out.println("내림차순 정렬: " + Arrays.toString(scores));
	}
	
	private static void customClassSort() {
		// 사용자 정의 클래스의 정렬
		Member[] Members = {
				new Member("홍길동"),
				new Member("고길동"),
				new Member("장길산"),
				new Member("임꺽정")	
		};
		System.out.println("원본 배열: " + Arrays.toString(Members));
		Arrays.sort(Members);
		System.out.println("오름차순 정렬: " + Arrays.toString(Members));
		Arrays.sort(Members,Collections.reverseOrder());
		System.out.println("내릶차순 정렬: " + Arrays.toString(Members));
		
	}

}
