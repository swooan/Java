package org.constudy21.ch03;

public class Ch03Ex25 {
	
	public static void homework(String[] args) {
		
		//���� ����: 5  �Է½�
		
//1		//*****
		//**  *
		//* * *
		//*  **
		//*****
		
		
		
//2		//*
		//**
		//* *
		//*  *
		//*****
		
		
		//*********
		//*  * *  *
		//* *   * *
		//**     **
		//*       *
		//**     **
		//* *   * *
		//*  * *  *
		//*********
		
		
		//*********
		//**** ****
		//***   ***
		//**     **
		//*       *
		//**     **
		//***   ***
		//**** ****
		//*********
		
		
		//    *
		//   ***
		//  *****
		// *******
		//*********
		// *******
		//  *****
		//   ***
		//    *
		
		//*********
		//**** ****
		//***   ***
		//**     **
		//*       *
		
		
		//    *
		//   ***
		//  *****
		// *******
		//*********
		
		
		//*****
		// ****
		//  ***
		//   **
		//    *
		//   **
		//  ***
		// ****
		//*****
		
		
		//    *
		//   **
		//  ***
		// ****
		//*****
		// ****
		//  ***
		//   **
		//    *
		
		
		//*****
		//****
		//***
		//**
		//*
		//**
		//***
		//****
		//*****
		
		
		//*
		//**
		//***
		//****
		//*****
		//****
		//***
		//**
		//*
	}
	
	public static void test06(String[] args) {
		//^^^^*
		//^^^**
		//^^***
		//^****
		//*****
		for(int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print((j+i<4) ? " " : "*");
			}
			System.out.println();
		}
		
	}

	public static void test05(String[] args) {
		// *****
		// ^****
		// ^^***
		// ^^^**
		// ^^^^*
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print((j < i) ? " " : "*");
			}
			System.out.println();
		}

//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < i + 5-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j =0; j<5-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

	public static void test04(String[] args) {
//		*****
//		****
//		***
//		**
//		*
// 1�� ���		

//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
// 2�� ���		

//		for (int i = 5; i > 0; i--) {
//			for(int j = 0; j < i; j++) {
//				System.out.print("*");				
//			}
//			System.out.println();
//		}
//		
// 3�� ���	

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void test03(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void test02(String[] args) {
		// 2�� for������ 5�� 5��¥�� �� ���

		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print("*");
			}
		}
		System.out.println();
	}

	public static void test01(String[] args) {
		// �� ���
		// *****
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

}
