package java_day07;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex03 {
	static Scanner scan = new Scanner(System.in);
	static final int SIZE = 5;
	
	public static void main(String[] args) {
		// ������ �����ϴ� �迭�� �����ϰ� 
		// 5���� ������ �Է� �޾Ƽ� ������ ���ϴ� ���α׷��� �����.

		int[] score = new int[SIZE];
		int total = 0; // ���� ����
		double avg = 0; //���
		int max = 0; // �ְ�����
		
//		for(int i=0; i<SIZE; i++) {
//			do {
//				System.out.print("���� �Է�  " + i+1 +" : " );
//				score[i] = scan.nextInt();
//			}
//			while(score[i]>100 || score[i]<0);
//			
//			total += score[i];
//			avg = (double)total / score.length;
//			max = Math.max(score[i], max);
//		}
//		System.out.println("������ ���� : " + total);
//		System.out.println("������ ����� : " + avg);
//		System.out.println("������ �ִ��� : " + max);
		
		System.out.println("5���� ���� �Է�");
		for(int i=0; i<SIZE; i++) {
			score[i] = scan.nextInt();
			total+=score[i];
		}
		// System.out.println(Arrays.toString(score));
		System.out.println("���� : " + total);
		avg = total/SIZE;
		System.out.println("��� : " + avg);
		
		// max�� 0���� �ʱ�ȭ�Ѵ�.
		// max�� ��Ҹ� ���ؼ� ��Ұ� max ���� ũ�� max�� ���� �ٲ۴�.
		max = 0;
		int min = 100;
		for (int i=0; i<SIZE; i++) {
			if(score[i] > max) {
				max = score[i];
			}
			if(score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	}

}
