package org.comstudy21.method;

import java.util.Arrays;

public class Day09Ex09 {

	static int[][] mkArr(int[] ar1, int[] ar2) {

		//int[][] mkArr = {ar1 , ar2};
		int[][] mkArr = new int[2][4];

		for (int i = 0; i < 2; i++) {

			if (i == 0) {
				for (int j = 0; j < 4; j++) {
					mkArr[i][j] = ar1[j];
				}
			}
			else {
				for (int j = 0; j < 3; j++) {
					mkArr[i][j] = ar2[j];
				}
			}
		}

		return mkArr;
	}

	static void printArr(int[][] ar3) {

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < ar3[i].length; j++) {
				//System.out.print(ar3[i][j]);
				System.out.print(ar3[i][j] == 0 ? " " : ar3[i][j]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int[] ar1 = { 1, 2, 3, 4 };
		int[] ar2 = { 5, 6, 7 };

		int[][] ar3 = null;

		// 2���� �迭�� �����

		ar3 = mkArr(ar1, ar2);

		printArr(ar3);

	}

}

// ���� ��� ���α׷��� ����� ���� �Լ��� �ִ��� ���� ����ؼ� ������

// ���� ���� �� �����ϱ�
