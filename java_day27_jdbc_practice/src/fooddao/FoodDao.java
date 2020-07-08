package fooddao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fooddto.FoodDto;
import foodutil.FoodUtil;

public class FoodDao {

	
	private ArrayList<FoodDto> selectAll() {
		ArrayList<FoodDto> list = new ArrayList<FoodDto>();
		
		Connection conn = FoodUtil.getConnection();
		
		System.out.println(conn);
		
		String sql = "select * from food";
		ResultSet rs = null;
		Statement stmt = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				list.add(new FoodDto(no, name, price));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			FoodUtil.close(rs);
			FoodUtil.close(stmt);
			FoodUtil.close(conn);
		}
		
		return list;
	}
	
	public static void main(String[] args) {
	
		FoodDao dao = new FoodDao();
		ArrayList<FoodDto> list = dao.selectAll();
		for(FoodDto dto : list) {
			System.out.println(dto);
		}

	}


}
