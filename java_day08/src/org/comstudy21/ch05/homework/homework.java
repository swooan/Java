package org.comstudy21.ch05.homework;

import java.util.Scanner;

public class homework {
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

	public static void main(String[] args) {
		int no = 0;

		while (true) {
			// �޴� ���
			System.out.println("----------- ���� ��� ���α׷� ------------");
			for (int i = 0; i < menuItems.length; i++) {
				System.out.printf("%s(%d)", menuItems[i], i + 1);
			}
			System.out.println("\n���� : ");
			no = scan.nextInt();

			switch (no) {
			case 1:
				System.out.println("---- �Է� ��� ----");

				System.out.print("�̸�  : ");
				name[top] = scan.next();
				System.out.print("���� : ");
				kor[top] = scan.nextInt();
				System.out.print("���� : ");
				eng[top] = scan.nextInt();
				System.out.print("���� : ");
				mat[top] = scan.nextInt();

				total[top] = kor[top] + eng[top] + mat[top];
				avg[top] = total[top] / 3;
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
				top++;
				break;

			case 2:
				System.out.println("---- ��� ��� ----");
				System.out.println("�̸�\t����\t����\t����\t����\t���\t���");
				for (int i = 0; i <= top - 1; i++) {
					System.out.print(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + total[i] + "\t"
							+ avg[i] + "\t" + grade[i]);
					System.out.println();
				}
				break;
				
			case 3:
				System.out.println("---- �˻� ��� ----");
				System.out.print("�̸� : ");
				String Name = scan.next();
				for (int i = 0; i < top; i++) {
					if (Name.equals(name[i])) {
						System.out.println("�̸�\t����\t����\t����\t����\t���\t���");
						System.out.println(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + total[i]
								+ "\t" + avg[i] + "\t" + grade[i]);
					}
				}

				break;
				
			case 4:
				System.out.println("---- ���� ��� ----");

				System.out.print("�̸� : ");
				String Name1 = scan.next();
				for (int i = 0; i < top; i++) {
					if (Name1.equals(name[i])) {

						System.out.print("�ٲ� �̸�  : ");
						name[i] = scan.next();
						System.out.println("�ٲ� ���� ���� : ");
						kor[i] = scan.nextInt();
						System.out.print("�ٲ� ���� ���� : ");
						eng[i] = scan.nextInt();
						System.out.print("�ٲ� ���� ���� : ");
						mat[i] = scan.nextInt();

						total[i] = kor[i] + eng[i] + mat[i];
						avg[i] = total[i] / 3;
						if (avg[i] >= 90) {
							grade[i] = 'A';
						} else if (avg[i] >= 80) {
							grade[i] = 'B';
						} else if (avg[i] >= 70) {
							grade[i] = 'C';
						} else if (avg[i] >= 60) {
							grade[i] = 'D';
						} else {
							grade[i] = 'F';
						}
						break;
					}
				}
				break;
				
			case 5:
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
				break;
				
			case 6:
				System.out.println("---- �����մϴ�! ----");
				System.exit(0);
				break;
			default:
				System.out.println("�߸� �Է� �ϼ̽��ϴ�!");
			}
			System.out.println();

		}

	}

}