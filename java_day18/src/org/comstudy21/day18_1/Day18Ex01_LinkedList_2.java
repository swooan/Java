package org.comstudy21.day18_1;

public class Day18Ex01_LinkedList_2 {
	
	public static void main(String[] args) {
		Shape start, last, cur;
		// 링크드 리스트로 도형 생성하여 연결
		start = new Line(); // Line 객체 연결
		last = start;
		cur = new Rect();
		last.next = cur; // Rect 객체 연결
		last = cur;
		cur = new Line();
		last.next = cur; // Line 객체 연결
		last = cur;
		cur = new Circle();
		last.next = cur;
		// 모든 도형 출력
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}
	}

}
