package com.javaex.oop.point.v4;
//v3. Method overloading
public class PointApp {

	public static void main(String[] args) {
//		Point p1 = new Point();
		Point p1 = new Point(5,5);
		
//		p1.setX(5);
//		p1.setY(5);
		
//		Point p2 = new Point();
		Point p2 = new Point(10,23);
//		p2.setX(10);
//		p2.setY(23);
		
		p1.draw();
		p2.draw();
		
		// 오버로딩된 메서드 호출
		p1.draw(true); // 그리기
		p1.draw(false); // 지우기
		p2.draw(true);
		p2.draw(false);
		
		ColorPoint cp1 = new ColorPoint("red");
		
		cp1.draw();
		
        ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		
		cp2.draw();
		
		
	}

}