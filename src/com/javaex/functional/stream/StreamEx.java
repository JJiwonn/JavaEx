package com.javaex.functional.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.IntStream;

public class StreamEx {

	public static void main(String[] args) {
		int scores [] = {80, 90, 70, 100, 60, 50};
		
		// 배열에서 스트림 뽑아내는 방법
		IntStream arrStream = Arrays.stream(scores);
		System.out.println(arrStream);
		
		// 컬렉션 순회
		Iterator<Student> it = lst.iterator();
		while(it.hasNext()) {
			Student st = it.next();
			System.out.println(st);
		}
		// forEach
		lst.stream()
		         .forEach(obj -> System.out.println(obj));

	}
	
	private static void testCountSum(int[] arr) {
	// count : 요소의 개수를 카운트하는 함수(집계)
	int numCount = (int)Arrays.stream(arr).count();
	System.out.println(Arrays.toString(arr)+
			": count = " + numCount);
	
	// sum : 기본형 특화 스트림에서만 사용가능
	// 기본형 특화 스트림 : primitve type을 처리하기 위해 만들어진 스트림
	// 예) IntStream, LongStream,DoubleStream
	// 배열로부터 70점 이상인 점수를 필러링 모두 합산
	System.out.println("70점이상 점수 합계: "
	+Arrays.stream(arr).filter(n -> n >= 70).sum());
	}
	
	private static void testFilterSort(List<Student> list) {
		System.out.println("===============stream filter + sort");
	// 평균점 70점이상인 학생 목록으로부터 학생 이름의 오름차순으로 정렬하여 출력
		list.stream() // 스트림 생성
		.filter(obj -> obj.getAverage() >= 70) // 필터 함수
		.sorted((obj1, obj2) 
				-> obj1.getname().compareTo(obj2.getname())) // 정렬(오름차순)
		.sorted((obj1, obj2) 
				-> -obj1.getname().compareTo(obj2.getname())) // 정렬(오름차순)
		.forEach(System.out::println);
 
	}
	
	private static void testReduce(int[]arr) {
		System.out.println("원본 : " + Arrays.toString(arr));
		System.out.println("===============stream reduce");
		
		int total = Arrays.stream(arr)
				.reduce(0,             // 누산기 초기값
						(acc,curr) -> {// acc : 누산기, curr : 현재 요소
							System.out.println("acc : " + acc);
							System.out.println("curr : " + curr);
							return acc + curr;
						});
		System.out.println("Total : " + total);
	}
	
	

}
