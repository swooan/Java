package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import util.Util;

interface SQLImpl {
	String RESERVATION = "INSERT INTO BALLPARK VALUES (?,?,?,?,?,?)";
	String OUTPUT = "SELECT NUM, TYPE FROM BALLPARK WHERE CNT = ?";
	String SEARCH = "SELECT NAME, DATE, TYPE, NUM FROM BALLPARK WHERE NAME LIKE '%'||?||'%'";
	String UPDATE = "UPDATE BALLPARK SET NAME = ? WHERE NAME = ? AND DATE = ? AND TYPE = ? AND NUM = ?";
	String DELETE = "DELETE FROM BALLPARK WHERE NAME = ? AND DATE = ? AND TYPE = ? AND NUM = ?";

	String DATE = "SELECT DATE FROM DATE";
	String TYPE = "SELECT TYPE FROM TYPE WHERE CNT = ?";
	
	String SEAT11 = "SELECT NUM FROM BALLPARK WHERE CNT = ? AND DCNT = ?";


	Vector<Vector> output(Dto dto);
	Vector<Vector> search(Dto dto);
	Vector<Vector> date();
	Vector<Vector> type(Dto dto);

	ArrayList<Integer> seat11(Dto dto);

	
	void reservation(Dto dto);
	void update(Dto dto);
	void delete(Dto dto);
	void finish();
}

public class Dao implements SQLImpl {

	private Connection conn;
	private PreparedStatement pstmt;
	private Statement stmt;
	private ResultSet rs;
	private int cnt;

	public Dao() {
		conn = Util.getConnection();
	}
	
	@Override
	public Vector<Vector> output(Dto dto) {
		Vector<Vector> outputlist = new Vector<Vector>();
		try {
			pstmt = conn.prepareStatement(OUTPUT);
			pstmt.setInt(1, dto.getCnt());		
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Vector vector = new Vector();
				vector.add(rs.getInt(1));
				vector.add(rs.getString(2));
				
				outputlist.add(vector);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Util.close(null, rs, pstmt);
		}
		return outputlist;
	}

	@Override
	public Vector<Vector> search(Dto dto) {
		Vector<Vector> list = new Vector<Vector>();
		try {
			pstmt = conn.prepareStatement(SEARCH);
			pstmt.setString(1, dto.getName());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Vector vector = new Vector();
				vector.add(rs.getString(1));
				vector.add(rs.getString(2));
				vector.add(rs.getString(3));
				vector.add(rs.getInt(4));

				list.add(vector);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Util.close(null, rs, pstmt);
		}
		return list;
	}

	@Override
	public void reservation(Dto dto) {
		try {
			pstmt = conn.prepareStatement(RESERVATION);
			pstmt.setInt(1, dto.getCnt());
			pstmt.setString(2, dto.getDate());
			pstmt.setInt(3, dto.getDcnt());
			pstmt.setString(4, dto.getType());
			pstmt.setInt(5, dto.getNum());
			pstmt.setString(6, dto.getName());
			cnt = pstmt.executeUpdate();
			if (cnt == 0) {
				System.out.println("ERROR : 입력실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally	{
			Util.close(pstmt);
		}
	}

	@Override
	public void update(Dto dto) {
		try {
			pstmt = conn.prepareStatement(UPDATE);
			pstmt.setString(1, dto.getName2());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getDate());
			pstmt.setString(4, dto.getType());
			pstmt.setInt(5, dto.getNum());
			cnt = pstmt.executeUpdate();
			if (cnt == 0) {
				System.out.println("ERROR : 수정실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			Util.close(pstmt);
		}
	}

	@Override
	public void delete(Dto dto) {
		try {
			pstmt = conn.prepareStatement(DELETE);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getDate());
			pstmt.setString(3, dto.getType());
			pstmt.setInt(4, dto.getNum());
			cnt = pstmt.executeUpdate();
			if (cnt == 0) {
				System.out.println("ERROR : 삭제 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			Util.close(pstmt);
		}

	}

	@Override
	public Vector<Vector> date() {

		Vector<Vector> datelist = new Vector<Vector>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(DATE);
			while (rs.next()) {
				Vector datevector = new Vector();
				datevector.add(rs.getString(1));

				datelist.add(datevector);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Util.close(null, rs, stmt);
		}
		return datelist;
	}

	@Override
	public Vector<Vector> type(Dto dto) {
		Vector<Vector> typelist = new Vector<Vector>();
		try {
			pstmt = conn.prepareStatement(TYPE);
			pstmt.setInt(1, dto.getCnt());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Vector vector = new Vector();
				vector.add(rs.getString(1));

				typelist.add(vector);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Util.close(null, rs, pstmt);
		}
		return typelist;
	}

	@Override
	public ArrayList<Integer> seat11(Dto dto) {
		ArrayList<Integer> seat11list = new ArrayList<Integer>();
		try {
			pstmt = conn.prepareStatement(SEAT11);
			pstmt.setInt(1, dto.getCnt());
			pstmt.setInt(2, dto.getDcnt());			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				seat11list.add(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Util.close(null, rs, pstmt);
		}
		return seat11list;
	
	}

	@Override
	public void finish() {
		Util.close(conn);
		System.exit(0);
		
	}
}
