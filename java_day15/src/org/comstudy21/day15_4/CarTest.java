package org.comstudy21.day15_4;

abstract class Car {
	
	void startCar() {
		
	}
	
	abstract void drive();
	abstract void stop();
	abstract void wiper();
	
	final void run() {
		System.out.println("시동을 켭니다.");
		drive();
		stop();
		wiper();
		System.out.println("시동을 끕니다.");
	}
}

class AICar extends Car {

	
	
	
	@Override
	void drive() {
		System.out.println("자율 주행 합니다.");
		System.out.println("자동차가 알아서 방향을 틉니다.");
		
	}

	@Override
	void stop() {
		System.out.println("자동차가 알아서 멈춤.");
		
	}

	@Override
	void wiper() {
		System.out.println("비나 눈이 올때 자동으로 속도를 조절합니다.");
		
	}
	
}

class ManualCar extends Car {

	@Override
	void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 방향을 틉니다.");
		
	}

	@Override
	void stop() {
		System.out.println("사람이 차를 멈춥니다.");
		
	}

	@Override
	void wiper() {
		System.out.println("사람이 수동으로 속도를 조절합니다.");
		
	}
	
}

public class CarTest {
	public static void main(String[] args) {
		System.out.println("=== 자율 주행 자동차 ===");
		Car mycar = new AICar();
		mycar.run();
		
		System.out.println();
		
		System.out.println("=== 일반 자동차 ===");
		Car yourCar = new ManualCar();
		yourCar.run();
	}
}
