package org.comstudy21.day15_1;

// �߻� �޼ҵ带 �ϳ��� ������ Ŭ������ �߻�Ŭ������ �Ǿ�� �Ѵ�.
abstract class Shape {
	// �߻�޼ҵ�� ��ü�� �������� �ʾҴ�.
	abstract void area();
}

// ��� 1. �߻� Ŭ������ ��ӹ��� Ŭ������ �ϴ� �߻� Ŭ�����̴�.
// ��� 2. ���� �߻� Ŭ������ �ƴϱ� ���ϸ� �θ��� �߻� �޼ҵ带 ������ �־�� �Ϲ� Ŭ������ �ȴ�.
/*��� 1 : abstract*/ class Circle extends Shape {
	
	int r;
	Circle(int r) {
		this.r = r;
	}
	
	/*��� 2 : */void area() {
		double result = Math.PI * Math.pow(r, 2);
		System.out.println("���� ������ " + result);
	}
	
}

public class Day15Ex01 {
	public static void main(String[] args) {
		// �߻� Ŭ�����δ� ��ü ������ �Ұ����ϴ�.
		// Shape c = new Shape();     ����
		
		// �߻� Ŭ������ ���������� ���� ����.
		Shape c;
		
		// �߻�Ŭ������ ���� ������ ���ɽ��� ����
		c = new Circle(10);
		c.area();
		
	}
}
