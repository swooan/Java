package org.comstudy21.ch03;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;


public class Ch03Ex04 {
	public static Scanner scan = new Scanner(in);
	// �ڵ带 �ܿ�� ���� �ƴϴ�. �۾� ������ ����Ѵ�.
	// �Ѵܰ� �Ѵܰ� �׾� ������.
	// �ǻ��ڵ带 Ȱ���Ѵ�.
	public static void sample02(String[] args) {
		
		String grade = "F";
		int score = 0;
		
		out.print("�����Է�: ");
		score = scan.nextInt();

		/*
		out.println("score => " + score); // test
		�׽�Ʈ �ϸ鼭 �ڵ��ϱ�
		*/
		
		if(score>100 || score<0) {
			out.println("�߸� �� �����Դϴ�.");
			return; //�Լ��� �����Ѵ�.
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
		
		out.printf("%d���� %s���� �Դϴ�.", score, grade);
		
	}
	
	public static void main(String[] args) {
		//������ �Է� �޾Ƽ� A+, A, A- �������� ����ϵ���
		//������ 1���ڸ��� 7 �̻��̸� +
		//������ 1���ڸ��� 2 ���ϸ� -
		
		String grade = "F";
		int score = 0;
		
		out.print("�����Է�: ");
		score = scan.nextInt();

		if (100 < score || score < 0) {
			out.println("���� �߸� �ԷµǾ����ϴ�.\n");
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
			out.printf("%d������ %s�����Դϴ�.\n\n", score, grade);
			main(null);
			
		}
		
	}

}
