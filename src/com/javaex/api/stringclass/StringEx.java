package com.javaex.api.stringclass;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		// 문자열 기본
//		stringBasic();
		// 문자열의 다양한 메서드
		usefulMethods();
		
	}
		
	private static void stringBasic(){
		String s1 = "Java"; // 리터럴
		String s2 = new String("Java"); // 메모리에 직접 객체 생성
		String s3 = "Java"; // 리터럴
			
		// 리터럴과 new 객체 생성이 다르게 작동한다.
		System.out.println(s1 ==s2); // 주소 비교 : Literal vs new
		System.out.println(s1 ==s3); // Literal vs Literal
		// 리터럴의 경우, 데이터가 같으면 같은 객체로 취급한다.
			
		// 배열을 이용한 String 생성자
		char[]letters = {'J', 'a', 'v', 'a'};
		String s4 = new String(letters);
		System.out.println(s4);	
		
		//.valueOf 메서드 -> 기본 타입을 문자열로 변환
		String s5 = String.valueOf(2024); // int -> String으로 변환
		System.out.println(s5);
		}
	
	private static void usefulMethods() {
		String str = "Java Programming, OOP Programming";
		
		System.out.println("str:" + str);
		
		// 문자열 길이 확인 : .length()
		System.out.println(".length()"+ str.length());
		// 인덱스 범위 : 0 ~ .length() -1
		
		// 변환 메서드
		System.out.println("toUpperCase:" + str.toUpperCase());// 전부 대문자로
		System.out.println("toLowerCase:" + str.toLowerCase());// 전부 소문자로
		
		// 검색
		System.out.println("charAt:"+ str.charAt(5)); // 5번 인덱스의 글자
		int index = 0; // 인덱스 저장 변수
		index = str.indexOf("Programming"); // str 내 "Programming"의 위치 인덱스
		//ㄴ 문자열 내 검색어
		
		System.out.println("1st search:"+ index);
		index += "Programming".length(); // 검색 시작 위치를 뒤로 이동시키는 작업
		index = str.indexOf("Programming", index); // 새로운 시작 위치에서 검색하도록 설정
		
		System.out.println("2nd search:"+ index);
		index += "Programming".length(); // 재검색하기위해 검색 시작위치를 뒤로 이동시켜야함
		index = str.indexOf("Programming", index); // 새로운 시작 위치에서 검색
		
		System.out.println("3rd search:"+ index); // 검색할 것이 없으면 -1이 나온다.
		// indexOf로 검색시 찾는 것이 없으면 -1
		
		index = str.lastIndexOf("Programming"); // 검색을 뒤에서부터 찾기
		
		System.out.println("lastIndexOf: "+ index);
		
		// 부분 문자열 추출: substring 사용
		System.out.println("substring: "+ str.substring(5)); 
		// ㄴ5번 인덱스부터 끝까지 추출한다는 의미
		
		System.out.println("substring: "+ str.substring(5,16));
		// ㄴ5번 인덱스부터 16번전까지의 인덱스를 추출해낸다는 의미
		
		// 치환: Replace, ReplaceAll
		System.out.println("replace" + str.replace("Programming", "Coding"));
		
		// Whitespace(공백, 개행, 탭문자) 지우기
		String str2 = "        HELLO      ";
		String str3 = ", Java";
		// 지우기
		String str4 = str2.trim();
		System.out.println(str4 + str3);
		
		// 원본 출력
		System.out.println("원본: " + str);
		// 문자열 데이어틑 불변(immutable)이다.
		// 여러가지 메서드를 통해 변화가 발생했더라도 원본은 유지된다.
		
		// 구분자로 분리 : split()
		String[] split = str.split(" ");
		//ㄴ공백문자를 기준으로 문자열을 분리 -> 문자열 배열로 변환하는 것
		System.out.println(Arrays.toString(split));
		
		for(String data: split) {
			System.out.println("조각" + data);
		}
		
		// 문자열 비교 메서드: compareTo
		// 문자열 Unicode 비교
		// 같으면(0), 작으면 음수(-1), 크면 양수(1)
		System.out.println("ABC".compareTo("ABB")); // 문자열도 순서에 따라서 크기를 결정한다.
				
	}

}
