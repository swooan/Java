package org.comstudy21.day14_3;

class Triangle extends Shape {

	int w;
	int h;
	
	public Triangle() {
		this(0,0);
	}
	
	public Triangle(int w, int h) {
		
		this.w = w;
		this.h = h;
		setRes(w * h / 2);
		
	}
	
	public void area() {
		System.out.printf("밑변 %d 높이 %d 인 삼각형의 " , w, h);
		super.area();
	}

	public void showTriangleMessage() {
		System.out.println("삼각형은 말이 없다.");
	}
	
}
