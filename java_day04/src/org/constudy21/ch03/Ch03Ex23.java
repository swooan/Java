package org.constudy21.ch03;

public class Ch03Ex23 {

	public static void main(String[] args) {
		int total = 0;
		int n = 1;
		while (n <= 5)
		{
			total += n;
			System.out.print(n);
			if(n<5) 
			{
				System.out.print("+");
			}
			
			n++;
		}
		System.out.println("=" + total);
	}

	public static void test02(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10= ���� ����� �ǰ�
		// int total = 0;

		for (int n = 1; n <= 10; n++) {
			// total += n;
			System.out.print(n);
			if (n != 10) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
		}
		// System.out.println("=" + total); <- ��ſ� else�� ����
	}

	public static void test(String[] args) {
		// 1~10������ Ȧ���� ���� total�� �����Ѵ�.

		int total = 0;

		// for ���� ���� �����ϼ���

		for (int n = 1; n <= 10; n += 2) {
			total += n;
		}

		// ���

		System.out.println("1���� 10���� Ȧ���� ���� " + total + "�Դϴ�.");

	}
}
