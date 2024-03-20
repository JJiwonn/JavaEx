package com.javaex.practice;

public class Practice {

	public static void main(String[] args) {
		forGugu();
		// 구구단을 만드는 방법 2개

		for (int dan = 2; dan <= 9; dan++) {
			for (int num = 1; num <= 9; num++) {
				System.out.println(dan + "*" + num + "=" + dan * num);
			}
		}

	}

	private static void forGugu() {
		// TODO Auto-generated method stub

	}

}
