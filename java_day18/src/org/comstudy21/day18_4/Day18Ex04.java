package org.comstudy21.day18_4;

class ������ {
	String �𵨸�, ������, �������̽�;
	int �μ�ż� = 0, �����ܷ� = 100;
	
	void print() {
		�μ�ż� ++;
		�����ܷ� --;
	}
}

class ��ũ�������� extends ������ {
	int ��ũ�ܷ�;
	
	void print() {
		super.print();
		System.out.println("��ũ�� ������ �μ�");
		
	}
}

class ������������ extends ������ {
	int ����ܷ�;
	
	@Override
	void print() {
		super.print();
		System.out.println("������ ������ �μ�");
		
	}
}

public class Day18Ex04 {

	public static void main(String[] args) {
		������[] pArr = {new ��ũ��������(), new ������������()};
		
		for(int i = 0; i<10; i++) {
			pArr[0].print();
		}
		System.out.println(pArr[0].�μ�ż�);
		System.out.println(pArr[0].�����ܷ�);
	}

}
