package org.comstudy21.ch01;

import java.util.Scanner;

public class Ch01Ex08 {
	
		public static void main(String[] args) {
			//�������� �Է� �޾Ƽ� ����ϴ� ���α׷�
			String name;
			int age;
			String address;
			String job;
			int height;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("�����Է�: ");
			name = scan.next();
			System.out.print("�����Է�: ");
			age = scan.nextInt();
			System.out.print("�ּ��Է�: ");
			address = scan.next();
			System.out.print("�����Է�: ");
			job = scan.next();
			System.out.print("Ű�Է�: ");
			height = scan.nextInt();
			
			System.out.println("������ " + name);
			System.out.println("���̴� " + age);
			System.out.println("�ּҴ� " + address);
			System.out.println("������ " + job);
			System.out.println("Ű�� " + height);
			
			
		}
		
}
