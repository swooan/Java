package org.comstudy21.ch02;

import java.util.Scanner;

public class Ch02Ex03 {
	//필드 선언 (함수 외부의 변수)
	/*2*/static Scanner scan = new Scanner(System.in); 
	
	///*2*/static 멤버는 non-static 멤버가 접근 불가능.
	public static void main(String[] args) {
		//원주율 선언 - final을 이용한 상수선언
		final double Pi = 3.141592;
		//Pi = 3.14; final선언은 뒤에 숫자를 절대 못바꿈
		/*1*/int r = 5;
		double area = 0; //아무 숫자나 들어가도 상관 없음
		
		/*2*/System.out.print("반지름 입력: ");
		///*2-2*/Ch02Ex03 obj = new Ch02Ex03();
		///*2-2*/r = obj.scan.nextInt();
		///*2-1*/r = scan.nextInt();
		
		//정수와 실수를 연산하면 결과 타입은 실수형이 된다.
		area = r*r*Pi;
		
		System.out.print("반지름이 " + r + "인 원의 " );
		System.out.printf("면적은 %.2f\n", area);
		//%.2f 라고 쓰면 소수점 2자리까지 나온다.
		
		
	}
}
