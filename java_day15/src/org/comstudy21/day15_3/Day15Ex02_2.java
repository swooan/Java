package org.comstudy21.day15_3;

abstract class Woman {
	
	abstract void act();
	
	void action() {
		System.out.println("원더우먼 준비 완료!");
		act();
		System.out.println("미션 complete");
	}
	
}

class Wonder extends Woman {

	Weapon w;
	
	Wonder(Weapon w) {
		this.w = w;
	}
	
	@Override
	void act() {
		System.out.print("받아라 ");
		w.roll();
	}
	
}

abstract class Weapon {
	abstract void roll();
}

class Rope extends Weapon {

	@Override
	void roll() {
		System.out.println("진실의 로프");		
	}
	
}

class Spear extends Weapon {

	@Override
	void roll() {
		System.out.println("창! 슉슉슉~");
		
	}
	
}

public class Day15Ex02_2 {
	public static void main(String[] args) {
		
		Wonder wonder = new Wonder(new Weapon() {
			
			@Override
			void roll() {
				System.out.println("아테나의 방패!!! ");
				
			}
		});
		
		wonder.action();
		
	}
}
