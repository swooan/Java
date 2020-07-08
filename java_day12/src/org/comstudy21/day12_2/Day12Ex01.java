package org.comstudy21.day12_2;

//클래스 선언
class Point { // main에 있는 Point 보다 더 포괄적임 (자동차 설계도)
	//클래스 멤버 필드 선언
	// 일반적으로 필드의 접근지정자는 private, 메소드는 public
	private int x;
	private int y;
	
	// setters 메소드
	public void setX(int x) {
		// this는 객체 자신을 가르키는 참조변수다.
		this.x = x; // 이름이 같을 시 this 를 붙이 애는 필드에 있는 놈을 가르킴 (this는 main 에 있는 new point(); 와 같음)
	}
	public void setY(int y) {
		this.y = y;
	}
	// getters 메소드
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}

public class Day12Ex01 {
		
	public static void main(String[] args) {
		// 클래스의 참조 변수 선언
		Point pt;
		// 클래스를 이용한 객체 생성
		pt = new Point(); // class에서 선언한 Point 보다 더 작음 (자동차 실물) => Point2 Point3... 계속 만들 수 있다
		
		// 멤버 필드에 값 넣기
		pt.setX(100);
		pt.setY(150);
		
		// 멤버 필드의 값 접근
		System.out.println(pt.getX() + ", " + pt.getY());
	}

}
