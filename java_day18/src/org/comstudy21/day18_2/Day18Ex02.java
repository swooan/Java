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
		System.out.println("�⺻���� ������ => " + weapon.fire());
		
		weapon = new Canon(); // ��ĳ����
		System.out.println("���ݹ��� ������ => " + weapon.fire());

	}

}
