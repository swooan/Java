package org.constudy21.ch03;

public class Ch03Ex22 {

	public static void main(String[] args) {
		
		int total = 0;
		//1~10������ �������� total�� �����ϴ� ���α׷��� �����.
		// ��� : 1~10������ ���� 55 �Դϴ�.
		for(int n = 1; n <= 10; n++) {
			//�ݺ� �� ������ �ݺ��� ���ο��� �����Ѵ�.
			//total += n;
			total = total + n;
			
		}
		System.out.println("1~10������ ���� " + total + "�Դϴ�.");
		
	}
}
