package org.comstudy21.ch03_homework;

import java.util.Scanner;

public class Ch04Ex02 {
public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 시작단 : 3 5
		// 종료단 : 5 3
		
		int num1 = 0;
		int num2 = 0;
		
		do {
			System.out.print("시작단 : ");
			num1 = scan.nextInt();
		}
		while(num1 < 9 || num1 > 2);
	
		do {
			System.out.print("종료단 : ");
			num2 = scan.nextInt();
		}
		while(num2 < 2 || num2 > 9); // do ~ while 은 2~9 까지만 출력되게 하기 위해 넣는다
		
// 스왑 알고리즘을 이용하는 방법
		// if(num1>num2) {
		// 		int temp = num1
		//		num1 = num2
		//		num2 = temp
		// }
		
		for(int dan = Math.min(num1, num2); dan <= Math.max(num1, num2); dan++) {
			System.out.println("\n::::: " + dan + " 단 :::::");
			for(int n = 1; n<=9; n++) {
				System.out.println(dan + " * " + n + " = " + dan*n);
			}
			System.out.println();
			
		}
		
	}
		
	
	public static void test03(String[] args) {
		
		for(int n = 1; n<=9; n++) {
			for(int dan=2; dan<=9; dan++) {
				System.out.print(dan + " * " + n + " = " + dan*n+"\t");
			}
			System.out.println();
			
		}
	
	}
	
	public static void test02(String[] args) {
		
		for(int dan=2; dan<=9; dan++) {
			System.out.println("::::: " + dan + " 단 :::::");
			for(int n = 1; n<=9; n++) {
				System.out.println(dan + " * " + n + " = " + dan*n);
			}
			
			
		}
		
	}
	
	public static void test01(String[] args) {
		
		int dan=2;
		
				System.out.println("::::: " + dan + " 단 :::::");
		
		for(int n = 1; n<=9; n++) {
				System.out.println(dan + " * " + n + " = " + dan*n);
		}
			
		
	}
	
}
