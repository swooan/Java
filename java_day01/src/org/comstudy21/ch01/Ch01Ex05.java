package org.comstudy21.ch01;

import java.io.IOException;

public class Ch01Ex05 {

	public static void main(String[] args) throws IOException {
		System.out.print("input num1 : ");
		//������ �Է� �ޱ� ���� 48�� ���ش�.
		int num1 =  System.in.read() - 48;
		System.out.print("input num2 : ");
		System.in.read(); //13�� ���͸� ���ۿ��� ������
		System.in.read(); //10�� ���͸� ���ۿ��� ������
		int num2 =  System.in.read() - '0';

		//������ �����Ѵ�.
		System.out.println(num1*100 + ", " + num2*100);
		
	}

}
