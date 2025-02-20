package org.comstudy21.day12_4;

class Point {
	int x,y;
	
	//컴파일러가 디폴트 생성자는 자동으로 만든다
	// but 컴파일러를 수동으로 만들면 안만든다.
	// 생성자 오버로딩을 하게 되면 컴파일러는 더 이상 생성자를 만들지 않는다.
	
	public Point() {
		System.out.println("Point 클래스의 디폴트 생성자 호출");
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 모든 클래스의 부모는 object이다.
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}

public class Day12Ex04 {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 100;
		p1.y = 150;
		System.out.println(p1.toString());
		
		Point p2 = new Point (200,250);
		System.out.println(p2);
	}
}
