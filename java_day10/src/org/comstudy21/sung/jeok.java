package org.comstudy21.sung;

import org.comstudy21.day10.MyUtil;

public class jeok {

	static String[] menuStr = { "INPUT", "OUTPUT", "SEARCH", "MODIFY", "DELETE", "END" };
	static final int MAX = 100;
	static int top = 0;

	static String[] name = new String[MAX];
	static int[] kor = new int[MAX];
	static int[] eng = new int[MAX];
	static int[] mat = new int[MAX];
	static int[] total = new int[MAX];
	static double[] avg = new double[MAX];
	static char[] grade = new char[MAX];
	static int[] rank = new int[MAX];

	static void list() {
		System.out.println("�̸�\t����\t����\t����\t����\t���\t���\t����");
	}

	static void scoreData(int a) {

		System.out.print(name[a] + "\t" + kor[a] + "\t" + eng[a] + "\t" + mat[a] + "\t" + total[a] + "\t" + avg[a]
				+ "\t" + grade[a] + "\t" + rank[a]);
		System.out.println();

	}

	static int[] Total(int a) {

		total[a] = kor[a] + eng[a] + mat[a];

		return total;

	}

	static double[] average(int a) {

		avg[a] = total[a] / 3.0;

		return avg;
	}

	static char[] grd(int a) {

		if (avg[a] >= 90) {
			grade[a] = 'A';
		} else if (avg[a] >= 80) {
			grade[a] = 'B';
		} else if (avg[a] >= 70) {
			grade[a] = 'C';
		} else if (avg[a] >= 60) {
			grade[a] = 'D';
		} else {
			grade[a] = 'F';
		}

		return grade;
	}

	static int[] rnk(int a) {

		for (int i = 0; i <= a; i++) {
			rank[i] = 1;
			for (int j = 0; j <= a; j++) {
				if (total[i] < total[j]) {
					rank[i]++;

				}
			}
		}

		return rank;

	}

	static void inputData(int a) {
		System.out.print("�̸� : ");
		name[a] = MyUtil.getStr();
		do {
			System.out.print("���� ���� : ");
			kor[a] = MyUtil.getNum();
		} while (kor[a] > 100 || kor[a] < 0);
		do {
			System.out.print("���� ���� : ");
			eng[a] = MyUtil.getNum();
		} while (eng[a] > 100 || eng[a] < 0);
		do {
			System.out.print("���� ���� : ");
			mat[a] = MyUtil.getNum();
		} while (mat[a] > 100 || mat[a] < 0);
	}

	static void input() {
		System.out.println("---- �Է� ��� ----");
		if (top >= MAX) {
			System.out.println("�� �̻� �Է� �� �� �����ϴ�!");
			return;
		}

		inputData(top);

		total = Total(top);

		avg = average(top);

		grade = grd(top);

		rank = rnk(top);

		top++;
	}

	static void output() {
		System.out.println("---- ��� ��� ----");
		list();
		for (int i = 0; i <= top - 1; i++) {
			scoreData(i);
		}

	}

	static void search() {
		System.out.println("---- �˻� ��� ----");
		System.out.print("�̸� : ");
		String Name = MyUtil.getStr();
		for (int i = 0; i < top; i++) {
			if (Name.equals(name[i])) {
				list();
				scoreData(i);
			}
		}

	}

	static void modify() {

		System.out.println("---- ���� ��� ----");

		System.out.print("�̸� : ");
		String Name1 = MyUtil.getStr();
		for (int i = 0; i < top; i++) {
			if (Name1.equals(name[i])) {

				inputData(i);

				total = Total(i);
				avg = average(i);

				grade = grd(i);

				rank = rnk(top);

				break;
			}
		}

	}

	static void delete() {

		System.out.println("---- ���� ��� ----");

		System.out.print("�̸� : ");
		String Name2 = MyUtil.getStr();
		for (int i = 0; i < top; i++) {
			if (Name2.equals(name[i])) {
				for(int j = i; j < top; j++) {
					name[j] = name[j + 1];
					kor[j] = kor[j + 1];
					eng[j] = eng[j + 1];
					mat[j] = mat[j + 1];
					total[j] = total[j + 1];
					avg[j] = avg[j + 1];
					grade[j] = grade[j + 1];
					
					rank = rnk(top);
				}

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
		for (int i = 0; i < menuStr.length; i++) {
			System.out.print((i + 1) + ". " + menuStr[i] + " ");
		}
		System.out.print("\n�۾� ���� : ");
		int no = MyUtil.getNum();
		return no;
	}

	public static void main(String[] args) {

		while (true) {
			cases();

		}
	}
}
