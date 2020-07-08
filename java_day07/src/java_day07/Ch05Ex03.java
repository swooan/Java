package java_day07;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex03 {
	static Scanner scan = new Scanner(System.in);
	static final int SIZE = 5;
	
	public static void main(String[] args) {
		// 성적을 저장하는 배열을 선언하고 
		// 5명의 성적을 입력 받아서 총점을 구하는 프로그램을 만든다.

		int[] score = new int[SIZE];
		int total = 0; // 총점 저장
		double avg = 0; //평균
		int max = 0; // 최고점수
		
//		for(int i=0; i<SIZE; i++) {
//			do {
//				System.out.print("점수 입력  " + i+1 +" : " );
//				score[i] = scan.nextInt();
//			}
//			while(score[i]>100 || score[i]<0);
//			
//			total += score[i];
//			avg = (double)total / score.length;
//			max = Math.max(score[i], max);
//		}
//		System.out.println("점수의 합은 : " + total);
//		System.out.println("점수의 평균은 : " + avg);
//		System.out.println("점수의 최댓값은 : " + max);
		
		System.out.println("5명의 성적 입력");
		for(int i=0; i<SIZE; i++) {
			score[i] = scan.nextInt();
			total+=score[i];
		}
		// System.out.println(Arrays.toString(score));
		System.out.println("총점 : " + total);
		avg = total/SIZE;
		System.out.println("평균 : " + avg);
		
		// max를 0으로 초기화한다.
		// max와 요소를 비교해서 요소가 max 보다 크면 max의 값을 바꾼다.
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
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
