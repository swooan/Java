package org.comstudy21.ch03;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Ch03Ex03 {
	static Scanner scan = new Scanner(in);
	
	public static void main(String[] args) {
		int score = 0;
		String grade = "F";
		
		out.print("성적입력: ");
		score = scan.nextInt();
		
		if (score > 100 || score < 0) {
			out.println("입력값이 잘못 되었습니다.");
			main(null); //재귀호출... main 을 다시 실행한다.
		}
		else if(score<=100 && score>=90) {
			grade = "A";
		}
		else if (score >= 80 ) {
			grade = "B"; 
		}
		else if (score >= 70) {
			grade = "C"; 
		}
		else if (score >= 60) {
			grade = "D";
		}
			out.printf("%d점은 %s학점입니다!", score, grade); 
		
	}
		
	
	
	public static void test03 (String[] args) {
		//성적을 입력받아서 학점을 출력한다.
		int score = 0;
		String grade = "F";
		
		out.print("성적입력: ");
		score = scan.nextInt();
		/* 2. if (score>100 || score<0) {
		 * out.println("error")
		 * } else { */
		if (score > 100 || score < 0) {
			out.println("입력값이 잘못 되었습니다.");
			//System.exit(0); <- 밑에 if 를 안넣어줘도 error 값만 출력된다(프로세스 종료)
		}
		else if(score<=100 && score>=90) {
			grade = "A";
		}
		else if (score >= 80 ) {
			grade = "B"; 
		}
		else if (score >= 70) {
			grade = "C"; 
		}
		else if (score >= 60) {
			grade = "D";
		}
		/*else {
			grade = "F";
		} <- 생략 가능 ( 위에 기본값이 이미 F이기 때문에)*/
		/*1. if(score>100 || score<0) {
		 * 	out.println("error");
		 * } else {*/
		if (score <= 100 && score >= 0) {
			out.printf("%d점은 %s학점입니다!", score, grade); 
		}
		
	}
	
}
