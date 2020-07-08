package java_day07;

import java.util.Arrays;

public class Ch05Ex02 {

	public static void main(String[] args) {
		// 배열을 선언과 동시에 초기화
		int[] score = {85,90,75,100,95};
		
		// Arrays 를 이용해서 배열 요소 한꺼번에 출력하기
		// System.out.println(Arrays.toString(score));
		
		int total = 0;
		
		// score.length : score(배열) 가 가지고 있는 최대 길이를 저장한 속성
		// system.out.print : out => 속성 , print ~ => 메소드, system => 배열
		for(int index=0; index<score.length; index++) {
			// System.out.println(score[index]);
			total += score[index];
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (double)total / score.length);
	}
}
