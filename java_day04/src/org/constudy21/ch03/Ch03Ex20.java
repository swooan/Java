package org.constudy21.ch03;

import java.util.Scanner;

import static java.lang.System.out;

public class Ch03Ex20 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//월 입력: 2
		// ---> 2월은 28일까지 있습니다!
		// 1~12 사이 값이 아니면 다시 입력
		
		int mon = 0;
		int day = 0;
		
		out.print("월 입력 : ");
		mon = scan.nextInt();
		
		while(mon > 12 || mon <1) { // (!(no>=1 && mon<=12)) 로 해도 된다
			out.println("잘못된 값 입니다.\n");
			out.print("월 입력 : ");
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
		 * } <= 이렇게만 해도 31일인 달은 기본값으로 출력이 되니까 생략 가능*/
		
		out.printf("%d월은 %d일까지 있습니다.\n\n", mon, day);
		main(null);
	}
	
	public static void test2(String[] args) {
		// ------------ 메 뉴 ----------------
		// 입력(1) 출력(2) 검색(3) 수정(4) 삭제(5) = crud = 데이터 가공의 기본
		// 선택 : 1을 누르면
		// :::: 입력 기능 실행 ::::::
		//
		// ------------ 메 뉴 ----------------
		// 입력(1) 출력(2) 검색(3) 수정(4) 삭제(5)
		// 선택 :
		
		int num = 0;
		String menu = "a";
		
		out.println("------- 메 뉴 -------");
		out.println("입력(1) 출력(2) 검색(3) 수정(4) 삭제(5)");
		out.print("선택 : ");
		num = scan.nextInt();
		
		// while(num < 1 || num > 5) { //제대로 된 값이 들어갈 때 까지 반복
		//	System.out.print("선택 : ");
		//	num = scan.nextInt();
		
		switch(num) {
		case 1 :
			menu = "입력";
			break;
			
		case 2 : 
			menu = "출력";
			break;
		
		case 3 : 
			menu = "검색";
			break;
		
		case 4 : 
			menu = "수정";
			break;
		
		case 5 : 
			menu = "삭제";
			break;
			
		default :
			out.println("\n잘못된 값입니다.\n");
			main(null);
		}
		out.println("\n:::::::" + menu + " 기능 실행 :::::::\n");
		main(null);
		
	}
	
	public static void test(String[] args) {
		// switch ~ case 문으로 성적 출력
		//Scanner scan = new Scanner(System.in);
		int score = 0;
		char grade = 'F';

		out.print("성적 입력: ");
		score = scan.nextInt();

		if (score > 100 || score < 0) {
			out.println("잘못된 값입니다.");
			main(null);
		}
		else {
			switch (score / 10) {
			case 10: // break 가 없으므로 다음 케이스의 문장을 출력
				
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
				grade = 'F'; // 밑에 더 진행 될게 없어서 break 없어도 됨
			}
			out.printf("%d 학점은 %c 학점 입니다.", score, grade);
		}

	}

}
