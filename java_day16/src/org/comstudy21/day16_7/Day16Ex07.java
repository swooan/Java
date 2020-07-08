package org.comstudy21.day16_7;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Day16Ex07 {

	Hashtable<String, ArrayList<String>> map = new Hashtable<String, ArrayList<String>>();

	public Day16Ex07() {
		ArrayList<String> sList = new ArrayList<String>();
		ArrayList<String> aList = new ArrayList<String>();
		ArrayList<String> bList = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			sList.add("---");
			aList.add("---");
			bList.add("---");
		}
		map.put("S", sList);
		map.put("A", aList);
		map.put("B", bList);
	}

	public void showSeat(String level) {
		ArrayList<String> list = null;
		list = map.get(level);
		System.out.print(level + " >>> ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

	public void showAllSeat() {
		showSeat("S");
		showSeat("A");
		showSeat("B");
	}

	Scanner scan = new Scanner(System.in);
	String[] menuStr1 = { "����", "��ȸ", "���", "������" };
	String[] menuStr2 = { "S", "A", "B" };

	int menu(String[] menuStr) {
		for (int i = 0; i < menuStr.length; i++) {
			System.out.print(menuStr[i] + "(" + (i + 1) + ")" + " ");

		}
		System.out.print("\n���� >>> ");
		return scan.nextInt();
	}

	void ����() {

		System.out.println("--- �����ϱ� ---");
		ArrayList<String> list = null;
		switch (menu(menuStr2)) {
		case 1:
			list = map.get("S");
			break;
		case 2:
			list = map.get("A");
			break;
		case 3:
			list = map.get("B");
			break;
		default:
			System.out.println("�ش� ���� �����ϴ�.");
			return;
		}
		System.out.print("�̸� >>> ");
		String name = scan.next();
		int no = 0;
		do {
			System.out.printf("��ȣ (1~%d����) >>> ", list.size());
			no = scan.nextInt();
		} while (no < 1 || no > list.size());
		list.set(no - 1, name);
	}

	void ���() {
		System.out.println("--- ����ϱ� ---");
		ArrayList<String> list = null;
		String level = " ";
		switch (menu(menuStr2)) {
		case 1:
			list = map.get("S"); level = "S";
			break;
		case 2:
			list = map.get("A"); level = "A";
			break;
		case 3:
			list = map.get("B"); level = "B";
			break;
		default:
			System.out.println("�ش� ���� �����ϴ�.");
			return;
		}
		showSeat(level);
		System.out.print("�̸� >>> ");
		String name = scan.next();
		int idx = list.indexOf(name);
		if(idx != -1) {
			list.set(idx, "---");
		}
		else {
			System.out.println("�˻��� �̸��� �����ϴ�.");
		}

	}

	void ������() {
		System.out.println("--- ���μ��� ���� ---");
		System.exit(0);
	}

	public void run() {
		while (true) {
			switch (menu(menuStr1)) {
			case 1:
				����();
				break;
			case 2:
				showAllSeat();
				break;
			case 3:
				���();
				break;
			case 4:
				������();
				break;
			default:
				System.out.println("�ش� ���� ����");
			}
		}
	}

	public static void main(String[] args) {

		Day16Ex07 app = new Day16Ex07();
		app.run();

	}

}
