package com.javaex.oop.shape.v2;

// 추상클래스
// ㄴ 자신이 객체화 될 수는 없다.
// ㄴ 상속을 위한 부모 클래스로만 존재
// ㄴ 안쪽에 추상 메서드를 가져야한다.
// ㄴ 상속 받은 클래스는 선언된 추상 메서드를 구현해줘야한다.
public abstract class Shape {
	// 필드
	protected int x;
	protected int y;
	
	// 생성자
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
    // 추상 메서드
	// ㄴ 추상 메서드는 구현문은 없고 추상문만 있다.
	// ㄴ 추상 클래스를 상속 받은 클래스에서 반드시 구현해야한다.
//	public abstract void draw();직접적인 상속관계에서 벗아나기에 주석처리
	// interface에 위임
	public abstract double area();
}
