package day18.model;

import day18.view.DObject;

public class Dao {
	static DLinkedList list = new DLinkedList();
	
	public static void insert(DObject obj) {
		list.append(obj);
	}
	
	public static void delete() {
		list.remove();
	}
	
	public static DLinkedList select() {
		return list;
	}

}
