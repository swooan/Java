package org.comstudy21.ch03_homework;

import java.util.Scanner;

public class Ch04Ex03 {

	public static void main(String[] args) {
		// �������� 3�� 3���� ����ϱ�
		// ���۴�, ����ܰ� ��ġ��
		
		Scanner scan = new Scanner(System.in);
		
		int min = 0;
		int max = 0;

		do {
			System.out.print("���۴� : ");
			min = scan.nextInt();
		}
		while(2 > min || 9 < min);
		do {
			System.out.print("����� : ");
			max = scan.nextInt();
		}
		while(2 > max || 9 < max);
		
			if (min > max) {
				int temp = min;
				min = max;
				max = temp;
			}
		
			for(int n=1; n<=9; n++) {	
				for(int dan = min; dan <= min+2; dan++) {
					System.out.print(dan + "*" + n + "=" + dan*n + "\t");
					if(dan==max) {
						break;
					}
				}
				System.out.println();
			}				
			System.out.println();
						
			if(max > min+2) {				
				for(int n=1; n<=9; n++) {
					for(int dan = min+3; dan <= min+5; dan++) {
						System.out.print(dan + "*" + n + "=" + dan*n + "\t");
						if(dan==max) {
							break;
						}
					}					
					System.out.println();
				}
				System.out.println();				
			}
		
					
			if (max>min+5 && max <= 9) {				
				for(int n=1; n<=9; n++) {	
					for(int dan = min+6; dan <= max; dan++) {
						System.out.print(dan + "*" + n + "=" + dan*n + "\t");
						if(dan==max) {
							break;
						}
					}					
					System.out.println();
				}
			}	
		
		
	}

}