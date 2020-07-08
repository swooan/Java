package org.comstudy21.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.comstudy21.dto.MemberDto;
import org.comstudy21.util.JdbcUtil;

public class MemberDao {
	
	private ArrayList<MemberDto> selectAll() {
		
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		
		Connection conn = JdbcUtil.getConnection();
		
//		System.out.println(conn);
		
		String sql = "select * from member";
		ResultSet rs = null;
		Statement stmt = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String code = rs.getString("CODE");
				String name = rs.getString("NAME");
				String id = rs.getString("ID");
				String pwd = rs.getString("PWD");
				int age = rs.getInt("AGE");
				list.add(new MemberDto(code, name, id, pwd, age));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
			JdbcUtil.close(conn);
		}

		return list;
	}
	
	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> list = dao.selectAll();
		for(MemberDto dto : list) {
			System.out.println(dto);
		}
	}

	
}
