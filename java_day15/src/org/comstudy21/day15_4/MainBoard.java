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
		System.out.println("천천히 달립니다.");
		
	}
	
	@Override
	void jump() {
			System.out.println("아직 jump 할 줄 모르지롱~");
		
	}

	@Override
	void turn() {
		System.out.println("아직 turn 할 줄 모르지롱~");
		
	}

	@Override
	void showLevelMessage() {
		System.out.println("***** 아직 초보자 레벨 입니다 *****");
		
	}


	
}

class Advanced extends PlayerLevel {
	
	@Override
	void showLevelMessage() {
		System.out.println("***** 중급자 레벨 입니다 *****");
		
	}


	@Override
	void run() {
		System.out.println("빨리 달립니다.");
		
	}
	
	@Override
	void jump() {
		System.out.println("높이 점프 합니다.");
		
	}

	@Override
	void turn() {
		System.out.println("아직 turn 할 줄 모르지롱~");
		
	}

}
class Super extends PlayerLevel {
	@Override
	void showLevelMessage() {
		System.out.println("***** 상급자 레벨 입니다 *****");
		
	}

	
	@Override
	void run() {
		System.out.println("아주 빨리 달립니다.");
		
	}
	
	@Override
	void jump() {
		System.out.println("아주 높이 점프 합니다.");
		
	}
	
	@Override
	void turn() {
		System.out.println("한바퀴 돕니다.");
		
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
