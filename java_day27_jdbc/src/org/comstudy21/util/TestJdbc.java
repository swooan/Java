package org.comstudy21.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {

	public static void main(String[] args) {
		// ����̹� jar ���� �ҷ����� => ������Ʈ -> �����н� -> ���̺귯�� -> �ܺε����� �߰� -> jar���� ����
		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "sa";
		String password = "";
		try {
			Class.forName("org.h2.Driver");
			System.out.println("����̹� �˻� ����!");
			Connection con = DriverManager.getConnection(url, user, password); 
			System.out.println(con);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �˻� ����!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("���� ����");
			e.printStackTrace();
		}

	}

}
