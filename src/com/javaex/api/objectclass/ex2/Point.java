package com.javaex.api.objectclass.ex2;

// 두 객체의 내부 데이터의 같음을 확인하는 equals 메서드
public class Point { // extends java.lang.Object가 생략된 상태
	
	//필드
	private int x;
	private int y;
	
	
	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// equals : 두 객체의 내부 데이터가 같음을 확인하는 메서드
	@Override
	public boolean equals(Object obj) {
		//equals(new Point)가 아닌 equals(Object obj)로 들어오면 
		//첫번째,Point 확인 또는 두번째, obj에서 Point로 casting해줘야함
		if(obj instanceof Point) {
			Point other = (Point)obj;
			// 두 객체가 동등하다면
			// 두 객체의 x필드가 같고, 두 객체의 y 필드가 같아야 동등하다고 본다.
			//return x == other.x && y == other.y;
			
			if(x == other.x && y == other.y) {
				return true;
			}else {
				return false;
			}
		}
		// obj가 Point가 아님을 알수있음
		// 부모에게 비교 방법을 위임할 수 있다.
		return super.equals(obj);
	}
	
	// toString : 객체 정보를 문자열로 출력할 때 호출되는 메서드
	@Override
	public String toString() { //포맷팅이후에 문자열로 돌려준다.
		return "Point(" + x + "," + y + ")";
	}

}
