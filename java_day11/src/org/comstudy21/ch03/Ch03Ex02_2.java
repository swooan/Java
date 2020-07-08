package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex02_2 {

	public Ch03Ex02_2() {
		System.out.println("생성자");
		
//		test(); - 생성자에서 호출 (객체 내부)
	}
	
	private void test() {
		System.out.println("입력될 때까지 입력된 수의 평균 구하기");
		int count = 0; // 입력된 수 카운트
		int sum = 0; // 입력된 수의 합
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수입력(종료는 -1) >>> ");
//		int num = scan.nextInt();
//		
//		while(num != -1) {
		
		int num = 0;
		while((num=scan.nextInt())!=-1) {
			sum += num;
			count++;
			
		}
		if(count == 0) {
			System.out.println("입력된 수가 없습니다.");
			return;
		}
		System.out.println("정수의 개수는 " + count + "개 입니다.");
		System.out.println("평균은 " + ((double)sum/count));
		
		scan.close();
	}

	public static void main(String[] args) {
		
		Ch03Ex02_2 ch03Ex02_2 = new Ch03Ex02_2();
		
		// 객체 외부에서 호출    (main은 동일 클래스 안에 있는 다른 객체이다.)
		ch03Ex02_2.test();
	}
}
