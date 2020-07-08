package org.comstudy21.day15_3;

abstract class Woman {
	
	abstract void act();
	
	void action() {
		System.out.println("������� �غ� �Ϸ�!");
		act();
		System.out.println("�̼� complete");
	}
	
}

class Wonder extends Woman {

	Weapon w;
	
	Wonder(Weapon w) {
		this.w = w;
	}
	
	@Override
	void act() {
		System.out.print("�޾ƶ� ");
		w.roll();
	}
	
}

abstract class Weapon {
	abstract void roll();
}

class Rope extends Weapon {

	@Override
	void roll() {
		System.out.println("������ ����");		
	}
	
}

class Spear extends Weapon {

	@Override
	void roll() {
		System.out.println("â! ������~");
		
	}
	
}

public class Day15Ex02_2 {
	public static void main(String[] args) {
		
		Wonder wonder = new Wonder(new Weapon() {
			
			@Override
			void roll() {
				System.out.println("���׳��� ����!!! ");
				
			}
		});
		
		wonder.action();
		
	}
}
