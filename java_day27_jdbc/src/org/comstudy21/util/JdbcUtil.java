package org.comstudy21.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {

	public static Connection getConnection() {
		// 드라이버 jar 파일 불러오기 => 프로젝트 -> 빌드패스 -> 라이브러리 -> 외부데이터 추가 -> jar파일 선택
		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "sa";
		String password = "";
		
		Connection conn = null;
		
		try {
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection(url, user, password); 
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void close(Connection conn) {
		if( conn != null) {
			try {conn.close();}
			catch (SQLException e) {}
		}
	}
	public static void close(ResultSet rs) {
		if( rs != null) {
			try {rs.close();}
			catch (SQLException e) {}
		}
	}
	public static void close(Statement stmt) {
		if( stmt != null) {
			try {stmt.close();}
			catch (SQLException e) {}
		}
	}
	
}
