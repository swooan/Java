package org.comstudy21.method;

import java.util.Scanner;

public class Day09Ex05 {
	// ���ڿ��� �Է� �޾Ƽ� ��ȯ�ϴ� �Լ�

	static Scanner scan = new Scanner(System.in);
	
	static String getName() {
	
		System.out.println("�̸� : ");
		String name = scan.next(); 
		// or return scan.next();
		
		return name;
		
		
	}
	
	public static void main(String[] args) {

		//System.out.print("���� �Է� : ");
		//String name = scan.next();
		
		String name = getName();
		
		System.out.println("name => " + name);
		
	}

}
