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
		
		System.out.print("정수1: ");
		a = scan.nextInt();
		System.out.print("정수2: ");
		b = scan.nextInt();
		System.out.print("정수3: ");
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
		//성적을 입력받아서 학점을 출력한다.
		int score = 0;
		String grade = "M";
		
		out.print("성적입력: ");
		score = scan.nextInt();
		
		if (score > 100 || score < 0) {
			out.println("입력값이 잘못 되었습니다.");
		}
		else if(score<=100 && score>=90) {
			grade = "A";
			out.println(score + "점은 A학점 입니다.");
		}
		else if (score >= 80 ) {
			grade = "B"; 
			out.println(score + "점은 B점 입니다.");
		}
		else if (score >= 70) {
			grade = "C"; 
			out.println(score + "점은 C학점 입니다.");
		}
		else if (score >= 60) {
			grade = "D";
			out.println(score + "점은 D학점 입니다.");
		}
		else {
			grade = "F";
			out.println(score + "점은 F학점 입니다.");
		}
	}
	
}
