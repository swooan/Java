package org.comstudy21.day10;

import java.util.Scanner;

public class Day10Ex01 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int num;

		num = 0;
		while (true) {
			try {
				System.out.print("�����Է� : ");
				num = scan.nextInt();
				break; // ���� �Է� �Ǹ� �ݺ��� Ż��
			} catch (Exception e) {
				scan.next(); // ���۸� ����ְ�
				continue; // ó������ �̵�

			}
		}

		System.out.println("num => " + num);

	}

}
