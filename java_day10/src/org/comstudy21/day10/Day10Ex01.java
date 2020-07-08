package org.comstudy21.day10;

import java.util.Scanner;

public class Day10Ex01 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int num;

		num = 0;
		while (true) {
			try {
				System.out.print("정수입력 : ");
				num = scan.nextInt();
				break; // 정상 입력 되면 반복문 탈출
			} catch (Exception e) {
				scan.next(); // 버퍼를 비워주고
				continue; // 처음으로 이동

			}
		}

		System.out.println("num => " + num);

	}

}
