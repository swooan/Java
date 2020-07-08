package org.constudy21.ch03;

public class Ch03Ex23 {

	public static void main(String[] args) {
		int total = 0;
		int n = 1;
		while (n <= 5)
		{
			total += n;
			System.out.print(n);
			if(n<5) 
			{
				System.out.print("+");
			}
			
			n++;
		}
		System.out.println("=" + total);
	}

	public static void test02(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10= 으로 출력이 되게
		// int total = 0;

		for (int n = 1; n <= 10; n++) {
			// total += n;
			System.out.print(n);
			if (n != 10) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
		}
		// System.out.println("=" + total); <- 대신에 else를 삭제
	}

	public static void test(String[] args) {
		// 1~10까지의 홀수의 합을 total에 누적한다.

		int total = 0;

		// for 문을 만들어서 누적하세요

		for (int n = 1; n <= 10; n += 2) {
			total += n;
		}

		// 출력

		System.out.println("1부터 10까지 홀수의 합은 " + total + "입니다.");

	}
}
