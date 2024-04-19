package com.javaex.test0419;

public class Staff extends User{
	
	// 필드
	private int salary;
	
	// 생성자
	public Staff() {
		
	}
	
	// 전체 초기화하는 생성자
	public Staff(String id, String pw, String name, int salary) {
		super(id,pw,name);
		this.salary = salary;
	}
	
	// getters/setters
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "아이디:" + id + " 비번:" + pw + " 이름:" + name + " 월급:" + salary;
	}
	
	@Override
	public void showInfo() {
		System.out.printf("%s: %s: %s: %d)%n",
					  id, pw ,name, salary);
	}

}
