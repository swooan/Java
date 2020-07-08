package org.constudy21.ch03;

import java.util.Scanner;

public class Ch03Ex24 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		char yn = 0;
		
		do {
			System.out.println("y또는 n만 입력하세요!");
			System.out.println("입력: ");
			yn = scan.next().charAt(0); // 0: 맨 앞
			                            // charAt: 한개만 뽑아서 출력하라
		} while (!(yn == 'y' || yn == 'n'));
		System.out.println(yn);
	}

	public static void test05(String[] args) {
		int n = 10;

		do {
			System.out.println(n);
			n++;
		} while (n < 10);
	}

	public static void test04(String[] args) {
		int n = 0;
		while (n++ < 5) {
			System.out.println(" " + n);
		}

	}

	public static void test03(String[] args) {
		int total = 0;
		int n = 1;
		while (n++ < 5) {
			System.out.print(" " + n);
		}
		System.out.println("\n-------------------");
	}

	public static void test02(String[] args) {
		int total = 0;
		int n = 1;
		while (n <= 10) {
			total += n;
			n++;
		}
		System.out.println(total);
	}

	public static void test(String[] args) {
		int total = 0;

		int n = 1; // 초기식
		while (n <= 10) // 비교문
		{
			total += n; // 누적
			n++; // 증감식
		}
		System.out.println(total);

	}
}
