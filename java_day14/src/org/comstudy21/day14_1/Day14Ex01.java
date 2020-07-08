package org.comstudy21.day14_1;

class Point2D {
	int x, y;
	
	void showPoint() {
		System.out.printf("%d, %d", x, y);
	}
	
//	public Point2D() {
//		System.out.println("Point2D의 생성자");
//	}
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point2D {
	int z;
	
	// 부모의 생성자를 먼저 호출하고 자식의 생성자 호출
	// 부모의 객체가 먼저 생성된다.
	public Point3D() {
		super(0, 0);
		System.out.println("Point3D의 생성자");
	}
	
	// 메소드 오버라이드(재정의)
	void showPoint() {
		super.showPoint();
		System.out.printf(/*"%d, %d*/ ", %d\n" , /*x, y,*/ z);
	}
}

public class Day14Ex01 {
	public static void main(String[] args) {
		Point3D p3d = new Point3D();
		p3d.x = 101;
		p3d.y = 102;
		p3d.z = 103;
		
		p3d.showPoint();
	}
}
