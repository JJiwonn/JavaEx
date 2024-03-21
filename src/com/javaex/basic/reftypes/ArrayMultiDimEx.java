package com.javaex.basic.reftypes;

public class ArrayMultiDimEx {

	public static void main(String[] args) {
		// 2차원 배열의 선언 p.123
		int[][]twoDimen = new int [5][10]; // 5X10 배열을 만들자.
		
		int[][]table = {
				{1,2,3,4,5,6,7,8,9,10},
				{2,3,4,5,6,7,8,9,10,1},
				{3,4,5,6,7,8,9,10,1,2},
				{4,5,6,7,8,9,10,1,2,3},
				{5,6,7,8,9,10,1,2,3,4},
				
			//처음에 선언할때 가능하다(무슨말이지?)
				
		 };
		  System.out.println(table);
 // 출력할 때 기본적으로 객체형이다. 객체의 기본형태로 나온값이다.[[I@1f32e575 이런식으로.
			  
		  System.out.println("table.length:" + table.length);
		  System.out.println("table[0].length:" 
		                       + table[0].length);
		  
		  // 행 루프
		  int sum = 0; // 내부 데이터 합산해보기
		  for(int row = 0; row < table.length; row++) {
		  // 열 루프
	      for(int col = 0; col < table[row].length; col++) {
				
	    	 System.out.print(table[row][col]+"\t");
	    	 sum += table[row][col];
			  }
	        System.out.println();
		  }
		  System.out.println("총합:" + sum);
		}
		

	}


