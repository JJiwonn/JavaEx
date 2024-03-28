package com.javaex.oop.shape.v2;

// 인터페이스내의 모든 추상 메서드는 반드시 구현해야 한다.
public class Circle extends Shape{
	// 추상클래스안에 메서드를 구현하지 않아서 오류가 난다.
	
	// 필드
	private double radius;
	
	// 생성자
	public Circle(int x, int y, double radius) {
		// 부모 생성자 호출
		super(x, y);
		this.radius = radius;
	}
	// 부모가 선언한 추상메서드는 반드시 구현해줘야 한다.
	@Override
	public void draw() {
		System.out.printf("원[x=%d, y=%d, r=%f, area=%f]을 그렸어요.%n",
				x, y, radius, area());
	}
	
	@Override
	public double area() {
		double area = Math.PI * Math.pow(radius, 2);
		// double area = Math.PI * radius * radius 로 해도 상관없음
		//제곱을 만들려면 radius를 두번곱해야하기때문에.
		return area;
	}

}
