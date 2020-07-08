package org.comstudy21.day10;

import java.util.Scanner;

public class Homework2 {

	static final int MAX = 100;
	static int top = 0; // 현재 입력 위치 index

	static String[] name = new String[MAX];
	static int[] kor = new int[MAX]; // 국어
	static int[] eng = new int[MAX]; // 영어
	static int[] mat = new int[MAX]; // 수학
	static int[] total = new int[MAX]; // 총점
	static double[] avg = new double[MAX]; // 평균
	static char[] grade = new char[MAX]; // 등급
	static int[] rank = new int[MAX]; // 순위

	static Scanner scan = new Scanner(System.in);

	static String[] menuItems = { "INPUT", "OUTPUT", "SEARCH", "MODIFY", "DELETE", "END" };

	static void list() {
		System.out.println("이름\t국어\t수학\t영어\t총합\t평균\t등급\t순위");
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
		System.out.println("---- 입력 기능 ----");
		if (top >= MAX) {
			System.out.println("더 이상 입력 할 수 없습니다!");
			return;
		}
		System.out.print("이름 : ");
		name[top] = MyUtil.getStr();
		do {
			System.out.print("국어 점수 : ");
			kor[top] = MyUtil.getNum();
		} while (kor[top] > 100 || kor[top] < 0);
		do {
			System.out.print("영어 점수 : ");
			eng[top] = MyUtil.getNum();
		} while (eng[top] > 100 || eng[top] < 0);
		do {
			System.out.print("수학 점수 : ");
			mat[top] = MyUtil.getNum();
		} while (mat[top] > 100 || mat[top] < 0);

		total = Total();
		avg = average();

		grade = grd();

		rank = rnk();

		top++;
	}

	static void output() {
		System.out.println("---- 출력 기능 ----");
		list();
		for (int i = 0; i <= top - 1; i++) {
			System.out.print(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + total[i] + "\t" + avg[i]
					+ "\t" + grade[i] + "\t" + rank[i]);
			System.out.println();
		}

	}

	static void search() {
		System.out.println("---- 검색 기능 ----");
		System.out.print("이름 : ");
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

		System.out.println("---- 수정 기능 ----");

		System.out.print("이름 : ");
		String Name1 = scan.next();
		for (int i = 0; i < top; i++) {
			if (Name1.equals(name[i])) {

				do {
					System.out.print("바꿀 국어 점수 : ");
					kor[top] = scan.nextInt();
				} while (kor[top] > 100 || kor[top] < 0);
				do {
					System.out.print("바꿀 영어 점수 : ");
					eng[top] = scan.nextInt();
				} while (eng[top] > 100 || eng[top] < 0);
				do {
					System.out.print("바꿀 수학 점수 : ");
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

		System.out.println("---- 삭제 기능 ----");

		System.out.print("이름 : ");
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
		for (int i = 0; i < menuItems.length; i++) {
			System.out.printf("%s(%d)", menuItems[i], i + 1);
		}
		System.out.println("\n선택 : ");
		int no = scan.nextInt();

		return no;
	}

	public static void main(String[] args) {

		cases();
	}

}
