package org.comstudy21.method;

public class Day09Ex03 {

	static void add(int x, int y) {
		x+=10;
		y+=10;
		
		System.out.println("x = " + x + " y = " + y);
	}
	
	public static void main(String[] args) {
		int x = 100, y = 200;
		
		// call by value
		add(x,y);
		
		System.out.println("x = " + x + " y = " + y); // 위에 덧셈한 값이 아닌 100 200 값이 그대로 출력된다.
		
	}
}
