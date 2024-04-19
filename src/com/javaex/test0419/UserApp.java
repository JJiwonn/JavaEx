package com.javaex.test0419;

import java.util.ArrayList;

public class UserApp {

	public static void main(String[] args) {
		ArrayList<User> lst = new  ArrayList<User>();
		
		Staff u1= new Staff("master","m7788","운영자",3500000);
		Customer u2 = new Customer("jung-ws","j1357913579","정우성",1000);
		Customer u3 = new Customer("LeeHR","a123!!","이효리",2500);
		Customer u4 = new Customer("ms-park","y2345","박명수",1200);
		
		lst.add(u1);
		lst.add(u2);
		lst.add(u3);
		lst.add(u4);
		
		for (int i = 0; i <lst.size() ; i++) {
			 System.out.println((i+1) + "."+ lst.get(i));
		}
		
		int salary = ((Staff)u1).getSalary();
		System.out.println("\n운영자의 연봉은 " + (salary*12) + "원입니다.");

	}

}
