package org.comstudy21.day13_2;

import org.comstudy21.People;

public class Day13Ex03 {
	public static void main(String[] args) {
		People p1 = new People("È«±æµ¿");
		People p2 = new People("±è±æµ¿");
		People p3 = new People("ÀÌ¼ø½Å");
		
		System.out.println(p1); // (number = 1, name = È«±æµ¿) 
		System.out.println(p2); // (number = 2, name = ±è±æµ¿) 
		System.out.println(p3); // (number = 3, name = ÀÌ¼ø½Å)
		
		People.showSequence(); // sequence => 4
	}
}
