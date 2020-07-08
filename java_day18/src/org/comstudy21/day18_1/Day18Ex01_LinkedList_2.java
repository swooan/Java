package org.comstudy21.day18_1;

public class Day18Ex01_LinkedList_2 {
	
	public static void main(String[] args) {
		Shape start, last, cur;
		// ��ũ�� ����Ʈ�� ���� �����Ͽ� ����
		start = new Line(); // Line ��ü ����
		last = start;
		cur = new Rect();
		last.next = cur; // Rect ��ü ����
		last = cur;
		cur = new Line();
		last.next = cur; // Line ��ü ����
		last = cur;
		cur = new Circle();
		last.next = cur;
		// ��� ���� ���
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}
	}

}
