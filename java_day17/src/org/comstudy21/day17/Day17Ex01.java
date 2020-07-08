package org.comstudy21.day17;

class Circle {
	int radius;
	String name;
	
	double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}

public class Day17Ex01 {

	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "�ڹ�����";
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle donuts = new Circle();
		donuts.radius = 2;
		donuts.name = "�ڹٵ���";
		area = donuts.getArea();
		System.out.println(donuts.name + "�� ������ " + area);

	}

}
