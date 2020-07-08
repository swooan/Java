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
		System.out.println("이름\t국어\t수학\t영어\t총합\t평균\t등급\t순위");
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
		System.out.print("이름 : ");
		name[a] = MyUtil.getStr();
		do {
			System.out.print("국어 점수 : ");
			kor[a] = MyUtil.getNum();
		} while (kor[a] > 100 || kor[a] < 0);
		do {
			System.out.print("영어 점수 : ");
			eng[a] = MyUtil.getNum();
		} while (eng[a] > 100 || eng[a] < 0);
		do {
			System.out.print("수학 점수 : ");
			mat[a] = MyUtil.getNum();
		} while (mat[a] > 100 || mat[a] < 0);
	}

	static void input() {
		System.out.println("---- 입력 기능 ----");
		if (top >= MAX) {
			System.out.println("더 이상 입력 할 수 없습니다!");
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
		System.out.println("---- 출력 기능 ----");
		list();
		for (int i = 0; i <= top - 1; i++) {
			scoreData(i);
		}

	}

	static void search() {
		System.out.println("---- 검색 기능 ----");
		System.out.print("이름 : ");
		String Name = MyUtil.getStr();
		for (int i = 0; i < top; i++) {
			if (Name.equals(name[i])) {
				list();
				scoreData(i);
			}
		}

	}

	static void modify() {

		System.out.println("---- 수정 기능 ----");

		System.out.print("이름 : ");
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

		System.out.println("---- 삭제 기능 ----");

		System.out.print("이름 : ");
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
		System.out.println("---- 종료합니다! ----");
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
			System.out.println("잘못 입력 하셨습니다!");
		}
		System.out.println();

	}

	static int base() {
		System.out.println("----------- 성적 출력 프로그램 ------------");
		for (int i = 0; i < menuStr.length; i++) {
			System.out.print((i + 1) + ". " + menuStr[i] + " ");
		}
		System.out.print("\n작업 선택 : ");
		int no = MyUtil.getNum();
		return no;
	}

	public static void main(String[] args) {

		while (true) {
			cases();

		}
	}
}
