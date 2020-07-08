package org.comstudy21.day16_1;

abstract class Shape {
	protected double res;
	
	abstract void area();
	
	// 템플릿 메소드
	final void printArea() {
		area();
		System.out.println("Area => " + res);
	}
}

interface Drawable {
	// public static final 이 생략되어도 상수이다.
	String title = "::: Drawable interface :::";
	//abstract가 생략 되어도 추상 메소드이다.
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
		System.out.println("반지름이 "+ r+ " 인 원을 그립니다.");
		printArea();
	}
	
	@Override
	void area() {
		res = Math.PI * Math.pow(r, 2);
		System.out.println("안내 : 면적이 환산 되었습니다.");
		
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
