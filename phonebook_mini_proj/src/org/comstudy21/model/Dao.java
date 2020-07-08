package org.comstudy21.model;

import java.util.ArrayList;

public class Dao {
	private ArrayList<People> list = new ArrayList<People>();
	private static int sequence = 1;
	{
		list.add(new People(sequence++, "kim", "010-1111-1111", "대구시 수성구"));
		list.add(new People(sequence++, "lee", "010-2222-2222", "광주시 송정동"));
		list.add(new People(sequence++, "park", "010-3333-3333", "부산시 사하구"));
		list.add(new People(sequence++, "kang", "010-4444-4444", "서울시 은평구"));
	}
	
	public void insert(People dto) {
		dto.setIdx(sequence++);
		list.add(dto);
	}

	public ArrayList<People> selectAll() {
		//ArrayList<People> list = new ArrayList<People>();
		return list;
	}

	public void remove() {
		sequence --;
		
	}
	
	
	
}
