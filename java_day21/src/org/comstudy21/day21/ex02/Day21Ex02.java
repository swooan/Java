package org.comstudy21.day21.ex02;

import java.util.ArrayList;

class Point {
	int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Point) {
			Point p = (Point)obj;
			if (p.x == x && p.y == y) {
				return true;
			}
		}
		
		return false;
	}
	
	
}

public class Day21Ex02 {
	
	public static void main(String[] args) {
		// Point 객체를 ArrayList에 담고 indexOf로 위치 검색
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(new Point(10,20));
		list.add(new Point(30,40));
		list.add(new Point(50,60));
		list.add(new Point(70,80));
		list.add(new Point(90,100));
		
		int index = list.indexOf(new Point(70,80));
		System.out.println("index => " + index);
	}
	
	public static void test(String[] args) {
		
		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.equals(p2));
	}
}
