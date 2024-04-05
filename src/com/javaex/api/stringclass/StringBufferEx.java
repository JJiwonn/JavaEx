package com.javaex.api.stringclass;

public class StringBufferEx {

	public static void main(String[] args) {
		// StringBuffer 불변
		// StringBuffer는 내부에 버퍼를 두고, 버퍼에서 작업한다.
		// 최종 소비되는 시점에서 문자열로 반환한다.
		// 메모리 관리 측면에서 String보다는 유리하다.
		
		// 버퍼 생성
	    StringBuffer sb = new StringBuffer("This");
	    System.out.println(sb);
	    
	    // 믄자열 추가 : append
	    sb.append(" is pencil");
	    System.out.println(sb);
	    
	    // 문자열 삽입 : insert
	    sb.insert(7," my");
	    System.out.println(sb);
	    
	    // 문자열 치환 : replace
	    sb.replace(7, 10, " your"); // 7번부터 10번까지의 범위를 바꾼다는 뜻.
	    System.out.println(sb);
	    
	    // 메서드 체이닝 :
	    // ㄴ 중복적으로 코드를 적지않고 메서드를 연속적으로 호출하면서, 객체를 변화시키는 것
	    StringBuffer sb2 = new StringBuffer("this")
	    		.append(" is pencil")
	    		.insert(7," my")
	    		.replace(7, 10, " your");
	    System.out.println(sb2);
	    
	    sb.setLength(5);
	    System.out.println(sb);
	}

}
