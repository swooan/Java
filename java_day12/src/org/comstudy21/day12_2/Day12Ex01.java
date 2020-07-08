package org.comstudy21.day12_2;

//Ŭ���� ����
class Point { // main�� �ִ� Point ���� �� �������� (�ڵ��� ���赵)
	//Ŭ���� ��� �ʵ� ����
	// �Ϲ������� �ʵ��� ���������ڴ� private, �޼ҵ�� public
	private int x;
	private int y;
	
	// setters �޼ҵ�
	public void setX(int x) {
		// this�� ��ü �ڽ��� ����Ű�� ����������.
		this.x = x; // �̸��� ���� �� this �� ���� �ִ� �ʵ忡 �ִ� ���� ����Ŵ (this�� main �� �ִ� new point(); �� ����)
	}
	public void setY(int y) {
		this.y = y;
	}
	// getters �޼ҵ�
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}

public class Day12Ex01 {
		
	public static void main(String[] args) {
		// Ŭ������ ���� ���� ����
		Point pt;
		// Ŭ������ �̿��� ��ü ����
		pt = new Point(); // class���� ������ Point ���� �� ���� (�ڵ��� �ǹ�) => Point2 Point3... ��� ���� �� �ִ�
		
		// ��� �ʵ忡 �� �ֱ�
		pt.setX(100);
		pt.setY(150);
		
		// ��� �ʵ��� �� ����
		System.out.println(pt.getX() + ", " + pt.getY());
	}

}
