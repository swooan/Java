package org.comstudy21.day15_3;

abstract class Man {
	
	abstract void run();
	
	// 템플릿 메소드
	final void start() { 	// final 을 선언했으므로 밑에서 이 작업을 고칠 수 없다.
		System.out.println("--- 수행 준비 완료! ---");
		run();
		System.out.println("--- 수행 완료! ---");
	}
}

class Rambo extends Man {
	
	무기 w;
	Rambo(무기 w) {
		this.w = w;
	}

	@Override
	void run() {
		System.out.print("람보가 ");
		w.play();
	}	
}

abstract class 무기 {
	abstract void play();
}

class 총 extends 무기 {

	@Override
	void play() {
		
		System.out.println("총을 쏜다 탕탕탕");
	}
	
}

class 칼 extends 무기 {

	@Override
	void play() {
		System.out.println("칼을 휘두른다 휙휙휙");
		
	}
	
}

public class Day15Ex02 {

	public static void main(String[] args) {
		// 익명 클래스 형식으로 객체 생성
		Rambo rambo = new Rambo(new 무기() {
			
			@Override
			void play() {
				System.out.println("활을 쏜다 슉슉!");
				
			}
		});
		rambo.start();
		//rambo.run();
	}
}
