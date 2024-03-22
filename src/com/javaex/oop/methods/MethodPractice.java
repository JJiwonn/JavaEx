package com.javaex.oop.methods;

public class MethodPractice {

	public static void main(String[] args) {
		// 매개변수 없고 리턴 값 없고
		printHelloMethod();// 문제1
		printNumbers(); // 문제2
		// 매개변수 없고 리턴 값 있고
		int rnd = getRandomNumber(); // 랜덤정수 하나를 돌려줄게라는 뜻/ 문제3번에서의 rnd와는 다른 놈이다.
		System.out.println(rnd); // 문제3
		//문제4.
		int result = getSum();
		System.out.println(result);
		//문제5.
		printOddOrEven(2023);
		//문제6.
		printStringLength("java programming");
		//문제7.
		int largeNumber = printLargeNumber(10,20);
		  System.out.println(largeNumber);
		//문제8.
		 System.out.println(concatenateString("Java ",
				                          "programming"));
		//문제9.
		 System.out.println(sumAll(1,2,3,4,5,6,7,8,9));
		// 문제10.
		 System.out.println(concatenateStrings("Java ",
				 "programming ",
				 "is ",
				 "fun!"));

	}
        // 문제1.
	    private static void printHelloMethod() {
	    	System.out.println("HelloMethod!");	//콘솔출력내용
	    }
	    // 문제2.
	    private static void printNumbers() {
	    for(int i = 1; i <=10; i++) {
	    	System.out.print(i + "\t");
	    }
	    System.out.println(); // 이 문장이 있어야 다음행에 확인가능
	    //System.out.println("1,2,3,4,5,6,7,8,9,10"); // 이것도 가능
	    }
	    // 문제3.
        private static int getRandomNumber() { // 정수라서 돌려줄 타입을 int로 잡아줌
        	int rnd = (int)(Math.random() * 101); // 소수점 아래를 날려주기 위해서 (괄호)쳐줌
        	return rnd; // 현재 rnd는 private 아래에서만 사용가능한 것임
        }
        // 문제4.
        private static int getSum(){
        	int result = 0;
        	for (int i = 0; i <=10; i++) {
        		result += i;
        	}
        	return result;
        }
        // 문제5.if문으로도 가능하고 3항연산으로도 가능함
        public static void printOddOrEven(int value) {
        	System.out.println(
        			value % 2 == 0 ? "짝수" : "홀수"
        			);
        }
        // 문제6.
        private static void printStringLength(String str) {
        	System.out.println(str.length());
        }
        
        // 문제7.
        private static int printLargeNumber(int num1, int num2) {
        	if (num1 > num2 ) {
        		return num1;
        	} else {
        		return num2;
        	}
        }
        // 문제8.
        private static String concatenateString(String str1,
        		               String str2) {
        	return str1 + str2;
 
       }
        // 문제9.
        private static int sumAll(int ... values) {
        	int total = 0;
        	for (int val :values) {
        		total += val;
        	}
        	return total;
        }
        // 문제10.
        private static String concatenateStrings(String ...values){
        	String result = "";
        	
        	for(String val :values) {
        		result += val;
        	}
        	return result;
        }
}
