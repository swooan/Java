package org.comstudy21.day13_2;

import org.comstudy21.People;

public class Day13Ex03 {
	public static void main(String[] args) {
		People p1 = new People("ȫ�浿");
		People p2 = new People("��浿");
		People p3 = new People("�̼���");
		
		System.out.println(p1); // (number = 1, name = ȫ�浿) 
		System.out.println(p2); // (number = 2, name = ��浿) 
		System.out.println(p3); // (number = 3, name = �̼���)
		
		People.showSequence(); // sequence => 4
	}
}
