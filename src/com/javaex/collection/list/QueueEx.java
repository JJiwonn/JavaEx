package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// Queue의 선언
		// - InterFace
		// - 실제 저장은 LinkedLinst의 기능을 활용
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = 0; i < 10; i++) {
			queue.offer(i); // 입력(제공)
			System.out.println("QUEUE:" + queue);
		}
		
		System.out.println("PEEK: " + queue.peek()); // 출력 방향의 데이터 확인
		System.out.println("POLL: " + queue.poll()); // 인출
		System.out.println("QUEUE:" + queue);
		
		// poll할 때는 비어있는지 확인해줘야한다.
		while(!queue.isEmpty()) {// 큐가 비어있지 않은 동안 루트
			System.out.println("POLL: " + queue.poll());
			System.out.println("QUEUE:" + queue);
		}

	}

}
