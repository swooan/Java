package org.comstudy21.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.comstudy21.util.JdbcUtil;

interface DaoInterface {
	
	String INSERT = "INSERT INTO MEMBER VALUES (?,?,?,?,?)"; // ? => 변수 나중에 SET 으로 값을 넣을 수 있다.
	String SELECT_ALL = "SELECT * FROM MEMBER ORDER BY CODE DESC";
	String SELECT = "SELECT * FROM MEMBER WHERE NAME LIKE '%'||?||'%'"; // LIKE 를 쓸때만 이런 형식이 된다.
	String SELECT_ONE = "SELECT * FROM MEMBER WHERE CODE = ?";
	String UPDATE = "UPDATE MEMBER SET NAME=?, ID=?, PWD=?, AGE=? WHERE CODE=?";
	String DELETE = "DELETE FROM MEMBER WHERE CODE=?";
	String FINDCODEBYNAME = "SELECT CODE FROM MEMBER WHERE NAME = ?";
	
	public void insert(Dto dto);
	public ArrayList<Dto> selectAll();
	public ArrayList<Dto> select(Dto dto);
	public void update(Dto dto);
	public void delete(Dto dto);
}

public class Dao implements DaoInterface {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	
	public Dao() {
		conn = JdbcUtil.getConnection();
	}
	
	public Dao(Connection conn) {
		this.conn = conn;
	}
	
	public void setConnection(Connection conn) {
		this.conn = conn;
	}
	
	// 입력, 전체검색, 부분검색, 수정, 삭제
	public void insert(Dto dto) {
		try {
			pstmt = conn.prepareStatement(INSERT);
			pstmt.setString(1, dto.getCode());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getId());
			pstmt.setString(4, dto.getPwd());
			pstmt.setInt(5, dto.getAge());
			int cnt = pstmt.executeUpdate(); // executeUpdate : 데이터를 db로 보내기 / executeQuery : 데이터를 db에서 가져오기
			System.out.println("cnt => " + cnt);
			if(cnt > 0) {
				System.out.println("INFO : 입력성공");
			}
			else {
				System.out.println("INFO : 입력실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			// conn은 전역 멤버 필드 이므로 close() 할 경우 다른 메소드에서 사용 불가.
			JdbcUtil.close(null, pstmt, null);
		}
	}
	
	public void insertList(ArrayList<Dto> list) {
		
		try {
			for(int i = 0; i < list.size(); i++) {				
				pstmt = conn.prepareStatement(INSERT);
				pstmt.setString(1, list.get(i).getCode());
				pstmt.setString(2, list.get(i).getName());
				pstmt.setString(3, list.get(i).getId());
				pstmt.setString(4, list.get(i).getPwd());
				pstmt.setInt(5, list.get(i).getAge());
				int cnt = pstmt.executeUpdate();
				System.out.println("cnt => " + cnt);
				if(cnt > 0) {
					System.out.println("INFO : 입력성공");
				}
				else {
					System.out.println("INFO : 입력실패");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			
			JdbcUtil.close(null, pstmt, null);
		}
	}
	
	public ArrayList<Dto> selectAll() {
		ArrayList<Dto> list = new ArrayList<Dto>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_ALL);
			while(rs.next()) {
				String code = rs.getString("code");
				String name = rs.getString("name");
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				int age = rs.getInt("age");
				list.add(new Dto(code, name, id, pwd, age));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.close(rs, stmt, null);
		}
		return list;
	}
	
	public ArrayList<Dto> select(Dto dto) {
		ArrayList<Dto> list = new ArrayList<Dto>();
		try {
			pstmt = conn.prepareStatement(SELECT);
			pstmt.setString(1, dto.getName());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String code = rs.getString("code");
				String name = rs.getString("name");
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				int age = rs.getInt("age");
				list.add(new Dto(code, name, id, pwd, age));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.close(rs, pstmt, null);
		}
		return list;
		
	}
	
	public ArrayList<Dto> selectOne(Dto dto) {
		
		ArrayList<Dto> list = new ArrayList<Dto>();
		try {
			pstmt = conn.prepareStatement(SELECT_ONE);
			pstmt.setString(1, dto.getCode());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String code = rs.getString("code");
				String name = rs.getString("name");
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				int age = rs.getInt("age");
				list.add(new Dto(code, name, id, pwd, age));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.close(rs, pstmt, null);
		}
		return list;
		
	}
	
	public String findCodeByName(String name) {
		
		String code = null;
		
		ArrayList<Dto> list = new ArrayList<Dto>();
		
		try {
			pstmt = conn.prepareStatement(FINDCODEBYNAME);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				code = rs.getString("code");
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.close(rs,pstmt,null);
		}
		
		return code;
	}
	
	public void update(Dto dto) {
		// 코드를 조건으로 내용을 수정한다.
		
		try {
			pstmt = conn.prepareStatement(UPDATE);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getId());
			pstmt.setString(3, dto.getPwd());
			pstmt.setInt(4, dto.getAge());
			pstmt.setString(5, dto.getCode());
			
			int cnt = pstmt.executeUpdate();
			
			if(cnt > 0) {
				System.out.println("INFO : 변경 완료");
			}
			else {
				System.out.println("INFO : 변경 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.close(null, pstmt, null);
		}
		
		
	}
	
	public void delete(Dto dto) {
		ArrayList<Dto> list = new ArrayList<Dto>();
		try {
			pstmt = conn.prepareStatement(DELETE);
			pstmt.setString(1, dto.getCode());
			int cnt = pstmt.executeUpdate();
			if(cnt > 0) {
				System.out.println("INFO : 삭제처리 완료");
			}
			else {
				System.out.println("INFO : 삭제 실패");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.close(null,pstmt,null);
		}
		
	}
	
}
