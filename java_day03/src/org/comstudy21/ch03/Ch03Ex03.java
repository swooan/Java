package org.comstudy21.ch03;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Ch03Ex03 {
	static Scanner scan = new Scanner(in);
	
	public static void main(String[] args) {
		int score = 0;
		String grade = "F";
		
		out.print("�����Է�: ");
		score = scan.nextInt();
		
		if (score > 100 || score < 0) {
			out.println("�Է°��� �߸� �Ǿ����ϴ�.");
			main(null); //���ȣ��... main �� �ٽ� �����Ѵ�.
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
			out.printf("%d���� %s�����Դϴ�!", score, grade); 
		
	}
		
	
	
	public static void test03 (String[] args) {
		//������ �Է¹޾Ƽ� ������ ����Ѵ�.
		int score = 0;
		String grade = "F";
		
		out.print("�����Է�: ");
		score = scan.nextInt();
		/* 2. if (score>100 || score<0) {
		 * out.println("error")
		 * } else { */
		if (score > 100 || score < 0) {
			out.println("�Է°��� �߸� �Ǿ����ϴ�.");
			//System.exit(0); <- �ؿ� if �� �ȳ־��൵ error ���� ��µȴ�(���μ��� ����)
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
		} <- ���� ���� ( ���� �⺻���� �̹� F�̱� ������)*/
		/*1. if(score>100 || score<0) {
		 * 	out.println("error");
		 * } else {*/
		if (score <= 100 && score >= 0) {
			out.printf("%d���� %s�����Դϴ�!", score, grade); 
		}
		
	}
	
}
