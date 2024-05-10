package com.javaex.jdbc.dao.MiniProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class PhoneBookDaoImplOracle implements PhoneBookDao {
	private Connection getConnection() throws SQLException {
		Connection conn = null;
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		conn = DriverManager.getConnection(dburl,
											PhDatabaseConfig.DB_USER,
											PhDatabaseConfig.DB_PASS);
	} catch (ClassNotFoundException e) {
		System.out.println("드라이버를 찾을 수 없습니다.");
	}
	
	return conn;
}
	
}
