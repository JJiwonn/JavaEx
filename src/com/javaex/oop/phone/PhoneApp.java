package com.javaex.oop.phone;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class PhoneData {
      // 필드 선언
      private String name;
      private String tel;
      private String hp;

      //생성자
      public PhoneData(String name, String tel, String hp) {
	  super();
	  this.name = name;
	  this.tel = tel;
	  this.hp = hp;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}
	
	@Override
	public String toString() {
		return "PhoneData [name=" + name + ", tel=" + tel + ", hp=" + hp + "]";
	}
}
public class PhoneApp {
	private static String rootPath = System.getProperty("user.dir");
	private static String filename = rootPath + "PhoneDB.txt";

	public static void main(String[] args) {
	
		List<PhoneData> lst = new LinkedList<>();
		
		System.out.println("<1.리스트>");
		
		PhoneData p1 = new PhoneData("1. 고길동","010-8788-8881", "032-8890-2974");
		PhoneData p2 = new PhoneData("2. 둘리","010-1212-3434", "02-5678-8765");
		PhoneData p3 = new PhoneData("3. 마이콜","010-7102-6327", "02-9192-5069");
		PhoneData p4 = new PhoneData("4. 또치","010-6514-5113", "032-7976-9368");
		PhoneData p5 = new PhoneData("5. 홍길동","010-7777-7777", "032-3333-3333");
		
		//객체추가
		lst.add(p1);
		lst.add(p2); 
		lst.add(p3); 
		lst.add(p4); 
		lst.add(p5); 
		
		System.out.println(	"1. " + p1 + "\n" + "2. "+ p2 + 
				"\n" +"3. " + p3 + "\n" + "4. " + p4 + "\n" +"5. "+ p5 );
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println();
		System.out.println("<2.등록>");
		
		System.out.println(">이름: ");
		String name = scanner.next();
		
		System.out.println(">휴대전화: ");
		String hp= scanner.next(); 	
		
		System.out.println(">회사전화: ");
		String tel= scanner.next();
		
		PhoneData phonedata = new PhoneData(name, hp, tel);
		
        lst.add(phonedata); 
		System.out.println(lst);
		
		System.out.println();
		System.out.println("<3. 삭제>");
		
		ArrayList<PhoneData> a1 = new ArrayList<>();
		
		a1.add(p1);
		a1.add(p2);
		a1.add(p3);
		a1.add(p4);
		a1.add(p5);
		
		int a2 = scanner.nextInt();

		a1.remove(a2-1);

		System.out.println(a1);
	}

}
