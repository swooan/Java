package org.comstudy21.day18_4;

class CPoint {
	int x,y;
	public CPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void show() {
		System.out.println("(" + x + "," + y + ")");
	}
	
	public String toString() {
		return "(" + x + "," + y + ") 입니다.";
	}
	
}

class CColorPoint extends CPoint{
	String color;
	public CColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	
	// 자식 클래스에서 재정의 하는 show 메소드
	public void show() {
		System.out.println("(" + x + "," + y + ")" + color);
	}
}

public class Day18Ex042 {

	public static void main(String[] args) {
		CPoint a,b;
		
		a = new CPoint(2,3);
		b = new CColorPoint(3,4,"red");
		
		a.show();
		b.show();
		
		System.out.println(a);
		System.out.println(b);
		

	}

}
