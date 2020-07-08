package org.comstudy21.day16_1;

abstract class Shape {
	protected double res;
	
	abstract void area();
	
	// ���ø� �޼ҵ�
	final void printArea() {
		area();
		System.out.println("Area => " + res);
	}
}

interface Drawable {
	// public static final �� �����Ǿ ����̴�.
	String title = "::: Drawable interface :::";
	//abstract�� ���� �Ǿ �߻� �޼ҵ��̴�.
	void draw();
}

interface AAA {
	String title = "::: AAA interface test :::";
}

class Circle extends Shape implements Drawable, AAA {

	int r;
	Circle(int r) {
		this.r= r;
	}
	
	
	@Override
	public void draw() {
		System.out.println("�������� "+ r+ " �� ���� �׸��ϴ�.");
		printArea();
	}
	
	@Override
	void area() {
		res = Math.PI * Math.pow(r, 2);
		System.out.println("�ȳ� : ������ ȯ�� �Ǿ����ϴ�.");
		
	}

	
}

public class Ch16Ex01 {

	public static void main(String[] args) {
		Circle circle = new Circle(10);
		circle.draw();
		
		Drawable circle1 = new Circle(8);
		circle1.draw();
		
		AAA circle2 = new Circle(6);
		System.out.println(circle2.title);;

	}

}
