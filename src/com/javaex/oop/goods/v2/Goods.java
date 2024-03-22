package com.javaex.oop.goods.v2;

// v2. private
public class Goods {
    // 필드 선언
	// instance 영역
	private String name; // 상품명
	private int price;  // 가격
	
	// Getter Setter
	// 외부에서 내부로 가져오는 것이 목적
	public String getName() {
		// 메서드 영역
		return name;
	}
	public void setName(String name) { //외부로부터 전달받은 이름
		this.name = name; // 인스턴스의 이름을 구분해준다	
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		// getter/setter를 활용하면 무결성 체크가능
		// 인증 체크 같은 로직을 수행 가능하다.
		if(price < 0) {
		  this.price = price;
		} else {
			this.price = price;
		}
	}
	
	// 일반 메서드
	public void showInfo() {
		System.out.printf("상품이름:%s%n 가격: %,d%n",
				name, price);
	}
}
