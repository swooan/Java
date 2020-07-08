package org.comstudy21.ch01;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scan.next();

		System.out.print("나이: ");
		int age = scan.nextInt();
		
		System.out.print("취미: ");
		String hobby = scan2.nextLine();
		
		System.out.print("좋아하는 것: ");
		String like = scan.next();
				
		System.out.println("제 이름은 " + name + "입니다.");
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("제 취미는 " + hobby + "입니다.");
		System.out.println("저는 " + like + "를 좋아합니다.");
	
	}

}
