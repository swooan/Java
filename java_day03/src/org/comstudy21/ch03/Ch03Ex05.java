package org.comstudy21.ch03;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Ch03Ex05 {
	public static Scanner scan = new Scanner(in);
	public static void main(String[] args) {
		// 정수 3개를 입력 받아서 제일 큰 수는 max에 담고, 작은 수는 min에 담아라
		// 단, 반복문 쓰지 말기, 논리 연산자 쓰지 말기
		int a, b, c;
		int max = 0;
		int mid = 0;
		int min = 0;
					
		out.print("정수1 : ");
		a = scan.nextInt();
		out.print("정수2 : ");
		b = scan.nextInt();
		out.print("정수3 : ");
		c = scan.nextInt();
	
// 4번 방법
		
		if (a>b) {
			max = a;
			min = b;
		}
		else {
			max = b;
			min = a;
		}
		
		if (c > max) {
			mid = max;
			max = c;
		}
		else if (c < min) {
			mid = min;
			min = c;
		}
		else {
			mid = c;
		}
		
// 3번 방법
//		max = a;
//		min = a;
//		
//		if(b > max) {
//			max = b;
//		}
//
//		else if (b < min) {
//			min = b;
//		}
//		if (c > max) {
//			mid = max;
//			max = c;
//		}
//		else if (c > min) {
//			mid = c;
//		}	
//		if (c < min) {
//			mid = min;
//			min = c;
//		}

		
// 2번 방법		
//		max = Math.max(a, Math.max(b, c));
////		min = Math.min(a, Math.min(b, c));
//		if(max == a) {
//			mid = Math.max(b, c);
//			min = Math.min(b, c);
//		}
//		else if(max == b) {
//			mid = Math.max(a, c);
//			min = Math.min(a, c);
//		}
//		else if(max == c) {
//			mid = Math.max(a, b);
//			min = Math.min(a, b);
//		}
//		
// 1번 방법	
//		if(a > b) {
//			if(c < b) {
//				max = a;
//				min = c;
//				mid = b;
//			}
//			else if(c > a) {
//				max = c;
//				min = b;
//				mid = a;
//			}
//			else if(c > b) {
//				max = a;
//				min = b;
//				mid = c;
//			}
//		}
//		else if(a < b) {
//			if (c > b) {
//				max = c;
//				min = a;
//				mid = b;
//			}
//			else if(c < a) {
//				max = b;
//				min = c;
//				mid = a;
//			}
//			else if( c > a ) {
//				max = b;
//				min = a;
//				mid = c;
//			}
//			
//		}
//		
		out.printf("%d, %d, %d\n\n", a, b, c);
		out.println("최대값 : " + max + "\n최소값 : " + min + "\n중간값 : " + mid);
	
		
	}

}
