package org.comstudy21.ch02;

import java.util.Scanner;

public class Ch02Ex03 {
	//�ʵ� ���� (�Լ� �ܺ��� ����)
	/*2*/static Scanner scan = new Scanner(System.in); 
	
	///*2*/static ����� non-static ����� ���� �Ұ���.
	public static void main(String[] args) {
		//������ ���� - final�� �̿��� �������
		final double Pi = 3.141592;
		//Pi = 3.14; final������ �ڿ� ���ڸ� ���� ���ٲ�
		/*1*/int r = 5;
		double area = 0; //�ƹ� ���ڳ� ���� ��� ����
		
		/*2*/System.out.print("������ �Է�: ");
		///*2-2*/Ch02Ex03 obj = new Ch02Ex03();
		///*2-2*/r = obj.scan.nextInt();
		///*2-1*/r = scan.nextInt();
		
		//������ �Ǽ��� �����ϸ� ��� Ÿ���� �Ǽ����� �ȴ�.
		area = r*r*Pi;
		
		System.out.print("�������� " + r + "�� ���� " );
		System.out.printf("������ %.2f\n", area);
		//%.2f ��� ���� �Ҽ��� 2�ڸ����� ���´�.
		
		
	}
}
