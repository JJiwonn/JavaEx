package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class HRSearchEmployeesPstmt {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl,dbuser,dbpass);
			
			System.out.print("검색어를 입력하세요:");
			String keyword = scanner.next();
			
			// 실행계획 수립
			String sql = "SELECT first_name ||' ' || last_name, email, phone_number, hire_date "
					+ "FROM employees "
					+ "WHERE lower(first_name)LIKE ? "
					+ "OR lower(last_name)LIKE ?";
			
			pstmt = conn.prepareStatement(sql);
			
			// 동적 파라미터 바인딩 시키기
			pstmt.setString(1, "%" + keyword.toLowerCase() + "%");
			pstmt.setString(2, "%" + keyword.toLowerCase() + "%");
			
			// 쿼리 수행하기
			rs = pstmt.executeQuery();
			
			// rs 순회 출력
			while (rs.next()) {
				String name = rs.getString(1);
				String email = rs.getString(2);
				String phoneNumber = rs.getString(3);
				Date hireDate = rs.getDate(4);
				
				System.out.printf("%s: %s, %s, %s%n",name, email, phoneNumber, hireDate);
			}
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 로드하지 못했습니다.");
			e.printStackTrace();
		} catch(SQLException e) {
			System.err.println("SQLError!");
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
		}
		}
		scanner.close();
		
	}

}
