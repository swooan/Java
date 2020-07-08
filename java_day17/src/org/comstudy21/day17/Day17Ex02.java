package org.comstudy21.day17;

import java.util.Scanner;

// ��ǰ �ϳ��� ǥ���ϴ� Ŭ���� Goods �����

class Goods{
	String name;
	int price;
	int numberOfStock;
	int sold;
	
	public Goods() {
		this("",0,0,0);
	}
	
	public Goods(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
	
	void showInfo() {
		System.out.println("������ => " + name);
		System.out.println("���� => " + price);
		System.out.println("��� => " + numberOfStock);
		System.out.println("�Ǹŷ� => " + sold);
	}
}

public class Day17Ex02 {
	
	public static void main(String[] args) {
		// ��ǰ�� 5�� ������ �� �ִ� �迭
		Goods[] shop = new Goods[5];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			shop[i] = new Goods("",0,0,0);
			
			System.out.println("��ǰ�� >> ");
			shop[i].name = scan.next();
			System.out.println("���� >> ");
			shop[i].price = scan.nextInt();
			System.out.println("��� >> ");
			shop[i].numberOfStock = scan.nextInt();
			System.out.println("�Ǹŷ� >> ");
			shop[i].sold = scan.nextInt();
			
		}
		
		// ��ǰ 5���� �迭�� ����
		
//		shop[0] = new Goods ("����" , 500000, 30, 50);
//		shop[1] = new Goods ("ĳ��" , 600000, 28, 42);
//		shop[2] = new Goods ("�ø�Ǫ��" , 280000, 17, 23);
//		shop[3] = new Goods ("�ڴ�" , 1500000, 60, 1);
//		shop[4] = new Goods ("����ī" , 100000, 60, 5);
//		
		
		//�迭�� �����͸� ���
		
		for(int i = 0; i < 5; i++) {
			shop[i].showInfo();
			System.out.println();
		}
	}
	
	public static void test(String[] args) {
		Goods camera = new Goods();
		camera.name = "Nikon";
		camera.price = 400000;
		camera.numberOfStock = 30;
		camera.sold = 50;
		
		camera.showInfo();
	}
}
