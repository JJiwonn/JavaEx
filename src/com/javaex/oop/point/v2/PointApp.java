package com.javaex.oop.point.v2;

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
	}

}
