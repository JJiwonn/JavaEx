package com.javaex.basic.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
		// 배열 생성하는 여러가지 방법
		String[] names; // 타입[] 식별자
		int scores[];  //  타입 식별자[]
		// 배열을선언하는 방법은 위에 방법처럼 두가지이다.
		
		//초기화하는 방법도 여러가지이다.
		names = new String[] { // 배열로 주어진 값의 목록으로 갯수판별가능함
			"김", "이", "박", "정"
		}; // new 키워드로 기본값과 함께 생성할 수 있다.
		
		float height[] = {
             175.5f,
             170.2f,
             180.3f,
             165.2f
	}; // 값 목록을 가지고 있을 때
		
		scores = new int[4] ;
	 // 값을 가지고 있지 않고, 공간의 개수만 알고 있을 때 공간의 개수를 명시해줘야함
	  
	
	scores [0] = 80;
	scores [1] = 90;
	scores [2] = 85;
	scores [3] = 88;
	
    // 인덱스는 0부터, 총길이는 .length-1
    // 길이 체그하고 인덱스를 접근해야 한다. 맨 마지막 scores[4]=100;은 빼야함
	
	for (int i =0; i<names.length; i++) {
		System.out.printf("%s(%.2f) : score = %d%n",
				names[i],
				height[i],
				scores[i]);
						
					
	}
	}
}


