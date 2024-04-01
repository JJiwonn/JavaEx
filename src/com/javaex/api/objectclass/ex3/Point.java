package com.javaex.api.objectclass.ex3;

// 객체의 복제
// 얕은 복제 : 필드의 값만 동일하게 복제한 것(프리미티브 타입일 경우)
public class Point implements Cloneable{ 
	// Object이 가진 clone() 메서드를 사용하려면
	// Cloneable 인터페이스를 구현해야 한다.
	
	//필드
	private int x;
	private int y;
	
	
	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// getters/setters
	public int getX() {
		return this.x; // 내부 필드를 외부로 전달
	}	
	public void setX(int x) {
		this.x = x; // 외부 파라미터를 내부 필드로 세팅
	}
	public int getY() {
		return this.y; // 내부 필드를 외부로 전달
	}	
	public void setY(int y) {
		this.y = y; // 외부 파라미터를 내부 필드로 세팅
	}
	
	
	// equals : 두 객체의 내부 데이터가 같음을 확인하는 메서드
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Point) {
			Point other = (Point)obj;
			
			
			if(x == other.x && y == other.y) {
				return true;
			}else {
				return false;
			}
		}
	
		return super.equals(obj);
	}
	
	@Override
	public String toString() { //포맷팅이후에 문자열로 돌려준다.
		return "Point(" + x + "," + y + ")";
	}
	
	// 객체를 복제해서 새로운 Point를 반환하는 메서드
	public Point getClone() {
		// 새로 생성될 Point 객체
		Point clone = null;
		
		// 복제 시도
		// clone 메서드 반환 타입은 Object
		try {
		clone = (Point)clone();
		} catch(CloneNotSupportedException e) {
			// clone이 불가능한 상황에 대한 예외 처리
		}
		
		return clone;
	}

}
