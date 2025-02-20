package org.comstudy21.day13_2;

import org.comstudy21.People;

public class Day13Ex04 {
	public static void main(String[] args) {
		// import한 클래스는 클래스 이름 만으로 사용가능
		
		People p1 = new People("홍길동");
		People p2 = new People("김길동");
		People p3 = new People("이순신");
		
		System.out.println(p1); // (number = 1, name = 홍길동) 
		System.out.println(p2); // (number = 2, name = 김길동) 
		System.out.println(p3); // (number = 3, name = 이순신)
		
		People.showSequence(); // sequence => 4
	}
}
