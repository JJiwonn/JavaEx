package com.javaex.thread.ex02;

public class MainThread {

	public static void main(String[] args) {
		// Working Thread 수행
		DigitThread thread = new DigitThread();
		thread.setName("DigitThread");
		// thread 시작
		// .start() 메서드 시작하기위해 메서드 호출
//		thread.start();
		// 1(MIN) ~ 5 (NORMAL) ~ 10(MAX)
		thread.setPriority(Thread.MAX_PRIORITY);
		
		// Runnable 활용한 쓰레드
		Thread runnableThread = new Thread(new AlphabetRunnable());
		runnableThread.setName("AlphabetRunnable");
		runnableThread.setPriority(Thread.MIN_PRIORITY);
		
		thread.start();
		runnableThread.start();
		
		
		// MainThread로직
		// A - Z까지 차례대로 출력
		/*
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("MainThread: " + ch);
			
			// 쓰레드 실행 대기
			try {
			Thread.sleep(300);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		*/
		// thread와 runnableThread의 호름을 main 쓰레드의 흐름 합류
		try {
			Thread.sleep(300);   // 0.3초 대기
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인쓰레드 종료");

	}

}
