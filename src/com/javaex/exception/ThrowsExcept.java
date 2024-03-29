package com.javaex.exception;

import java.io.IOException;

// 사용자 정의 예외
class CustomArithException extends ArithmeticException {
	// 필드
	private int num1;
	private int num2;

	// 생성자
	public CustomArithException(String message, int num1, int num2) {
		super(message);
		this.num1 = num1;
		this.num2 = num2; 
	}
	//getter의 역할 
	//내부필드데이터를 꺼내서 외부로 전달하는것인데 파라미터는 있을 필요가 없다.
	
	// 파라미터 : 모델이 데이터로부터 학습하는 값.
	
	//setter의 역할
	//외부에서의 데이터를 파라미터하여 내부 필드에 세팅하기에 리턴은 필요없다. 대신 void필요.
	//클래스 필드가 은닉되어있기에 우회접근통로가 필요하여 사용하는 것이다.
	//이 클래스에서는 setter는 세팅해줄 필요 없음.

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

}

public class ThrowsExcept {
	public void excuteExcept() throws IOException {
		System.out.println("강제 예외 발생!");

		throw new IOException("강제 예외!");
		// IOExceptiondms checkedException
		// 을 할 때는 해당 메서드가 을 던져준다는 점을
		// 외부의 메서드
	}

	public void executeRuntimeException() {
		// 런타임 익셉션
		// 예외 처리 없이도 컴파일은 되지만
		// 예외처리를 거쳐야 안전성 보장
		// throw를 명시하지 않는다.
		System.out.println("런타임 익셉션");
		throw new RuntimeException("런타임 익셉션");
	}

	// 두개의 숫자를 나누는 코드
	public double divide(int num1, int num2) {
		// 예외 발생시 보다 구체적인 예외로 변환한 후
		// 예외 상황의 정보를 추가해서 예외를 반환하는 것이 좋다.
		double result = 0;

		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			// 보다 구체적인 예외로 전환시킨다.
			CustomArithException cae = new CustomArithException("사용자 정의 Exception", num1, num2);
			// 전환된 사용자 정의 예외를 throw
			throw cae;
		}
		return result;
	}

}
