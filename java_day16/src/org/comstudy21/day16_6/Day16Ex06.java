package org.comstudy21.day16_6;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

abstract class Calc {
		private int a, b;
		
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
		public int getB() {
			return b;
		}
		public void setB(int b) {
			this.b = b;
		}
		
		public void setValue(int a, int b) {
			this.a = a;
			this.b = b;
		}
		abstract public int calculate();
}

class Add extends Calc {

	@Override
	public int calculate() {		
		return getA() + getB();
	}
	
}

class Sub extends Calc {
	
	@Override
	public int calculate() {		
		return getA() - getB();
	}
	
}

class Mul extends Calc {
	
	@Override
	public int calculate() {		
		return getA() * getB();
	}
	
}

class Div extends Calc {
	
	@Override
	public int calculate() {		
		return getA() / getB();
	}
	
}

public class Day16Ex06 {
	static Hashtable<String, Calc> map = new Hashtable<String, Calc>();
	static ArrayList<String> list = new ArrayList<String>();
	// static 멤버 초기화 블럭
	static {
		list.add("+");
		list.add("-");
		list.add("*");
		list.add("/");
		map.put(list.get(0), new Add());
		map.put(list.get(1), new Sub());
		map.put(list.get(2), new Mul());
		map.put(list.get(3), new Div());
	}
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		String op = "+";
		Calc calc = null;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오 : ");
		a = scan.nextInt();
		b = scan.nextInt();
		op = scan.next();
		
		if(list.indexOf(op) != -1) {
			calc = map.get(op);
			calc.setValue(a,  b);
			System.out.println(calc.calculate());			
		}
		else {
			System.out.println("입력하신 연산자에 해당 사항이 없습니다.");
		}
		scan.close();
	}
	
	
	public static void test(String[] args) {
		int a = 10;
		int b = 5;
		Calc calc = null;
		
		calc = map.get("+");
		calc.setValue(a,  b);
		System.out.println(calc.calculate());
		
		calc = map.get("-");
		calc.setValue(a,  b);
		System.out.println(calc.calculate());
		
		calc = map.get("*");
		calc.setValue(a,  b);
		System.out.println(calc.calculate());
		
		calc = map.get("/");
		calc.setValue(a,  b);
		System.out.println(calc.calculate());
		
	}
	
}
