package org.comstudy21.day13_4;

import java.util.ArrayList;

public class TestArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("���");
		list.add("����");
		list.add("��");
		list.add("����");
		list.add("����");

		System.out.println(list);
		
		list.add(2,"Ű��");
		
		System.out.println(list);
		
		list.set(4, "����");
		
		System.out.println(list);
		
		list.remove(1);
		
		System.out.println(list);

	}

}
