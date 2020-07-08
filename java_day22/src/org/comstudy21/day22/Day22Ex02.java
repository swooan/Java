package org.comstudy21.day22;

import java.util.Hashtable;
import java.util.Scanner;

interface View {
	void show();
}

class Input implements View {
	public void show() {
		
		System.out.println("---- 입력기능 ----");
	}
}
class Output implements View {
	public void show() {
		
		System.out.println("---- 출력기능 ----");
	}
}
class Search implements View {
	public void show() {
		
		System.out.println("---- 검색기능 ----");
	}
}
class End implements View {
	public void show() {
		
		System.out.println("---- 종료 ----");
		System.exit(0);
	}
}


public class Day22Ex02 {
	static Scanner scan = new Scanner(System.in);
	
	static Hashtable<Integer, View> map = new Hashtable<Integer, View>();
	
	static {
		map.put(1, new Input());
		map.put(2, new Output());
		map.put(3, new Search());
		map.put(4, new End());
	}
	
	public static void main(String[] args) {
		System.out.println("1.입력 2.출력 3.검색 4.종료");
		System.out.print("선택 : ");
		int no = scan.nextInt();

		try {
			View view = map.get(no);
			view.show();
		} catch (NullPointerException e) {
			System.out.println("해당하지 않는 번호입니다.");
		}
		
		main(null);
	}

}
