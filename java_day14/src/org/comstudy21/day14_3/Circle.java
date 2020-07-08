package org.comstudy21.day14_3;

class Circle extends Shape {

	private int r;
	
	public Circle() {
		this(0);
	}
	
	public Circle(int r) {
		this.r = r;
		setRes(Math.PI * Math.pow(r, 2));
	}
	
	public void area() {
		
		System.out.printf("�������� %d�� ����  " , r);
		super.area();
	}
	
	public void showCircleMessage() {
		System.out.println("�ձ۰� �ձ۰�~");
	}

}
