package org.comstudy21.day15_4;

class Player {
	private PlayerLevel level;
	
	public Player() {
		level = new Beginner();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}

abstract class PlayerLevel {
	
	abstract void showLevelMessage();
	
	abstract void run();
		
	abstract void jump();
	
	abstract void turn();
	
	void go(int count) {
		run();
		for(int i = 1; i <= count; i++) {
			jump();
		}
		turn();
	}
	
}

class Beginner extends PlayerLevel {

	@Override
	void run() {
		System.out.println("õõ�� �޸��ϴ�.");
		
	}
	
	@Override
	void jump() {
			System.out.println("���� jump �� �� ������~");
		
	}

	@Override
	void turn() {
		System.out.println("���� turn �� �� ������~");
		
	}

	@Override
	void showLevelMessage() {
		System.out.println("***** ���� �ʺ��� ���� �Դϴ� *****");
		
	}


	
}

class Advanced extends PlayerLevel {
	
	@Override
	void showLevelMessage() {
		System.out.println("***** �߱��� ���� �Դϴ� *****");
		
	}


	@Override
	void run() {
		System.out.println("���� �޸��ϴ�.");
		
	}
	
	@Override
	void jump() {
		System.out.println("���� ���� �մϴ�.");
		
	}

	@Override
	void turn() {
		System.out.println("���� turn �� �� ������~");
		
	}

}
class Super extends PlayerLevel {
	@Override
	void showLevelMessage() {
		System.out.println("***** ����� ���� �Դϴ� *****");
		
	}

	
	@Override
	void run() {
		System.out.println("���� ���� �޸��ϴ�.");
		
	}
	
	@Override
	void jump() {
		System.out.println("���� ���� ���� �մϴ�.");
		
	}
	
	@Override
	void turn() {
		System.out.println("�ѹ��� ���ϴ�.");
		
	}
	
}

public class MainBoard {
	public static void main(String[] args) {
		
		Player user = new Player();
		user.play(1);
		
		Advanced aLevel = new Advanced();
		user.upgradeLevel(aLevel);
		user.play(2);
		
		Super sLevel = new Super();
		user.upgradeLevel(sLevel);
		user.play(3);
	}
}
