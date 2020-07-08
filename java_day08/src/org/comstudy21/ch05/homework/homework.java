package org.comstudy21.ch05.homework;

import java.util.Scanner;

public class homework {
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

	public static void main(String[] args) {
		int no = 0;

		while (true) {
			// 메뉴 출력
			System.out.println("----------- 성적 출력 프로그램 ------------");
			for (int i = 0; i < menuItems.length; i++) {
				System.out.printf("%s(%d)", menuItems[i], i + 1);
			}
			System.out.println("\n선택 : ");
			no = scan.nextInt();

			switch (no) {
			case 1:
				System.out.println("---- 입력 기능 ----");

				System.out.print("이름  : ");
				name[top] = scan.next();
				System.out.print("국어 : ");
				kor[top] = scan.nextInt();
				System.out.print("영어 : ");
				eng[top] = scan.nextInt();
				System.out.print("수학 : ");
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
				System.out.println("---- 출력 기능 ----");
				System.out.println("이름\t국어\t수학\t영어\t총합\t평균\t등급");
				for (int i = 0; i <= top - 1; i++) {
					System.out.print(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + total[i] + "\t"
							+ avg[i] + "\t" + grade[i]);
					System.out.println();
				}
				break;
				
			case 3:
				System.out.println("---- 검색 기능 ----");
				System.out.print("이름 : ");
				String Name = scan.next();
				for (int i = 0; i < top; i++) {
					if (Name.equals(name[i])) {
						System.out.println("이름\t국어\t수학\t영어\t총합\t평균\t등급");
						System.out.println(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + total[i]
								+ "\t" + avg[i] + "\t" + grade[i]);
					}
				}

				break;
				
			case 4:
				System.out.println("---- 수정 기능 ----");

				System.out.print("이름 : ");
				String Name1 = scan.next();
				for (int i = 0; i < top; i++) {
					if (Name1.equals(name[i])) {

						System.out.print("바꿀 이름  : ");
						name[i] = scan.next();
						System.out.println("바꿀 국어 점수 : ");
						kor[i] = scan.nextInt();
						System.out.print("바꿀 영어 점수 : ");
						eng[i] = scan.nextInt();
						System.out.print("바꿀 수학 점수 : ");
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
				break;
				
			case 6:
				System.out.println("---- 종료합니다! ----");
				System.exit(0);
				break;
			default:
				System.out.println("잘못 입력 하셨습니다!");
			}
			System.out.println();

		}

	}

}