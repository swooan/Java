package org.constudy21.ch03;

import java.util.Scanner;

import static java.lang.System.out;

public class Ch03Ex20 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//�� �Է�: 2
		// ---> 2���� 28�ϱ��� �ֽ��ϴ�!
		// 1~12 ���� ���� �ƴϸ� �ٽ� �Է�
		
		int mon = 0;
		int day = 0;
		
		out.print("�� �Է� : ");
		mon = scan.nextInt();
		
		while(mon > 12 || mon <1) { // (!(no>=1 && mon<=12)) �� �ص� �ȴ�
			out.println("�߸��� �� �Դϴ�.\n");
			out.print("�� �Է� : ");
			mon = scan.nextInt();
		}
		
		switch(mon) {
		case 1 : case 3: case 5: case 7: case 8 : case 10 : case 12 :
			day = 31;
			break;
		
		case 4 : case 6: case 9: case 11:
			day = 30;
			break;
			
		case 2 :
			day = 28;
			break;
		
		}
		/* int day = 31;
		 * switch(mon) {
		 * case 2 : day = 28; break;
		 * case 4 : case 6 : case 9 : case 11 : day = 30; break
		 * } <= �̷��Ը� �ص� 31���� ���� �⺻������ ����� �Ǵϱ� ���� ����*/
		
		out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.\n\n", mon, day);
		main(null);
	}
	
	public static void test2(String[] args) {
		// ------------ �� �� ----------------
		// �Է�(1) ���(2) �˻�(3) ����(4) ����(5) = crud = ������ ������ �⺻
		// ���� : 1�� ������
		// :::: �Է� ��� ���� ::::::
		//
		// ------------ �� �� ----------------
		// �Է�(1) ���(2) �˻�(3) ����(4) ����(5)
		// ���� :
		
		int num = 0;
		String menu = "a";
		
		out.println("------- �� �� -------");
		out.println("�Է�(1) ���(2) �˻�(3) ����(4) ����(5)");
		out.print("���� : ");
		num = scan.nextInt();
		
		// while(num < 1 || num > 5) { //����� �� ���� �� �� ���� �ݺ�
		//	System.out.print("���� : ");
		//	num = scan.nextInt();
		
		switch(num) {
		case 1 :
			menu = "�Է�";
			break;
			
		case 2 : 
			menu = "���";
			break;
		
		case 3 : 
			menu = "�˻�";
			break;
		
		case 4 : 
			menu = "����";
			break;
		
		case 5 : 
			menu = "����";
			break;
			
		default :
			out.println("\n�߸��� ���Դϴ�.\n");
			main(null);
		}
		out.println("\n:::::::" + menu + " ��� ���� :::::::\n");
		main(null);
		
	}
	
	public static void test(String[] args) {
		// switch ~ case ������ ���� ���
		//Scanner scan = new Scanner(System.in);
		int score = 0;
		char grade = 'F';

		out.print("���� �Է�: ");
		score = scan.nextInt();

		if (score > 100 || score < 0) {
			out.println("�߸��� ���Դϴ�.");
			main(null);
		}
		else {
			switch (score / 10) {
			case 10: // break �� �����Ƿ� ���� ���̽��� ������ ���
				
			case 9:
				grade = 'A';
				break;
				
			case 8:
				grade = 'B';
				break;
				
			case 7:
				grade = 'C';
				break;
				
			case 6:
				grade = 'D';
				break;
				
			default:
				grade = 'F'; // �ؿ� �� ���� �ɰ� ��� break ��� ��
			}
			out.printf("%d ������ %c ���� �Դϴ�.", score, grade);
		}

	}

}
