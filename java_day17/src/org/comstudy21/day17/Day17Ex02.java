package org.comstudy21.day17;

import java.util.Scanner;

// 상품 하나를 표현하는 클래스 Goods 만들기

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
		System.out.println("제조사 => " + name);
		System.out.println("가격 => " + price);
		System.out.println("재고 => " + numberOfStock);
		System.out.println("판매량 => " + sold);
	}
}

public class Day17Ex02 {
	
	public static void main(String[] args) {
		// 상품을 5개 저장할 수 있는 배열
		Goods[] shop = new Goods[5];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			shop[i] = new Goods("",0,0,0);
			
			System.out.println("상품명 >> ");
			shop[i].name = scan.next();
			System.out.println("가격 >> ");
			shop[i].price = scan.nextInt();
			System.out.println("재고 >> ");
			shop[i].numberOfStock = scan.nextInt();
			System.out.println("판매량 >> ");
			shop[i].sold = scan.nextInt();
			
		}
		
		// 상품 5개를 배열에 저장
		
//		shop[0] = new Goods ("니콘" , 500000, 30, 50);
//		shop[1] = new Goods ("캐논" , 600000, 28, 42);
//		shop[2] = new Goods ("올림푸스" , 280000, 17, 23);
//		shop[3] = new Goods ("코닥" , 1500000, 60, 1);
//		shop[4] = new Goods ("라이카" , 100000, 60, 5);
//		
		
		//배열의 데이터를 출력
		
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
