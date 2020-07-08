package org.comstudy21.day15_2;

abstract class Shape {
	
	abstract void area();
	
}

class Circle extends Shape {
	
	int r;
	
	Circle(int r) {
		this.r = r;
	}
	
	@Override
	void area() {
		double res = Math.PI * Math.pow(r, 2);
		System.out.println("¿øÀÇ ³ÐÀÌ´Â " + res);
	}
	
}

class Rectangle extends Shape {
	
	int w;
	int h;
	
	Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	@Override
	void area() {
		int res = w * h;
		System.out.println("»ç°¢ÇüÀÇ ³ÐÀÌ´Â " + res);
	}
	
}

class Triangle extends Shape {
	
	int w;
	int h;
	
	Triangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	@Override
	void area() {
		int res = w * h / 2;
		System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ´Â " + res);
	}
	
}

public class Day15Ex01_2 {

	public static void main(String[] args) {
		
		Circle c = new Circle(10);
		Rectangle r = new Rectangle(10,10);
		Triangle t = new Triangle(10,10);
		
		c.area();
		r.area();
		t.area();
//-----------------------------------------------------------		
		Shape s;
		
		s = new Circle(10);
		s.area();
		s = new Rectangle(10, 10);
		s.area();
		s = new Triangle(10, 10);
		s.area();
		
		
	}
	
}
