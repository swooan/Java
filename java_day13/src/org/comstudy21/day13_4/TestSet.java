package org.comstudy21.day13_4;

import java.util.HashSet;
import java.util.Iterator;

public class TestSet {
	public static void main(String[] args) {
		// Set ������ ��ü ����
		HashSet set = new HashSet();
		
		// set�� Ư¡ : �ߺ� ���� �ȵ���.
		set.add("ȫ�浿");
		set.add("��浿");
		set.add("ȫ�浿");
		set.add("��浿");
		set.add("�ڱ浿");
		
		System.out.println(set.size());
		
		Iterator elements = set.iterator();
		while(elements.hasNext()) {
			System.out.println(elements.next());
		}
	}
}
