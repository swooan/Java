package org.comstudy21;

import java.util.ArrayList;

import org.comstudy21.model.Dao;
import org.comstudy21.model.Dto;

public class MainCls {
	public static Dao dao = new Dao();
	
	public static void main(String[] args) {		
		insertAll();
		selectAll();
	}
	
	public static void insertAll() {
		ArrayList<Dto> list = new ArrayList<Dto>();
		Dto dto1 = new Dto("1005", "서다슬", "v다슬v", "9999", 26);
		Dto dto2 = new Dto("1006", "알렉스", "Clazziquai", "5555", 36);
		Dto dto3 = new Dto("1007", "디즈니", "KartRider", "6666", 23);
		
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		
		dao.insertList(list);

	}
	
	public static void findCodeByName() {		
		String code = dao.findCodeByName("강지아");
		System.out.println(code);
	}
	
	public static void select_One() {
		Dto dto = new Dto("1001",null, null, null,0);
		ArrayList<Dto> list = dao.selectOne(dto);
		for(Dto dto2 : list) {
			System.out.println(dto2);
		}
	}
	
	public static void select() {
		Dto dto = new Dto(null,"지아", null, null,0);
		ArrayList<Dto> list = dao.select(dto);
		for(Dto dto2 : list) {
			System.out.println(dto2);
		}
	}
	
	public static void update() {
		Dto dto = new Dto("1003","김백합","lily","2222",25);
		dao.update(dto);
	}
	
	
	public static void delete() {
		Dto dto = new Dto("1003",null,null,null,0);
		dao.delete(dto);
		
		ArrayList<Dto> list = dao.selectAll();
		for(Dto dto2 : list) {
			System.out.println(dto2);
		}
	}
	
	public static void selectAll () {
		ArrayList<Dto> list = dao.selectAll();
		for(Dto dto : list) {
			System.out.println(dto);
		}
	}
	
	public static void insert() {
		
		
		Dto dto = new Dto("1003", "김백합", "lily", "3333", 25);
		dao.insert(dto);
		
		dao.selectAll();
	}

}
