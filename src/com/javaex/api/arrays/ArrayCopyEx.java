package com.javaex.api.arrays;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		char[] src = "Java Programming".toCharArray();
		System.out.println(src);
		System.out.println(Arrays.toString(src)); // 배열의 배용을 출력
		
		// System을 이용한 copy
		char target[] = new char[src.length];
		System.arraycopy(src,    // 원본 배열
				0,               // 복사시작인덱스
				target,          // 타겟 배열
				0,               // 타겟 배열의 복사 시작 인ㄴ덱스
				src.length);              // 복사할 길이
		System.out.println(target);
		System.out.println(Arrays.toString(target));
		
		// Arrays.copyOf을 이용한 copy
		target = Arrays.copyOf(src,    // 복사할 원본 배열
				src.length);           // 복사할 길이
		System.out.println(Arrays.toString(target));
		
		// Arrays.copyOfRange
		//ㄴ범위 복제(전체범위에서 내가 원하는 부분만 추출)
		target = Arrays.copyOfRange(src,  // 복사할 원본 배열
				                    5,    // 복사 시작 인덱스
				                    12);   // 복사 할 끝 인덱스
		
		System.out.println(Arrays.toString(target));
		
		

	}

}
