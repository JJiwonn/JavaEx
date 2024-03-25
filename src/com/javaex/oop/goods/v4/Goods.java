package com.javaex.oop.goods.v4;

// v4. this 
// 현재 자기자신의 객체를 의미한다.
// this()의 의미는 현재 Class내부에 다른 생성자를 호출할 때 사용할수 있다.
public class Goods {
    // 필드 선언
	// instance 영역
	private String name; // 상품명
	private int price;  // 가격
	
	// name 필드 생성자
	public Goods(String name) {
		this.name = name; 
    //ㄴname을 초기화하는 생성자는 여기에 이미 있기 때문에, 다음에 필요할 때 똑같이 작성하지 않는다.
		System.out.println("name 필드 초기화 생성자");
	}
	// 전체 필드 생성자 
	public Goods(String name,
			int price) {
		// 객체 초기화를 담당
	    this(name); // -> 위에 사용된 Goods(String name) 생성자를 호출하는 코드
	    this.price = price;
	    System.out.println("전체 필드 초기화 생성자");
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
