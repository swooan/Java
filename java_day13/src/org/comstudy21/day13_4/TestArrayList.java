package org.comstudy21.day13_4;

import java.util.ArrayList;

public class TestArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		// arraylist는 어느 타입이든 다 넣을 수 있다. 그러므로 타입을 제한하고자 한다. : <generic>
		
		list.add("사과");
		list.add("바나나");
		list.add("귤");
		list.add("오렌지");
		list.add("바나나");
		
		System.out.println("size => " + list.size());
		
//		for(int i =0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
//		for(String item : list) {
//			System.out.println(item);
//		}
		
		// 리스트를 배열로 변환
		String[] strArr = new String[list.size()];
		list.toArray(strArr);
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
	}
}
