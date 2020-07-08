package org.comstudy21.day10;

public class Homework {
	static int[][] mkArr(int[] ar1, int[] ar2) {

		// int[][] mkArr = {ar1 , ar2}; => 원본이 바뀔 수 있다.
		int[][] mkArr = new int[2][];

		int row = 0;
		mkArr[row] = new int[ar1.length];
		for (int j = 0; j < ar1.length; j++) {
			mkArr[row][j] = ar1[j];
		}
		row++;
		mkArr[row] = new int[ar2.length];
		for (int j = 0; j < ar2.length; j++) {
			mkArr[row][j] = ar2[j];
		}

		// arr[0] = ar1;
		// arr[1] = ar2;

		return mkArr;
	}

	static void printArr(int[][] ar3) {

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < ar3[i].length; j++) {
				 System.out.print(ar3[i][j]);
//				System.out.print(ar3[i][j] == 0 ? " " : ar3[i][j]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int[] ar1 = { 1, 2, 3, 4 };
		int[] ar2 = { 5, 6, 7 };

		int[][] ar3 = null;

		// 2차원 배열로 만들기

		ar3 = mkArr(ar1, ar2);

		printArr(ar3);

	}

}
