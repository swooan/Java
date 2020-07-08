package org.comstudy21.method;

import java.util.Scanner;

public class WeekendHomework {

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

	public static void input() {
		System.out.println("---- 입력 기능 ----");
		if (top >= MAX) {
			System.out.println("더 이상 입력 할 수 없습니다!");
			return;
		}
		System.out.print("이름 : ");
		name[top] = scan.next();
		do {
			System.out.print("국어 점수 : ");
			kor[top] = scan.nextInt();
		} while (kor[top] > 100 || kor[top] < 0);
		do {
			System.out.print("영어 점수 : ");
			eng[top] = scan.nextInt();
		} while (eng[top] > 100 || eng[top] < 0);
		do {
			System.out.print("수학 점수 : ");
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
		System.out.println("---- 출력 기능 ----");
		// 목록 출력
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "번호", "성명", "국어", "영어", "수학", "총점", "평균", "학점", "등수");
		for (int i = 0; i < top; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c\t%d\n", i, name[i], kor[i], eng[i], mat[i], total[i], avg[i],
					grade[i], rank[i]);
		}
	}

	public static void search() {
		System.out.println("---- 검색 기능 ----");
		if(top == 0) {
			System.out.println("저장된 데이터 내용이 없습니다.");
			return;
		}
		
		System.out.println("이름 입력 : ");
		String searchName = scan.next();
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n", "번호", "성명", "국어", "영어", "수학", "총점", "평균", "학점", "등수");
		boolean flag = false;
		for (int i = 0; i < top; i++) {
			if(searchName.equals(name[i])) {
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c\t%d\n",i, name[i], kor[i], eng[i], mat[i], total[i], avg[i],
						grade[i], rank[i]);
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("검색하신 내용을 찾지 못하였습니다.");
		}
	}

	public static void modify() {
		System.out.println("---- 수정 기능 ----");
		
		System.out.print("수정 할 학생의 번호 입력 : ");
		int no = scan.nextInt();
		while(no<0 || no>=top) {
			System.out.println("범위를 벗어났습니다.");
			System.out.print("번호 다시 입력 : ");
			no = scan.nextInt();
		} 
		
		System.out.print("이름 : ");
		name[no] = scan.next();
		do {
			System.out.print("국어 점수 : ");
			kor[no] = scan.nextInt();
		} while (kor[no] > 100 || kor[no] < 0);
		do {
			System.out.print("영어 점수 : ");
			eng[no] = scan.nextInt();
		} while (eng[no] > 100 || eng[no] < 0);
		do {
			System.out.print("수학 점수 : ");
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
		System.out.println("---- 삭제 기능 ----");
		if(top == 0) {
			System.out.println("삭제할 내용이 없습니다.");
			return;
		}
		System.out.print("삭제할 번호 입력 : ");
		int no = scan.nextInt();
		while(no<0||no>top) {
			System.out.print("삭제할 번호 입력 : ");
			no = scan.nextInt();
		}
		
		// no 를 기준으로 한칸씩 앞으로 땡겨준다.
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
		System.out.println("---- 종료합니다! ----");
	}

	public static void main(String[] args) {
		int no = 0;

		while (true) {
			// 메뉴 출력
			System.out.println("----------- 성적 출력 프로그램 ------------");
			for (int i = 0; i < menuItems.length; i++) {
				System.out.printf("%s(%d)", menuItems[i], i + 1);
			}
			System.out.print("\n선택 : ");
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
				System.out.println("잘못 입력 하셨습니다!");
				break;
			}
			System.out.println();

		}
	}
}
