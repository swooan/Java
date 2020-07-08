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
		return "(" + x + "," + y + ") �Դϴ�.";
	}
	
}

class CColorPoint extends CPoint{
	String color;
	public CColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	
	// �ڽ� Ŭ�������� ������ �ϴ� show �޼ҵ�
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
