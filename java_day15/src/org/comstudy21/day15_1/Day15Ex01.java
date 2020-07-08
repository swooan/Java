package org.comstudy21.day15_1;

// 추상 메소드를 하나라도 포함한 클래스는 추상클래스가 되어야 한다.
abstract class Shape {
	// 추상메소드는 몸체가 구현되지 않았다.
	abstract void area();
}

// 방법 1. 추상 클래스를 상속받은 클래스는 일단 추상 클래스이다.
// 방법 2. 만일 추상 클래스가 아니길 원하면 부모의 추상 메소드를 구현해 주어야 일반 클래스가 된다.
/*방법 1 : abstract*/ class Circle extends Shape {
	
	int r;
	Circle(int r) {
		this.r = r;
	}
	
	/*방법 2 : */void area() {
		double result = Math.PI * Math.pow(r, 2);
		System.out.println("원의 면적은 " + result);
	}
	
}

public class Day15Ex01 {
	public static void main(String[] args) {
		// 추상 클래스로는 객체 생성이 불가능하다.
		// Shape c = new Shape();     에러
		
		// 추상 클래스로 참조변수는 선언 가능.
		Shape c;
		
		// 추상클래스는 참조 변수로 업케스팅 가능
		c = new Circle(10);
		c.area();
		
	}
}
