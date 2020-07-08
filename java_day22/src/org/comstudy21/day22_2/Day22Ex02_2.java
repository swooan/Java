package org.comstudy21.day22_2;

import java.util.Hashtable;
import java.util.Scanner;

interface Controller {
	void show();
}

class Input implements Controller {
	@Override
	public void show() {
		System.out.println("Input");
		
	}
}
class Output implements Controller {
	@Override
	public void show() {
		System.out.println("Output");
		
	}
}
class Search implements Controller {
	@Override
	public void show() {
		System.out.println("Search");
		
	}
}
class End implements Controller {
	@Override
	public void show() {
		System.out.println("End");
		
	}
}

public class Day22Ex02_2 {

	static Hashtable<Integer, Controller> hs = new Hashtable<Integer, Controller>();
	static Scanner scan = new Scanner(System.in);
	
	static {
		hs.put(1, new Input());	
		hs.put(2, new Output());	
		hs.put(3, new Search());	
		hs.put(4, new End());	
	}
	
	public static void main(String[] args) {
		System.out.println("1.입력 2.출력 3.검색 4.종료");
		System.out.print(">>> ");
		int no = scan.nextInt();
		
		try {
			Controller control = hs.get(no);
			control.show();
		} catch (NullPointerException e) {
			System.out.println("널 포인터 에러 발생!");
		}

		main(null);
	}

}
