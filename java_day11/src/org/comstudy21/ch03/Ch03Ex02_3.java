package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex02_3 {

	public Ch03Ex02_3() {
		doWhileTest();
	}
	
	public void doWhileTest() {
		//do while 문을 이용하여 'a'부터 'z'까지 출력
		char ch = 'a';
		
		do {
			System.out.print(ch);
			ch = (char)(ch+1);
		}
		while(ch<='z');
		
	}

	public void test() {
		
		System.out.println("종료하기 전 까지의 입력된 숫자의 개수와 평균을 구하기");
		System.out.println("숫자 입력 (종료는 -1 입력) : ");
		
		Scanner scan = new Scanner(System.in);
		
		int cnt = 0;
		int sum = 0;
		int num = 0;
		while((num = scan.nextInt()) != -1) {
			sum += num;
			cnt++;
			
		}
		if(cnt == 0) {
			System.out.println("입력된 숫자가 없습니다.");
			return;
		}
		System.out.println("숫자는 총 " + cnt + "개 입력하셨습니다.");
		System.out.println("숫자들의 평균은 " + (sum/cnt) + " 입니다.");
		
		scan.close();
	}

	public static void main(String[] args) {
		new Ch03Ex02_3();

	}

}
