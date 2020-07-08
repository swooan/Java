package org.comstudy21.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.comstudy21.util.JdbcUtil;

interface DaoInterface {
	
	String INSERT = "INSERT INTO MEMBER VALUES (?,?,?,?,?)"; // ? => ���� ���߿� SET ���� ���� ���� �� �ִ�.
	String SELECT_ALL = "SELECT * FROM MEMBER ORDER BY CODE DESC";
	String SELECT = "SELECT * FROM MEMBER WHERE NAME LIKE '%'||?||'%'"; // LIKE �� ������ �̷� ������ �ȴ�.
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
	
	// �Է�, ��ü�˻�, �κа˻�, ����, ����
	public void insert(Dto dto) {
		try {
			pstmt = conn.prepareStatement(INSERT);
			pstmt.setString(1, dto.getCode());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getId());
			pstmt.setString(4, dto.getPwd());
			pstmt.setInt(5, dto.getAge());
			int cnt = pstmt.executeUpdate(); // executeUpdate : �����͸� db�� ������ / executeQuery : �����͸� db���� ��������
			System.out.println("cnt => " + cnt);
			if(cnt > 0) {
				System.out.println("INFO : �Է¼���");
			}
			else {
				System.out.println("INFO : �Է½���");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			// conn�� ���� ��� �ʵ� �̹Ƿ� close() �� ��� �ٸ� �޼ҵ忡�� ��� �Ұ�.
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
					System.out.println("INFO : �Է¼���");
				}
				else {
					System.out.println("INFO : �Է½���");
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
		// �ڵ带 �������� ������ �����Ѵ�.
		
		try {
			pstmt = conn.prepareStatement(UPDATE);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getId());
			pstmt.setString(3, dto.getPwd());
			pstmt.setInt(4, dto.getAge());
			pstmt.setString(5, dto.getCode());
			
			int cnt = pstmt.executeUpdate();
			
			if(cnt > 0) {
				System.out.println("INFO : ���� �Ϸ�");
			}
			else {
				System.out.println("INFO : ���� ����");
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
				System.out.println("INFO : ����ó�� �Ϸ�");
			}
			else {
				System.out.println("INFO : ���� ����");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.close(null,pstmt,null);
		}
		
	}
	
}
