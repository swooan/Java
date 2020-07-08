package org.comstudy21.day13_4;

import java.util.ArrayList;

public class TestArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("사과");
		list.add("수박");
		list.add("귤");
		list.add("딸기");
		list.add("수박");

		System.out.println(list);
		
		list.add(2,"키위");
		
		System.out.println(list);
		
		list.set(4, "포도");
		
		System.out.println(list);
		
		list.remove(1);
		
		System.out.println(list);

	}

}
