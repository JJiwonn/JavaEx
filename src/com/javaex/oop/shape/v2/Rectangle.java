package com.javaex.oop.shape.v2;

public class Rectangle extends Shape implements Drawable{
     // 필드
	private int width;
	private int heigth;
	
	//생성자
	public Rectangle(int x, int y, int width, int heigth) {
		super(x, y);
		this.width = width;
		this.heigth = heigth;
	}
	// 추상메서드 구현(구현하지 않으면 public class Rectangle extends Shape 여기에서 오류가 난다.)
	@Override
	public double area() {
		return width * heigth;
	}
	@Override
	public void draw() {
		System.out.printf("사각형[x=%d, y=%d, w=%f, h=%f, area=%f]을 그렸어요.%n",
				x, y, width, heigth, area());
	}
}
