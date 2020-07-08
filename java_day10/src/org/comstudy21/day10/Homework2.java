package org.comstudy21.day10;

import java.util.Scanner;

public class Homework2 {

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

	static void list() {
		System.out.println("�̸�\t����\t����\t����\t����\t���\t���\t����");
	}

	static int[] Total() {

		total[top] = kor[top] + eng[top] + mat[top];

		return total;

	}

	static double[] average() {

		avg[top] = total[top] / 3.0;

		return avg;
	}

	static char[] grd() {

		if (avg[top] >= 90) {
			grade[top] = 'A';
		} else if (avg[top] >= 80) {
			grade[top] = 'B';
		} else if (avg[top] >= 70) {
			grade[top] = 'C';
		} else if (avg[top] >= 60) {
			grade[top] = 'D';
		} else {
			grade[top] = 'F';
		}

		return grade;
	}

	static int[] rnk() {

		for (int i = 0; i <= top; i++) {
			rank[i] = 1;
			for (int j = 0; j <= top; j++) {
				if (total[i] < total[j]) {
					rank[i]++;

				}
			}
		}

		return rank;

	}

	static void input() {
		System.out.println("---- �Է� ��� ----");
		if (top >= MAX) {
			System.out.println("�� �̻� �Է� �� �� �����ϴ�!");
			return;
		}
		System.out.print("�̸� : ");
		name[top] = MyUtil.getStr();
		do {
			System.out.print("���� ���� : ");
			kor[top] = MyUtil.getNum();
		} while (kor[top] > 100 || kor[top] < 0);
		do {
			System.out.print("���� ���� : ");
			eng[top] = MyUtil.getNum();
		} while (eng[top] > 100 || eng[top] < 0);
		do {
			System.out.print("���� ���� : ");
			mat[top] = MyUtil.getNum();
		} while (mat[top] > 100 || mat[top] < 0);

		total = Total();
		avg = average();

		grade = grd();

		rank = rnk();

		top++;
	}

	static void output() {
		System.out.println("---- ��� ��� ----");
		list();
		for (int i = 0; i <= top - 1; i++) {
			System.out.print(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + total[i] + "\t" + avg[i]
					+ "\t" + grade[i] + "\t" + rank[i]);
			System.out.println();
		}

	}

	static void search() {
		System.out.println("---- �˻� ��� ----");
		System.out.print("�̸� : ");
		String Name = scan.next();
		for (int i = 0; i < top; i++) {
			if (Name.equals(name[i])) {
				list();
				System.out.println(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + total[i] + "\t"
						+ avg[i] + "\t" + grade[i] + "\t" + rank[i]);
			}
		}

	}

	static void modify() {

		System.out.println("---- ���� ��� ----");

		System.out.print("�̸� : ");
		String Name1 = scan.next();
		for (int i = 0; i < top; i++) {
			if (Name1.equals(name[i])) {

				do {
					System.out.print("�ٲ� ���� ���� : ");
					kor[top] = scan.nextInt();
				} while (kor[top] > 100 || kor[top] < 0);
				do {
					System.out.print("�ٲ� ���� ���� : ");
					eng[top] = scan.nextInt();
				} while (eng[top] > 100 || eng[top] < 0);
				do {
					System.out.print("�ٲ� ���� ���� : ");
					mat[top] = scan.nextInt();
				} while (mat[top] > 100 || mat[top] < 0);

				total = Total();
				avg = average();

				grade = grd();

				rank = rnk();

				break;
			}
		}

	}

	static void delete() {

		System.out.println("---- ���� ��� ----");

		System.out.print("�̸� : ");
		String Name2 = scan.next();
		for (int i = 0; i < top; i++) {
			if (Name2.equals(name[i])) {

				name[i] = name[i + 1];
				kor[i] = kor[i + 1];
				eng[i] = eng[i + 1];
				mat[i] = mat[i + 1];
				total[i] = total[i + 1];
				avg[i] = avg[i + 1];
				grade[i] = grade[i + 1];

				top--;
			}
		}

	}

	static void end() {
		System.out.println("---- �����մϴ�! ----");
		System.exit(0);
	}

	static void cases() {

		switch (base()) {
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
			break;
		default:
			System.out.println("�߸� �Է� �ϼ̽��ϴ�!");
		}
		System.out.println();

	}

	static int base() {
		System.out.println("----------- ���� ��� ���α׷� ------------");
		for (int i = 0; i < menuItems.length; i++) {
			System.out.printf("%s(%d)", menuItems[i], i + 1);
		}
		System.out.println("\n���� : ");
		int no = scan.nextInt();

		return no;
	}

	public static void main(String[] args) {

		cases();
	}

}
