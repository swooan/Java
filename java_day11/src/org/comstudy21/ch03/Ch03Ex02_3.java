package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex02_3 {

	public Ch03Ex02_3() {
		doWhileTest();
	}
	
	public void doWhileTest() {
		//do while ���� �̿��Ͽ� 'a'���� 'z'���� ���
		char ch = 'a';
		
		do {
			System.out.print(ch);
			ch = (char)(ch+1);
		}
		while(ch<='z');
		
	}

	public void test() {
		
		System.out.println("�����ϱ� �� ������ �Էµ� ������ ������ ����� ���ϱ�");
		System.out.println("���� �Է� (����� -1 �Է�) : ");
		
		Scanner scan = new Scanner(System.in);
		
		int cnt = 0;
		int sum = 0;
		int num = 0;
		while((num = scan.nextInt()) != -1) {
			sum += num;
			cnt++;
			
		}
		if(cnt == 0) {
			System.out.println("�Էµ� ���ڰ� �����ϴ�.");
			return;
		}
		System.out.println("���ڴ� �� " + cnt + "�� �Է��ϼ̽��ϴ�.");
		System.out.println("���ڵ��� ����� " + (sum/cnt) + " �Դϴ�.");
		
		scan.close();
	}

	public static void main(String[] args) {
		new Ch03Ex02_3();

	}

}
