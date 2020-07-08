package org.comstudy21.day22;

import java.util.Enumeration;
import java.util.Hashtable;

public class Day22Ex01 {

	public static void main(String[] args) {
		
		Hashtable<String, String> friends = new Hashtable<String, String>();
		friends.put("ȫ�浿", "010-1111-1111");
		friends.put("��浿", "010-2222-2222");
		friends.put("�ڱ浿", "010-3333-3333");
		friends.put("�̱浿", "010-4444-4444");
		friends.put("��浿", "010-5555-5555");
		
		System.out.println(friends.size());
		System.out.println(friends);
		
		Enumeration<String> keys = friends.keys();
		while(keys.hasMoreElements()) {
			String key = keys.nextElement();
			System.out.println(key + " : " + friends.get(key));
		}
		
		System.out.println("��浿�� ��ȭ��ȣ : " + friends.get("��浿"));
	}

}
