package org.comstudy21.method;

import java.util.Scanner;

public class WeekendHomework {

	static final int MAX = 100;
	static int top = 0; // ���� �Է� ��ġ index

	static String[] name = new String[MAX];
	static int[] kor = new int[MAX]; // ����
	static int[] eng = new int[MAX]; // ����
	static int[] mat = new int[MAX]; // ����
	static int[] total = new int[MAX]; // ����
	static double[] avg = new double[MAX]; // ���
	static char[] grade = new char[MAX]; // ���
	static int[] rank = new int[MAX]; // ����

	static Scanner scan = new Scanner(System.in);

	static String[] menuItems = { "INPUT", "OUTPUT", "SEARCH", "MODIFY", "DELETE", "END" };

	public static void input() {
		System.out.println("---- �Է� ��� ----");
		if (top >= MAX) {
			System.out.println("�� �̻� �Է� �� �� �����ϴ�!");
			return;
		}
		System.out.print("�̸� : ");
		name[top] = scan.next();
		do {
			System.out.print("���� ���� : ");
			kor[top] = scan.nextInt();
		} while (kor[top] > 100 || kor[top] < 0);
		do {
			System.out.print("���� ���� : ");
			eng[top] = scan.nextInt();
		} while (eng[top] > 100 || eng[top] < 0);
		do {
			System.out.print("���� ���� : ");
			mat[top] = scan.nextInt();
		} while (mat[top] > 100 || mat[top] < 0);

		total[top] = kor[top] + eng[top] + mat[top];
		avg[top] = total[top] / 3.0;

		switch ((int) avg[top] / 10) {
		case 10:
		case 9:
			grade[top] = 'A';
			break;
		case 8:
			grade[top] = 'B';
			break;
		case 7:
			grade[top] = 'C';
			break;
		case 6:
			grade[top] = 'D';
			break;
		default:
			grade[top] = 'F';
		}

		for (int i = 0; i <= top; i++) {
			rank[i] = 1;
			for (int j = 0; j <= top; j++) {
				if (total[i] < total[j]) {
					rank[i]++;

				}
			}
		}

		top++;

	}

	public static void output() {
		System.out.println("---- ��� ��� ----");
		// ��� ���
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "��ȣ", "����", "����", "����", "����", "����", "���", "����", "���");
		for (int i = 0; i < top; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c\t%d\n", i, name[i], kor[i], eng[i], mat[i], total[i], avg[i],
					grade[i], rank[i]);
		}
	}

	public static void search() {
		System.out.println("---- �˻� ��� ----");
		if(top == 0) {
			System.out.println("����� ������ ������ �����ϴ�.");
			return;
		}
		
		System.out.println("�̸� �Է� : ");
		String searchName = scan.next();
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "��ȣ", "����", "����", "����", "����", "����", "���", "����", "���");
		boolean flag = false;
		for (int i = 0; i < top; i++) {
			if(searchName.equals(name[i])) {
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c\t%d\n",i, name[i], kor[i], eng[i], mat[i], total[i], avg[i],
						grade[i], rank[i]);
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("�˻��Ͻ� ������ ã�� ���Ͽ����ϴ�.");
		}
	}

	public static void modify() {
		System.out.println("---- ���� ��� ----");
		
		System.out.print("���� �� �л��� ��ȣ �Է� : ");
		int no = scan.nextInt();
		while(no<0 || no>=top) {
			System.out.println("������ ������ϴ�.");
			System.out.print("��ȣ �ٽ� �Է� : ");
			no = scan.nextInt();
		} 
		
		System.out.print("�̸� : ");
		name[no] = scan.next();
		do {
			System.out.print("���� ���� : ");
			kor[no] = scan.nextInt();
		} while (kor[no] > 100 || kor[no] < 0);
		do {
			System.out.print("���� ���� : ");
			eng[no] = scan.nextInt();
		} while (eng[no] > 100 || eng[no] < 0);
		do {
			System.out.print("���� ���� : ");
			mat[no] = scan.nextInt();
		} while (mat[no] > 100 || mat[no] < 0);

		total[no] = kor[no] + eng[no] + mat[no];
		avg[no] = total[no] / 3.0;

		switch ((int) avg[no] / 10) {
		case 10:
		case 9:
			grade[no] = 'A';
			break;
		case 8:
			grade[no] = 'B';
			break;
		case 7:
			grade[no] = 'C';
			break;
		case 6:
			grade[no] = 'D';
			break;
		default:
			grade[no] = 'F';
		}

		for (int i = 0; i <= top; i++) {
			rank[i] = 1;
			for (int j = 0; j <= top; j++) {
				if (total[i] < total[j]) {
					rank[i]++;

				}
			}
		}
		
	}

	public static void delete() {
		System.out.println("---- ���� ��� ----");
		if(top == 0) {
			System.out.println("������ ������ �����ϴ�.");
			return;
		}
		System.out.print("������ ��ȣ �Է� : ");
		int no = scan.nextInt();
		while(no<0||no>top) {
			System.out.print("������ ��ȣ �Է� : ");
			no = scan.nextInt();
		}
		
		// no �� �������� ��ĭ�� ������ �����ش�.
		for(int i = no; i<top; i++) {
			name[i] = name[i+1];
			kor[i] = kor[i+1];
			eng[i] = eng[i+1];
			mat[i] = mat[i+1];
			total[i] = total[i+1];
			avg[i] = avg[i+1];
			grade[i] = grade[i+1];
			rank[i] = rank[i+1];
			
		}
		top--;
	}

	public static void end() {
		System.out.println("---- �����մϴ�! ----");
	}

	public static void main(String[] args) {
		int no = 0;

		while (true) {
			// �޴� ���
			System.out.println("----------- ���� ��� ���α׷� ------------");
			for (int i = 0; i < menuItems.length; i++) {
				System.out.printf("%s(%d)", menuItems[i], i + 1);
			}
			System.out.print("\n���� : ");
			no = scan.nextInt();

			switch (no) {
			case 1:
				input();
				break;
			case 2:
				output();
				break;
			case 3:
				search();
				break;
			case 4:
				modify();
				break;
			case 5:
				delete();
				break;
			case 6:
				end();
				System.exit(0);
				break;
			default:
				System.out.println("�߸� �Է� �ϼ̽��ϴ�!");
				break;
			}
			System.out.println();

		}
	}
}
