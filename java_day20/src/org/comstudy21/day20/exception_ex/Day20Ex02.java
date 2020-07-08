package org.comstudy21.day20.exception_ex;

import java.util.Scanner;

public class Day20Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		System.out.print("���� �ΰ� �Է� >>> ");
		a = scan.nextInt();
		b = scan.nextInt();
		
		int result = 0;
		
		try {
			result = a / b;
		} catch (ArithmeticException e) {
			System.out.println("�и�� 0�� �� �� �����ϴ�.");
		}

		System.out.printf("%d / %d = %d\n",a ,b, result);
	}

}
