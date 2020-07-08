package org.comstudy21.day14_1;

class Point2D {
	int x, y;
	
	void showPoint() {
		System.out.printf("%d, %d", x, y);
	}
	
//	public Point2D() {
//		System.out.println("Point2D�� ������");
//	}
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point2D {
	int z;
	
	// �θ��� �����ڸ� ���� ȣ���ϰ� �ڽ��� ������ ȣ��
	// �θ��� ��ü�� ���� �����ȴ�.
	public Point3D() {
		super(0, 0);
		System.out.println("Point3D�� ������");
	}
	
	// �޼ҵ� �������̵�(������)
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
