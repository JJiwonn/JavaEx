package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionEx {
	
	// 정수 1개 입력
	// 100을 입력받은 정수로 나눔
	// 나눗셈 결과를 화면에 출력
   public static void main(String[] args) {
		// 변수 선언
	   double result = 0; 
	   // 마지막으로 double result; 에서 double result = 0;으로 초기화해준다.
	   int num;
	   
	   // 스캐너 개방
	   // 정수 1개 입력
	   Scanner scanner = new Scanner(System.in);
	   System.out.print("정수 입력:");
	  
	   // 100을 입력받은 정수로 나눔
	   try { // 예외 발생 가능영역을 try 블록으로 감싼다.
	   num = scanner.nextInt();
	   result = 100 / num;
	   
	       // 앞쪽에서 구체적 에러 처리
	       // 가장 마지막에 Exception으로 잔여 에러 처리
	   } catch(InputMismatchException e) {
		   System.err.println("정수로 입력해 주세요");
	   } catch(ArithmeticException e) { 
		   // 이 안으로 들어온 것들은 100% ArithmeticException이다.
		   // 구체적인 예외 처리 로직 수행 가능하다.
		   System.err.println("0으로는 나눌 수 없습니다.");
	   } catch(Exception e) { // 모든 예외 (정보) 클래스로 catch한다.
		   e.printStackTrace(); // 예외 스택은 클래스가 가진 많은 정보들을 보여준다.
	   }finally { 
		   // 예외 유무 관계 없이 가장 마지막에 1회 실행된다.
		   // try 블록에서 설정된 시스템 자원 등을 해제할 때 사용한다.
		   // finally 블록은 필수는 아니고 선택이다.
		   System.out.println("예외처리 종료.");
	   }
	  
	   // 나눗셈 결과를 화면에 출력
	   System.out.println(result);
	   
	   scanner.close();

	}

}
