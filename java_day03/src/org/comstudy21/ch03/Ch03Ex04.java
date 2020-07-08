package org.comstudy21.ch03;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;


public class Ch03Ex04 {
	public static Scanner scan = new Scanner(in);
	// 코드를 외우는 것이 아니다. 작업 순서를 기억한다.
	// 한단계 한단계 쌓아 나간다.
	// 의사코드를 활용한다.
	public static void sample02(String[] args) {
		
		String grade = "F";
		int score = 0;
		
		out.print("성적입력: ");
		score = scan.nextInt();

		/*
		out.println("score => " + score); // test
		테스트 하면서 코딩하기
		*/
		
		if(score>100 || score<0) {
			out.println("잘못 된 점수입니다.");
			return; //함수를 종료한다.
		}
		if(score >= 90) {
			grade = "A";
		}
		else if (score >= 80) {
			grade ="B";
		}
		else if (score >= 70) {
			grade = "C";
		}
		else if (score >= 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		
		if (score >= 60) { 
		
			int mod = score % 10;
			if(mod >= 7 || score == 100) {
				grade += "+";
			}
			else if(mod <= 2) {
				grade += "-";
			}	
		}	
		
		out.printf("%d점은 %s학점 입니다.", score, grade);
		
	}
	
	public static void main(String[] args) {
		//성적을 입력 받아서 A+, A, A- 형식으로 출력하도록
		//성적의 1의자리가 7 이상이면 +
		//성적의 1의자리가 2 이하면 -
		
		String grade = "F";
		int score = 0;
		
		out.print("성적입력: ");
		score = scan.nextInt();

		if (100 < score || score < 0) {
			out.println("값이 잘못 입력되었습니다.\n");
			main(null);
		}
		else {
			if (score >= 90) {
				grade = "A";
			}
			else if (score >= 80) {
				grade = "B";
			}
			else if (score >= 70) {
				grade = "C";
			}
			else if (score >= 60) {
				grade = "D";
			}
			if (score%10 >= 7 || score == 100) {
				grade = grade + "+";
			}
			else if (score%10 <= 2) {
				grade = grade + "-";
			}
			if (score < 60) {
				grade = "F";
			}
			out.printf("%d점으로 %s학점입니다.\n\n", score, grade);
			main(null);
			
		}
		
	}

}
