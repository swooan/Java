package org.comstudy21.day14_3;

public class MainClass {
	// ��ĳ������ Ȱ���� ������
	// �����ε� ���� �ʾƵ� ���� Ÿ�� ó�� ����
	public static void showArea(Shape shape) {
		shape.area();
		
		if(shape instanceof Circle) {
			Circle circle = (Circle)shape;
			circle.showCircleMessage();
		}
		if(shape instanceof Rectangle) {
			Rectangle rectangle = (Rectangle)shape;
			rectangle.showRectangleMessage();
		}
		if(shape instanceof Triangle) {
			Triangle triangle = (Triangle)shape;
			triangle.showTriangleMessage();
		}
	}
	
	public static void main(String[] args) {
		showArea(new Circle(10));
		showArea(new Rectangle(10,10));
		showArea(new Triangle(10,10));
	}
	
	
	
	public static void test(String[] args) {
		Shape sh = new Circle(10);
		sh.area();

		sh = new Rectangle(10,10);
		sh.area();
		
		sh = new Triangle(10,10);
		sh.area();
		
	}

}
