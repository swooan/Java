package day18.main;

import java.util.Scanner;

import day18.model.DLinkedList;
import day18.model.Dao;
import day18.view.Circle;
import day18.view.DObject;
import day18.view.Line;
import day18.view.Rect;


public class MainClass {
	static Scanner scan = new Scanner(System.in);
	static boolean isPlay = true;
	public static void main(String[] args) {
		while(isPlay) {
			play();
		}
		System.out.println("���μ��� ����!");
	}
	
	static int menu(String[] items) {
		for(int i = 0; i<items.length; i++) {
			System.out.print(items[i] + "(" + (i+1) + ")");
			if(i<items.length-1) {
				System.out.print(", ");
			}
			else {
				System.out.print(" >>> ");
			}
		}
		
		return scan.nextInt();
	}
	
	public static void play() {
		String[] menu1 = {"����","����","��κ���","����"};
		
		switch(menu(menu1)) {
		case 1 :
			DObject newObj = null;
			
			switch(menu(new String[] {"Line","Rect","Circle"})) {
			
			case 1 : newObj = new Line(); break;
			case 2 : newObj = new Rect(); break;
			case 3 : newObj = new Circle(); break;
			default : System.out.println("�ش� ���� �����ϴ�.");
			
			}
			
			Dao.insert(newObj); break;
			
		case 2 : Dao.delete(); break;
		
		case 3 : DLinkedList list = Dao.select();
			list.showList();
			break;
		
		case 4 : System.out.println("--- Good bye ---");
			isPlay = false;
			break;
		default : System.out.println("�ش���� �����ϴ�.");
		}
	}

	public static void test(String[] args) {
		DLinkedList list = new DLinkedList();
		list.append(new Line());
		list.append(new Circle());
		list.append(new Rect());
		list.append(new Rect());
		list.append(new Circle());
		
		list.remove();
		list.remove();
		list.remove();
		
		list.showList();

	}

}
