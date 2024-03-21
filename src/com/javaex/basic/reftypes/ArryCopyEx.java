package com.javaex.basic.reftypes;

import java.util.Arrays; // 유틸리티를 하기위해서 작성해줘야 할 부분

public class ArryCopyEx {
	// 배열은 크기 변경 불가
	// 공간을 늘리고자 한다면 새 배열을 만들고 복사해야한다.

	public static void main(String[] args) {
		// for문을 이용한 배열 복사
		//arrayCopyByFor();
		// System을 이용한 배열 복사
         arrayCopyByStstem();
	}
	
	public static void arrayCopyByFor() {
		int scores[] = {1,2,3,}; // .length ==3
		for(int i =0; i< scores.length; i++) {
			System.out.print(scores[i]+"\t"); 
			// 현재 지금 이 데이터를 더 넓은 공간으로 옮겨준다.
		}
		System.out.println();
		
		// 새로운 공간을 만들어서 복사해보자.
		int target[] = new int [10];
		for(int i =0; i < scores.length; i++) {
			target[i] = scores[i];
		}
		// 배열 유틸리티 클래스를 이용한 출력
		System.out.println(Arrays.toString(target));
	}

	  public static void arrayCopyByStstem() {
	   int source[] = {1,2,3};
	   int target[]= new int[10];
	   
	   System.out.println("soure:" + 
	                        Arrays.toString(source));
	   
	   // 배열 복제
	   System.arraycopy(source, // 원본배열
			            0,  // 복사 시작 인덱스(원본)
			            target, // 복사 대상 배열
			            0, // 대상 배열의 시작 인덱스
			            source.length); // 복사할 길이
	   System.out.println("target:"
			                + Arrays.toString(source));
	   
	   // Enhanced For
	   // for (추출된 데이터: 원본 배열 혹은 컬랙션)
	      for (int value: target) {
		    System.out.print(value + "\t");
	   }
	      System.out.println();
	 }
}
