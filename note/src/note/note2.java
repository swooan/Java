package note;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class note2 {
	static Scanner scan = new Scanner(in);
	
	public static void main(String[] args) {
		
		int a,b,c;
		int max = 0;
		int mid = 0;
		int min = 0;
		
		System.out.print("����1: ");
		a = scan.nextInt();
		System.out.print("����2: ");
		b = scan.nextInt();
		System.out.print("����3: ");
		c = scan.nextInt();
		
		if(b<a) {
			if(c<b) {
				max = a;
				mid = b;
				min = c;
			}
			else if(b<c ) {
				if(c<a) {
					max = a;
					mid = c;
					min = b;
				}
				else if(a<c) {
					max = c;
					mid = a;
					min = b;
				}
			}
		}
		else if(b>a) {
			if(c>b) {
				max = c;
				mid = b;
				min = a;
			}
			else if(c<b) {
				if(c>a) {
					max = b;
					mid = c;
					min = a;
				}
				else if(c<a) {
					max = b;
					mid = a;
					min = c;
				}
			}
		}
		
		
		
		
		System.out.printf("%d, %d, %d\n", a, b, c);
		System.out.println("max = " + max + "\nmid = " + mid + "\nmin = " + min);
		
	}
	
	
	public static void note01 (String[] args) {
		//������ �Է¹޾Ƽ� ������ ����Ѵ�.
		int score = 0;
		String grade = "M";
		
		out.print("�����Է�: ");
		score = scan.nextInt();
		
		if (score > 100 || score < 0) {
			out.println("�Է°��� �߸� �Ǿ����ϴ�.");
		}
		else if(score<=100 && score>=90) {
			grade = "A";
			out.println(score + "���� A���� �Դϴ�.");
		}
		else if (score >= 80 ) {
			grade = "B"; 
			out.println(score + "���� B�� �Դϴ�.");
		}
		else if (score >= 70) {
			grade = "C"; 
			out.println(score + "���� C���� �Դϴ�.");
		}
		else if (score >= 60) {
			grade = "D";
			out.println(score + "���� D���� �Դϴ�.");
		}
		else {
			grade = "F";
			out.println(score + "���� F���� �Դϴ�.");
		}
	}
	
}
