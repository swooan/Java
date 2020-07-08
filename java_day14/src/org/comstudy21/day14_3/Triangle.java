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
		System.out.printf("�غ� %d ���� %d �� �ﰢ���� " , w, h);
		super.area();
	}

	public void showTriangleMessage() {
		System.out.println("�ﰢ���� ���� ����.");
	}
	
}
