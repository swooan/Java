package org.constudy21.ch03;

import java.util.Scanner;

public class Ch03Ex24 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		char yn = 0;
		
		do {
			System.out.println("y�Ǵ� n�� �Է��ϼ���!");
			System.out.println("�Է�: ");
			yn = scan.next().charAt(0); // 0: �� ��
			                            // charAt: �Ѱ��� �̾Ƽ� ����϶�
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

		int n = 1; // �ʱ��
		while (n <= 10) // �񱳹�
		{
			total += n; // ����
			n++; // ������
		}
		System.out.println(total);

	}
}
