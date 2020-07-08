package org.comstudy21.day21.ex03;

import java.util.StringTokenizer;

public class Day21Ex03 {
	public static void test(String[] args) {
		String str = "kim|28|010-1111-1111|서울시 강남구 대치동";
		System.out.println(str);
		str = str.replace("28", "35"); 
		// 스트링은 불변객체라서 str.replace("28,"35)만으로는 바뀌지 않는다.
		// 고로 바뀐걸 str에 새로 담아줘야 한다.
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("Kim");
		buf.append('|');
		buf.append(28);
		buf.append('|');
		buf.append("010-1111-1111");
		buf.append('|');
		buf.append("서울시 강남구 대치동");
		
		System.out.println(buf);
		
		int start = buf.indexOf("28");
		System.out.println(buf.indexOf("28"));
		buf.replace(start, start+2, "35");
		System.out.println(buf);
		
		StringTokenizer stz = new StringTokenizer(buf.toString(),"|- ");
		while(stz.hasMoreTokens()) {
			System.out.println(stz.nextToken());
		}
	}
}
