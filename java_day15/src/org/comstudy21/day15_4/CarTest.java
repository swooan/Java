package org.comstudy21.day15_4;

abstract class Car {
	
	void startCar() {
		
	}
	
	abstract void drive();
	abstract void stop();
	abstract void wiper();
	
	final void run() {
		System.out.println("�õ��� �մϴ�.");
		drive();
		stop();
		wiper();
		System.out.println("�õ��� ���ϴ�.");
	}
}

class AICar extends Car {

	
	
	
	@Override
	void drive() {
		System.out.println("���� ���� �մϴ�.");
		System.out.println("�ڵ����� �˾Ƽ� ������ Ƶ�ϴ�.");
		
	}

	@Override
	void stop() {
		System.out.println("�ڵ����� �˾Ƽ� ����.");
		
	}

	@Override
	void wiper() {
		System.out.println("�� ���� �ö� �ڵ����� �ӵ��� �����մϴ�.");
		
	}
	
}

class ManualCar extends Car {

	@Override
	void drive() {
		System.out.println("����� �����մϴ�.");
		System.out.println("����� ������ Ƶ�ϴ�.");
		
	}

	@Override
	void stop() {
		System.out.println("����� ���� ����ϴ�.");
		
	}

	@Override
	void wiper() {
		System.out.println("����� �������� �ӵ��� �����մϴ�.");
		
	}
	
}

public class CarTest {
	public static void main(String[] args) {
		System.out.println("=== ���� ���� �ڵ��� ===");
		Car mycar = new AICar();
		mycar.run();
		
		System.out.println();
		
		System.out.println("=== �Ϲ� �ڵ��� ===");
		Car yourCar = new ManualCar();
		yourCar.run();
	}
}
