package com.javaex.practice;

public class BreakEx {
        // 6과 14로 모두 나누어 떨어지는 숫자 찾기
	    //어디까지 돌려야 나오는지 알수없기 때문에 반복횟수를 알수없기에 while 구문사용
	
	public static void main(String[] args) {
	 int num = 1;
	 
	   while(true) {
		   if (num % 6 == 0 && num % 14 == 0) {
			   break;
		   }
		    num += 1;		    
	   }
            System.out.println(num);
	}

}
