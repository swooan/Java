package org.comstudy21.ch03;

import java.util.Scanner;
// import static java.lang.System.out; <- �ؿ� system�� �� �ʿ䰡 ������

public class Ch03Ex02 {
	static Scanner scan = new Scanner(System.in);
		
	public static void main(String[] args) {
		int num = 0;
		//���� : ������ �Է� �޾Ƽ� ��� ���� �Ǵ�
		
		System.out.println("::: ��� ���� �Ǵ� :::");
		System.out.print("���� �Է�: ");
		num = scan.nextInt();
		
		if(num > 0) {
			System.out.println("����Դϴ�.");
		} 
		else if (num == 0 ) {
			System.out.println("0�Դϴ�.");
		} 
		else {
			System.out.println("�����Դϴ�.");
		}
		
		
	}
	
	public static void test02(String[] args) {
		// 3�� ������� �Ǻ��ϴ� ���α׷�
		int num = 0;
		
		System.out.println("::: 3�� ����� �Ǻ��ϴ� ���α׷� :::");
		System.out.print("�����Է�: ");
		num = scan.nextInt();
		/* ������ �����ڸ� ������� �ʴ� ���
		int moc = num / 3;
		int namuzi = num - moc*3;
		if(namuzi == 0)*/
				
		if(num % 3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		} else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		
		
	}
	
	public static void test01(String[] args) {

		// Ȧ���� ¦���� �Ǻ��ϴ� ���α׷�
		int num = 6;
		
		if(num%2 == 1) {
			System.out.println("Ȧ���Դϴ�!");
		} else {
			System.out.println("¦���Դϴ�!");
			
		}
		
		
	}
}
