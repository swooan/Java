package org.comstudy21.day18_2;

class Weapon {
	protected int fire() {
		return 1;
	}
}

class Canon extends Weapon {
	protected int fire() {
		return 10;
	}
}

public class Day18Ex02 {

	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본무기 데미지 => " + weapon.fire());
		
		weapon = new Canon(); // 업캐스팅
		System.out.println("포격무기 데미지 => " + weapon.fire());

	}

}
