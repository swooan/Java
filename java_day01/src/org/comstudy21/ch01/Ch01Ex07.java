package org.comstudy21.ch01;

import java.util.Scanner;

public class Ch01Ex07 {

	public static void main(String[] args) {
		// Scanner�� �̿��� �����
		Scanner scan = new Scanner(System.in);
		System.out.print("����: ");
		String name = scan.next(); //���ڿ� �Է�
		System.out.println("������ " + name);
		System.out.print("����: ");
		int age = scan.nextInt();
		// � �����͸� ���ڿ��� �����ϸ� ��� ���ڿ��� �ȴ�.
		//System.out.println("10���Ŀ� ����� " + age+10 + "���Դϴ�."); -> ����10
		//+�����ڴ� �������� ���ڿ� ���� ���� ����� �ִ�
		System.out.println("10���Ŀ� ����� " + (age+10) + "���Դϴ�.");
		
	}
//�ڱ� �������� ����� ����� �̿��ؼ� �����϶�.
}
