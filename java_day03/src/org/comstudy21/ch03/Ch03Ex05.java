package org.comstudy21.ch03;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Ch03Ex05 {
	public static Scanner scan = new Scanner(in);
	public static void main(String[] args) {
		// ���� 3���� �Է� �޾Ƽ� ���� ū ���� max�� ���, ���� ���� min�� ��ƶ�
		// ��, �ݺ��� ���� ����, �� ������ ���� ����
		int a, b, c;
		int max = 0;
		int mid = 0;
		int min = 0;
					
		out.print("����1 : ");
		a = scan.nextInt();
		out.print("����2 : ");
		b = scan.nextInt();
		out.print("����3 : ");
		c = scan.nextInt();
	
// 4�� ���
		
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
		
// 3�� ���
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

		
// 2�� ���		
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
// 1�� ���	
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
		out.println("�ִ밪 : " + max + "\n�ּҰ� : " + min + "\n�߰��� : " + mid);
	
		
	}

}
