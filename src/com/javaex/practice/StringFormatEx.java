package com.javaex.practice;

public class StringFormatEx {

	public static void main(String[] args) {
		// %s(문자열) , %d(십진수) ,  %n(개행)
		// __개의 _중에서 __개를 먹었다
        String fruit = "사과";
        int total = 10, eat = 3;
        
        System.out.printf("%d개의 %s중에서 %d개를 먹었다%n", // 포맷문자열
        		total, fruit, eat); // 순서중요
        
        // %d의 천단위 구분 기호: %,d -> 천단위마다 구분해서 사용가능
        int amount = 1_234_567_890; //-> 콤마대신에 아랫기호사용
        System.out.printf("%,d%n",amount);
       
        
        double pi = Math.PI; // 내장상수파일을 만든것
       System.out.printf("PI:%.2f%n", pi); // 소수점 2째 자리까지
      
        // 포맷 형식은 String guddml .format 메서드에서 구현된다
        String fmt = "%d개의 %s 중에서 %d개를 먹었다%n";
        System.out.println(fmt.formatted(10,"바나나",2));
        
	}

}
