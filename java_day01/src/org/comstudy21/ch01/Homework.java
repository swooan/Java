package org.comstudy21.ch01;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.print("�̸�: ");
		String name = scan.next();

		System.out.print("����: ");
		int age = scan.nextInt();
		
		System.out.print("���: ");
		String hobby = scan2.nextLine();
		
		System.out.print("�����ϴ� ��: ");
		String like = scan.next();
				
		System.out.println("�� �̸��� " + name + "�Դϴ�.");
		System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
		System.out.println("�� ��̴� " + hobby + "�Դϴ�.");
		System.out.println("���� " + like + "�� �����մϴ�.");
	
	}

}
