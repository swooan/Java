package org.comstudy21.day16_3;

import java.util.Scanner;

interface Scheduler {
	abstract void getNextCall();
	abstract void sendCallToAgent();
}

class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���� �������� ����մϴ�.");
		
	}
		
}

 class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ��� ������ ���ų� ��Ⱑ ���� ���� �������� �Ҵ��մϴ�.");
		
	}
	
}

class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("�� ����� ���� ���� ��Ȱ�� ���� �����ɴϴ�.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� skill ���� ���� �������� �켱������ ����մϴ�.");
		
	}
	
}

public class SchdulerTest {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("��ȭ��� �Ҵ� ����� �����ϼ���.");
		
		System.out.println("R : �Ѹ� ������ �Ҵ�");
		System.out.println("L : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
		System.out.println("P : �켱������ ���� �� ���� �Ҵ�");
		
		System.out.println(" ���� : ");
		char ch = scan.next().charAt(0);
		
		Scheduler scheduler = null;
		
		if (ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();

	}

}
