package org.comstudy21.day22;

import java.util.Enumeration;
import java.util.Hashtable;

public class Day22Ex01 {

	public static void main(String[] args) {
		
		Hashtable<String, String> friends = new Hashtable<String, String>();
		friends.put("홍길동", "010-1111-1111");
		friends.put("김길동", "010-2222-2222");
		friends.put("박길동", "010-3333-3333");
		friends.put("이길동", "010-4444-4444");
		friends.put("김길동", "010-5555-5555");
		
		System.out.println(friends.size());
		System.out.println(friends);
		
		Enumeration<String> keys = friends.keys();
		while(keys.hasMoreElements()) {
			String key = keys.nextElement();
			System.out.println(key + " : " + friends.get(key));
		}
		
		System.out.println("김길동의 전화번호 : " + friends.get("김길동"));
	}

}
