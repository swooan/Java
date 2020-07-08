package org.comstudy21;

// People 클래스를 독립 파일로 만들었다.

public class People {
	private static int sequence = 1;
	private int number;
	private String name;
	
	
	public People() {
		
	}
	
	public People(String name) {
		this.name = name;
		number = sequence++;
	}
	//자동호출 된다.
	@Override
	public String toString() {
		return "(number = " + number + ", name = " + name + ")";
	}

	public static void showSequence() {

		System.out.println("sequence => " + sequence);
		
	}
	
}
