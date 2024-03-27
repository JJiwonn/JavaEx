package com.javaex.oop.point.v4;

// 상속 Extends
public class ColorPoint extends Point{
        // 필드
	    private String color;
	    
	    // 생성자
	    // 기본 생성자가 없으면 자바컴파일러가 기본생성자를 추가하여 컴파일한다.
	    public ColorPoint(String color) {
	    	super(0, 0);
	    	this.color = color;
	    }
	    
	    public ColorPoint(int x, int y,
	    		String color) {
	    	super(x, y);
	    	this.color = color;
	    }
	    
		// getters/setters
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		@Override
		public void draw() {
			// getter 이용 우회접근을 해준다.
//			System.out.printf("색깔점[x=%d, y=%d, color=%s]점을 찍었습니다.%n",
//					super.getX(), super.getY(), color);
			// Point의 필드가 Private이기 때문에 getter를 사용하여 우회접근을 하거나
			// Private를 protected로 바꿔준다. 그럼 시스템이 아래처럼 달라진다.
	        System.out.printf("색깔점[x=%d, y=%d, color=%s]점을 찍었습니다.%n",
	        				x, y, color);
		}
		
		// void draw(boolean) 오바라이드
		@Override
		 public void draw(boolean bDraw) {
			  String message = String.format("색깔점[x=%d, y=%d, color=%s]을 ",
					  x, y, color);
			  message += bDraw ? "그렸습니다." : "지웠습니다.";
			  System.out.println(message);
		  }
}