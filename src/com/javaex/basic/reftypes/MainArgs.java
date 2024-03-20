package com.javaex.basic.reftypes;

public class MainArgs {
// 배열 형태의 값 목록이 main 메서드로 전달
	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			System.out.printf("args[%d] = %s%n",
			i, args[i]);
			// length를 잡으면 4가 될것이고 0-3까지 문자가 나올것이다
		}

	}

}
