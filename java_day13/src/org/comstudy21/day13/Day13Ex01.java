package org.comstudy21.day13;

class Point {
	
	int x,y;
	
	public Point() {
		// this()�������� �ٸ� ������ ȣ��.
		this(0,0); // �����ڸ� ȣ���ϱ� ���� �ٸ� ������ ���� �ȵȴ�.
		
		System.out.println("Point Ŭ������ Ƽ��Ʈ ������");
	}
	
	public Point(int x) {
		//this.x=x;
		this(x,0);
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public void showPoint() {
		System.out.println("("+x+", "+y+")");
	}
	
}

public class Day13Ex01 {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(10);
		Point p3 = new Point(100,200);
		
		p1.showPoint();
		p2.showPoint();
		p3.showPoint();
		
	}
	
}
