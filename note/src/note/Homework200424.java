package note;

import java.util.Scanner;

public class Homework200424 {
	
	public static void homework11(String[] args) {
//1		//*****
		//**  *
		//* * *
		//*  **
		//*****
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		System.out.print("º°ÀÇ °¹¼ö´Â : ");
		num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				System.out.print((i-j == 0 || i == num - 1 || j == num - 1 || i == 0 || j == 0) ? "*" : " ");
			}
			System.out.println();
		}
	}
	
	public static void homework10(String[] args) {
//2		//*
		//**
		//* *
		//*  *
		//*****
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		System.out.print("º°ÀÇ °¹¼ö´Â : ");
		num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				System.out.print((i-j == 0 || i == num-1 || j == 0) ? "*" :" ");
			}
			System.out.println();
		}
		
		
	}
	
	public static void homework9(String[] args) {
		//*********
		//*  * *  *
		//* *   * *
		//**     **
		//*       *
		//**     **
		//* *   * *
		//*  * *  *
		//*********
		for(int i=0; i<9; i++) {			
			if(i<=4) {
				for(int j=0; j<9; j++) {
					if(j<=4) {
						System.out.print((i+j==4 || j ==0 || i == 0) ? "*" : " ");
					}
					else if(j>=4) {
						System.out.print((j-i == 4 || i == 0 || j == 8) ? "*" : " ");
					}
				}
				
			}
			else if(i>=4) {
				for(int j=0; j<9; j++) {
					if(j>4) {
						System.out.print((i+j == 12 || j == 8 || i ==8) ? "*" : " ");
					}
					else if(j<=4) {
						System.out.print((i-j == 4 || i == 8 || j == 0) ? "*" :" ");
					}
				}
			}
			System.out.println();
		}
	}
	
	public static void homework8(String[] args) {
		//*********
		//**** ****
		//***   ***
		//**     **
		//*       *
		//**     **
		//***   ***
		//**** ****
		//*********
		
		for (int i = 0; i < 9; i++) {
			if (i == 0 || i == 8) {
				for (int j = 0; j < 9; j++) {
					System.out.print("*");
				}
			}
			else if(i == 1 || i == 7) {
				for(int j = 0; j < 9; j++) {
					System.out.print((j<=3 || j>=5) ? "*" : " ");
				}
			}
			else if(i == 2 || i == 6) {
					for(int j = 0; j < 9; j++) {
						System.out.print((j<=2 || j>=6) ? "*" : " ");
					}
			}
			else if(i == 3 || i == 5) {
				for(int j = 0; j < 9; j++) {
					System.out.print((j<=1 || j>=7) ? "*" : " ");
				}
			}			
			else {
				for(int j=0; j<9; j++) {
					System.out.print((j == 0 || j == 8) ? "*" : " ");
				}
			}
			System.out.println();
		}
	}
	
	public static void homework7(String[] args) {
		//    *
		//   ***
		//  *****
		// *******
		//*********
		// *******
		//  *****
		//   ***
		//    *
		
		for (int i = 0; i < 9; i++) {
			if (i == 0 || i == 8) {
				for (int j = 0; j < 9; j++) {
					System.out.print((j == 4) ? "*" : " ");
				}
			}
			else if(i == 1 || i == 7) {
				for(int j = 0; j < 9; j++) {
					System.out.print((j>=3 && j<=5) ? "*" : " ");
				}
			}
			else if(i == 2 || i == 6) {
					for(int j = 0; j < 9; j++) {
						System.out.print((j>=2 && j<=6) ? "*" : " ");
					}
			}
			else if(i == 3 || i == 5) {
				for(int j = 0; j < 9; j++) {
					System.out.print((j>=1 && j<=7) ? "*" : " ");
				}
			}			
			else {
				for(int j=0; j<9; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public static void homework6(String[] args) {
		//*********
		//**** ****
		//***   ***
		//**     **
		//*       *
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j<9; j++) {
				if (j>=4) {
					System.out.print((j-i>=4) ? "*" : " ");
				}
				else if(j<=4) {
					System.out.print((j+i<=4) ? "*": " ");
				}
			}
			System.out.println();
		}
	}
	
	public static void homework5(String[] args) {
		//    *
		//   ***
		//  *****
		// *******
		//*********
		
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
	}
	
	public static void homework4(String[] args) {
		// *****
		//  ****
		//   ***
		//    **
		//     *
		//    **
		//   ***
		//  ****
		// *****

		for (int i = 0; i < 9; i++) {
			if (i < 5) {
				for (int j = 0; j < 5; j++) {
					System.out.print((i - j <= 0 ) ? "*" : " ");
				}
			} else {
				for (int j = 0; j < 5; j++) {
					System.out.print((i + j >= 8) ? "*" : " ");

				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		//     *
		//    **
		//   ***
		//  ****
		// *****
		//  ****
		//   ***
		//    **
		//     *

		for (int i = 0; i < 9; i++) {
			if (i < 5) {
				for (int j = 0; j < 5; j++) {
					System.out.print((i + j < 4) ? " " : "*");
				}
			} else if(i>=5) {
				for (int j = 0; j < 5; j++) {
					System.out.print((i - j > 4) ? " " : "*");
				}
			}
			System.out.println();
		}
	}

	public static void homework2(String[] args) {
		// *****
		// ****
		// ***
		// **
		// *
		// **
		// ***
		// ****
		// *****

		for (int i = 0; i < 9; i++) {
			if (i < 5) {
				for (int j = 0; j < 5; j++) {
					System.out.print((i + j <= 4) ? "*" : " ");
				}
			} else {
				for (int j = 0; j < 5; j++) {
					System.out.print((i - j >= 4) ? "*" : " ");
				}
			}
			System.out.println();
		}
	}

	public static void homework1(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		// ****
		// ***
		// **
		// *

		for (int i = 0; i < 9; i++) {
			if (i < 5) {
				for (int j = 0; j < 5; j++) {
					System.out.print((j > i) ? " " : "*");
				}
			} else {
				for (int j = 0; j < 5; j++) {
					System.out.print((j + i < 9) ? "*" : " ");

				}
			}
			System.out.println();
		}
	}
}
