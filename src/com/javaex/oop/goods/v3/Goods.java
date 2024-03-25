package com.javaex.oop.goods.v3;

// v3. 생성자
public class Goods {
    // 필드 선언
	// instance 영역
	private String name; // 상품명
	private int price;  // 가격
	
	// 생성자를 하나도 선언하지 않았을 경우
	// 자바 컨파일러가 기본 생성자를 추가한다.
	// ㄴ우리눈에 보이지 않지만 자동으로 생성자를 생성한다.
	// ㄴ객체화하기 위해서는 기본1가지 이상 생성자가 있어야한다.
	// 만약에 개발자가 생성자를 만들었을 경우에는 기본 생성자가 생성되지 않는다.
	
	// 생성자 [문제]03파일-25쪽
	public Goods(String name,
			int price) {
		// 객체 초기화를 담당
	    this.name = name;
	    this.price = price;
	}
	
	
	
	
	
	
	// Getter Setter
	// 외부에서 내부로 가져오는 것이 목적
	// Setter가 없으면 Read Only 필드를 만들수 있고
	// Getter Setter 모두 없으면 플이빗 필드가 된다
	public String getName() {
		// 메서드 영역
		return name;
	}
//      public void setName(String name) { //외부로부터 전달받은 이름
//		this.name = name; // 인스턴스의 이름을 구분해준다	
//	}
	public int getPrice() {
		return price;
	}
//      public void setPrice(int price) {
//      getter/setter를 활용하면 무결성 체크가능
//      인증 체크 같은 로직을 수행 가능하다.
//		if(price < 0) {
//		  this.price = price;
//		} else {
//			this.price = price;
//		}
//	}
	
	// 일반 메서드
	public void showInfo() {
		System.out.printf("상품이름:%s%n 가격: %,d%n",
				name, price);
	}
}
