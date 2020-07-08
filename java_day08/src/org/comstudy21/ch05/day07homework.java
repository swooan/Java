package org.comstudy21.ch05;

import java.util.Scanner;

public class day07homework {
	
	static int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static int month = 0;
	static int day = 0;
	static int total = 0;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("�� �Է� : ");
		month = scan.nextInt();
		while(month<1 || month>12) {
			System.out.println("���� 1������ 12�� ���̸� ����մϴ�.");
			System.out.println("�ٽ� �� �Է� : ");
			month = scan.nextInt();
		}
		System.out.print("�� �Է� : ");
		day = scan.nextInt();
		while (day<1 || day>days[month-1]) {
			System.out.println("��¥�� 1�Ϻ��� " + days[month-1] + "���̿��� �մϴ�.");
			System.out.println("�ٽ� �� �Է� : ");
			day = scan.nextInt();
		}
		System.out.print("��ĥ �� ��¥�� �˰� ��������? �Է� : ");
		int dDay = scan.nextInt();
		System.out.printf("%d�� %d�� " , month , day);
		
		if(dDay <= days[month-1] - day) {
			System.out.print(dDay + "�� �Ĵ� " + month);
			System.out.println("�� " + (day+dDay) + "�� �Դϴ�.");
			return;
		}
		else {
			//100���� ���� ���� ���� ��¥�� ����.
			total = dDay - (days[month-1] - day);
			int i = month;
			for(; total > days[i%12]; i++) {
				total -= days[i%12];
			}
			
			System.out.print(dDay + "�� �Ĵ� " + (i%12+1));
			System.out.println("�� " + total + "�� �Դϴ�.");
		}
		
		
	}
	
	public static void test01(String[] args) {
		// �� �Է� : 4
		// �� �Է� : 29
		// 4�� 29�� 100�� �� ��¥�� ?��?�� �Դϴ�.
		
		System.out.print("�� �Է� : ");
		month = scan.nextInt();
		System.out.print("�� �Է� : ");
		day = scan.nextInt();
		
		System.out.printf("%d�� %d�� " , month , day);
		
		// ���� ���� ���� ��¥�� total�� �����Ѵ�.
		total = days[month-1] - day;
		int i = month;
		//while(i<(month+3)) {
		while (total < 100) {
			total += days[i%12];
			i++;
		}
		//System.out.println("total => " + total);
		int dDay = 0, dMonth = 0;
		//if(total >= 100) {
			// 100���� ũ�ٸ� ������ ��ŭ �����Ѵ�.
			dMonth = i%12;
			dDay = days[(i-1)%12] - (total-100);
		//}
//		else {
//			// �����ϴٸ� �Ѵ� �Ŀ��� ������ ��¥�� ���Ĵ�.
//			dMonth = i%12 + 1;
//			dDay = 100 - total;
//		}
		if(dMonth == 0) {
			dMonth = 12;
		}
		System.out.printf("100�� �Ĵ� %d�� %d�� �Դϴ�.",dMonth,dDay);
	}
	
}
