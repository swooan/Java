package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex02_2 {

	public Ch03Ex02_2() {
		System.out.println("������");
		
//		test(); - �����ڿ��� ȣ�� (��ü ����)
	}
	
	private void test() {
		System.out.println("�Էµ� ������ �Էµ� ���� ��� ���ϱ�");
		int count = 0; // �Էµ� �� ī��Ʈ
		int sum = 0; // �Էµ� ���� ��
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�����Է�(����� -1) >>> ");
//		int num = scan.nextInt();
//		
//		while(num != -1) {
		
		int num = 0;
		while((num=scan.nextInt())!=-1) {
			sum += num;
			count++;
			
		}
		if(count == 0) {
			System.out.println("�Էµ� ���� �����ϴ�.");
			return;
		}
		System.out.println("������ ������ " + count + "�� �Դϴ�.");
		System.out.println("����� " + ((double)sum/count));
		
		scan.close();
	}

	public static void main(String[] args) {
		
		Ch03Ex02_2 ch03Ex02_2 = new Ch03Ex02_2();
		
		// ��ü �ܺο��� ȣ��    (main�� ���� Ŭ���� �ȿ� �ִ� �ٸ� ��ü�̴�.)
		ch03Ex02_2.test();
	}
}
