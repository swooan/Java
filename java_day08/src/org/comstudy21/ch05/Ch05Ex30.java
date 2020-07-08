package org.comstudy21.ch05;

public class Ch05Ex30 {

	// ��� �ʵ� -> ���� ���� ó�� ��� �Լ����� ���� ����(�� static)�� �پ�� �Ѵ�.
	static int[][] arr = new int[5][5];
	static int num = 1;

	public static void homework(String[] args) {
		// 1 2 3 4 5
		// 6 7 8 9
		// 10 11 12
		// 13 14 15 16
		// 17 18 19 20 21

		// 1 2 3 4 5
		// 6 7 8 9
		// 10 11 12
		// 13 14 15 16
		// 17 18 19 20 21

		// 1 2 3 4 5
		// 6 7 8
		// 9
		// 10 11 12
		// 13 14 15 16 17

		// 1 2
		// 3 4 5 6
		// 7 8 9 10 11
		// 12 13 14 15
		// 16 17

		// 1 2 3 4 5
		// 16 17 18 19 6
		// 15 24 25 20 7
		// 14 23 22 21 8
		// 13 12 11 10 9

		// �̴� ������Ʈ:
		// ������� ���α׷�
		// �ִ� 100����� ����
		// ------------ ���� ��� ���α׷� ------------------
		// �Է�(1) ���(2) �˻�(3) ����(4) ����(5) ����(6)
		// ����: 1
		// ------------------- �Է� ��� ---------------------
		// ����:
		// ����:
		// ����:
		// ����:
		// --------------- ���� ��� ���α׷� ---------------------

	}

	public static void test13(String[] args) {
		// 1 2 3 4 5
		// 16 17 18 19 6
		// 15 24 25 20 7
		// 14 23 22 21 8
		// 13 12 11 10 9

		int i = 0;
		int j = 0;
		int level = 0; // 0�϶� �� -> ��, 1�϶� �� -> �Ʒ�, 2�϶� �� -> ��, 3�϶� �Ʒ� -> ��
		for (int cnt = 0; cnt < 25; cnt++) {
			arr[i][j] = num++;
			switch (level) {
			case 0:
				j++;
				if (j == 5 || arr[i][j] != 0) {
					level++;
					j--;
					i++;
				}
				break;
			case 1:
				i++;
				if (i == 5 || arr[i][j] != 0) {
					level++;
					i--;
					j--;
				}
				break;
			case 2:
				j--;
				if (j < 0 || arr[i][j] != 0) {
					j++;
					i--;
					level++;
				}
				break;
			case 3:
				i--;
				if (i < 0 || arr[i][j] != 0) {
					i++;
					j++;
					level = 0;
				}
				break;
			}
		}

//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {				
//				if(i == 0) {
//					arr[i][j] = num++;
//				}
//				if(j==4) {
//					for(i =1; i<5;i++) {
//						arr[i][j] = num++;
//						
//					}
//				}
//			}
//		}
//		for(int i = 4; i>=0; i--) {
//			for(int j = 3; j>=0; j--) {
//				if(i==4) {
//					arr[i][j] = num++;
//				}
//				if(j==0) {
//					for(i = 3; i>=1; i--) {
//						arr[i][j] = num++;
//						
//					}
//				}
//				
//			}
//			
//		}
//		for(int i = 1; i < 4; i++) {
//			for(int j = 1; j < 4; j++) {
//				if(i==1) {
//					arr[i][j] = num++;
//				}
//				if(j==3) {
//					for(i=2; i<4; i++) {
//						arr[i][j] = num++;
//						
//					}
//				}
//			}
//		}
//		for(int i = 3; i>=0; i--) {
//			for(int j = 2; j>=1; j--) {
//				if(i == 3) {
//					arr[i][j] = num++;
//				}
//			}
//		}
//		int i = 2;
//		if(i == 2) {
//			for(int j = 1; j<3; j++) {
//				arr[i][j] = num++;
//			}
//		}
		printArr();
	}

	public static void test12(String[] args) {
		// 1 2
		// 3 4 5 6
		// 7 8 9 10 11
		// 12 13 14 15
		// 16 17

		for (int i = 0; i < 5; i++) {
			int start = i < 2 ? i : 4 - i;
			int end = i < 2 ? 5 - i : i + 1;
			for (int j = 0; j < 5; j++) {
				if (j <= start || j >= end - 1) {
					arr[i][j] = num++;
				}
			}
		}

//		for(int i = 0; i < 5; i++) {
//			for(int j=0; j<5; j++) {
//				if(i<=2) {				
//					if(j <= i || j >= 4-i) {
//						arr[i][j] = num++;
//					}
//				}
//				else {
//					if(j >= i || j <= 4-i) {
//						arr[i][j] = num++;
//					}
//				}
//			}
//		}
		printArr();
	}

	public static void test11(String[] args) {
		// 1 2 3 4 5
		// 6 7 8
		// 9
		// 10 11 12
		// 13 14 15 16 17

		for (int i = 0; i < 5; i++) {
			int start = i < 2 ? i : 4 - i;
			int end = i < 2 ? 5 - i : i + 1;
			for (int j = start; j < end; j++) {
				arr[i][j] = num++;
			}
		}

//		int cnt = 0;
//		for(int i = 0; i<5; i++) {
//			for (int j = cnt; j < 5 - cnt; j++ ) {
//				arr[i][j] = num++;
//				
//			}
//			if(i<2) {
//				cnt += 1;	
//			}
//			else {
//				cnt -= 1;
//			}
//		}
		printArr();
	}

	public static void test10(String[] args) {
		// 1 2 3 4 5
		// 6 7 8 9
		// 10 11 12
		// 13 14 15 16
		// 17 18 19 20 21

		for (int i = 0; i < 5; i++) {
			int start = i < 2 ? i : 4 - i;
			for (int j = start; j < 5; j++) {
				arr[i][j] = num++;
			}
		}

//		int cnt = 0;
//		
//		for(int i = 0; i < 5; i++ ) {
//			for(int j = cnt; j < 5; j++) {
//				arr[i][j] = num++;
//			}
//			if(i<2) {
//				cnt++;
//			}
//			else {
//				cnt--;
//			}
//		}
		printArr();
	}

	public static void test09(String[] args) {
		// 1 2 3 4 5
		// 6 7 8 9
		// 10 11 12
		// 13 14 15 16
		// 17 18 19 20 21

		for (int i = 0; i < 5; i++) {
			int end = i < 2 ? 5 - i : i + 1;
			for (int j = 0; j < end; j++) {
				arr[i][j] = num++;
			}
		}

//		int cnt = 5;
//		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < cnt; j++) {
//				arr[i][j] = num++;
//				
//			}
//			if(i<2) {
//				cnt--;
//			}
//			else {				
//				cnt++;
//			}
//		}
		printArr();
	}

	public static void test08(String[] args) {
		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j % 2 == 1 ? 4 - j : j] = num++;
			}
		}

//		for (int i = 0; i < 5; i++) {
//			if (i % 2 == 1) {
//				for (int j = 4; j >=0 ; j--) {
//					arr[i][j] = num++;
//				}
//			} 
//			else {
//				for (int j = 0; j < 5; j++) {
//					arr[i][j] = num++;
//				}
//
//			}
//
//		}
		printArr();

	}

	public static void test07(String[] args) {
		// 1
		// 3 2
		// 4 5 6
		// 7 8 9 10
		// 11 12 13 14 15

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 4 - i; j--) {
				arr[i][j] = num++;
			}

		}
		printArr();

	}

	public static void test06(String[] args) {
		// 1
		// 2 3
		// 4 5 6
		// 7 8 9 10
		// 11 12 13 14 15

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				arr[i][j] = num++;
			}

		}
		printArr();
	}

	public static void test05(String[] args) {
		// 1 2 3 4 5
		// 6 7 8 9
		// 10 11 12
		// 13 14
		// 15

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				arr[i][j] = num++;
			}

		}

		printArr(); // 0��� �������� ��µǵ��� �����Ѵ�.
	}

	public static void test04(String[] args) {
		// 1 6 11 16 21
		// 2 7 12 17 22
		// 3 8 13 18 23
		// 4 9 14 19 24
		// 5 10 15 20 25

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[j][i] = num++;
			}
		}

		printArr();
	}

	public static void test03(String[] args) {
		// ���� ������ �̿��ؼ� �Ʒ��� ���� �Էµǵ��� �Ѵ�.
//		1	2	3	4	5 
//		6	7	8	9	10
//		11	12	13	14	15
//		16	17	18	19	20
//		21	22	23	24	25

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}

		printArr(); // �Լ� ȣ��
	}

	// �Լ� ����
	public static void printArr() {

		// ��������

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print((arr[i][j] == 0 ? " " : arr[i][j]) + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// �迭�� ����� ���ÿ� �ʱ�ȭ
		// 1���� �迭�� �迭�� ��ҷ� ����Ѵ�.
		int[][] arr = { { 90, 85, 95 }, { 95, 75, 95 }, { 90, 80, 70 }, { 80, 90, 60 }, { 95, 65, 80 }};

		// ���� for ���� �̿��ؼ� ��� ����

		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c] + "\t");
			}
			System.out.println();
		}
	}

	public static void test01(String[] args) {
		int[][] arr = new int[5][3]; // new �ڴ� hip�� ���ԵǱ� ������ ���� ��ǥ �ȿ��� ��� null�� �ƴ� int�� �ʱⰪ 0�� ����ִ�.

		arr[1][1] = 200;
		arr[2][2] = 100;
		arr[3][0] = 500;

		// 2���� �迭�� ���� for������ ����
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(arr[r][c] + "\t");
			}
			System.out.println();
		}

	}

}
