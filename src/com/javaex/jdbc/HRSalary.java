package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HRSalary {
	
	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "HR";
		String dbpass = "hr";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn =  DriverManager.getConnection(dburl,dbuser,dbpass);
			
			System.out.print("최소급여 최대급여:");
			String keyword = scanner.nextLine();
			
			String[] input = keyword.trim().split(" ");
			
			stmt = conn.createStatement();
		
			String sql = "SELECT first_name ||' ' || last_name, salary"
					+ "	FROM employees"
					+ "	WHERE salary > 2000 AND salary < 10000"
					+ "	ORDER BY salary ASC";
			System.out.println("Query: " + sql);
			
			rs = stmt.executeQuery(sql);  // DB Cursor 반환
			
			// ResultSet 순회
			while(rs.next()) {
				String name = rs.getString(1); 
				int sal = rs.getInt(2); 
				
				System.out.printf("%s\t%d%n ", name, sal);
			 }
			}catch (ClassNotFoundException e) {
				System.err.println("드라이버를 로드하지 못했습니다.");
				e.printStackTrace();
			}catch(SQLException e) {
				System.err.println("SQLError!");
				e.printStackTrace(); // 에러메세지가 뜨면 한번 찍어줘야한다
			}finally {
				try {
					rs.close();
				}catch (Exception e) {
					
				}
				try {
					stmt.close();
				}catch (Exception e) {
					
				}
				try {
					conn.close();
				}catch (Exception e) {
					
				}
			
				}
		
		scanner.close();
	}

}
