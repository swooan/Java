package org.comstudy21.method;

import java.util.Scanner;

public class Day09Ex05 {
	// 문자열을 입력 받아서 반환하는 함수

	static Scanner scan = new Scanner(System.in);
	
	static String getName() {
	
		System.out.println("이름 : ");
		String name = scan.next(); 
		// or return scan.next();
		
		return name;
		
		
	}
	
	public static void main(String[] args) {

		//System.out.print("성명 입력 : ");
		//String name = scan.next();
		
		String name = getName();
		
		System.out.println("name => " + name);
		
	}

}
