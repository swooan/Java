package org.comstudy21.ch03;

import java.util.Arrays;
import java.util.Scanner;

public class Ch03Ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int max = 0;
		
		System.out.println("��� 5���� �������� �Է��ϼ��� : ");
		for(int i = 0; i < 5; i++) {
			arr[i] = scan.nextInt();
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
		System.out.println(Arrays.toString(arr));
	}

}
