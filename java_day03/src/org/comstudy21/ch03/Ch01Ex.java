package org.comstudy21.ch03;

public class Ch01Ex {

	public static void main(String[] args) {
		
		System.out.println('글');
		System.out.println((int)'글');
		System.out.println(Integer.toHexString((int)'글'));
		
		// 8진수는 0으로 시작, 16진수는 0x로 시작
		System.out.println(033);
		
		//16진수에는 16이 없다.
		// 0123456789abcdef -> 10
		// 8진수에는 8이 없다.
		// 0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20
		
		char ch = 0xae00;
		System.out.println(ch);
		
	}
	
	public static void Q4(String[] args) {
		
		int number1 = 10;
		double number2 = 2.0;
		
		// 결론: 정수와 실수를 연산하면 결과 타입은 실수가 된다.
		System.out.println(number1 + number2);
		System.out.println(number1 - number2);
		System.out.println(number1 * number2);
		System.out.println(number1 / number2);
		System.out.println(number1 % number2);
		
	}
	
}
