package org.comstudy21.day13_4;

import java.util.HashSet;
import java.util.Iterator;

public class TestSet {
	public static void main(String[] args) {
		// Set 구조의 객체 생성
		HashSet set = new HashSet();
		
		// set의 특징 : 중복 값이 안들어간다.
		set.add("홍길동");
		set.add("김길동");
		set.add("홍길동");
		set.add("김길동");
		set.add("박길동");
		
		System.out.println(set.size());
		
		Iterator elements = set.iterator();
		while(elements.hasNext()) {
			System.out.println(elements.next());
		}
	}
}
