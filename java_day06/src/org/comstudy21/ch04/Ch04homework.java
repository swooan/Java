package org.comstudy21.ch04;

import static java.lang.System.out;

import java.util.Scanner;

public class Ch04homework {

	public static void main(String[] args) {
		// �������� 3�� 3���� ����ϱ�
		// ���۴�, ����ܰ� ��ġ��
		
		// 1. �������� 3�� 3���� ���
		//     - ������� ���
		
//			out.printf("***%d***\t", dan+0);
//			out.printf("***%d***\t", dan+1);
//			if(dan+2 != 10) {				
//				out.printf("***%d***\t", dan+2);
//			}

		int start =3, end=9;
		
		Scanner scan = new Scanner(System.in);
		
		do {	
		out.print("���۴� : ");
		start = scan.nextInt();
		} while(start < 2 || start > 9);
		
		do {
			out.print("����� : ");
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
