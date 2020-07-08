package org.comstudy21.ch04;

import static java.lang.System.out;

import java.util.Scanner;

public class Ch04homework {

	public static void main(String[] args) {
		// 구구단을 3행 3열로 출력하기
		// 시작단, 종료단과 합치기
		
		// 1. 구구단을 3행 3열로 출력
		//     - 제목부터 출력
		
//			out.printf("***%d***\t", dan+0);
//			out.printf("***%d***\t", dan+1);
//			if(dan+2 != 10) {				
//				out.printf("***%d***\t", dan+2);
//			}

		int start =3, end=9;
		
		Scanner scan = new Scanner(System.in);
		
		do {	
		out.print("시작단 : ");
		start = scan.nextInt();
		} while(start < 2 || start > 9);
		
		do {
			out.print("종료단 : ");
			end = scan.nextInt();
		} while(end < 2 || end > 9);
		
		if (start>end) {
			int temp = start;
			start = end;
			end = temp;
		}
		
		for(int dan = start; dan <= end; dan+=3) {
			for(int i=0; i<3; i++) {
				if(dan+i <= end && dan+i!=10) {
					out.printf("***%d***\t", dan+i);
					
				}
			}
			System.out.println();
			
			for(int cnt=1; cnt<=9; cnt++) {
				for(int i=0; i<3; i++) {
					if(dan + i <= end && dan+i!=10) {
						out.printf("%d*%d=%d\t", (dan+i), cnt, (dan+i)*cnt);
						
					}
					
				}
				System.out.println();
			}
		}
				
		
	}
	
}
