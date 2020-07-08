package org.comstudy21.day10;

public class Day10Ex03 {
	
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("정수 입력 : ");
		num1 = MyUtil.getNum();
		System.out.print("정수 입력 : ");
		num2 = MyUtil.getNum();
		
		
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}
	
}
