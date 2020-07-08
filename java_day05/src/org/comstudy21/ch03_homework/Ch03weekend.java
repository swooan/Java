package org.comstudy21.ch03_homework;

public class Ch03weekend {
		//별의 갯수: 5  입력시
	public static void test11(String[] args) {
		
//1		// 0 *****
		// 1 **  *
		// 2 * * *
		// 3 *  **
		// 4 *****
		
	}
		
	public static void test10(String[] args) {
			
//2		// 0 *
		// 1 **
		// 2 * *
		// 3 *  *
		// 4 *****
		
		}

	public static void test09(String[] args) {
		
		
		// 0 *********
		// 1 *  * *  *
		// 2 * *   * *
		// 3 **     **
		// 4 *       *
		// 5 **     **
		// 6 * *   * *
		// 7 *  * *  *
		// 8 *********
			
	}

	public static void main(String[] args) {
		
	
		// 0 *********
		// 1 **** ****
		// 2 ***   ***
		// 3 **     **
		// 4 *       *
		// 5 **     **
		// 6 ***   ***
		// 7 **** ****
		// 8 *********
		
		int cnt = 0;
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(j>4-cnt && j<4+cnt) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
			if(i<4) cnt++;
			else cnt--;
		}
		
	}
	
	public static void test07(String[] args) {
			
		// 0     *
		// 1    ***
		// 2   *****
		// 3  *******
		// 4 *********
		// 5  *******
		// 6   *****
		// 7    ***
		// 8     *
		
			
		int cnt = 4;
		for(int i=0; i<9; i++) {
			for(int j=0; j<cnt; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(5-cnt)*2-1; j++) {
				System.out.print("*");
			}
		System.out.println();
		if(i<4) cnt--;
		else cnt++;
		}
		
	}
		
	public static void test06(String[] args) {
		
	
		// 0 *********
		// 1 **** ****
		// 2 ***   ***
		// 3 **     **
		// 4 *       *
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<9; j++) {
				System.out.print((j>4-i && j< 4+i)?" ":"*");
			}
			System.out.println();
		}

	
	}
	
	public static void test05(String[] args) {
		
	
		// 0     *	
		// 1    ***
		// 2   *****
		// 3  *******
		// 4 *********
		//   432101234
	
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j<9; j++) {
				if (j>=4) {
					System.out.print((j-i>4) ? " " : "*");
				}
				else if(j<4) {
					System.out.print((j+i<4) ? " ": "*");
				}
			}
			System.out.println();
		}
				

		
//		for(int i=0; i<5; i++) {
//			for(int j= 0; j<4-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j =0; j<i+1; j++) {
//				System.out.print("*");
//			}
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//		
//      	   	=> for(int j=0; j< 5+i; j++) {
//					System.out.print(j<4-i?"*":" ");
//		    	   }
//			}
//			System.out.println();
//		}
	}	

	public static void test04(String[] args) {
		
	
		// 0 *****	0 5
		// 1  ****	1 4
		// 2   ***	2 3
		// 3    **	3 2
		// 4     *	4 1 
		// 5    **	3 2
		// 6   ***	2 3
		// 7  ****	1 4
		// 8 *****	0 5
		
		int cnt = 0;
		for(int i=0; i<9; i++) {
			for(int j = 0; j<5; j++) {
				System.out.print((j<cnt) ? " " : "*");
			}
		System.out.println();
		if (i<4) cnt++;
		else cnt--;
		}
		
	}	
		
	public static void test03(String[] args) {
			
		// 0     *	4
		// 1    **	3
		// 2   ***	2
		// 3  ****	1
		// 4 *****	0
		// 5  ****	1
		// 6   ***	2
		// 7    **	3
		// 8     *	4
		
		// <의사표현>
		// i를 9까지 증가
		// i가 4보다 작으면 cnt를 감소하고 아니면 증가하기
		// j를 cnt만큼 반복
		// --> j가 cnt보다 작으면 공백 아니면 별
		
		int cnt = 4;
		for(int i = 0; i < 9; i++) { 
			for(int j=0; j<5; j++) {
				if (j>=cnt) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");				
				}
			}
			System.out.println();
			
			if (i < 4) cnt--;
			else cnt++;          
			
		}
	}	
		
	public static void test02(String[] args) {
		
	
		// 0 *****		5
		// 1 ****		4
		// 2 ***		3
		// 3 **			2
		// 4 *			1
		// 5 **			2
		// 6 ***		3
		// 7 ****		4
		// 8 *****		5
		
		int cnt = 5;
		for(int i=0; i<9; i++) {	
			for(int j=0; j<cnt; j++) {
				System.out.print("*");
			}
			System.out.println();
		
			if(i<4) cnt--;
			else cnt++;
		}
		
	}	
	public static void test01(String[] args) {
		
		// 0 *			1
		// 1 **			2
		// 2 ***		3
		// 3 ****		4
		// 4 *****		5
		// 5 ****		4
		// 6 ***		3
		// 7 **			2
		// 8 *			1

		int cnt = 1;
		for(int i = 0; i < 9; i++) {
			for(int j=0; j<cnt; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i<4) {
				cnt++;				
			}
			else {
				cnt--;
			}
			// = cnt = (i<4) ? cnt+1 : cnt-1;			
		}
	}
	
}
