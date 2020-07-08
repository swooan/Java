package org.comstudy21.day16_4;

class Rectangle {
	int x1, y1, x2, y2;
	int area;
	
	public Rectangle() {
		this(0,0,0,0);
	}
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		area = (x2 - x1) * (y2 - y1);
	}
	
	public void set(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		area = (x2 - x1) * (y2 - y1);
	}
	
	public int square() {
		return area;
	}
	
	public void show() {
		System.out.printf("x1: %d, y1: %d, x2: %d, y2: %d\n" , x1, y1, x2, y2);
		System.out.println("area : " + area);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle rect = (Rectangle)obj;
			if(rect.x1 == x1 && rect.y1 == y1) {
				if(rect.x2 == x2 && rect.y2 == y2) {
					return true;
				}
			}
		}
		return false;
	}
	
}

public class Day16Ex04 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(1, 1, 2, 3);
		
		r.show();
		s.show();
		System.out.println(s.square());
		r.set(-2, 2, -1, 4);
		r.show();
		System.out.println(r.square());
		if(r.equals(s)) {
			System.out.println("두 사각형은 같습니다.");
		}
		else {
			System.out.println("두 사각형은 같지 않습니다.");
		}

	}

}
