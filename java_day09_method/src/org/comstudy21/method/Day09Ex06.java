package org.comstudy21.method;

import java.util.Arrays;
import java.util.Scanner;

public class Day09Ex06 {

	static Scanner scan = new Scanner(System.in);
	
	static String[] getNames() {
		
		String[] names = new String[3];
		
		System.out.print("이름 : ");
		names[0] = scan.next();
		System.out.print("이름 : ");
		names[1] = scan.next();
		System.out.print("이름 : ");
		names[2] = scan.next();
		
		return names;
	}
	
	static void printNames(String[] names) {
		
		for(int i=0; i<names.length; i++) {
			System.out.println("names["+i+"] = " + names[i]);
		}
		
//		String[] names = new String[3];
//		
//		System.out.print("이름 : ");
//		names[0] = scan.next();
//		System.out.print("이름 : ");
//		names[1] = scan.next();
//		System.out.print("이름 : ");
//		names[2] = scan.next();
//		
//		System.out.print(Arrays.toString(names));
//		
	}
	
	public static void main(String[] args) {
		String[] names = new String[3];
		
	// 이름 3개를 입력 받아서 반환하는 함수
		names = getNames();		
		//System.out.println(Arrays.toString(names));
		
		printNames(names);

	}

}
