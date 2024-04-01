package com.javaex.api.objectclass.ex4;

import java.util.Arrays;

// clone 메서드 이용을 위해서 Cloneable 인터페이스를 구현한다.(implements 사용)
// 깊은 복제 : 
//          - 참조필드의 경우, 새 객체로 만들어서 참조 필드 값을 변경
public class Scoreboard implements Cloneable{
	// 필드
	private int scores[];
	
	// 생성자
	public Scoreboard(int[] scores) {
		super();
		this.scores = scores;
	}
	
	// getters/setters
	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
    // 오버라이드
	@Override
	public String toString() {
		return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
	}
	
	// 복제본 생성 메서드
	public Scoreboard getClone() {
		// 복제를 위해서 새로운 인스턴스를 저장할 수 있는 변수 선언
		Scoreboard clone = null;
		
		try {
			clone = (Scoreboard)clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 깊은 복제를 위해서 내부 참조 데이터를 복제하여 새로운 참조로 변경하는 것이다.
		
		// 먼저 얕은 복제 시도
		Scoreboard clone = (Scoreboard)super.clone();
//		return super.clone();
		// 내부 참ㅈ모 객체를 복제 시도(깊은 복제)
		clone.scores = Arrays.copyOf(scores, scores.length);
		
		// 만들어진 복제본을 반환
		return clone;
		
	}

}
