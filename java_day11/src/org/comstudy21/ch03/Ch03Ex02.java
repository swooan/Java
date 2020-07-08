package org.comstudy21.ch03;

public class Ch03Ex02 {
	public Ch03Ex02() {
		System.out.println("Ch03Ex02 클래스의 생성자 호출!");
		
		test();
	}

	private void test() {
		System.out.println("Test 함수 호출!");
		
	}

	public static void main(String[] args) {
		// main 함수는 객체와는 별개다.
		// static 으로 선언한 멤버는 모두 객체와는 별개다
		// => static 멤버는 class 차원이기 때문에.
		
		// 생성자를 이용한 구현
		// 모든 클래스는 생성자가 있다.
		// 생성자는 객체를 생성할 때 자동 호출
		
		// 클래스도 type의 일종이다.
		// 클래스를 이용한 변수 생성 가능.
		Ch03Ex02 ch03Ex02 = new Ch03Ex02();
		// ㅣ		ㅣ				ㄴ 객체 (힙에 만들어짐 / 클래스 이름과 똑같은 매소드다 하지만 지금 없다? => JVM이 자동으로 만들어줌 /
		// ㅣ             ㅣ                                               생성자라고 한다 / 선언하고 그 메소드 밖에서 ctrl+space)
		// l        l                                생성자 = 클래스 이름과 똑같은 함수 / 반환형이 없다(type / void x)
		// ㄴ 타입       ㄴ 변수 (참조변수 - 4바이트)
		//   스택에 만들어짐                 

	}

}
