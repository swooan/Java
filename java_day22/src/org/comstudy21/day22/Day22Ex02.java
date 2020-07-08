package org.comstudy21.day22;

import java.util.Hashtable;
import java.util.Scanner;

interface View {
	void show();
}

class Input implements View {
	public void show() {
		
		System.out.println("---- �Է±�� ----");
	}
}
class Output implements View {
	public void show() {
		
		System.out.println("---- ��±�� ----");
	}
}
class Search implements View {
	public void show() {
		
		System.out.println("---- �˻���� ----");
	}
}
class End implements View {
	public void show() {
		
		System.out.println("---- ���� ----");
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
		System.out.println("1.�Է� 2.��� 3.�˻� 4.����");
		System.out.print("���� : ");
		int no = scan.nextInt();

		try {
			View view = map.get(no);
			view.show();
		} catch (NullPointerException e) {
			System.out.println("�ش����� �ʴ� ��ȣ�Դϴ�.");
		}
		
		main(null);
	}

}
