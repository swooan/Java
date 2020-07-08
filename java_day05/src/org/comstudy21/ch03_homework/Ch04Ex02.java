package org.comstudy21.ch03_homework;

import java.util.Scanner;

public class Ch04Ex02 {
public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// ���۴� : 3 5
		// ����� : 5 3
		
		int num1 = 0;
		int num2 = 0;
		
		do {
			System.out.print("���۴� : ");
			num1 = scan.nextInt();
		}
		while(num1 < 9 || num1 > 2);
	
		do {
			System.out.print("����� : ");
			num2 = scan.nextInt();
		}
		while(num2 < 2 || num2 > 9); // do ~ while �� 2~9 ������ ��µǰ� �ϱ� ���� �ִ´�
		
// ���� �˰����� �̿��ϴ� ���
		// if(num1>num2) {
		// 		int temp = num1
		//		num1 = num2
		//		num2 = temp
		// }
		
		for(int dan = Math.min(num1, num2); dan <= Math.max(num1, num2); dan++) {
			System.out.println("\n::::: " + dan + " �� :::::");
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
			System.out.println("::::: " + dan + " �� :::::");
			for(int n = 1; n<=9; n++) {
				System.out.println(dan + " * " + n + " = " + dan*n);
			}
			
			
		}
		
	}
	
	public static void test01(String[] args) {
		
		int dan=2;
		
				System.out.println("::::: " + dan + " �� :::::");
		
		for(int n = 1; n<=9; n++) {
				System.out.println(dan + " * " + n + " = " + dan*n);
		}
			
		
	}
	
}
